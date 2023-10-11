package ra.bt1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ra/bt1/data.txt")));) {
            String str = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                str = str + line + " ";
            }
            System.out.println("Kết quả sau khi đọc file: ");
            System.out.println(str);
            String[] words = str.split(" ");
            System.out.println("Số lượng từ trong file: " + words.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
