package cw10.generic.gen_list_test;

import cw09.enum_example.InsertType;
import java.util.List;

public class ListTest<T> {

    private List<T> testedList;

    public ListTest(List<T> testedList) {
        this.testedList = testedList;
    }

    public long add(InsertType type, T value, int count) {
        long start = System.currentTimeMillis();
        if (type == InsertType.START) {
            for (int i = 0; i < count; i++) {
                testedList.add(0, value);
            }
        } else if (type == InsertType.MIDDLE) {
            for (int i = 0; i < count; i++) {
                testedList.add(testedList.size() / 2, value);
            }
        } else if (type == InsertType.END) {
            for (int i = 0; i < count; i++) {
                testedList.add(value);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


}
