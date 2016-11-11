package cw06.lists_hw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        List<String> al = new ArrayList<>();
        int count = 10_000;

        for (int i = 0; i < count; i++) {
            al.add("Hello");
        }
        for (int i = 0; i < count; i++) {
            ll.add("Hello");
        }

        long startALaddToEnd = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            al.add(al.size() / 2, "Hello");
        }
        long endALaddToEnd = System.currentTimeMillis();

        System.out.println(endALaddToEnd - startALaddToEnd);

        long startLLaddToEnd = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            ll.add(ll.size() / 2, "Hello");
        }
        long endLLaddToEnd = System.currentTimeMillis();
        System.out.println(endLLaddToEnd - startLLaddToEnd);


    }
}
