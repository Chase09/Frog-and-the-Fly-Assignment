import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Chase
 * Class: Software Development 10S
 * Teacher: Mr. Hardman
 * Date Last Modified: October 24, 2018
 */
public class Beach extends World
{
    private Scoreboard score;
    
    public Beach()
    {    
       //this is the size of the screen 
       super(800, 600, 1); 
       //this makes the beach add 10 food
       addFood(10);
       //this makes a fly spawn in a random spot
       addObject(new Fly(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
       //this makes the frog spawn in the center of the screen
       addObject(new Frog(),getWidth()/2, getHeight()/2);
       //This makes the scorboard
       score = new Scoreboard();
       addObject( score, 80, 60);
       
    }
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {   //this makes the food spawn in random locations
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    //this updates the score to the scoreboard
    public void update()
    {
      score.addToScore();
    }
    //this makes the food spawn in random locations when all the other food is eaten
    public void act()
    {
        if(getObjects(Food.class).isEmpty() == true)
        {
            addFood(10);
        }
    }
}
