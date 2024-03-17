
echo "Enter a character:"
read char

case "$char" in
    [0-9])
        echo "$char is a number."
        ;;
    [a-zA-Z])
        echo "$char is an alphabet."
        
        case "$char" in
            [a-z])
                echo "$char is a lowercase alphabet."
                ;;
            [A-Z])
                echo "$char is an uppercase alphabet."
                ;;
            *)
                echo "$char is a special character."
                ;;
        esac
        ;;
    *)
        echo "$char is a special character."
        ;;
esac

