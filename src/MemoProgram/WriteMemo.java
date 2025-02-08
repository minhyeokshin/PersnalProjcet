package MemoProgram;
//메모장 작성 method
import java.io.*;
import java.util.Scanner;

public class WriteMemo {

    public static void writeMemo(Scanner scanner) {
        System.out.print("메모 입력: ");
        String memo = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FileContants.FILE_NAME, true))) {
            writer.write(memo);
            writer.newLine();
            System.out.println("메모가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("메모 저장 중 오류 발생.");
            e.printStackTrace();
        }
    }
}
