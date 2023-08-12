import java.util.*;

public class NumberGuessing{

	public static int guess()
	{
		int g,ran,range,point=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range");
		range=sc.nextInt();
		ran=(int)(Math.random()*range)+1;
		do
		{
			System.out.println("Guess the number");
			g=sc.nextInt();
			if(g<ran)
			{
				System.out.println("Your Guess is Low");
			}
			else if(g>ran)
			{
				System.out.println("Your Guess is High");
			}
			else
			{
				System.out.println("Your Guess is correct !! You Won and the number is "+ran);
				return point;
			}
			point++;
		}while(point<8);
		System.out.println("You Loss and the correct answer is "+ran);
		return 8;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guess());
	}

}