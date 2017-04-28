package fishing.strategies;

import fishing.data.BotData;
import fishing.data.FishingData;
import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.Npcs;
import org.rev317.min.api.methods.Players;
import org.rev317.min.api.wrappers.Npc;

/**
 * Created by @Ruben.
 */

public class Fishing implements Strategy {

    /**
     * Array holding the object ID's of the fishing pools.
     */
    private final int FISHING_ID = 326;

    Npc[] fishingSpot;

    @Override
    public boolean activate() {
        //Creating a local variable so we don't have to loop through all the objects everytime this gets called.
       fishingSpot = Npcs.getNearest(326);
        return (!Inventory.isFull() && fishingSpot != null && Players.getMyPlayer().getAnimation() != -1 && Inventory.containts(304));
    }

    @Override
    public void execute() {

        if(fishingSpot.length > 0 && fishingSpot != null) {
            try {
                fishingSpot[0].interact(FishingData.MONKFISH.getActionId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        BotData.setStatus("Fishing.");
        Time.sleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() != -1;
            }
        }, 5000);
    }
}
