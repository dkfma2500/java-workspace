package section02;

public class StringType {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        System.out.println(a);
        System.out.println("---");
        System.out.println(b);
        System.out.println(a == b);

        System.out.println("---");

        // stack, heap
        String c = new String(original:"Java") // 객체 생성
        System.out.println(c);
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
    }
    
}
