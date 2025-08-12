import java.util.Scanner;
public class TaskTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int scoreAverage = 0;
		int sum = 0;
		for(int index = 0; index < 10; index++){
			System.out.print("Enter ten scores:");
			int score = input.nextInt();
			sum +=score;
			scoreAverage = sum / 10;
			}	
			System.out.println("The average score is:"+scoreAverage);
			



	}


}