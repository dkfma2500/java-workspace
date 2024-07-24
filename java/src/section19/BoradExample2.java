package section19;

import java.util.Scanner;

public class BoradExample2 {

    private Scanner scanner = new Scanner(System.in);

    public static void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "김일남", "2024.07.24", "오징어게임1");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "김이남", "2024.07.24", "오징어게임1");
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3. Clear | 4.Exit");
        System.out.println("메뉴 선택 : ");
        String menuNo = scanner.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1":
                create();
                break;
            case "2":
                read();
            case "3":
                clear();
            case "4":
                exit();

        }
    }

    public void create() {

        System.out.println("create() 메서드 실행");
        list();
    }

    public void read() {

        System.out.println("read() 메서드 실행");
        list();
    }

    public void clear() {

        System.out.println("clear() 메서드 실행");
        list();
    }

    public void exit() {

        System.out.println("exit() 메서드 실행");
        list();
    }

    public static void main(String[] args) {
        BoradExample2 boradExample2 = new BoradExample2();
        boradExample2.list();
    }}
