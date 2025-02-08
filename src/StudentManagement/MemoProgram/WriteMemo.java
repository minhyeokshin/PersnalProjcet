package StudentManagement.MemoProgram;
//메모장 작성 method

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteMemo {

    public static void writeMemo(Scanner scanner) {
        System.out.println("학생정보 입력");
        String memo = scanner.nextLine();
        String[][] studentInfo = new String[100][100];
        studentInfo[0] = memo.split(",");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(StudentInfo.FILE_NAME, true))) {
            writer.write(memo);
            writer.newLine();
            System.out.println(studentInfo[0]);
            System.out.println(studentInfo[1]);
            System.out.println("정보가 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("메모 저장 중 오류 발생.");
            e.printStackTrace();
        }
    }
}
