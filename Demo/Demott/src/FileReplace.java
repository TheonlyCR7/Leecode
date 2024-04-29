import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FileReplace {
    public static void main(String[] args) {
        Path inputPath = Paths.get("D:\\Document\\school_doc\\paper_per\\inf_se\\en.txt"); // 输入文件路径
        Path outputPath = Paths.get("D:\\Document\\school_doc\\paper_per\\inf_se\\en_output.txt"); // 输出文件路径

        try {
            String content = new String(Files.readAllBytes(inputPath), StandardCharsets.UTF_8);
            content = content.replace("\r", " ").replace("\n", " ");

            Files.write(outputPath, content.getBytes(StandardCharsets.UTF_8));
            System.out.println("文件内容替换完成并已写入到 " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("文件内容替换完成");
        }
    }
}