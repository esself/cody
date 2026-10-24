password = input("Enter a password : ")
score = 0
feedback = []
 
if len(password) >= 8:
    score += 1
else: 
    feedback.append("use at least 8 characters")
has_upper = False
for ch in password:
    if ch.isupper():
        has_upper = True
        break
if has_upper:
    score += 1
else:
    feedback.append("add an uppercase letter")

has_lower = False
for ch in password:
    if ch.islower():
        has_lower = True
        break

if has_lower:
    score += 1
else:
    feedback.append("include at least one digit") 

if score == 4:
    rating = "Strong"
elif score:
    rating = "Moderate"
else:
    rating = "Weak"

print("\n---- Password Report ----")
print("Length: ", len(password))
print("Rating: ", rating)
if feedback:
    print("Tips   :")
    for tip in feedback:
        print("  -", tip)
