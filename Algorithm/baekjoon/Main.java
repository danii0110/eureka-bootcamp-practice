package baekjoon;

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 빌딩의 개수
        int[] h = new int[n]; // 각 빌딩의 높이
        int count = 0;

        for (int i = 0; i < n; i++) { // 각 빌딩의 높이 입력
            h[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (h[i] > h[j]) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.print(count);
    }
}