package JavaBasic.ch04;

public class Test2 {
    public static void main(String[] args) {
        // for
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        // 변수 2개
//        for (int i = 0, j = 2; i < 10 && j > 0; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }

        // nested
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%d %d  ", i, j);
            }
        }
    }
}
