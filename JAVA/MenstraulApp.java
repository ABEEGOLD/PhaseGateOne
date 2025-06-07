import java.util.Scanner; 
public class MenstraulApp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter last period start day: ");
		int lastPeriodStartDate = input.nextInt();

	System.out.print("Enter next period start day: ");
		int nextPeriodStartDate = input.nextInt();
	
	System.out.print("Enter total days in the month (e.g., 30 or 31): ");
		 int monthDays = input.nextInt();

	System.out.println("\nCycle Length: " + cycleLength(lastPeriodStartDate,nextPeriodStartDate,monthDays) + " days");

	System.out.println("The ovulation day is:" +ovulationDay(nextPeriodStartDate));

			safeDays(lastPeriodStartDate, nextPeriodStartDate);

	


	}

public static int cycleLength(int lastPeriodStartDate,int nextPeriodStartDate,int monthDays){
		
	if (nextPeriodStartDate < lastPeriodStartDate) {
            return  (monthDays - lastPeriodStartDate) + nextPeriodStartDate;
        } else {
           return nextPeriodStartDate - lastPeriodStartDate;
        }
		
			


}

public static int ovulationDay(int nextPeriodStartDate){
		 return nextPeriodStartDate - 14;

			
}



public static void safeDays(int lastPeriodStartDate,int nextPeriodStartDate){
 		int ovalDay = ovulationDay(nextPeriodStartDate);
		int Startsafe = lastPeriodStartDate;
		int EndSafe = ovalDay - 6;
		int postOvalStartsafe = ovalDay + 2;
		int postOvalEndSafe = nextPeriodStartDate -1;

 System.out.println("Safe Days Before Ovulation: Day " + Startsafe + " to " + EndSafe);

System.out.println("Safe Days After Ovulation: Day " + postOvalStartsafe + " to " + postOvalEndSafe);



}






}