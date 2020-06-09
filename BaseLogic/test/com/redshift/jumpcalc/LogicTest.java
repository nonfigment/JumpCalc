package com.redshift.jumpcalc;

import org.junit.jupiter.api.Test;

class LogicTest extends Input {

    private void makeTest(String s1Name, float s1Range, String s2Name, float s2Range, float dist, int jumps) {
        Ship ship1 = new Ship();
        ship1.name = s1Name;
        ship1.range = s1Range;
        Ship ship2 = new Ship();
        ship2.name = s2Name;
        ship2.range = s2Range;

        Logic logic = new Logic();
        logic.calc(dist, jumps, ship1, ship2);
        System.out.printf("%s route time: %s%n", ship1.name, Util.timeFormatter(ship1.routeTime));
        System.out.printf("%s route time: %s%n", ship2.name, Util.timeFormatter(ship2.routeTime));
    }

    @Test
    void testCalc() {
        makeTest("Dwarf 10", 10, "Carrier 500", 500, 350, 3);
    }

    @Test
    void testBigValueCalc() {
        makeTest("Alpha", 30, "Carrier 200", 200, 5400, 50);
    }

    @Test
    void testExtremeRoute() {
        makeTest("DBE", 17, "Carrier 100", 100, 16700, 550);
    }

    @Test
    void testJumpsCount() {
        makeTest("ShipOne", 10, "ShupTwo", 30, 90, 1);
    }

    @Test
    void testJumpsCountSimple() {
        makeTest("One", 1, "Two", 1, 100, 100);
    }

    @Test
    void testMad() {
        makeTest("One", 199999999, "Two", 199999999, 1, 100000);
    }

}
