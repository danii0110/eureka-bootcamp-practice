package JavaBasic.ch07.classEx;

public class Test {
    public static void main(String[] args) {
        // 상속
//        {
//            Parent p = new Parent();
//            Child c = new Child();
//        }

        // Parent 생성자 추가, 필드 추가
        {
            Child c = new Child();
            c.m();
        }

        // Up Casting, Down Casting
        {
            Parent p = new Child();

            Child c = new Child();
            Parent p2 = c;

            c.m();
//            p2.m();

            Child c2 = (Child) new Parent(1); // 문법적 오류는 없지만 ClassCastException 발생

            // 명시적으로 Casting 하는 것은 되도록 지양
        }
    }
}
