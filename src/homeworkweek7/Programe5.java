package homeworkweek7;
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
// HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
// PF= Basic salary 20%
// Gross salary = basic salary + HRA + TA + DA –PF

import java.util.Scanner;

public class Programe5 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.println("Enter Employee id");
        int q = sx.nextInt();
        System.out.println("Enter Employee name");
        String name = sx.next();
        System.out.println("Enter basic salary");
        float r = sx.nextFloat();

        float hra = (r * 0.10f);// calculate hra
        float da = (r * 0.08f);
        float ta = (r * 0.09f);
        float pf = (r * 0.20f);
        float gs = (r + hra + ta + da - pf);// formula for gross salary
        System.out.println("--------------------------------------");
        System.out.println("|           Salary Slip                |");
        System.out.println("|-------------------------------------- |");
        System.out.println("|Emplyee Id              :      " + q + " |");
        System.out.println("|Emplyee name       :    " + name + "       |");
        System.out.println("|---------------------------------------- |");
        System.out.println("|Basic Salary       :   " + r + "             |");
        System.out.println("|HRA     10%        :    " + hra + "          |");
        System.out.println("| TA     8%         :      " + ta + "         |");
        System.out.println("|  DA     9%        :      " + da + "         |");
        System.out.println("|  PF  -20&         :      " + pf + "         |");
        System.out.println("|                                         |");
        System.out.println("|------------------------------------------ |");
        System.out.println("|Gross Salary      :       " + gs + "           |");
        System.out.println("|============================================ |");





    }


}







