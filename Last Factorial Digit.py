def last_factorial_digit(n):
  if n == 0:
    return 1
  else:
    number=1
    for i in range(1,n+1):
      number*=i
  return number % 10
