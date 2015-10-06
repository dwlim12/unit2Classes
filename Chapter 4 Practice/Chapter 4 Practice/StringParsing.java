import java.util.Scanner;

public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Please enter a number between 1,000 and 999,999: ");
        String number = user_input.next();
        int length = number.length();
        int i;
        for (i=0;i>length;i++){
            if (number.charAt(i) = ","){
                String numbersub1 = number.substring(0,i);
                String numbersub2 = number.substring(i);
            }
    }
    }
}