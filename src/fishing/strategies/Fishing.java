package fishing.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.Players;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;

/**
 * Created by @Ruben.
 */

public class Fishing implements Strategy {

    /**
     * Array holding the object ID's of the fishing pools.
     */
    private final int[] FISHING_IDS = {3825, 4491};

    SceneObject spot;


    @Override
    public boolean activate() {
        //Creating a local variable so we don't have to loop through all the objects everytime this gets called.
        spot = getFishingSpot();
        return (!Inventory.isFull() && spot != null && Players.getMyPlayer().getAnimation() != -1);
    }

    @Override
    public void execute() {
        //TODO: Interact with Object spot

        Time.sleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return Players.getMyPlayer().getAnimation() != -1;
            }
        }, 5000);
    }

    /**
     * Gets the nearest fishing spot by given Id's.
     * @return nearest fishing spot by given ID's.
     */
    private SceneObject getFishingSpot() {
        //Loop through all local Objects and return the object if it matches.
        for(SceneObject spot : SceneObjects.getNearest(FISHING_IDS)) {
            //Make sure that the Object isn't @null
            if (spot != null) {
                //Return the Object.
                return spot;
            }
        }
        //Returns null if no Object is found.
        return null;
    }
}
