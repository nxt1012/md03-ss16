package ra.bt1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ra/bt1/data.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            str = str + line + " ";
        }
        System.out.println("Kết quả sau khi đọc file: ");
        System.out.println(str);
        String[] words = str.split(" ");
        System.out.println("Số lượng từ trong file: " +  words.length);
    }
}
