public class CountCharacter
{
    public static void main(String[] args)
    { String a = "HelloWorld";
        int count=0;
        a=a.toLowerCase();

        for (int i = 0; i <a.length() ; i++)//Count each character of the string 
        { char ch=a.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' );
            count++;

        }//Display as per below statement
        System.out.println("Total number of characters in a string: " + count);
    }
}
