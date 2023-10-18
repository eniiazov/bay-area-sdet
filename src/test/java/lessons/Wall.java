package lessons;

import java.util.Random;

public class Wall {

    public static void main(String[] args) {
        char c = 'Z';
        int i = c;
        System.out.println(i);

        String city = "London";
        char cc = city.charAt(0);
        int a = cc;
        System.out.println(a);
        if (a >= 65 && a <= 90){
            System.out.println("It is capital");
        }else {
            System.out.println("Lower case");
        }
    }
}
