name = input("Enter students name: ")
score1 = float(input("Enter score 1 : "))
score2 = float(input("Enter score 2 : "))
score3 = float(input("Enter score 3 : "))

average = (score1 + score2 + score3) / 3
print("Average score: ", round(average, 2))

if average >= 90:
    grade = "A" 
elif average >= 80:
    grade = "B"
elif average >= 70:
    grade = "C"
elif average >= 60:
    grade = "D"
elif average >= 50:
    grade = "E"
else:
    grade = "F"

print("\n--- Report for ", name, "---")
print("Average : " + str(round(average, 2)))
print("Grade : " + grade)
if grade == "F":
    print("Status : FAILED - please revise!")
else:
    print("Status : PASSED")
