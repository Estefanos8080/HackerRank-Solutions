def isPrime(num):
  for num1 in range(2 , num):
    if num % num1 == 0:
      return False
  return True
def countPrimes(num):
  lis = []
  for num1 in range(2 , num):
    if isPrime(num1):
      lis.append(num1)
  num_prime = len(lis) 
  return num_prime 
