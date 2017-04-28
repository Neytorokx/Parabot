package fishing.data;

import org.parabot.environment.api.utils.Timer;

/**
 * Created by @Ruben.
 */

public class FishingData {

    //Creates a new @Timer instance.
    public Timer timer = new Timer();

    //Holds the amount of caskets gained.
    public int casketAmount;

    //Holds the amount of fish caught.
    public int fishCaught;

    //Gets the runtime.
    public String getRunTime() {
        return timer.toString();
    }
}
