package lessons;

import java.util.Scanner;

public class Cat {

    public static void main(String[] args) {

        System.out.println("Number:");
        int size = new Scanner(System.in).nextInt();

        if (size < 14){
            System.out.println("Small ball");
            if (size > 0){
                System.out.println("Valid");
            }else if (size > -10 && size < 0){
                System.out.println("Invalid");
            }else{
                System.out.println("Else");
            }
        }
        else if(size > 14 || size < 30){
            System.out.println("medium size ball");
        }
        else{
            System.out.println("Big ball");
        }
    }
}
