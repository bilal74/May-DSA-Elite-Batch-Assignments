package classes;

public class Class1 {
    public static void main(String[] args){
        System.out.println("Hello");

        User user1 = new User();
        user1.setAge(12);
        System.out.println("User1 Age : "+ user1.getAge());

        User user2 = new User();
        user2.setAge(23);
        System.out.println("User2 Age : "+ user2.getAge());
    }
}
