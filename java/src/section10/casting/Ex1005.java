package section10.casting;

class Animal {

}
class Dog extends Animal {
    
}
class HouseDog extends Dog {

}
class Cat extends Animal {

}
class Housecat extends Cat {

}

public class Ex1005 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal ad = new Dog();
        Animal ahd = new HouseDog();
        Animal ac = new Cat();
        Animal ahc = new Housecat();

        // Dog a1 = (Dog) a;
        Dog ad1 = (Dog) ad;

        System.out.println(ad1);

        // HouseDog hd = (HouseDog)ad1;

        HouseDog hd1 = (HouseDog) ahd;
        System.out.println(hd1);

        Dog hd2 = (Dog)ahd;

        // Cat c1 = (Cat)ad;

        // 1. 자식에서 부모 타입 형변환 자동
        // 2. 부모에서 자식 타입 형변환 강제 (조건: 자식에서 부모 타입으로 형변환된 경우)

    }
    
}
