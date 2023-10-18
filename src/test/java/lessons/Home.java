package lessons;

public class Home {

    public static void main(String[] args) {
        String name = "Aizirek";
        String someName = name.toUpperCase();

        int size = name.length();

        char firstLetter = name.charAt(0);
        System.out.println(firstLetter);

        System.out.println(name.contains("ne"));
        System.out.println(name.indexOf("s"));

        // substring
        System.out.println(name.substring(2, 4));

        String city = "Aizirek";

        System.out.println(name.equals(city));


    }
}
