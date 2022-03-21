package homeworkweek7;

public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    //instance method
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String setFirstName(String fName) {
        firstName=fName;
        return firstName;
    }

    public String setLastName(String lName) {
        lastName=lName;
        return lastName;
    }

   // public int  age(int age) {
      //  return age;

// declare an instance method with return data type

    public int setAge(int age1) {
        if (age1 >=0 || age1 <= 100) {
            return age = age1;
        } else {
            return age;

        }

    }
// instance method without any perameter Teenwithoutanyperameter

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }


    }

    public String getFullName(){


        if (firstName.isEmpty()){
            return firstName;
        }
        if (lastName.isEmpty()){
            return lastName;
        }
        if (firstName.isEmpty() & lastName.isEmpty()){
           return " ";
     }
        String fullName=(firstName +"       " +lastName);


        return fullName;



}
}
