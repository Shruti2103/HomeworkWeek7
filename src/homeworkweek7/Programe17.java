package homeworkweek7;
//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Programe17 {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1889, 2013,
                1458, 2458, 1254, 2365,
                1453, 2156, 2456};


        String[] my_array2 = {
                "Java",
                "Python",
                "php",
                "c",
                "c Programming",
                "c++"

        };
        System.out.println("Original numeric array :" + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array:" + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array:" + Arrays.toString((my_array2)));// output in sorting form


    }


}
