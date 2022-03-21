package homeworkweek7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//       any other alphabet should be invalid entry

import java.util.Scanner;

public class Programe8 {

    public static void main(String[] args) {
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any alphabet to print City name:");// allow user to enter alphbet
        x = sc.next().charAt(0);
        Programe8.alpha(x);


    }


    public static char alpha(char x) {


        if (x == 'a') {
            System.out.println("Ahmedabad");
        } else if (x == 'b') {
            System.out.println("Baroda");
        } else if (x == 'c') {
            System.out.println("Calcutta");
        } else if (x == 'd') {
            System.out.println("Darjiling");
        } else if (x == 'e') {
            System.out.println("Ealing");
        } else if (x == 'f') {
            System.out.println("Fatehpur");
        } else {
            System.out.println("invalid entry");



        }
        return x;
    }

}























