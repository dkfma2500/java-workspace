package section07;

public class Practice0707 {
    public static void main(String[] args) {
        int[][] arrs = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 },

        };

        int sum = 0;

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                sum += arrs[i][j];
            }
        }

        System.out.println("for - 배열의 모든 요소의 합: " + sum);
        System.out.println();

        
        for (int[] arr : arrs) {
            for (int number : arr) {
                sum += number;

            }
        }
        System.out.println("for - 배열의 모든 요소의 합: " + sum);

    }

}
