import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have?: ");
        int numberOfStudent = input.nextInt();

        System.out.print("How many subjects do they offer?: ");
        int numberOfSubject = input.nextInt();


	int scores = numberOfStudent + numberOfSubject;
        int totalScores = numberOfStudent;
        double averageScores = numberOfStudent;
        int positions = numberOfStudent;

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.printf("Enter scores for Student %d:%n", i + 1);
            int total = 0;
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.printf("Subject %d: ", j + 1);
                scores = input.nextInt();
                total += scores;

            totalScores = total;
            averageScores = (double) total / numberOfSubject;
        }
	}

	int highestScore = 0;
	int lowestScore = 0;
	int numberOfPasses = 0;
	int numberFails = 0;
	
	if(totalScores > highestScore){
	highestScore = totalScores;
	 numberOfPasses = scores;
	}

	if(totalScores < lowestScore){ 
		lowestScore = totalScores;
		numberFails = scores;
		totalScores = scores;
	}

	System.out.println("\n==========================================================================");
        System.out.printf("%-10s", "STUDENT");

        for (int i = 1; i <= numberOfSubject; i++) {
            System.out.printf("%10s", "SUB" + i);
        }

        System.out.printf("%10s %10s %10s%n", "TOT", "AVE", "POS");
        System.out.println("==========================================================================");

        for (int i = 1; i <= numberOfStudent; i++) {
            System.out.printf("Student %-5d%n", i);
        }
	 System.out.printf("%10d %10.2f %10d%n", totalScores, averageScores, positions);
	
	System.out.println("Highest scoring student is:"+highestScore);
	System.out.print("Lowest scoring student is:"+lowestScore);
	System.out.print("Total score is:"totalScores);
	System.out.print("Average score is:"+averageScores);
	System.out.print("Number of passes:"+numberOfPasses);
	System.out.print("Number of fails:"+numberFails);




    }
}