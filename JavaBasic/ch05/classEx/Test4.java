package JavaBasic.ch05.classEx;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        // 다차원 배열
        {
            int[] intArray1 = new int[4]; // 1차원 배열
            int[][] intArray2 = new int[4][3]; // 2차원 배열
            int[][] intArray3 = new int[4][]; // 2차원 배열이지만 1차원까지만 만들어진다.
            intArray3[0] = new int[4];
            intArray3[1] = new int[2];
            intArray3[2] = new int[1];
            intArray3[3] = new int[10];
        }

        // 배열 + for
        {
            int[] intArray = {1, 2, 3, 4};
//            for (int i = 0; i < intArray.length; i++) {
//                System.out.println(intArray[i]);
//                intArray[i]++;
//            }
//            System.out.println(Arrays.toString(intArray));

            for (int i : intArray) {
                System.out.println(i);
                i++; // heap에 있는 원본 int 항목을 복사한 local 변수 i 변경, 원본 변화 X
            }
            System.out.println(Arrays.toString(intArray));
        }
    }
}
