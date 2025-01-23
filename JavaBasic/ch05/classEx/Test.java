package JavaBasic.ch05.classEx;

public class Test {
    public static void main(String[] args) {
        // 참조타입 객체 생성 == 비교
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyClass mc3 = mc1;

        System.out.println(mc1 == mc2);
        System.out.println(mc1 == mc3);

        // null
        System.out.println(mc1);
        // local 변수는 사용 전 반드시 초기화가 되어야 한다.
        MyClass mc4;
//        System.out.println(mc4);
    }
}
