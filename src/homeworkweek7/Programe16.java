package homeworkweek7;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
import java.util.Scanner;

public class Programe16 {
    public static void main(String[] args) {
        Programe16.test();// calling by class


    }
    // define static method
    public static int test() {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        if (number > 0) {
            System.out.println(number + "The number is positive");
        } else if (number < 0) {
            System.out.println(number + "The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        return number;


    }

}
