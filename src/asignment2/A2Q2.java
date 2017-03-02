package asignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nate
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//creates a city named kw
        City kw = new City();

        Robot steve = new Robot(kw, 2, 1, Direction.EAST);

        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 9, Direction.SOUTH);
        new Wall(kw, 2, 10, Direction.SOUTH);
        new Wall(kw, 2, 11, Direction.SOUTH);
        new Wall(kw, 2, 12, Direction.SOUTH);
        new Wall(kw, 2, 13, Direction.SOUTH);
        new Wall(kw, 2, 14, Direction.SOUTH);

        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 7, Direction.EAST);
        new Wall(kw, 2, 8, Direction.EAST);

        new Thing(kw, 2, 14);

        for (;;) {
            //when the front is clear steve moves forwards
            if (steve.frontIsClear()) {
                steve.move();
                //jumps the hurdle
            } else {
                steve.turnLeft();
                steve.move();

                steve.turnLeft();
                steve.turnLeft();
                steve.turnLeft();

                steve.move();
                steve.turnLeft();
                steve.turnLeft();
                steve.turnLeft();
                steve.move();

                steve.turnLeft();
            }
            //when it finds the thing it stops
            if (steve.canPickThing()) {
                break;
            }
        }
    }
}
