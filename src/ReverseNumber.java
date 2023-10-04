import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)//Main method
    { int number=0;
        int reverse=0;

        Scanner scanner=new Scanner(System.in);//Create object
        System.out.println("Enter the numer");
        number= scanner.nextInt();

        for (;number!=0;)    /*for loop: No initialization part as number is already *initialized and no increment/decrement part as logic
                   * number = number/10 already decrements the value of number*/

        {   reverse=reverse*10 + number%10;
            number=number/10;

        }
        System.out.println("Reverse of specified number is: "+reverse);

    }
}
