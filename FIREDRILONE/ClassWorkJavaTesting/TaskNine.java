import java.util.Scanner;
public class TaskNine{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
			int sum = 0;
		for(int count = 1;count<=10;count++){
			System.out.print("Enter valid score: ");
			int number = input.nextInt();
			
			if(number >= 0){
			sum += number;
			}
		}
		System.out.println("The sum of valid score is: "+sum);


	

	}


}