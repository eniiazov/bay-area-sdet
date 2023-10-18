package lessons;

public class Screen {

    public static void main(String[] args) {
        /*String: is the data type used to store words.

	int: data type to store numbers. Whole numbers only.

	double: stores numbers with fractions. Ex: 12.4

	boolean: stores true or false information only.

         */
        // Assignment statement
        String name = "James";
        int age = 31;
        double distance = 4000.12;
        char letter = '2';
        boolean isAmerican = true;

        System.out.println(distance);
        distance = age + distance;
        System.out.println(distance);
        // Age of James: 31
        System.out.println("Age of " + name + ": " + age);
        System.out.println(name + " is American: " + isAmerican);

        System.out.println(age + distance);
        System.out.println(age + name);

        String city;
        city = "London";

        System.out.println("End of program" + city);






    }
}
