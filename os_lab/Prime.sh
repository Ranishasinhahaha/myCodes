echo "Enter a number:"
read number

factor=1
counter=0

while [ $factor -le $number ]
do
    if [ `expr $number % $factor` -eq 0 ]
      then
       counter=`expr $counter + 1`
     fi
    factor=`expr $factor + 1`
done

if [ $counter -eq 2 ]
  then echo "$number is a prime number"
  else echo "$number is not a prime number"
  fi
  

