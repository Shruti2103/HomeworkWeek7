package homeworkweek7;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?


import java.util.Scanner;

public class Programme2 {
    // main method
    public static void main(String[] args) {
        Programme2 programme2 = new Programme2();//create object to call from instance method
        programme2.leapyear();

    }

    public int leapyear() {
        int year;// decalre int year

        Scanner sc = new Scanner(System.in);// allow user to enter year by
        System.out.println("Enter any year");
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))// formula for leap year
            System.out.println("This is leap Year");
        else
            System.out.println("Not leap Year");
        return year;// giving return type

    }
}