package MemoProgram;
//메모장 작성 method
import java.io.*;
import java.util.Scanner;

public class WriteMemo {

    public static void writeMemo(Scanner in) {
        System.out.println("기존 메모에 덮어씌우기(Y/N)");
        String input =in.nextLine();
        if (input.equalsIgnoreCase("y")){
            System.out.print("메모 입력: ");
            String memo = in.nextLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(Memo.getFileName(),false))) {
                writer.write(memo);
                writer.newLine();
                System.out.println("메모가 저장되었습니다.");
            } catch (IOException e) {
                System.out.println("메모 저장 중 오류 발생.");
                e.printStackTrace();
            }
        }
        else {
            System.out.print("메모 입력: ");
            String memo = in.nextLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(Memo.getFileName(), true))) {
                writer.write(memo);
                writer.newLine();
                System.out.println("메모가 저장되었습니다.");
            } catch (IOException e) {
                System.out.println("메모 저장 중 오류 발생.");
                e.printStackTrace();
            }
        }
    }
}
