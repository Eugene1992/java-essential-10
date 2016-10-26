package cw02.ref_value;

/**
 * Created by Evgeniy on 26.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    static int fac(int num) {
        if (num == 1) return 1;
        return fac(num - 1) * num;
    }
}
