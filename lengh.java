package lineComparision_day3;

import java.util.Random;
import java.util.Scanner;

public class lengh {
    public static void lengthCalculater() {
        System.out.println("------welcome to line comparision somputation program------");


        //a lengh has two points
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        double x1 = random.nextDouble();
        System.out.println("enter x1"+x1);          //this for 1st point

        double x2 = random.nextDouble();
        System.out.println("enter x2"+x2);


        double x3 = random.nextDouble();
        System.out.println("enter x3"+x3);

        double x4 = random.nextDouble();
        System.out.println("enter x4"+x4);



        //   double lineY = (x2 - x1) * (y2 - y1);

        double y1 = random.nextDouble();
        System.out.println("enter y1"+y1);          //this for 1st point

        double y2 = random.nextDouble();
        System.out.println("enter y2"+y2);


        double y3 = random.nextDouble();
        System.out.println("enter y3"+y3);

        double y4 = random.nextDouble();
        System.out.println("enter y4"+y4);


        //line one
        double lengthOfLine1 = Math.sqrt((x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 - y1));


             double lineY2 = (x4 - x3) * (y4 - y3);

        double lengthOfLine2 = Math.sqrt((x4 - x3) *(x4 - x3)+ (y4 - y3)*(y4 - y3));
        System.out.println("lenght of line one :" + lengthOfLine1);
        System.out.println("lenght of line two :" + lengthOfLine2);

        if (lengthOfLine1 == lengthOfLine2) {
            System.out.println("both lines are same");
        } else if (lengthOfLine1 < lengthOfLine2) {
            System.out.println("line 2 is greater");
        } else {
            System.out.println("linde one is greater");

        }
    }
}
