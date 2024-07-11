package section10;



public class HouseDog extends Dog {
    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours" );

    }
    @Override
    void sleep(){
        super.sleep();
        System.out.println(this.name + "in house");

    }
}

