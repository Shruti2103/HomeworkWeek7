package homeworkweek7;
//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
// Sales amount >= 50,000 35%
// Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%


import java.util.Scanner;

public class Programe7 {
    public static void main(String[] args) {
        Programe7.sales();// calling by classname

    }

    // Define static method
    public static void sales() {

        Scanner st = new Scanner(System.in);
        System.out.println("Enter Sales id");
        int id = st.nextInt();
        System.out.println("Enter sellers name");
        String name = st.next();
        System.out.println("Enter sales amount");
        int amt = st.nextInt();
        System.out.println("Enter salary basic");
        int basic = st.nextInt();

        float commission;

        if (amt >= 50000) {
            commission = amt * 0.35f;
        } else if (amt >= 30000) {
            commission = amt * 0.20f;
        } else if (amt >= 20000) {
            commission = amt * 0.10f;
        } else if (amt >= 10000) {
            commission = amt * 0.05f;
        } else if (amt < 10000) {
            commission = 0.02f;
        } else
            commission=0;
        System.out.println("The comission is :" +commission);



    }


}