import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*4032332437--刘旻钞*/
public class Main {
    public static void main(String[] args) {
        try {
            // 创建一个新的进程来执行命令
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "wmic process where \"name='cmd.exe' and parentprocessid=" + ProcessHandle.current().pid() + "\" get ProcessId");
            Process process = pb.start();

            // 在父进程中打印进程ID
            System.out.println("Parent process ID: " + ProcessHandle.current().pid());
            vfork(process);


            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void vfork(Process process) throws IOException {
        // 在子进程中打印进程ID
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(), "GBK"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().length() > 0 && !line.trim().equalsIgnoreCase("ProcessId")) {
                System.out.println("Child process ID: " + line.trim());
            }
        }
    }
}