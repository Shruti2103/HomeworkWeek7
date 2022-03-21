package homeworkweek7;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Programe6 {
    public static void main(String[] args) {
        Programe6.test1();// call test method by class


    }

    public static void test1() {
        int h;

        Scanner sx = new Scanner(System.in);
        System.out.println("Enter any Number");
        h = sx.nextInt();

        if (h % 2 == 0)// formula to get even no
            System.out.println("The number is Even");
        else
            System.out.println("The number is odd");


    }


}
