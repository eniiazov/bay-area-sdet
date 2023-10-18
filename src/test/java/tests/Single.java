package tests;

public class Single {

    private static Single single;

    public static void main(String[] args) {
        System.out.println(getLargest("xyz123pqr789"));
    }

    private Single(){
        single = new Single();
    }

    public static Single getInstance(){
        if (single != null){
            return single;
        }else {
            new Single();
            return single;
        }
    }

    public static int getLargest(String str){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++){
            StringBuilder sb = new StringBuilder();
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                sb.append(c);
                for (int j = i+1; j < str.length(); j++){
                    if (Character.isDigit(str.charAt(j)))
                        sb.append(str.charAt(j));
                    else
                        break;
                }
                int temp = Integer.parseInt(sb.toString());
                if (temp > max)
                    max = temp;
            }


        }
        return max;
    }

}
