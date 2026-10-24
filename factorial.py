def factorial(n):
    result = 0

    if n == 0 or n == 1:
        return 1
    else:
        result = n * factorial(n - 1)
        return result

print("The factorial of 5 is " , factorial(5))
    