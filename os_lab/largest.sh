echo "Enter the first number:"
read a

echo "Enter the second number:"
read b

echo "Enter the third number:"
read c

if [ $a -gt $b  -a $a -gt $c ]
    then
echo "greatest is $a"
#    else
elif
 [ $b -gt $a -a $b -gt $c ]
then
     echo "greatest is $b"
    else
        echo "greatest is $c"
fi

