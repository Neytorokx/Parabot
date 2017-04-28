package fishing;

import fishing.strategies.Banking;
import fishing.strategies.Fishing;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;

import java.util.ArrayList;

/**
 * Created by @Ruben.
 */

@ScriptManifest(
        author = "Xenn",
        name = "XFisher",
        category = Category.FISHING,
        version = 1.0,
        description = "Fishing with banking support",
        servers = {"Os-Scape"})

public class XFisher extends Script {

    //Holds the strategys
    private ArrayList<Strategy> strategies;

    @Override
    public boolean onExecute() {
        //Creates a new instance of the ArrayList.
        strategies = new ArrayList<>();

        //Adds the fishing strategy.
        strategies.add(new Fishing());

        //Adds the banking strategy.
        strategies.add(new Banking());

        //Provides the strategies to the bot.
        provide(strategies);
        return true;
    }

    @Override
    public void onFinish() {
        System.out.println("Script shut down.");
    }
}
