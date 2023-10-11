package ra.bt2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ra/bt2/data.txt")))) {
            int lineCount = 0;
            while (bufferedReader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Số dòng trong file là: " + lineCount + " dòng");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
