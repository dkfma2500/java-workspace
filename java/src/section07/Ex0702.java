package section07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex0702 {
    public static void main(String[] args) {
        int[] oddArrObject;
        oddArrObject = new int[] { 1, 3, 5, 7, 9 };

        System.out.println(Arrays.toString(oddArrObject));

        int[] intArr = new int[5];
        System.out.println("before - Arrays.toString(intArr)\t: " + Arrays.toString(intArr));

        intArr[0] = 1;
        intArr[1] = 1;
        intArr[2] = 1;
        intArr[3] = 1;
        intArr[4] = 1;

        System.out.println("after - Arrays.toString(intArr)\t\t: " + Arrays.toString(intArr));

        // String[] strArr = new String[5];
        // System.out.println(Arrays.toString(strArr));
    }
}
