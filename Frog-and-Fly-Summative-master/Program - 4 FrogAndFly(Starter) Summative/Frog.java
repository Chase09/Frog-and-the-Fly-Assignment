import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    //this will make the frog turn left and right randomly
    public void act() 
    {
        if(Greenfoot.getRandomNumber(100) < 25 )
       {
         if( Greenfoot.getRandomNumber(2) < 1)
         {
             turn(-15);
            }
            else 
            {
                turn(15);
         }    
       } 
       //this will change the frogs speed from 4 to 8
       int moving = Greenfoot.getRandomNumber(4);
       if(moving == 0){
           move(4);
        }else if (moving == 1){
            move(5);
        }else if (moving == 2){
            move(6);
        }else if (moving == 3){
            move(7);
        }else{
            move(8);
        }
       
         
       //When the frog hits the edge of the screen it turns 7 degrees
        if(isAtEdge() == true)
       {
            turn(7);
       }
       //When the frog touches the fly it eats the fly 
        if(isTouching(Fly.class)==true)
       {
         removeTouching(Fly.class);
         Greenfoot.stop();
       }
       
        
      
    }    
}
