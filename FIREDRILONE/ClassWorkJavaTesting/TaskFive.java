import java.util.Scanner;
public class TaskFive{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for(int score = 0; score < 10;score++);
		System.out.print("Enter ten scores:");
		int number = input.nextInt();
		
		if(number % 2 == 0){
		sum += number;
		}
		System.out.println(sum);
		}
	}
}