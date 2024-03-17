echo "Enter the number"
read  a
if [a%2=0]
then
    echo "The number is even"
else [a%2!=0]
     echo "The number is odd"
fi
if [a<0]
then
     echo "Negative Number"
else [a>0]
    echo "Positive Number"
fi
