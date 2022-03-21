package homeworkweek7;

//Write a Java program to test if an array contains a specific value
public class Programe20 {

    public static void main(String[] args) {
        Programe20.test3();// call method by class


    }

    public static void test3() {
        int[] num = {5, 6, 7, 8, 9};
        int tofind = 6;//we need to find 6
        boolean found = false;
        for (int n : num) {
            if (n == tofind) {        // to find number
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(tofind + "  is found.");
        else
            System.out.println(tofind + "  is not found");
    }


}
