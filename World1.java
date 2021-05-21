import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class World1 extends World
{
     /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public World1()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        makeGround();
        addCars();
        addTrucks();
        addObject( new Player(), 370, 510);
        addObject( new Mushroom(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Mushroom(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Mushroom(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Mushroom(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Mushroom(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
    }
    public void makeGround()
    {
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 570);
        }
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 510);
        }
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 270);
        }
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 30);
        }
        for(int i = 0; i < 10; i++)
        {
            int x = Greenfoot.getRandomNumber(700) + 50;
            int y = Greenfoot.getRandomNumber(100) + 500; 
            addObject( new Grass(), x, y);
        }
    }
    public void addCars()
    {
        addObject( new Car(5), 30, 450);
        addObject( new Car(6), 30, 390);
        addObject( new Car(7), 30, 330);
    }
    public void addTrucks()
    {
        addObject( new Truck(-8), 30, 210);
        addObject( new Truck(-9), 30, 150);
        addObject( new Truck(-10), 30, 90);
    }
}