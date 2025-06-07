
def MenstraulApp():
	
	
		
	def cycleLength( next_Period_Start_Date, last_Period_Start_Date,month_Days):

		if next_Period_Start_Date < last_Period_Start_Date:
			cycle_Length = (month_Days - last_Period_Start_Date) + next_Period_Start_Date
		else:
			cycle_Length = next_Period_Start_Date - last_Period_Start_Date;

		
			
def ovulation_Day( next_Period_Start_Date):
		ovulation_Day =  next_Period_Start_Date - 14
		return ovulation_Day 





def safe_Days(last_Period_Start_Date, next_Period_Start_Date):
    oval_Day = ovulation_Day(next_Period_Start_Date)  

   
    
    Start_safe = last_Period_Start_Date
    End_Safe = oval_Day - 6
    post_Oval_Start_safe = oval_Day + 2
    post_Oval_End_Safe = next_Period_Start_Date - 1


    
print(f"Safe Days Before Ovulation : Day {Start_safe} to {End_Safe}")
print(f"Safe Days After Ovulation: Day {post_Oval_Start_safe} to {post_Oval_End_Safe}")

last_Period_Start_Date = int(input("Enter last period start day: "))
next_Period_Start_Date = int(input("Enter next period start day: "))
month_Days = int(input("Enter total days in the month (e.g., 30 or 31): "))


	
	





