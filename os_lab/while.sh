
echo "Enter a number:"
read number

counter=1

while [ $counter -le $number ]
do
  echo $counter
  counter=`expr $counter + 1`
done

