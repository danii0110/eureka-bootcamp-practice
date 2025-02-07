package basic.input;

import java.io.*;

public class IOTest2 {
    static int TEST_SIZE = 100_000;  // 입력 크기 조절
    static final String FILE_PATH = "basic/input/input.txt"; // 파일 경로

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.err.println("파일이 존재하지 않습니다: " + FILE_PATH);
            return;
        }

        // 3. BufferedReader + System.out.print (숫자 출력 제거)
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        long start = System.nanoTime();
        int count = 0;
        String line;
        while ((line = br.readLine()) != null && count < TEST_SIZE) {
            count++;
        }
        long end = System.nanoTime();
        System.out.println("BufferedReader + print: " + (end - start) / 1_000_000.0 + "ms");
        br.close();

        // 4. BufferedReader + BufferedWriter (숫자 출력 제거)
        br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        start = System.nanoTime();
        count = 0;
        while ((line = br.readLine()) != null && count < TEST_SIZE) {
            count++;
        }
        bw.flush();
        end = System.nanoTime();
        System.out.println("BufferedReader + BufferedWriter: " + (end - start) / 1_000_000.0 + "ms");
        br.close();
        bw.close();
    }
}