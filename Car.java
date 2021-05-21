import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Car extends Actor
{
    private int speed;
    public Car(int setSpeed)
    {
        speed = setSpeed;
    }
    public void act() 
    {
        move(speed);
        if(isAtEdge())
        {
            setLocation( 0, getY());
        }
    }    
}
