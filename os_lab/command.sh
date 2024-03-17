if [ $# -eq 0 ]
then
  echo "No argument given"
  exit 1
fi

n=$1

rev=0

while [ $n -gt 0 ]
do
  rev=$((rev * 10 + n % 10))
  n=$((n / 10))
done
echo "The reverse number is: $rev"

