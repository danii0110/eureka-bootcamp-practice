package JavaBasic.ch07.classEx;

public class Child extends Parent {
    public Child() {
//        super(); // 없으면 컴파일러가 넣어준다.

        super(1);
    }

    // 부모와 중복된 필드
//    int n = 20;

    public void m() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
