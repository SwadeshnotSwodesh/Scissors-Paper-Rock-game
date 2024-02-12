/*

This program has got some issues because of the Constructor Game(). The problem with this code is that Whenever the same input is repeated over the period of time, the computer chose the same input too

import java.util.Scanner;
import java.util.Random;
 class Game
{
    public int userInput;
    public int computerInput;
    public int point=0;
    public int computerPoint=0;
    Game()   //this creates a problem in this code
    {
        Random random=new Random();
        this.computerInput=random.nextInt(2);
    }
    public void takeUserInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 0 for Scissor, 1 for Paper, and 2 for Rock first:");
        this.userInput=scan.nextInt();
    }
    public void scoreOutput()
    {
        System.out.println("--->"+" Your score: "+point+" <---");
        System.out.println("--->"+" Computer score: "+computerPoint+" <---");
    }
    public void compare()
    {
        if(userInput==0||userInput==1||userInput==2)
        {
        if(computerInput==userInput)
        {
            System.out.println("--->"+" Same choice!! "+"<---");
            scoreOutput();
        }
        else if(userInput==0&&computerInput==1||userInput==1&&computerInput==2||userInput==2&&computerInput==0)
        {
            System.out.println("--->"+" You took one point here!! "+"<---");
            point++;
            scoreOutput();
        }
        else 
        {
            System.out.println("--->"+" Computer took one point here!! "+"<---");
            computerPoint++;
            scoreOutput();
        }
    }
    else 
    {
        System.out.println("Invalid option...");
        System.out.println("Restart the game please!!");
        System.exit(0);
    }
        System.out.println("Computer Input: "+computerInput);
    }
    public void comparePoint()
    {
            if(point==computerPoint)
        {
            System.out.println("GAME IS DRAW!!");
            System.out.println("Your total point is = Computer's total point is = "+point);
        }
        else if(point>computerPoint)
        {
            System.out.println("YOU HAVE WON THIS MATCH!!");
            System.out.println("Your total point is: "+point);
            System.out.println("Computer's total point is: "+computerPoint);
        }
        else 
        {
            System.out.println("COMPUTER HAS WON THIS MATCH!!");
            System.out.println("Your total point is: "+point);
            System.out.println("Computer's total point is: "+computerPoint);
        }
    }
}
public class spr
{
    public static void main(String[] args)
    {
        Game game=new Game();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times you want to run the program first:");
        int noOfTime=sc.nextInt();
        for(int i=0;i<noOfTime;i++)
        {
        game.takeUserInput();
        game.compare();
        }
        game.comparePoint();
    }
}


*/


//the below mentioned code is the corrected version of the code for the Scissor, Paper, and game.

import java.util.Scanner;
import java.util.Random;
 class Game
{
    public int userInput;
    public int computerInput;
    public int point=0;
    public int computerPoint=0;
    /*Game()
    {
        //Using the random generator in constructor here is creating problem
        //Whenever the same input is repeated over the period of time, the computer chose the same input too
        //The problem is occuring because of computerInput is set only once in the game and gets invoked when the object is created.
        //Hence, the computer's input remains the same for the rest of the round too.
        Random random=new Random();
        this.computerInput=random.nextInt(3);
    }*/
    public void randomNumberGenerator()
    {
        Random random=new Random();
        this.computerInput=random.nextInt(3);
    }
    public void takeUserInput()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 0 for Scissor, 1 for Paper, and 2 for Rock first:");
        this.userInput=scan.nextInt();
    }
    public void scoreOutput()
    {
        System.out.println("--->"+" Your score: "+point+" <---");
        System.out.println("--->"+" Computer score: "+computerPoint+" <---");
    }
    public void compare()
    {
         
        int option=userInput;
        if(option==0||option==1||option==2)
        {
        if(computerInput==userInput)
        {
            System.out.println("--->"+" Same choice!! "+"<---");
            scoreOutput();
        }
        else if(userInput==0&&computerInput==1||userInput==1&&computerInput==2||userInput==2&&computerInput==0)
        {
            System.out.println("--->"+" You took one point here!! "+"<---");
            point++;
            scoreOutput();
        }
        else 
        {
            System.out.println("--->"+" Computer took one point here!! "+"<---");
            computerPoint++;
            scoreOutput();
        }
    }
    else 
    {
        System.out.println("Invalid option...");
        System.out.println("Restart the game please!!");
        System.exit(0);
    }
        System.out.println("Computer Input: "+computerInput);
    }
    public void comparePoint()
    {
            if(point==computerPoint)
        {
            System.out.println("GAME IS DRAW!!");
            System.out.println("Your total point is = Computer's total point is = "+point);
        }
        else if(point>computerPoint)
        {
            System.out.println("YOU HAVE WON THIS MATCH!!");
            System.out.println("Your total point is: "+point);
            System.out.println("Computer's total point is: "+computerPoint);
        }
        else 
        {
            System.out.println("COMPUTER HAS WON THIS MATCH!!");
            System.out.println("Your total point is: "+point);
            System.out.println("Computer's total point is: "+computerPoint);
        }
    }
}
public class spr
{
    public static void main(String[] args)
    {
        Game game=new Game();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times you want to run the program first:");
        int noOfTime=sc.nextInt();
        for(int i=0;i<noOfTime;i++)
        {
        game.randomNumberGenerator();
        game.takeUserInput();
        game.compare();
        }
        game.comparePoint();
    }
}

//Have a fun!





