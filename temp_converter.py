unit = input("Is the unit is Celsius or Fahrenhiet (C/F): ")
temp = float(input("Enter temperature value: "))

if unit == "C":
    temp = round((temp * 9)/ 5 + 32, 2)
    print(f"Temperature in Fahrenheit is: {temp} Fahrenheit")
elif unit == "F":
    temp = round((temp -32)* 5/9 , 2)
    print(f"Temperature on Celcius is: {temp} Fahrenheit")
else:
    print(f"{unit} is an invalid unit of measurement")