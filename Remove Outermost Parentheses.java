def removeOuterParentheses(string):
	current_count = 0
	output = ""
	for charc in string:
	  if charc == "(":
	    current_count += 1
	  if current_count > 1:
	    output += charc
	  if charc == ")":
	    current_count -= 1
	return output

sampleInput = "(()())(())"
print(removeOuterParentheses(sampleInput))
