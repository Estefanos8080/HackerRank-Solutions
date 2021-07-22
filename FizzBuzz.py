def fizzbuzz(test_case):
  for num in range(1, test_case+1):
    if num % 3 == 0 and num % 5 == 0:
      print("fizzbuzz")
      continue
    elif num % 5 == 0:
      print("buzz")
      continue
    elif num % 3 == 0:
      print("fizz")
      continue
    print(num)
# Please do not modify the code below this line.
# When you run your code, you will need to enter 
# an input in the terminal below, where the prompt appears

test_case = int(input("Please enter an input number:"))

    
fizzbuzz(test_case)
