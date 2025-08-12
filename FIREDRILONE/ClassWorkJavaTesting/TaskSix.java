import java.util.Scanner;
public class TaskSix{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int averageScore = 0;
		
		for(int score = 1; score <= 10;score++){
		System.out.print("Enter ten scores:");
		int number = input.nextInt();
		
		if(number % 2 == 0){
		sum += number;
		averageScore = sum / 10; 
		}
		System.out.println("The average of the number is:"+averageScore);
		}
	}
}