import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner stdin_reader = new Scanner(System.in);
        int num = stdin_reader.nextInt();
        int num_cpy = num;
        int rev = 0;

        while(num_cpy!=0) {
            rev = (rev*10) + (num_cpy%10);
            num_cpy=num_cpy/10;
        }

        if(num == rev) {
            System.out.println("The number is a palindrome");
        }
        stdin_reader.close();
    }
}