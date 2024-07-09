package section07;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class Ex0704 {
    public static void main(String[] args) {
        int[] numbers = {30, 10, 50, 20, 40};

        System.out.println("정렬 전 : "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("정렬 후 : " + Arrays.toString(numbers));

        Integer[] integerNumbers = {30, 10, 50, 20, 40};

        //Arrays.sort(integerNumbers, Collection.reberseOrder());
        
        System.out.println("정렬 후 : " + Arrays.toString(integerNumbers));


    }
    
}
