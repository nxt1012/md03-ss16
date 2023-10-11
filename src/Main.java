import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
//        new method
//        Files.createDirectories(Paths.get("output"));
//        old method
//        boolean isFolderCreated = new File("output").mkdir();
//        System.out.println(isFolderCreated ? "Folder created successfully" : "Folder creation failed");
//        Files.createDirectories(Paths.get("output"));
//        Files.createFile(Paths.get("output/hello.txt"));
//        Files.createDirectories(Paths.get("output/subfolder"));
//        Files.createFile(Paths.get("output/subfolder/output1.txt"));
//        Files.createDirectories(Paths.get("output/subfolder/output1"));
//
//        Files.move(Paths.get("output/subfolder"), Paths.get("output/subfolder1"));
//
//        File dir = new File("output");
//        if (dir.isDirectory()) {
//            File[] list = dir.listFiles();
//            for (int i = 0; i < list.length; i++) {
//                System.out.println(list[i].getName());
//            }
//        }
//         old method
//        subfolder.renameTo(new File("output/subfolder1"));
//

        File outputDir = new File("output");
        File helloFile = new File("output/hello.txt");
        File subDir = new File("output/subfolder");
        File output1File = new File("output/subfolder/output1.txt");
        File output1Dir = new File("output/subfolder/output1");

        if (outputDir.mkdir()) {
            helloFile.createNewFile();
            if (subDir.mkdir()) {
                output1File.createNewFile();
                output1Dir.mkdir();
            }
        }
//        Đổi tên
        subDir.renameTo(new File("output/subfolder1"));
        System.out.println("Cấu trúc của cây thư mục là: ");
        displayDirTree(outputDir);

    }

    private static void displayDirTree(File rootDir) {
        if (rootDir.isDirectory()) {
            System.out.println(rootDir.getName());
            File[] subFiles = rootDir.listFiles();
            String prefixLv1 = "-";
            for (File subFile : subFiles) {
                System.out.println(prefixLv1 + subFile.getName());
                if (subFile.isDirectory()) {
                    String prefixLv2 = "--";
                    File[] subFileLv2 = subFile.listFiles();
                    for (File sflv2 : subFileLv2) {
                        System.out.println(prefixLv2 + sflv2.getName());
                    }
                }
            }
        } else {
        System.out.println("Đây không phải là thư mục");
    }


}
}
