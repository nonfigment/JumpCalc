package com.redshift.jumpcalc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Input {
    public void input() {

        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.print("(Not necessary) Enter first ship callsign or class: ");
            String sn1 = bufferedReader.readLine();
            confirm();
            System.out.println(" Enter "+sn1+" current LY range:");
            String s1l = bufferedReader.readLine();
            float range1 = Float.parseFloat(s1l);
            confirm();
            System.out.print("(Not necessary) Enter second ship callsign or class: ");
            String sn2 = bufferedReader.readLine();
            confirm();
            System.out.println(" Enter "+sn2+" current LY range:");
            String s2l = bufferedReader.readLine();
            float range2 = Float.parseFloat(s2l);
            confirm();
            System.out.println(" Enter the distance between ships according to galaxy map route builder: ");
            String sLy = bufferedReader.readLine();
            float distance = Float.parseFloat (sLy);
            confirm();
            Logic.calc(distance,range1,range2);
        } catch (Exception e) {
            String error = "Error! Please, check the data you've provided";
            System.out.println(error);
        }
    }


    public static void confirm() {
        String c = ">>Confirmed";
        System.out.println(c);
    }

}
