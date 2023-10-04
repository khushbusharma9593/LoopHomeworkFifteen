public class PrimeNumber
{
    public static void main(String[] args)//main method
    { int n=15; //Variable declared
        boolean prime=true;

        for (int i = 2; i < n ; i++)
        { if (n % i == 0);
            prime=false;
            break;

        }
        System.out.println(prime);

    }
}
