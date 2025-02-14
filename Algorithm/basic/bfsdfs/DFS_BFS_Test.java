package basic.bfsdfs;

// 2차원 배열 상하좌우 탐색을 통한 dfs, bfs
// 한 번 방문한 좌표는 다시 방문 X
public class DFS_BFS_Test {
    static int[][] map = {
            {0,  0,  0,  0,  0,  0,  0},
            {0, 11, 12, 13, 14, 15, 16},
            {0, 21, 22, 23, 24, 25, 26},
            {0, 31, 32, 33, 34, 35, 36},
            {0, 41, 42, 43, 44, 45, 46},
            {0, 51, 52, 53, 54, 55, 56},
            {0, 61, 62, 63, 64, 65, 66},
    };

    // 상 - 하 - 좌 - 우 순서
    static int[] dy = { -1, 1,  0, 0 };
    static int[] dx = {  0, 0, -1, 1 };

    public static void main(String[] args) {

    }
}