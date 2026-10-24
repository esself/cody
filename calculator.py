operator = input("Enter operator (*,+,/,-): ") # this will ask the user to enter an operator. The user can enter +, -, *, or /.
num1 = float(input("Enter the 1st number: ")) # you can also use the integer function i.e integer()
num2 = float(input("Enter the 2nd number: "))

if operator == "+":
    result = num1 + num2
    print(result) # using the float function, you have to introduce round() to round the number eg. round(result,2) where 2 means 2 d.p
elif operator == "-":
    result = num1 - num2
    print(result)
elif operator == "*":
    result = num1 * num2
    print(result)

elif operator == "/":
    if num2 == 0: # this is to check if the user is trying to divide by zero. 
        print("Cannot divide by zero") # this will be printed if the user tries to divide by zero.
    else:
        result = num1 / num2
        print(result)
else:
    print("Invalid operator") # this will be printed if the user enters an invalid operator.