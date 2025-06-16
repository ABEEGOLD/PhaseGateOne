def student_grades():
    number_of_students = int(input("How many students do you have?: "))
    number_of_subjects = int(input("How many subjects do they offer?: "))

    scores = number_of_students + number_of_subjects
    total_scores = number_of_students
    average_scores = number_of_students
    positions = number_of_students

    for i in range(number_of_students):
        print(f"Enter scores for Student {i + 1}:")
        total = 0
        for j in range(number_of_subjects):
            score = int(input(f"Subject {j + 1}: ")) 
            total += scores
        
        total_scores = total
        average_scores = total / number_of_subjects

    print("\n==========================================================================")
    print(f"{'STUDENT':<10}", end="")

    for i in range(1, number_of_subjects + 1):
        print(f"{'SUB'+str(i):>10}", end="")

    print(f"{'TOT':>10} {'AVE':>10} {'POS':>10}")
    print("==========================================================================")

    for i in range(1, number_of_students + 1):
        print(f"Student {i:<10}")

    print(f"{total_scores:>10} {average_scores:>10.2f} {positions:>10}")
