package basic.input;

import java.io.*;
import java.util.Scanner;

public class IOTest {
    static int TEST_SIZE = 100_000;
    static final String FILE_PATH = "basic/input/input.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.err.println("파일이 존재하지 않습니다: " + FILE_PATH);
            return;
        }

        double timeScannerPrint, timeScannerBufferedWriter, timeBufferedReaderPrint, timeBufferedReaderBufferedWriter;

        // 1. Scanner + System.out.print (실제 출력 수행)
        Scanner scanner = new Scanner(new File(FILE_PATH));
        long start = System.nanoTime();
        int count = 0;
        while (scanner.hasNextInt() && count < TEST_SIZE) {
            System.out.print(scanner.nextInt() + " "); // 실제 출력 추가
            count++;
        }
        long end = System.nanoTime();
        timeScannerPrint = (end - start) / 1_000_000.0;
        scanner.close();

        // 2. Scanner + BufferedWriter (실제 출력 수행)
        scanner = new Scanner(new File(FILE_PATH));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        start = System.nanoTime();
        count = 0;
        while (scanner.hasNextInt() && count < TEST_SIZE) {
            bw.write(scanner.nextInt() + " "); // 실제 출력 추가
            count++;
        }
        bw.flush(); // 반드시 flush() 수행
        end = System.nanoTime();
        timeScannerBufferedWriter = (end - start) / 1_000_000.0;
        scanner.close();

        // 3. BufferedReader + System.out.print (실제 출력 수행)
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH)));
        start = System.nanoTime();
        count = 0;
        String line;
        while ((line = br.readLine()) != null && count < TEST_SIZE) {
            System.out.print(line + " "); // 실제 출력 추가
            count++;
        }
        end = System.nanoTime();
        timeBufferedReaderPrint = (end - start) / 1_000_000.0;
        br.close();

        // 4. BufferedReader + BufferedWriter (실제 출력 수행)
        br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH)));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        start = System.nanoTime();
        count = 0;
        while ((line = br.readLine()) != null && count < TEST_SIZE) {
            bw.write(line + " "); // 실제 출력 추가
            count++;
        }
        bw.flush();
        end = System.nanoTime();
        timeBufferedReaderBufferedWriter = (end - start) / 1_000_000.0;
        br.close();

        // 모든 결과를 마지막에 출력
        System.out.println("\n\n=== 실행 결과 ===");
        System.out.println("Scanner + print: " + timeScannerPrint + "ms");
        System.out.println("Scanner + BufferedWriter: " + timeScannerBufferedWriter + "ms");
        System.out.println("BufferedReader + print: " + timeBufferedReaderPrint + "ms");
        System.out.println("BufferedReader + BufferedWriter: " + timeBufferedReaderBufferedWriter + "ms");
    }
}