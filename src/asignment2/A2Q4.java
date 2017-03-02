/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment2;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.NORTH;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author nate
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();

        Robot steve = new Robot(kw, 3, 1, NORTH);

        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.WEST);

        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.WEST);

        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.WEST);

        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.WEST);

        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);

        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);

        for (;;) {
            //moves and checks if there are walls
            do {
                steve.move();
                steve.turnLeft();
                steve.turnLeft();
                steve.turnLeft();
                //turns to check the ball
            } while (steve.frontIsClear());{
                steve.turnLeft();
                //if the front is still not clear turn again
                if (!steve.frontIsClear()) {
                    steve.turnLeft();
                }

            }

        }

    }

}

