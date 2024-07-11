package section10.finalexample;

class NomalMethod {
    void nomalMethod(){
        System.out.println("nomalMethod!");
    }

}

class ChildNomalMethod extends NomalMethod {

}
class FinalMethod {

}

class ChildFinalMethod extends FinalMethod {

}

public class Ex1004 {
    public static void main(String[] args) {
        ChildNomalMethod cnm = new ChildNomalMethod();
        System.out.println(cnm);
    }
    
}
