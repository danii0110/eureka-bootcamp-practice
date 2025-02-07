package basic.array;

public class Array1 {
    public static void main(String[] args) {
        // #1. 주어진 배열의 원소들 중 제시된 규칙과 다른 항목이 몇 건??
        // 맨 앞부터 3개씩 묶어서 곱셈 결과가 맞으면 통과 틀리면 wrongCnt 증가
        // 3,2,6: 3 x 2 = 6 통과
        // 3,4,4: 3 x 4 = 12 != 4 wrongCnt
        {
            int[] intArray = {3, 2, 6, 3, 4, 4, 1, 4, 2, 2, 3, 6, 1, 3, 5, 1, 5, 1, 1, 1, 1, 2, 4, 2, 2, 2, 4};
            int wrongCnt = 0;

            // 구현
            for (int i = 0; i < intArray.length / 3; i++) {
                if (intArray[0 * i] * intArray[1 * i] == intArray[2 * i]) {
                    continue;
                } else {
                    wrongCnt++;
                }
            }
            System.out.println(wrongCnt);
        }
    }
}
