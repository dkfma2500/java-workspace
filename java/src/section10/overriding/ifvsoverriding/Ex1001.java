package section10.overriding.ifvsoverriding;

class Animal {
    void cry(){}
}

class Pig extends Animal{
    
}
class Cow extends Animal{

}
class Tiger extends Animal{

}
class Lion extends Animal{

}

// 결합도 높다, 응집도 나다
class Farm {
    void sound(Animal animal){
        if (animal instanceof Pig) {
            System.out.println("꿀꿀");
        }
        if (animal instanceof Cow) {
            System.out.println("음메");
        }
        if (animal instanceof Tiger) {
            System.out.println("어흥");
        }
        if (animal instanceof Lion) {
            System.out.println("사자후");
        }

    }
}

public class Ex1001 {
    public static void main(String[] args) {
        Farm f = new Farm();
        Pig p = new Pig();
        Cow c = new Cow();
        Tiger t = new Tiger();
        Lion L = new Lion();

        f.sound(p);
        f.sound(c);
        f.sound(t);
        f.sound(L);
    }
}
