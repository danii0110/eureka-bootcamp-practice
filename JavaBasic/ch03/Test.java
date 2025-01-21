package JavaBasic.ch03;

public class Test {
    public static void main(String[] args) {
//        // 증강 연산자
//        int x = 10;
//        int y = 10;
//
//        x++;
//        ++x;
//
//        System.out.println(x);
//        System.out.println(++x); // println()에 값이 전달되기 전에 x가 1 증가한다.
//        System.out.println(x++); // println()에 값이 전달되고 난 후 x가 1 증가한다.
//        System.out.println(x);
//
//        // 여러분이 y로 -- 테스트 코드 작성

        // 논리 연산자
//        {
//            int x = 10;
//            int y = 10;
//
//            if (++x == 10 && y++ == 10) {
//                System.out.println("A");
//            } else {
//                System.out.println("B");
//            }
//
//            // x, y 모두 11
//            System.out.println(x);
//            System.out.println(y);
//
//            if (++x == 12 && y++ == 11) {
//                System.out.println("C");
//            } else {
//                System.out.println("D");
//            }
//
//            // x, y 모두 12
//            System.out.println(x);
//            System.out.println(y);
//
//            // && -> ||
//            if (++x == 13 || y++ == 12) {
//                System.out.println("E");
//            } else {
//                System.out.println("F");
//            }
//
//            // x는 먼저 비교되어 true로 변경(x는 증가)
//            // y는 앞의 x 비교식에서 true로 이미 판명이 나서 전체 OR 연산이 true로 판명되어서 y++ == 12 비교식은 수행 X
//            // x는 13, y는 12
//            System.out.println(x);
//            System.out.println(y);
//
//            // 여러분은 OR ||로 진행하면서 &&, & 하는 예제를 만들어 보세요.
//            // 조별 활동에서 결과값을 예측하는 Quiz도 만들어 보세요.
//        }

        // 삼항 연산자
//        {
//            int score = 85;
//            // ....
//            // score > 90일 때 'A'
//            // 80 <= score <= 90일 때 'B'
//            // score < 80일 때 'C'
//            char grade = score > 90 ? 'A' : 'B';
//            System.out.println(grade);
//        }

        // 나눗셈
        int a = 10;
        double b = a / 3;
        System.out.println("b = " + b);
    }
}
