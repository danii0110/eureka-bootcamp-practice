package JavaBasic.ch16.classEx.ex4;

// 1개의 추상메소드 = @FunctionalInterface

@FunctionalInterface
public interface Calculable {
    public int calculate(int x, int y); // return이 있다.
}
