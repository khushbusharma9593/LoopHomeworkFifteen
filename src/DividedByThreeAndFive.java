public class DividedByThreeAndFive {
    public static void main(String[] args) {

        for (int i = 1; i <=100; i++) {//Choose from 1 to 100 numbers
            if (i % 3 == 0)//Divided by 3 only
            {
                System.out.println(i);

            }

        }

        System.out.println("-----------------------------------");

        for (int j = 1; j <=100; j++)//Choose from 1 to 100 numbers
            {
                if (j % 5 == 0)//Divided by 5 only
                {
                    System.out.println(j);

                }

            }


    }
}