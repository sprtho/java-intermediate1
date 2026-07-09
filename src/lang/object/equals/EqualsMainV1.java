package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));

        String s1 = "time";
        String s2 = "time";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("identity = " + (s1 == s2));
        System.out.println("equality = " + (s1.equals(s2)));

    }
}
