package MemoProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SearchMemo {
    public static void SearchMemo() {
        Scanner in = new Scanner(System.in);
        System.out.println("\n검색할 메모:");
        String str = in.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(FileContants.FILE_NAME))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                i++;
                if(str.equals(line)){
                    System.out.printf("%d번쨰 줄에 있습니다.",i);
                }
            }
        } catch (IOException e) {
            System.out.println("메모 검색 중 오류 발생.");
            e.printStackTrace();
        }
    }
}


