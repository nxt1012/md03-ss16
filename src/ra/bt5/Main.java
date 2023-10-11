package ra.bt5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ra/bt5/data.txt")))) {
            String str = "";
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                str = str + line + " ";
            }
            String[] words = str.split(" ");
            List<String> longWords = new ArrayList<>();
            int maxLength = words[0].length();
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }
            System.out.println("(Các) từ có độ dài lớn nhất trong văn bản là: ");
            for (String word : words) {
                if (word.length() == maxLength) {
                    System.out.println(word);
                }
            }
            System.out.println("Độ dài (các) từ trên là: " + maxLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
