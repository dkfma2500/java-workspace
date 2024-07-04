package section05;

public class Ex0501 {
    public static void main(String[] args) {
        int count = 0;
        
        // 반복 회수가 정해져 있지 않았을 때 효과적
        while (true) {
            System.out.printf("무한 루프(Infinite loop) - %d\n", ++count);
        }
    }
    
}
