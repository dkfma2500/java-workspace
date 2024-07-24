package section19;

public class BoradExample1 {
    public static void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date","title");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "김일남", "2024.07.24","오징어게임1");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "김이남", "2024.07.24","오징어게임1");
    }

    public void mainMenu(){
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3. Clear | 4.Exit");
        System.out.println("메뉴 선택 : ");
        System.out.println();
    }
    public static void main(String[] args) {
        BoradExample1 boradExample1 = new BoradExample1();
        boradExample1.list();
        boradExample1.mainMenu();
    }
}
