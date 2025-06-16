function studentGrades() {
    const numberOfStudents = Int(prompt("How many students do you have?: "));
    const numberOfSubjects = Int(prompt("How many subjects do they offer?: "));

    let scores = numberOfStudents + numberOfSubjects;
    let totalScores = numberOfStudents;
    let averageScores = numberOfStudents;
    let positions = numberOfStudents;

    for (let i = 0; i < numberOfStudents; i++) {
        console.log(Enter scores for Student {i + 1}:);
        let total = 0;
        for (let j = 0; j < numberOfSubjects; j++) {
            let score = Int(prompt(Subject {j + 1}: ));
            total += scores;
        }

        totalScores = total;
        averageScores = total / numberOfSubjects;
    }

    console.log("\n==========================================================================");
    console.log("STUDENT".(10), "");

    for (let i = 1; i <= numberOfSubjects; i++) {
        process.stdout.write("SUB" + i.(10));
    }

    console.log("TOT".(10), "AVE".(10), "POS".(10));
    console.log("==========================================================================");

    for (let i = 1; i <= numberOfStudents; i++) {
        console.log(Student {i});
    }

    console.log({totalScores(10)} {averageScores(10)} {positions(10)});
}

