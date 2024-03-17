if [ $# -ne 2 ]
then
  echo "Please provide two numbers as arguments"
  exit 1
fi

first = $1
second = $2

for ((i=first; i<=second; i++))
do
    echo -n "$i "
done
echo " "
