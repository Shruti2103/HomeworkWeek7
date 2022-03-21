package homeworkweek7;

// Write a Java program to calculate the average value of array elements.
public class Programe19 {
    public static void main(String[] args) {
        Programe19.test();


    }
      // define static method
    public static void test() {
        int[] numbers = new int[]{10, 20, 15, 25, 16, 60, 100};// define array

        int sum = 0;//Average value of array elements would be sum of all elements/total number of elements

        for (int i = 0; i < numbers.length; i++)
            sum += i;// calculate sum of array elements

        double average = sum / numbers.length;// formula for average
        System.out.println("Average value of array element is: " + average);


    }


}
















