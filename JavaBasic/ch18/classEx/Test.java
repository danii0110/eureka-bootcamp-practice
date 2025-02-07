package JavaBasic.ch18.classEx;

import java.io.File;
import java.io.IOException;

public class Test {
    // File
    public static void main(String[] args) throws IOException {
        // File 객체 생성

        // folder
        File dir = new File("C:/Temp/images"); // dir
        System.out.println(dir.exists()); // false
        if (!dir.exists()) {
            dir.mkdir();
        }

        // file
        File file = new File("C:/Temp/myFile.txt");
        System.out.println(file.exists());
        if(!file.exists()) {
            file.createNewFile();
        }
    }
}
