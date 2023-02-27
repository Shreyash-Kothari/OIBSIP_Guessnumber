import java.util.Scanner;
import java.util.Random;

class Guess_the_number 
{
    public static void main(String[] args) 
    {
        Random rd = new Random();
        int rnum = rd.nextInt(1, 100);
        Scanner sc = new Scanner(System.in);
        int count=1,score=0;
        System.out.println("Welcome to NUMBER GUESSING GAME\nTo start press Y/y");
        char c=sc.next().charAt(0);
        if(c=='y' || c=='Y')
        {
            System.out.print("Guess the number between 1 to 100 : ");
            int gnum = sc.nextInt();
            if(gnum==rnum)
            {
                System.out.println("Number Guessed correctly");
            } 
            else if(gnum!=rnum)
            {
                while (gnum!=rnum) 
                {
                    if (rnum > gnum) 
                    {   
                        System.out.println("Random Number is greater than " + gnum);
                        System.out.print("Try once again : ");
                        gnum = sc.nextInt();
                        count++;
                    } 
                    else if(rnum<gnum)
                    {
                        System.out.println("Random Number is less than " + gnum);
                        System.out.print("Try once again : ");
                        gnum = sc.nextInt();
                        count++;
                    } 
                }
                if(gnum==rnum)
                {
                    System.out.println("Number Guessed correctly in "+count+" attempts");
                }
            }   
            switch(count)
            {
                case 1:
                        score=50;
                        System.out.println("Score :"+score);
                        break;
                case 2:
                        score=40;
                        System.out.println("Score :"+score);
                        break;
                case 3:
                        score=30;
                        System.out.println("Score :"+score);
                        break;
                case 4:
                        score=20;
                        System.out.println("Score :"+score);
                        break;
                case 5:
                        score=10;
                        System.out.println("Score :"+score);
                        break;
                default: 
                        score=0;
                        System.out.println("Score : "+0+" because number is not guessed within 5 attempts....\n");
                        break;
            
            }
        }
        else
        {
            System.out.println("OOPs!!! Exit without playing.....");
            System.exit(0);
        }
    }
}