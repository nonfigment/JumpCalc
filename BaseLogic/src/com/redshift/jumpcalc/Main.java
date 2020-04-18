package com.redshift.jumpcalc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    private static boolean USE_PREDEFINED = false;

    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        float distance;

        if (USE_PREDEFINED) {
            ship1.name = "First Ship";
            ship1.range = 100;

            ship2.name = "Second Ship";
            ship2.range = 23;

            distance = 255;

        } else {
            Input inputManager = new Input();

            System.out.println("Enter first ship params");
            inputManager.readShipParams(ship1);

            System.out.println("Enter second ship params");
            inputManager.readShipParams(ship2);

            distance = inputManager.readDistance();
        }

        Logic logic = new Logic();
        logic.calc(distance, ship1, ship2);

        System.out.printf("%s route time: %s%n", ship1.name, Util.timeFormatter(ship1.routeTime));
        System.out.printf("%s route time: %s%n", ship2.name, Util.timeFormatter(ship2.routeTime));


        //TODO: create console output for results with ship names and final result in HOURS for rendezvous point reach)

    }

}
