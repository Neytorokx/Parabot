package fishing.strategies;

import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Bank;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.Players;

/**
 * Created by @Ruben.
 */

public class Banking implements Strategy {

    private static final int netId = 303;

    @Override
    public boolean activate() {
        return Inventory.isFull() && Players.getMyPlayer().getAnimation() == -1;
    }

    @Override
    public void execute() {
        if(Bank.open()) {
            Bank.depositAllExcept(netId);
        }
    }
}
