import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    //this adds the score to the scoreboard
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    public Scoreboard() 
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,100);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    } 
    
    public void addToScore()
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
            img.drawString("Score: " + points,5,25); 
            
        }        
    }    

