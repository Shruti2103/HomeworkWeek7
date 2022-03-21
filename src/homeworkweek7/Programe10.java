package homeworkweek7;
//.Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else

import java.util.Scanner;

public class Programe10 {
    public static void main(String[] args) {
        Programe10.test9();


    }
    // define method static
    public static void test9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one numbers");
        int a = sc.nextInt();

        System.out.println("Enter + for addition .-for subtraction, * for Multiplication and / fpr division");
        char d = sc.next().charAt(0);


        System.out.println("Enter second  numbers");
        int b = sc.nextInt();

       //create variables for each functions
        int c = a + b;
        int s = a - b;
        int m = a * b;
        int v = a / b;

        if (d == '+') {
            System.out.println("Addition of two numbers " + c);
        } else if (d == '-') {
            System.out.println("Subtraction of two number " + s);
        } else if (d == '*') {
            System.out.println("Multiplication of the two number " + m);
        } else if (d == '/') {
            System.out.println("Division of two numbers " + v);

        } else
            System.out.println("Invalid input");


    }


}
