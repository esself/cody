# format specifiers = {value : flags} format a value bases on
#                                what flags are inserted.

price1 = 3.142159
price2 = -987.62
price3 = 12.34

print(f"Price 1 is ${price1: .2f}") # to add a decimal place
print(f"Price 2 is ${price2:10}") # creates spaces before the price
print(f"Price 3 is ${price3:010}") # brings 0 infront of them

# for left alignment < is used
# for right alignment > is used
# for center alignment ^ is used
# for showing positive numbers a '+' is used. It appears 
# only for positive numbers. you can also bring a space after the colon
# for showing negative numbers'-' is used.
# it only appears in front of negative numbers.
# for showing thousands a comma is used. 