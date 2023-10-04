public class SumCountedDivisibleBy9
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 100;
        int sum = 0, count = 0;

        for (int i = a; i < b; i++)
        {
            if (i % 9 == 0)
            {
                sum = sum + i;
                count++;
            }

        }  System.out.println("Sum of number between 1 to 100 which are divisible by 9 " + sum);
        System.out.println("Total numbers between 1 to 100 which are divisible by 9 " + count);

    }
}
