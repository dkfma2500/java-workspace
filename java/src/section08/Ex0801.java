package section08;

public class Ex0801 {
    String owner;
    
    // 1. 인수 x , 반환값 x
    // void 메서드의 반환값이 없다는걸 알려주는것
    void onCalc() {
        System.out.println("계산기 전원이 켜졌습니다.");
    }

    // 2. 인수x, 반환값 o
    double pie() {
        return 3.14;
    }

    // 3. 인수o, 반환값o
    int add(int num1, int num2, int num3){
        int result = num1+ + num2 + num3;
        return result;
    }

    // 4. 인수o, 반환값x
    void offcaic(String name) {
        owner = name;
        System.out.println(owner + "님 안녕히 계세요!");
    }

    public static void main(String[] args) {
        Ex0801 cal = new Ex0801();
        cal.onCalc();
        double value = cal.pie();
        System.out.println(5 * 5 * value);
        int value2 = cal.add(1, 2, 3);
        System.out.println(value2);
        // cal.offCalc("김일남");
    }
}
