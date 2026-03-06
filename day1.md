# Day 1 – Pseudocode & Flowcharts

## 1. Leap Year Check

### Pseudocode
START  
READ year  
IF (year % 4 == 0) AND (year % 100 != 0 OR year % 400 == 0)  
    PRINT "Leap Year"  
ELSE  
    PRINT "Not Leap Year"  
END


## 2. Sum of Two Numbers

### Pseudocode
START  
READ num1  
READ num2  
sum = num1 + num2  
PRINT sum  
END


## 3. Multiplication Table

### Pseudocode
START  
READ number  
FOR i = 1 TO 10  
    result = number * i  
    PRINT number x i = result  
END FOR  
END


## 4. HCF and LCM

### Pseudocode
START  
READ a  
READ b  
temp1 = a  
temp2 = b  
WHILE b ≠ 0  
    remainder = a % b  
    a = b  
    b = remainder  
END WHILE  
HCF = a  
LCM = (temp1 * temp2) / HCF  
PRINT HCF  
PRINT LCM  
END


## 5. Sum Until 'x'

### Pseudocode
START  
sum = 0  
WHILE true  
    READ value  
    IF value == 'x'  
        BREAK   
    sum = sum + value  
PRINT sum  
END


