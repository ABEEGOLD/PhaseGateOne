import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
	int numberOfStudent;
	int numberOfSubject;



	System.out.print("How many students do you have?: ");
	numberOfStudent = input.nextInt();

	System.out.print("How many subjects do they offer?: ");
	numberOfSubject = input.nextInt();

	
    for (int i = 0; i < studentNumber.size(); i++) {
    int totalStudent = subjectNumber.get(i) * studentNumber.get(i);
    System.out.printf("%-20s %10d %10.2f %15.2f%n", subjectNumber.get(i), studentNumber.get(i), totalStudent);
}
	

    for (int i = 1; i <= numberOfStudent; i++) {
    System.out.printf("Student %d%n", i);
}

	System.out.print("\n==========================================================================\n");

	System.out.printf("%-10s %10s %10s %10s %10s %10s%n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
	System.out.println("\n==========================================================================\n");
	System.out.println("Student 1");
	System.out.println("Student 2");
	System.out.println("Student 3");
	System.out.println("Student 4");












	}

}