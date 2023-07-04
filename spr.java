import java.util.Scanner;
import java.util.Random;
 class Game
{
    public int userInput;
    public int computerInput;
    public int point=0;
    public int computerPoint=0;
    Game()
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

