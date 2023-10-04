public class MinAndMax//Create class
{
    public static void main(String[] args)//Create Main method
    {
        int x = 10;//Create variables
        int y = 30;
        int z = 50;

        if (x >= y && x >= z)//Start comparing with all 3 numbers
        {
            System.out.println("Maximum number x is: " + x);//Print x if it is maximum number
        } else if (y >= x && y >= z)//Comparing 2nd with first and third number
        {
            System.out.println("Maximum number y is: " + y);//Print y if it is maximum number
        } else //Print z if the above conditions are false

        {
            System.out.println("Maximum number z is: " + z);//Print z if it is maximum number
        }

        if (x <= y && x <= z)// Comparing x with y and z
        {
            System.out.println("Minimum number x is: " + x);// Print if x is minimum
        }
    }
}
