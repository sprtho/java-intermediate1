package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; // String 객체 == new String("hello")로 변환해줌
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
}
