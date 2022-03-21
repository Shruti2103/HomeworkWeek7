package homeworkweek7;
//Write a program that tells us input value is number or an alphabet or symbol

import java.util.Scanner;

public class Programe12 {
    public static void main(String[] args) {
        Programe12.test2();
    }
    // difine static method
    public static void test2() {


        System.out.println("Enter any value");
        Scanner sd = new Scanner(System.in);
        char k = sd.next().charAt(0);

       // if condition
        if (k >= '0' && k <= '9') {
            System.out.println(" It is a number");
        } else if ((k >= 'a' && k <= 'z') || (k >= 'A' && k <= 'Z')) {
            System.out.println("This is alphabet");
        } else {
            System.out.println("This is symbol");
        }


    }

}
