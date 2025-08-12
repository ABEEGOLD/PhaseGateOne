import java.util.Scanner;
public class TaskTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int scoreAverage = 0;

		for(int index = 0; index < 10; index++){
			System.out.print("Enter ten scores:");
			int score = input.nextInt();
			}

			scoreAverage = (score * score) / 10;
				
			System.out.println(scoreAverage);
			



	}


}