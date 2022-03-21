package homeworkweek7;
//. Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.

import java.io.Console;

public class Programe11 {
    public static void main(String[] args) {
        Programe11.test5();


    }
     // define static method
    public static void test5() {
        int i;
        System.out.println("\n devided by 3");// \n means new line
        for (i = 1; i < 100; i++) {
            if (i % 3 == 0)// if condition
                System.out.println(i + ",");
        }
        System.out.println("\n\nDevided by 5 :");// \n\n means new line
        for (i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + ",");
        }


        System.out.println("\n");


    }


}

