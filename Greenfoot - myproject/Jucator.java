import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jucator extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String up, down, left, right;
    Jucator(String a, String b, String c, String d){
        this.up = a;
        this.down = b;
        this.left = c;
        this.right = d;
    }
    
    public void act() 
    {
        move();
    }    
    
    public void move(){
        ///controalele up, down, left, right
        if(Greenfoot.isKeyDown(left)) turn(-1);
        if(Greenfoot.isKeyDown(right)) turn(1);
        
        if(Greenfoot.isKeyDown(up)){
            if(Greenfoot.isKeyDown(right)){
                move(1);
            }
            else move(1);
        }
        if(Greenfoot.isKeyDown(down)){
            move(-1);
            if(Greenfoot.isKeyDown(left))
                turn(2); //daca apesi down-left atunci merge in sens invers acelor de ceasornic
            
            if(Greenfoot.isKeyDown(right))
                turn(-2);
            
        }
    }
}
