package JavaBasic.ch08.classEx;

// 하나에 두 개를 구현
public class MyIFImpl1 implements MyIF, YourIF{
    @Override
    public void m() {
        System.out.println("MyIFImpl1");
    }

    @Override
    public void m2() {
        System.out.println("MyIFImpl2");
    }
}
