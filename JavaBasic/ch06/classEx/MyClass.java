package JavaBasic.ch06.classEx;

public class MyClass {
    // 생성자가 없을 때
    // final int num;
    // 컴파일러가 생성자가 없으므로 기본 생성자를 추가해줌.

//    final int num = 20;

    // 생성자를 통한 초기화
    final int num;

    public MyClass(int num) {
        this.num = num;
    }
}
