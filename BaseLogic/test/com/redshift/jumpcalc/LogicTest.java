package com.redshift.jumpcalc;

import org.junit.Test;

class LogicTest {

    @Test
    void calc() {

        Ship ship1 = new Ship();
        ship1.range = 123;
        ship1.name  = "123";

        Ship ship2 = new Ship();
        ship2.range = 123;
        ship2.name  = "123";

        Logic logic = new Logic();
        logic.calc(125, ship1, ship2);

        System.out.printf("%s route time: %s%n", ship1.name, Util.timeFormatter(ship1.routeTime));
        System.out.printf("%s route time: %s%n", ship2.name, Util.timeFormatter(ship2.routeTime));

    }
}