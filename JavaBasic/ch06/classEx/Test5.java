package JavaBasic.ch06.classEx;

public class Test5 {
    public static void main(String[] args) {
        // private
        A a = new A();

        //public
        int x = a.n2;

        // default
//        int x = a.n3 // not visible <- 다른 패키지
    }
}
