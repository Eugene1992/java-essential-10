package cw08.exceptions;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("Some statement...");
        } catch (Exception e) {
//            System.exit(0);
//            while (true);
            e.printStackTrace();
            throw new Error();
        } finally {
            System.out.println("Finally");
        }
    }
}
