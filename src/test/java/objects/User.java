package objects;

public class User {
    String name;
    int age;
    String email;
    long phoneNumber;
    boolean isAdmin;

    public void createGroup(String groupName){
        if (groupName.isEmpty()){
            System.out.println("Group creation failed! by " + this.name);
        }
        else {
            System.out.println(this.name + " created group successfully: " + groupName);
        }
    }
}
