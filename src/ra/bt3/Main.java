package ra.bt3;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ra/bt3/data.txt")));
        String str = "";
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            str = str + line + " ";
        }
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        Map<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            if (!wordFrequencies.containsKey(word.trim())) {
                wordFrequencies.putIfAbsent(word.trim(), 1);
            } else {
                wordFrequencies.put(word.trim(), wordFrequencies.get(word.trim()) + 1);
            }
        }
        System.out.println(wordFrequencies);
//        wordFrequencies.forEach((k,v)-> System.out.print(v > 1 ? k : ""));
        System.out.println("Những từ đã xuất hiện nhiều hơn 1 lần: ");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

    }
}
