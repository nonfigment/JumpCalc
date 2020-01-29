package com.redshift.jumpcalc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Input {
    public static void input() {

        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.print("(Not necessary) Enter first ship callsign or class: ");
            String sn1 = bufferedReader.readLine();
            confirm();
            System.out.print("(Not necessary) Enter second ship callsign or class: ");
            String sn2 = bufferedReader.readLine();
            confirm();
            System.out.println(" Enter distance between ships according to galaxy map route builder: ");
            String sLy = bufferedReader.readLine();
            int distance = Integer.parseInt(sLy);
            confirm();
             = new (distance);
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
