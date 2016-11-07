package cw07.local;

import java.io.Serializable;

public class Test {
    private static int s = 10;
    private int ns = 10;

    public static void main(String[] args) {
        final int f = 10;
        int nf = 100;
        nf = 100;
        int ef = 10; // effectively final

        class HomeCat extends Cat implements Serializable {
            private String address;

            public HomeCat(String address) {
                this.address = address;
            }

            @Override
            public void move() {
                System.out.println(s);
                System.out.println(f);
//                System.out.println(nf);
                System.out.println(ef);
            }
        }

        HomeCat hc1 = new HomeCat("Kiev");
        HomeCat hc2 = new HomeCat("Lvov");
    }

    public void f(final int arg) {

    }
}
