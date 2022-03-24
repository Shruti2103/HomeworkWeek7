package homeworkweek7;
//Input any alphabet from “A" to “F” and print their city name accordingly
//any other alphabet should be invalid entry using switch statement

import java.util.Scanner;

public class Programe9 {
    public static void main(String[] args) {
        char ch;
        Scanner sm = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        ch = sm.next().charAt(0);// formula

        Programe9.alphabets(ch);// calling method by class


    }
   // create static method by switch statement
    public static char alphabets(char ch) {
        char c;

        switch (ch) {
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'b':
                System.out.println("Bombay");
                break;
            case 'c':
                System.out.println("Calcutta");
                break;
            case 'd':
                System.out.println("Delhi");
                break;
            case 'e':
                System.out.println("Ealing");
                break;
            case 'f' :
            System.out.println("Fatehpur");
            break;
            default:
                System.out.println("Invalid entry");


        }


        return ch;
    }


}
