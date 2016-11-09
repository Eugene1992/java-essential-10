package cw08;

public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        s3 = s3.intern();

        System.out.println(s1 == s3);


        s1 = s1 + " world!" + "!!";

        s1 = new StringBuilder(s1).append(" world!").append("!!").toString();

        System.out.println(s1);

    }
}
