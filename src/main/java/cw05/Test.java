package cw05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(1000);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(0);
        list.add(7);
        System.out.println(list);

        list.set(0, 777);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.contains(777));
        System.out.println(list.contains(77));

        List<Integer> anotherList = Arrays.asList(7, 7, 7);
        list.addAll(0, anotherList);
        System.out.println(list);

        System.out.println(list.indexOf(777));

        List<Integer> subList = list.subList(0, 4);
        System.out.println(subList);
    }
}
