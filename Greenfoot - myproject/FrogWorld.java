import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FrogWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FrogWorld extends World
{

    /**
     * Constructor for objects of class FrogWorld.
     * 
     */
    public FrogWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jucator m1, m2;
        m1= new Jucator("up", "down", "left", "right");  m2 = new Jucator("w", "s", "a", "d");
        addObject(m1, 10, 10);
        addObject(m2, 590, 390);
    }/*
    private void earn()
    {
        Actor frog;
        frog = getOneObjectAtOffset(0, 0, Frog.class);
    }*/
}
