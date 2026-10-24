records = []
count   = 0
MAX     = 5
while count < MAX:
    print("\n--- Student", count + 1, "---")
    name = input("Name (or 'done' to finish) : ")

    if name.lower() == "done":
        break
    
    if not name.replace(" ", "").isalpha():
        print("Invalid name. Letters only.")
        continue

    s1 = float(input("Score 1 (0 - 100) : "))
    s2 = float(input("Score 2 (0 - 100) : "))
    
    if not (0 <= s1 <= 100 and 0 <= s2 <= 100):
        print("Scores must be between 0 and 100.")
        continue
    avg = (s1 + s2) / 2
    if avg >= 80: 
        grade = "A"
    elif avg >= 70:
        grade = "B"
    elif avg >= 60:
        grade = "C"
    elif avg >= 50:
        grade = "D"
    else:
        grade = "F"

    template = "[NAME] | Avg: [AVG] | Grade: [Grade]"
    record   = template.replace("[NAME]", name.upper())
    record   = record.replace("[NAME]", str(round(avg, 1)))
    record   = record.replace("[GRADE]", grade)

    records.append(record)
    count += 1
    print("Registered: ", record)

print("\n==== Class Summary ====")
passes = 0
for rec in records:
    print(rec)
    if rec.find("Grade: F") == -1:
        passes += 1

print("\nTotal registered :", len(records))
print("Passed     :",   passes)
print("Failed     :", len(records) - passes)