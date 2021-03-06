import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Player extends Actor
{
  private boolean isUpPress;
  private boolean isDownPress;
  private boolean isRightPress;
  private boolean isLeftPress;
  public Player()
    {
        isUpPress = false;
        isDownPress = false;
        isRightPress = false;
        isLeftPress = false;
    }
  /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyJump();
        checkCollision();
    }    
  public void keyJump()
    {
     if( isUpPress == false && Greenfoot.isKeyDown("up") && getY() > 60)
        {
            setLocation( getX() , getY() - 60);
            isUpPress = true;
            if( getY() < 60 )
            {
                Greenfoot.setWorld( new World2());
            }
        }
     if( isUpPress && !Greenfoot.isKeyDown("up"))
        {
            isUpPress = false;
        }
     if( isDownPress == false && Greenfoot.isKeyDown("down") && getY() <540)
        {
            setLocation( getX() , getY() + 60);
            isDownPress = true;
        }
     if( isDownPress && !Greenfoot.isKeyDown("down"))
        {
            isDownPress = false;
         }
     if( isRightPress == false && Greenfoot.isKeyDown("right") && getY() <540)
        {
            setLocation( getX() + 60 , getY());
            isRightPress = true;
        }
     if( isRightPress && !Greenfoot.isKeyDown("right"))
        {
            isRightPress = false;
        }
     if( isLeftPress == false && Greenfoot.isKeyDown("left") && getY() >60)
        {
            setLocation( getX() - 60 , getY());
            isLeftPress = true;
        }
     if( isLeftPress && !Greenfoot.isKeyDown("left"))
        {
            isLeftPress = false;
        }
     if(isTouching(Mushroom.class) )
        {
            removeTouching(Mushroom.class);
        }
    } 
  public void checkCollision()
    {
      if(isTouching(Car.class) || isTouching(Truck.class))
        {
            setLocation(370, 510);
        }
    }
  public void eatMushroom()
    {
      if (isTouching(Mushroom.class) )
        {
            removeTouching(Mushroom.class);
        }
    }
}