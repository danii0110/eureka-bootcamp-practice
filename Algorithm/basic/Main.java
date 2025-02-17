package basic;

import java.io.*;
import java.util.*;

class Main {
    static int n, m;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1]; // 방문 여부 체크 배열
        result = new int[m]; // 결과를 저장할 배열

        dfs(0);

        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == m) { // M개의 숫자를 모두 선택한 경우
            for (int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) { // 중복 방지
                visited[i] = true;
                result[depth] = i; // 현재 숫자를 선택
                dfs(depth + 1); // 다음 깊이 탐색
                visited[i] = false; // 원상복구 (백트래킹)
            }
        }
    }
}