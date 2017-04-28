package fishing.data;

/**
 * Created by @Ruben.
 */

public enum FishingData {

    MONKFISH(304, 326, 0);

    private final int itemReq, spotId, actionId;

    private FishingData(int itemReq, int spotId, int actionId) {
        this.itemReq = itemReq;
        this.spotId = spotId;
        this.actionId = actionId;
    }

    public int getItemReq() {
        return itemReq;
    }

    public int getSpotId() {
        return spotId;
    }

    public int getActionId() {
        return actionId;
    }
}
