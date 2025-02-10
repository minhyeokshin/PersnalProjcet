package MemoProgram;
//메모 검색
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SearchMemo{
    public static void searchMemo(Scanner in) {
        boolean search = false;
        System.out.println("\n검색할 메모:");
        String str = in.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(Memo.getFileName()))) {
            String line;
            int i = 0;

            while ((line = reader.readLine()) != null) {
                i++;
                if(str.equalsIgnoreCase(line)){
                    System.out.printf("%d번쨰 줄에 있습니다.",i);
                    search = true;
                }
            }
            if (!search) System.out.println("값을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("메모 검색 중 오류 발생.");
            e.printStackTrace();
        }

    }
}


