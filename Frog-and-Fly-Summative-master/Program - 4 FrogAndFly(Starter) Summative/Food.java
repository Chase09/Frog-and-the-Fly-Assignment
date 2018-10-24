import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    
    public Food()
    {
        //this makes the food randomize on the screen
        int foodType = Greenfoot.getRandomNumber(5);
        if( foodType == 0 ) {
            setImage("apple1.png");
        } else if( foodType == 1 ) {
            setImage("bananas.png");
        } else if( foodType == 2 ) {
            setImage("cherries.png");
        } else if( foodType == 3){
            setImage("grapes.png");
        } else
        {
            setImage("strawberry.png");
        }
    }
}