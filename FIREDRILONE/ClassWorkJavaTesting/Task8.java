import java.util.Scanner;
public class Task8{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int sum = 0;

	for(int index = 1; index <= 10;index++){
		System.out.print("Enter number score:");
		int number = input.nextInt();

		if(number < 0 && number <= 100){
		System.out.print("Invalid number");
		}

		sum += number;	
	} 
		System.out.println(sum);
