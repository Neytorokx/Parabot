package fishing.data;

import org.parabot.environment.api.utils.Timer;

/**
 * Created by @Ruben.
 */

public class BotData {

    //Creates a new @Timer instance.
    public Timer timer = new Timer();

    //Holds the amount of caskets gained.
    public static int casketAmount;

    //Getter for casketAmount
    public static int getCasketAmount() {
        return casketAmount;
    }

    //Holds the amount of fish caught.
    public static int fishCaught;

    //Getter for fishCaught
    public static int getFishCaught() {
        return fishCaught;
    }

    //Gets the runtime.
    public String getRunTime() {
        return timer.toString();
    }


    private static String status;

    //Getter for @status
    public static String getStatus(){
        return status;
    }

    //Setter for @status
    public static void setStatus(String value) {
        status = value;
    }
}
