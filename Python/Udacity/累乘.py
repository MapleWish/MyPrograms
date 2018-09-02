def factorial(n):
    sum=1
    while(n!=0):
        sum=sum*n
        n=n-1
    return sum

print(factorial(0))