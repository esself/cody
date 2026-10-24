# while loop executes some code while some conditions remains true

num = int(input("Enter your number from 1 - 10: "))

while num < 1 or num > 10:
    print(f"{num} is not between 1 and 10")
    num = int(input("Enter your number from 1 - 10: "))
    
print("Nice!")

