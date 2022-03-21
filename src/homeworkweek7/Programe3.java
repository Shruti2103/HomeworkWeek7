package homeworkweek7;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and
        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        Input, Marks should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format */

import java.util.Scanner;

public class Programe3 {
    public static void main(String[] args) {

// using scanner to allow user to input marks for all 3 subjects plus name and roll number
        Scanner sz = new Scanner(System.in);
        System.out.println("Enter the name of the student :  ");
        String name = sz.nextLine();
        System.out.println("Enter the roll number of student  :");
        int rollnum = sz.nextInt();
        System.out.println("Enter the Marks of Maths  :");
        int mat = sz.nextInt();
        System.out.println("Enter the marks of science  :");
        int sci = sz.nextInt();
        System.out.println("Enter the marks of English :");
        int eng = sz.nextInt();
        int t = (mat + sci + eng);

        if (mat < 0 || mat > 100) {
            System.out.println("Invalid Input. The marks should between 0 to 100");
        } else if (sci < 0 || sci > 100) {
            System.out.println("Invalid Input. The marks should between 0 to 100");
        } else if (eng < 0 || eng > 100) {
            System.out.println("Invalid Input. The marks should between 0 to 100");
        } else {
            int total = mat + sci + eng;// define integer for total
            int percentage = (total * 100) / 300;// define percentage
            Programe3.grade1(percentage);// calling method by percentage
            Programe3.result1(percentage);// calling method by percentage

            System.out.println("|----------------------------------------------|");
            System.out.println("-----------------Mark Sheet---------------------|");
            System.out.println("------------------------------------------------|");
            System.out.println("        Name                " + name + "            |");
            System.out.println("        Roll No             " + rollnum + "         |");
            System.out.println(" -----------------------------------------------|");
            System.out.println("        Subjects      :         Marks           |");
            System.out.println("------------------------------------------------|");
            System.out.println("        Math          :      " + mat + "            |");
            System.out.println("        Science       :      " + sci + "            |");
            System.out.println("        English       :      " + eng + "           |");
            System.out.println("------------------------------------------------|");
            System.out.println("        Total         :       " + total + "         |");
            System.out.println("------------------------------------------------|");
            System.out.println("        Percentage    :       " + percentage + "    |");
            System.out.println("         Result       :   " + result1(percentage) + "  |");
            System.out.println("        Grade         :  " + grade1(percentage) + "   |");
            System.out.println("        Total         :       " + total + "          |");
            System.out.println("------------------------------------------------|");


        }
    }

    // define one static method for grade
    public static String grade1(int a) {
        String grade;
        if (a >= 80) {
            grade = "A+";
        } else if (a >= 60 && a < 80) {
            grade = "A";
        } else if (a >= 50 && a < 60) {
            grade = "B";
        } else if (a >= 35 && a < 50) {
            grade = " C";
        } else {
            grade = "pass";
        }


        return grade;// return deta type grade

    }

    // define method for pass and fail
    public static String result1(int a) {
        String result;
        if (a >= 35) {
            result = "pass";
        } else {
            result = "fail";
        }
        return result;
    }


}

























