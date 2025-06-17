import java.util.Scanner;
public class PersonalityTest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	
	
		System.out.print("Take your test: \n");
		System.out.print("Enter your name: ");
        	String name = scanner.nextLine();

        int extrovert = 0, introvert = 0;
        int sensing = 0, intuitive = 0;
        int thinking = 0, feeling = 0;
        int judging = 0, perceptive = 0;

        String[][] questions = {
            {"Hanging out with friends", "Reading a book"}, // E vs I
            {"Enjoy group work", "Enjoy working alone"}, // S vs N
            {"Questions everything", "Keep to self"}, // T vs F
            {"Logical about happenings", "Emotional"}, // J vs P
            {"Outgoing person", "Reserved"}, // E vs I
            {"More practical", "More theoretical"}, // S vs N
            {"Organized", "Flexible"}, // T vs F
            {"Unplanned", "Spontaneous"}, // J vs P
            {"Control", "Govern"}, // E vs I
            {"Initiate action", "Reflect action"}, // S vs N
            {"Plan ahead", "Go with flow"}, // T vs F
            {"Facts", "Philosophical"}, // J vs P
            {"Focus on now", "Look to the future"}, // E vs I
            {"Criticize", "Appreciative"}, // S vs N
            {"Accommodating", "Not a people person"}, // T vs F
            {"Good sense of humor", "Receptive"}, // J vs P
            {"Seek private", "Interact with others"}, // E vs I
            {"Structured", "Easy-going"}, // S vs N
            {"Work out ideas", "Dreamer"}, // T vs F
            {"Communicative", "Internal"} // J vs P
        };

	
for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": a) " + questions[i][0] + " | b) " + questions[i][1]);
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("a") && !answer.equalsIgnoreCase("b")) {
                System.out.println("Invalid input. Restart the test.");
               
            }

}


}

}