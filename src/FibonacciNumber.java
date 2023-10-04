public class FibonacciNumber
{
    public static void main(String[] args)//Main method
    { int a=1;//Variable declared
         int b=0;
         int c, i;

        for (i = 1; i <=8 ; i++)//Loop method using from 1 to 8
        {
            c=a+b;
            System.out.print(c+"      ");

            a=b;//Swapping
            b=c;

        }

         }
}
