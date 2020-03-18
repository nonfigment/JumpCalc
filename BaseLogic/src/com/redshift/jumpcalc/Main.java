package com.redshift.jumpcalc;

public class Main {

    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        Input inputManager = new Input();

        System.out.println("Enter first ship params");
        inputManager.readShipParams(ship1);

        System.out.println("Enter second ship params");
        inputManager.readShipParams(ship2);

        float distance = inputManager.readDistance();

        Logic logic = new Logic();
        float result=logic.calc(distance, ship1.range, ship2.range);
        System.out.println(result);
//TODO: create console output for results with ship names and final result in HOURS for rendezvous point reach)
    }

}
