echo "enter year"
read yr

   # if [ $((yr % 4)) -eq 0 ] && [ $((yr % 100)) -ne 0 ] || [ $((yr % 400)) -eq 0 ]
if [ $yr % 4 -eq 0]
then
        echo "$year is a leap year."
    el if [ $yr % 100 -ne 0]
	then
        echo "$year is not a leap year."
    fi
