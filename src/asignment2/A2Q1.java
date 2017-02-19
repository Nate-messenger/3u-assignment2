/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author nate
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//creates a city named kitchener
        City kw = new City();
        
        Robot steve = new Robot(kw, 1, 1, Direction.EAST);
        
       // createing dots to pick up 
       new Thing(kw,1, 2);
       new Thing(kw,1, 3);
       new Thing(kw,1, 4);
       new Thing(kw,1, 5);
       new Thing(kw,1, 6);
       new Thing(kw,1, 7);
       new Thing(kw,1, 8);
       new Thing(kw,1, 9);
       new Thing(kw,1, 10);
       new Thing(kw,1, 11);
      //moves steve on to the things
       steve.move();
               //when steve has less than 7 things in backpack it picks up things
      while(steve.countThingsInBackpack() < 7){
        steve.pickThing();
        steve.move();
    }
      //when it has 7 things it moves untill it cannot pick up anything but does not pick it up
      while(steve.canPickThing()){
      steve.move();
      }
        
        
            }
    
}
