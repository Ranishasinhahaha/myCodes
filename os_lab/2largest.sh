echo "Enter the first number:"
read a

echo "Enter the second number:"
read b

echo "Enter the third number:"
read c

if [ "$a" -gt "$b" ] && [ "a" -gt "$c" ]; then
    if [ "$b" -gt "$c" ]; then
        second_greatest=$b
    else
        second_greatest=$c
    fi
elif [ "$b" -gt "$a" ] && [ "$b" -gt "$c" ]; then
    if [ "$a" -gt "$c" ]; then
        second_greatest=$a
    else
        second_greatest=$c
    fi
else
    if [ "$a" -gt "$b" ]; then
        second_greatest=$a
    else
        second_greatest=$b
    fi
fi

echo "The second greatest number is: $second_greatest"
