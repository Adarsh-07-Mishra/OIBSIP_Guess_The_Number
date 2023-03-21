import java.util.Random;
import java.util.Scanner;
class Guess_The_Number
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int x,y,i;
		System.out.println("you have only 5 chances :-");
		System.out.println(" ");
		System.out.println("enter your number between 1 to 100 ");
		
		
		
		Random r=new Random();
		 x=r.nextInt(100);
		 
		 for ( i=1;i<=5;i++)
		 {
				y=s.nextInt();

		 if(y<1)
			{
				System.out.println("you  have entered an wrong integer  plese follow the instructions !!");
			}
		 if(y>100)
		{
			System.out.println("you  have entered an wrong integer  plese follow the instructions !!");
		}
		else if(y==x)
		 {
			 System.out.println("you WON the match");
			 break;
		 }
		else if(y>x&&i<5) 
		 {		 
			 System.out.println("Number is greater than the system's number, you should  try again");
		}
		else if(i<5)
		 {
			 System.out.println("Number is smaller than the system's number, you should try again");
		 }
		 }
		 
		if(i==6) 
		{
			System.out.println();
			System.out.println("you lost the game , Better luck next time !!");
		}
		
		 System.out.println(" ");
		 System.out.println("system's random number is " + x);
	}
	}

