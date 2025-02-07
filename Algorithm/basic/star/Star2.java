package basic.star;

public class Star2 {
    public static void main(String[] args) {
        int n = 4; // 피라미드의 빈 높이

        // 상단 피라미드
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 하단 피라미드
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
