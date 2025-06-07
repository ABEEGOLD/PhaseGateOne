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

	


	}

public static int cycleLength(int nextPeriodStartDate,int lastPeriodStartDate,int monthDays){
		int calculateCycle;
	if (nextPeriodStartDate < lastPeriodStartDate) {
            return calculateCycle = (monthDays - lastPeriodStartDate) + nextPeriodStartDate;
        } else {
           return calculateCycle = nextPeriodStartDate - lastPeriodStartDate;
        }
		
			


}

public static int ovulationDay(int nextPeriodStartDate){
		int ovulationDay =  nextPeriodStartDate - 14;
			return ovulationDay; 

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