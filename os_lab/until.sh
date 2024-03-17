
echo "Enter a number:"
read number


counter=1

until [ $counter -gt $number ]
do
  echo $counter
  counter=`expr $counter + 1`
done

