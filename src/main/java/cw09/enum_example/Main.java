package cw09.enum_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int count = 10_000;
        ListTest arrayListTest = new ListTest(new ArrayList<>());

        long addToStartAL = arrayListTest.add(InsertType.START, "Hello", count);
        System.out.println("add to AL start - " + addToStartAL);

        long addToMiddleAL = arrayListTest.add(InsertType.MIDDLE, "Hello", count);
        System.out.println("add to AL start - " + addToMiddleAL);

        long addToEndAL = arrayListTest.add(InsertType.END, "Hello", count);
        System.out.println("add to AL start - " + addToEndAL);

        InsertType[] values = InsertType.values();
        for (InsertType value : values) {
            System.out.println(value);
        }

        InsertType type = InsertType.END;

        String typeName = type.name();
        System.out.println(typeName);

        int typeOrdinal = type.ordinal();
        System.out.println(typeOrdinal);

        switch (type) {
            case END:
                System.out.println("End");
        }
    }
}
