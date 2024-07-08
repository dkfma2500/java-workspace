package section06;

import java.util.Scanner;

public class Practice0603 {
    public static void main(String[] args) {
        // 1~10까지의 홀수의 합 : 25
        int sum = 0;
        System.out.printf("1부터 10까지의 홀수의 합: %d", sum);
        for(int i=1 ;i <= 10; i++  ){
         if(i % 2 != 0){
            sum += i;
         }
        }
    }
    Scanner scanner = new Scanner(System.in);


}

