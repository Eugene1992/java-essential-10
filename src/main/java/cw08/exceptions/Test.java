package cw08.exceptions;

public class Test {
    public static void main(String[] args) {
//        int[] arr = new int[Integer.MAX_VALUE];
        Test test = new Test();
        test = null;
        test.f();
    }

    void f(){
        f();
    }
}
