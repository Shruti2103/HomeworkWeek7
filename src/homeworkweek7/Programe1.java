package homeworkweek7;

//Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)

import java.util.Scanner;

public class Programe1 {

    public static void main(String[] args) {
        Programe1 programe1 = new Programe1();// call by object
        programe1.test();//caaling method by object
    }


    public void test() {
        int number;
        Scanner ss = new Scanner(System.in);// define scanner method
        System.out.println("Enter number to test");
        number = ss.nextInt();
        // ternary operator to check number
        String result = number % 2 == 0 ? "Even Number " : "odd Number ";
        System.out.println(number + " is  " + result);


    }


}