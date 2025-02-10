package MemoProgram;
//메모장 읽어오기 method
import java.io.*;

public class ReadMemo {
   public static void readMemo() {
        System.out.println("\n저장된 메모:");
        try (BufferedReader reader = new BufferedReader(new FileReader(Memo.getFileName()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("메모 읽기 중 오류 발생.");
            e.printStackTrace();
        }
    }
}

