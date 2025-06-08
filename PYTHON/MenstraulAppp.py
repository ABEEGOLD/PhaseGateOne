
def cycleLength(lastPeriodStartDate, nextPeriodStartDate, monthDays):
    if nextPeriodStartDate < lastPeriodStartDate:
        return (monthDays - lastPeriodStartDate) + nextPeriodStartDate
    else:
        return nextPeriodStartDate - lastPeriodStartDate

def ovulationDay(nextPeriodStartDate):
    return nextPeriodStartDate - 14

def safeDays(lastPeriodStartDate, nextPeriodStartDate):
    ovalDay = ovulationDay(nextPeriodStartDate)
    startSafe = lastPeriodStartDate
    endSafe = ovalDay - 6
    postOvalStartSafe = ovalDay + 2
    postOvalEndSafe = nextPeriodStartDate - 1

    print(f"Safe Days Before Ovulation: Day {startSafe} to {endSafe}")
    print(f"Safe Days After Ovulation: Day {postOvalStartSafe} to {postOvalEndSafe}")


lastPeriodStartDate = int(input("Enter last period start day: "))
nextPeriodStartDate = int(input("Enter next period start day: "))
monthDays = int(input("Enter total days in the month (e.g., 30 or 31): "))

print(f"\nCycle Length: {cycleLength(lastPeriodStartDate, nextPeriodStartDate, monthDays)} days")
print(f"The ovulation day is: Day {ovulationDay(nextPeriodStartDate)}")

safeDays(lastPeriodStartDate, nextPeriodStartDate)