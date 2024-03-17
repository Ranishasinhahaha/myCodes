echo "Enter a number:"
read n

if [ $n -lt 2 ]
then
  echo "Number entered is not a prime number."
  exit 0
fi

f=0

for ((i=2; i*i<=n; i++))
do
  if [ $((n%i)) -eq 0 ]
  then
    f=1
    break
  fi
done

if [ $f -eq 1 ]
then
  echo "$n is not a prime number."
else
  echo "$n is a prime number."
fi
