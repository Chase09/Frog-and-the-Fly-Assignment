import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    public void act() 
    {
        checkForFood();
        checkKeys();
    }   
    //this is what makes the food class work
    private void checkForFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            
            ( (Beach)getWorld()).update();
        }
    }
    //when you press the keys the fly turns
    private void checkKeys()
    {
        //when you press the right key the fly turns right 15 degrees
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        //when you press the left key the fly turns left 15 degrees
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        //when you press the up key the fly moves in the direction it is facing
        if(Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
    }
}
