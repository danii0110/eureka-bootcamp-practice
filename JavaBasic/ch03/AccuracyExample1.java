package JavaBasic.ch03;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit; // 1 - 0.7 = 0.3 => 결과: 0.29999999999999993
        System.out.println("사과 1개에서 남은 양 = " + result);
    }
}
