echo "enter number"
read no
pal=0
cpy=$num

while [ $num -gt 0]
do
tmp= $(expr $nuo %10)
pal=$(expr $pal \* 10)
pal=$(expr $pal + $tmp)

num=$(expr $no / 10)
done

if [ $pal -eq $cpy ]
then echo "palin"
else
 echo "not palin"
fi
