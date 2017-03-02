/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author nate
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//creates a city named kw
        City kw = new City();

        Robot steve = new Robot(kw, 9,99, Direction.EAST);

        for (;;) {
            //cheks if steve is at zero
            while (steve.getAvenue() > 0) {
               //turns steve the correct way
                if (steve.getDirection() == Direction.NORTH) {
                    steve.turnLeft();
                    steve.turnLeft();
                    steve.turnLeft();
                    steve.turnLeft();
                }
                //turns steve the correct way
                if (steve.getDirection() == Direction.SOUTH) {
                    steve.turnLeft();
                }
                //turns steve the correct way
                if (steve.getDirection() == Direction.EAST) {
                    steve.turnLeft();
                    steve.turnLeft();
                }
                //when steve is in the correct direction move it
                if (steve.getDirection() == Direction.WEST) {
                    steve.move();
                }
            }
            //cheks if steve is at street zero
            while (steve.getStreet() > 0) {
            //turns steve the correct way
                if (steve.getDirection() == Direction.WEST) {
                    steve.turnLeft();
                }
                //turns steve the correct way
                if (steve.getDirection() == Direction.SOUTH) {
                    steve.turnLeft();
                    steve.turnLeft();
                }
                //turns steve the correct way
                if (steve.getDirection() == Direction.EAST) {
                    steve.turnLeft();
                    steve.turnLeft();
                    steve.turnLeft();
                }
                //when steve is the correct way move him to 1, 1 
                if (steve.getDirection() == Direction.NORTH) {
                    steve.move();
                }
            }
        }
    }
}
