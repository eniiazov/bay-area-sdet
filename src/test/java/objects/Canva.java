package objects;

public class Canva {

    public static void main(String[] args) {

        User user1 = new User();
        user1.name = "Esen";
        user1.age = 31;
        user1.email = "esen@gmail.com";
        User user2 = new User();
        user2.name = "James";
        System.out.println(user1.name);
        System.out.println(user2.name);
        user1.createGroup("SDET");
        user2.createGroup("Studio Team");

    }
}
