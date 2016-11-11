package hw5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Марина on 11.11.2016.
 */
public class TestTime {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        List<String> al = new ArrayList<>();
        int count = 100000;

        for (int i = 0; i < count; i++) {
            al.add("Hello");
        }
        for (int i = 0; i < count; i++) {
            ll.add("Hello");
        }
        //////////////////////////////////////////////////////////////
        System.out.println("Add in middle");
        long startALaddToMiddle = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            al.add(al.size() / 2, "Hello");
        }
        long endALaddToMiddle = System.currentTimeMillis();

        System.out.println(endALaddToMiddle - startALaddToMiddle);

        long startLLaddToMiddle = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            ll.add(ll.size() / 2, "Hello");
        }
        long endLLaddToMiddle = System.currentTimeMillis();
        System.out.println(endLLaddToMiddle - startLLaddToMiddle);
        //////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////
        System.out.println("Add in start");
        long startALaddToStart = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            al.add(0, "Hello");
        }
        long endALaddToStart = System.currentTimeMillis();

        System.out.println(endALaddToStart - startALaddToStart);

        long startLLaddToStart = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            ll.add(0, "Hello");
        }
        long endLLaddToStart = System.currentTimeMillis();
        System.out.println(endLLaddToStart - startLLaddToStart);
        /////////////////////////////////////////////////////////
        System.out.println("Add in end");

        long startALaddToEnd = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            al.add("Hello");
        }
        long endALaddToEnd = System.currentTimeMillis();

        System.out.println(endALaddToEnd - startALaddToEnd);

        long startLLaddToEnd = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            ll.add("Hello");
        }
        long endLLaddToEnd = System.currentTimeMillis();
        System.out.println(endLLaddToEnd - startLLaddToEnd);
    ////////////////////////////////////////////////////////////////
        for (int i = 0; i < count; i++) {
            al.remove("Hello");
        }
        for (int i = 0; i < count; i++) {
            ll.remove("Hello");
        }
//        System.out.println("Remove in start");
//        long startALrem = System.currentTimeMillis();
//        for (int i = 0; i < count; i++) {
//            al.remove(0, "Hello");
//        }
//        long endALrem = System.currentTimeMillis();
//
//        System.out.println(endALaddToEnd - startALaddToEnd);
//
//        long startLLrem = System.currentTimeMillis();
//        for (int i = 0; i<count; i++){
//            ll.remove(0, "Hello");
//        }
//        long endLLrem = System.currentTimeMillis();
//        System.out.println(endLLrem-startLLrem);
//////////////////////////////////////////////////////////////
//        System.out.println("Remove in middle");
//        long startALremMid = System.currentTimeMillis();
//        for (int i = 0; i < count; i++) {
//            al.remove(al.size() / 2, "Hello");
//        }
//        long endALremMid = System.currentTimeMillis();
//
//        System.out.println(endALaddToEnd - startALaddToEnd);
//
//        long startLLremMid = System.currentTimeMillis();
//        for (int i = 0; i<count; i++){
//            ll.remove(ll.size()/2, "Hello");
//        }
//        long endLLremMid = System.currentTimeMillis();
//        System.out.println(endLLremMid-startLLremMid);
        ///////////////////////////////////////
        System.out.println("remove in end");
        long startALremEnd = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            al.remove( "Hello");
        }
        long endALremEnd = System.currentTimeMillis();

        System.out.println(endALaddToEnd - startALaddToEnd);

        long startLLremEnd = System.currentTimeMillis();
        for (int i = 0; i<count; i++){
            ll.remove( "Hello");
        }
        long endLLremEnd = System.currentTimeMillis();
        System.out.println(endLLremEnd-startLLremEnd);
    }
}
