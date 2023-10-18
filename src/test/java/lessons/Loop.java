package lessons;

public class Loop {

    public static void main(String[] args) {
        int result = add(12,5);
    }

    public static int add(int a, int b){
        // coding here and in the end i must return int
        // we use 'return' keyword
        int sum = a + b;
        return sum;
    }



    public static void welcome(){
        System.out.println("Welcome to the program!");
        System.out.println("Hope you will enjoy!");
    }

    // °F = °C × (9/5) + 32
    public static void celsiusToFahrenheit(int celsius){
        double result = celsius * (9/5) + 32;
        System.out.println(celsius + " is: " + result + " fahrenheit");
    }

    // Create a method that prints out the given String the given times in the parameter
    public static void printWord(String word, int n){
        for (int i = 0; i < n; i++){
            System.out.println(word);
        }
    }




}
