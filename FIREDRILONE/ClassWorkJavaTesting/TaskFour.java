import java.util.Scanner;
public class TaskFour{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		for(int index = 1; index <= 10; index++){
		System.out.print("Enter number:");
		int number = input.nextInt();
			
		if(index % 2 == 0){
			sum += index;
		}
		
		System.out.println("The index sum is:"+sum);
		}
	}
}