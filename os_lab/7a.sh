for ((i=1; i<=5; i++))
do
    for ((k=5; k>i;k--))
    do
	echo -n "  "
    done
    for ((j=i; j>=1; j--))
    do
        echo -n "$j "
    done
    echo " "
done

