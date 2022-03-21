package homeworkweek7;
/*Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years
they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above
 */
import java.util.Scanner;

public class Programe4 {

    public static int leapyear(int x) {
        int year=x;// if condition is used for leap year
        if (x>0 && x<9999) {
            if (x % 400 == 0) {
                System.out.println("Year is leap year");
            } else if ((x % 400 == 0) && (x % 100 != 0)) {
                System.out.println("Year is leap year");
            } else if ((x % 400 == 0) && (x % 100 != 0) && (x % 100 == 0)) {
                System.out.println("Year is a leap year");
            } else {
                System.out.println("Year is  not a leap year");
            }}else{
            System.out.println("Year is not a valid entry");
        }
        return year;
    }
     // switch statment for days in month calculation
    public static int getdaysinmonth(int month ,int year) {
        int daysinmonth = 0;

        switch (month) {
            case 1: //jan
            case 3://mar
            case 5://may
            case 7://july
            case 8://aug
            case 10://oct
            case 12://dec
                daysinmonth = 31;
                break;
            case 4://apr
            case 6://jun
            case 9://sept
            case 11://nov
                daysinmonth = 30;
                break;
            case 2://feb
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    daysinmonth = 29;
                } else {
                    daysinmonth = 28;
                }
                break;
            default:
                System.out.println("return -1");
                break;
        }
        return daysinmonth;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year1=obj.nextInt();
        leapyear(year1);
        System.out.println("Enter a month");
        int month1= obj.nextInt();
        //int year2 = obj.nextInt();
        System.out.println(getdaysinmonth(month1,year1));
    }
}


