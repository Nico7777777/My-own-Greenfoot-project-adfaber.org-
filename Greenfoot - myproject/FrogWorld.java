import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
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
        super(800, 450, 1); 
        prepare();
        continuing();
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
    }
    private void continuing()
    {
        prize p = new prize();
        prize p2 = new prize();
        int x= (3456*10 + 43242)%800, y=(42352*10+43242)%450;
        addObject(p, x, y);
        //sus e primul mar
        x = (3456*x + 43242)%800; y=(42352*y + 43242)%450;
        addObject(p2, x, y);
        //sus al doilea mar
        
    }
}
