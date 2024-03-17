echo "Enter a number"
read num

original_num=$num
reverse_num=0

while [ $num -gt 0 ]
do
    digit=`expr $num % 10`
    reverse_num=`expr $reverse_num \* 10 + $digit`
    num=`expr $num / 10`
done

if [ $original_num -eq $reverse_num ] 
 then
    echo "$original_num is a palindrome"
else
    echo "$original_num is not a palindrome"
fi
