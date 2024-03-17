echo "1. : check the number is odd or even" 
echo "2: positive or negative"
echo "Enter your option"

read option

case  $option in
  1) echo "Enter a number"
     read number1
     if [ `expr $number1 % 2` -eq 0 ]
       then echo "$number1 is even"
     else
      echo "$number1 is odd"
      fi;;
    
  2) echo "Enter a number"
     read number2
     if [ $number2 -lt 0 ]
       then 
       echo "$number2 is negative"
     else
       echo "$number2 is positive"
     fi;;
     
  *) echo "Invalid Choice";;
  
  esac
     
     
