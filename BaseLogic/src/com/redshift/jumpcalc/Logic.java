package com.redshift.jumpcalc;

public class Logic {

    static final float FS_DCHARGE = 10;
    static final float FS_DSAFECOOLING = 10;
    static final float FS_DJUMPTIME = 15;
    static final float FSD_SUM = FS_DCHARGE + FS_DJUMPTIME + FS_DSAFECOOLING;
    static final float REFUELBASE = 60;
    static final float ESCAPEROUTE = 15;
    //TODO: refuel multiplier?
    static final float DELAYBASE = FSD_SUM + REFUELBASE + ESCAPEROUTE;

    public float calc(float distance, float range1, float range2) {

        float routetimeOne = DELAYBASE * (distance / range1);
        float routetimeTwo = DELAYBASE * (distance / range2);
        float result = 0;

        if (routetimeOne > 0) {
            result = s2hConverter(Math.min(routetimeOne, routetimeTwo));
        } else {
            System.out.println("Error, please check data you've entered");
        }

        return result;

    }

    private float s2hConverter(float seconds) {
        return seconds / 3600;
    }
}
