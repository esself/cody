weight = float(input("Enter your weight: "))
unit = input("kilograms or pounds: ")

if unit == "kilograms":
    weight = weight * 2.205
    unit = "lbs."
    print(f"Your weight is: {round(weight, 2)} {unit}") # f string is for formatting 

elif unit == "pounds":
    weight = weight / 2.205
    unit = "kbs."
    print(f"Your weight is: {round(weight, 2)} {unit}")

else:
    print(f"{unit} is invalid")