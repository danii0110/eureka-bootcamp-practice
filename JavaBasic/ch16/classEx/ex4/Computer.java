package JavaBasic.ch16.classEx.ex4;

public class Computer {
    public static int staticMethod(int x, int y) {
        return x + y;
    }

    // non static
    public int instanceMethod(int x, int y) {
        return x * y;
    }
}
