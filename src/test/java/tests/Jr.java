package tests;

public class Jr {

    public static void main(String[] args) {
        String str = "AAabBCCdE";
//        String newOne = getMe(str);
        System.out.println(palindrome("deified"));
    }
    public static String getMe(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){

            int count = 0;
            char c = str.charAt(i);
            if (sb.toString().contains(c+""))
                continue;
            for (int j = 0; j < str.length(); j++){
                if (c == str.charAt(j)){
                    count++;
                }
            }
            sb.append(count).append(c);
            count = 0;
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static boolean palindrome(String str){
        str = str.toLowerCase().trim();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
