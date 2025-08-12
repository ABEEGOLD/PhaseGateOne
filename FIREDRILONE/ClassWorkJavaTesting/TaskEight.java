import java.util.Scanner;
public class TaskEight{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 0;

	while(count <= 10){
		System.out.print("Enter number score:");
		int number = input.nextInt();

		if(number < 0 || number > 100){
		System.out.print("Invalid number");
		
		}else{
		sum += number;
		count++;
		

		if(count == 10){
		  break;
		}
		}

		}	
		System.out.println("The sum of number equal to 100:"+sum);
		
	}
}