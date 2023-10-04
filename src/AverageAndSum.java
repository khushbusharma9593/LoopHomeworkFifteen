import java.util.Scanner;

public class AverageAndSum
{
    public static void main(String[] args)    // main method

    {
        float a, b, sum, average;// Variable declared

        Scanner scanner=new Scanner(System.in);// Create object of scanner
        System.out.println("Enter the first number");//reading first number
        a=scanner.nextFloat();

        System.out.println("Enter the second number");//reading second number
        b=scanner.nextFloat();

        sum=a+b;// Calculating sum of a and b

        average=sum/2;//Calculating average of given numbers

        System.out.println("Sum of two numbers is : " +sum);
        System.out.println("Average of two numbers is : " +average);

    }
}
