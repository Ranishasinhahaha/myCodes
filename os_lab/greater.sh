echo "enter two number"
read a
read b
if [$a -gt $b]
then
        echo "$a > $b"
else
        echo "$a < $b"
fi
