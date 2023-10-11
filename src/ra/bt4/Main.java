package ra.bt4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ra/bt4/data.txt")))) {
            String str = "";
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                str = str + line + " ";
            }
            String[] words = str.split(" ");

            Locale vietnameseLocale = new Locale("vi", "VN");
            Collator collator = Collator.getInstance(vietnameseLocale);

            Arrays.sort(words, collator);
            System.out.println(Arrays.toString(words));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
