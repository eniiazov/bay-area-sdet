package tests;

public class What {

    public static void main(String[] args) {

        int n = 55;
        int counter = n/2;
        for (int i = 0; i < n; i++){
            if (i <= n/2){
                for (int j = 0; j < i+1; j++){
                    System.out.print("*");
                }
            }else{
                for (int j = 0; j < counter; j++){
                    System.out.print("*");
                }
                counter--;
            }
            System.out.println();
        }
    }
}
