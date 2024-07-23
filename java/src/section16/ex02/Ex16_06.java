package section16.ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex16_06 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println("arrayList 소요 시간: " + duration);

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();

        duration = endTime - startTime;
        System.out.println("linkedList 소요 시간: " + duration);
    }
}
