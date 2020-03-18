package com.redshift.jumpcalc;

public class Logic {


    static final float FSDcharge = 10;
    static final float FSDsafecooling = 10;
    static final float FSDjumptime = 15;
    static final float FSDsum = FSDcharge + FSDjumptime + FSDsafecooling;
    static final float refuelbase = 60;
    static final float escaperoute = 15;
    //TODO: refuel multiplier?
    static float delaybase = FSDsum + refuelbase + escaperoute;

    public static float calc(float distance, float range1, float range2) {
        float routetimeOne = (distance / range1) * delaybase;
        float routetimeTwo = (distance / range2) * delaybase;
        float result;
        if (routetimeOne > 0) {
            return compare(routetimeOne, routetimeTwo);
        } else {

            System.out.println("Error, please check data you've entered");
        }
        return result;


    }

    public static float compare(float rtOne, float rtTwo) {
        return Math.max(rtOne, rtTwo);
    }

}
