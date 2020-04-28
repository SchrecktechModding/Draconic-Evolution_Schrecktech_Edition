package com.brandon3055.draconicevolution.common.blocks.multiblock;

/**
 * Created by Brandon on 23/7/2015.
 */
public interface IReactorPart {
    int RMODE_TEMP = 0;
    int RMODE_TEMP_INV = 1;
    int RMODE_FIELD = 2;
    int RMODE_FIELD_INV = 3;
    int RMODE_SAT = 4;
    int RMODE_SAT_INV = 5;
    int RMODE_FUEL = 6;
    int RMODE_FUEL_INV = 7;


    MultiblockHelper.TileLocation getMaster();

    void shutDown();

    boolean checkForMaster();

    boolean isActive();

    String getRedstoneModeString();

    void changeRedstoneMode();

    int getRedstoneMode();
}
