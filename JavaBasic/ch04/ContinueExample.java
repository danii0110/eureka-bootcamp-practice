package JavaBasic.ch04;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
            }
            System.out.print(i + " "); // 홀수는 실행되지 않는다.
        }
    }
}