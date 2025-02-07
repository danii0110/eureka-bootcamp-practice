package basic.input;

import java.io.*;

public class OutputTest {
    public static void main(String[] args) throws IOException {
        System.out.println("\n=== System.out.println Output Test ===");
        testPrintln("20x20.txt");
        testPrintln("3x3.txt");

        System.out.println("\n=== StringBuilder + println Output Test ===");
        testStringBuilderPrintln("20x20.txt");
        testStringBuilderPrintln("3x3.txt");

        System.out.println("\n=== BufferedWriter Output Test ===");
        testBufferedWriter("20x20.txt");
        testBufferedWriter("3x3.txt");

    }

    // System.out.println을 이용한 출력 테스트
    public static void testPrintln(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            long startTime = System.nanoTime();

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            long endTime = System.nanoTime();
            System.out.println("System.out.println (" + filename + ") elapsed time: " + (endTime - startTime) + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void testBufferedWriter(String filename) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(filename));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));

            long startTime = System.nanoTime();

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // 여기서 flush()를 호출하여 버퍼를 비웁니다.
            bw.flush();

            long endTime = System.nanoTime();
            System.out.println("BufferedWriter (" + filename + ") elapsed time: " + (endTime - startTime) + " ns");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // BufferedReader는 닫지만, BufferedWriter는 닫지 않습니다.
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // StringBuilder + System.out.println을 이용한 출력 테스트
    public static void testStringBuilderPrintln(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            long startTime = System.nanoTime();

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            System.out.println(sb.toString()); // 한 번에 출력

            long endTime = System.nanoTime();
            System.out.println("StringBuilder + println (" + filename + ") elapsed time: " + (endTime - startTime) + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
