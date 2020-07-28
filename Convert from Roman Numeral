def roman_to_decimal(roman_numeral):
  arabic_numeral = 0
  i = 0
  
  while (i < len(roman_numeral)): 

    # Getting value of symbol s[i] 
    s1 = value(roman_numeral[i]) 

    if (i < len(roman_numeral) - 1):

      # Getting value of symbol s[i+1] (the next number)
      s2 = value(roman_numeral[i+1])
      if (s1 >= s2): 
        arabic_numeral += (s1 - s2)
        i += 2
      else: 
        arabic_numeral += s2
        i += 1
    else:
      arabic_numeral += s2
      i += 1
    return arabic_numeral 

def value(r): 
    if (r == 'I'): 
        return 1
    if (r == 'V'): 
        return 5
    if (r == 'X'): 
        return 10
    if (r == 'L'): 
        return 50
    if (r == 'C'): 
        return 100
    if (r == 'D'): 
        return 500
    if (r == 'M'): 
        return 1000
    return -1
