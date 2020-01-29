package com.redshift.jumpcalc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;



public class logic_new {

    public static void main(String[] args) throws Exception {
//TODO:add check for input
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.print("Enter first ship callsign or class: ");
                String sn1 = bufferedReader.readLine();
                    confirm();
            System.out.print("Enter second ship callsign or class: ");
                String sn2 = bufferedReader.readLine();
                    confirm();
            System.out.println("Enter distance between ships according to galaxy map route builder: ");
                String sLy = bufferedReader.readLine();
                int distance = Integer.parseInt(sLy);
                    confirm();


    }
    private static void confirm (){
        String c = ">>Confirmed";
            System.out.println(c);
    }
    private static void calculation(int distance){
        int

    }
}