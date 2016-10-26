package cw02.ref_value;

public class RefValue {
    public static void main(String[] args) {
        int k = 10;
        changeValue(k);
        System.out.println(k);

        int[] arr = {1, 2, 3};
        changeValue(arr);
        System.out.println(arr[0]);
    }

    static void changeValue(int k) {
        k = 100;
    }

    static void changeValue(int[] arr) {
        arr[0] = 100;
    }
}
