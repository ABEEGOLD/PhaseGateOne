const prompt = require("prompt-sync")();

const lastPeriodStartDate = prompt("Enter last period start day: ");
const nextPeriodStartDate = prompt("Enter next period start day: ");
const monthDays = prompt("Enter total days in the month (e.g., 30 or 31):");

function cycleLength(lastPeriodStartDate, nextPeriodStartDate, monthDays) {
    if (nextPeriodStartDate < lastPeriodStartDate) {
        return (monthDays - lastPeriodStartDate) + nextPeriodStartDate;
    } else {
        return nextPeriodStartDate - lastPeriodStartDate;
    }
}

function ovulationDay(nextPeriodStartDate) {
    return nextPeriodStartDate - 14;
}

function safeDays(lastPeriodStartDate, nextPeriodStartDate) {
    let ovalDay = ovulationDay(nextPeriodStartDate);
    let startSafe = lastPeriodStartDate;
    let endSafe = ovalDay - 6;
    let postOvalStartSafe = ovalDay + 2;
    let postOvalEndSafe = nextPeriodStartDate - 1;

    console.log("Safe Days Before Ovulation: Day " + startSafe + " to " + endSafe);
    console.log("Safe Days After Ovulation: Day " + postOvalStartSafe + " to " + postOvalEndSafe);
}

console.log("\nCycle Length: " + cycleLength(lastPeriodStartDate, nextPeriodStartDate, monthDays) + " days");
console.log("The ovulation day is: Day " + ovulationDay(nextPeriodStartDate));

safeDays(lastPeriodStartDate, nextPeriodStartDate);  