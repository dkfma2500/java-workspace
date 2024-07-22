package section15.practice.p03;

import java.util.Arrays;

public class Practice1503 {
    public static void main(String[] args) {
        // 문자열 길이 구하기
        String str = "hello, World!";
        System.out.println("1: " + str.length());

        // 두 문자열 비교
        String str1 = "Hello";
        String str2 = "hello";
       
        if (str1.equals(str2)){
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        String firstName = "일남";
        String lastName = "김";

        System.out.println(lastName + firstName);

        String str3 = "Hello, World!";
        str3 = str3.substring(7, 12);
        System.out.println("4: " + str3);

        String str4 = "Hello, World!";
        String replaceStr4 = str4.replaceAll("o","0");
        System.out.println("5: " + replaceStr4);

        String str5 = "Apple, Banana, Cherry";
        String[] fruits = str5.split(", ");
        System.out.println("6: "+ Arrays.toString(fruits));

        String str6 = "    Hello, World!";
        String trimmedStr6 = str6.trim();
        System.out.println("7: " + trimmedStr6);

    }
}
