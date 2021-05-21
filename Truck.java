import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Truck extends Actor
{
    private int speed;
    public Truck(int setSpeed)
    {
        speed = setSpeed;
    }
    /**
     * Act - do whatever the Truck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        if(isAtEdge())
        {
            setLocation( 800, getY());
        }
    }    
}
