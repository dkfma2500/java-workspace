package section07;

import java.util.Arrays;

public class Ex0708 {
    public static void main(String[] args) {
        int[][] arrs = new int[3][4];

        int index = 0;
        for (int[] arr : arrs) {
            System.out.println("index" + index + " : " + Arrays.toString(arr));
            index++;

            System.out.println();

        }
        int[][] copiedArrs = Arrays.copyOf(arrs, arrs.length);
        arrs[0][0] = 100;
        
        for (int[] arr : arrs) {
            System.out.println("index" + index + " : " + Arrays.toString(arr));
            index++;

            System.out.println();

      
        
    }
    System.out.println();

        index = 0;
        for (int[] arr : copiedArrs) {
            System.out.println("index" + index + " : " + Arrays.toString(copiedArrs));
            index++;
        }
}
}
