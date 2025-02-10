package MemoProgram;
//메모장 읽어오기 method
//ArrayList 리펙토링
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadMemo {
    public static void readMemo(Scanner in) {
        ArrayList<String> memoList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(Memo.getFileName()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                memoList.add(line);
            }
        } catch (IOException e) {
            System.out.println("메모 읽기 중 오류 발생.");
            e.printStackTrace();
        }

        System.out.println("1.전체 읽기\t2.선택 줄 읽기");
        int choicenum = in.nextInt();
        in.nextLine();
        if (choicenum == 1) {
            for (int i = 0; i < memoList.size(); i++) {
                System.out.println(memoList.get(i));
            }
        } else if (choicenum == 2) {
            System.out.println("몇번째 줄 메모를 읽으시겠습니까?");
            int choicenum2 = in.nextInt();
            in.nextLine();
            if (choicenum2 > memoList.size()) System.out.println("데이터를 검색할 수 없습니다.");
            else System.out.println(memoList.get(choicenum2 - 1));
        }
        else System.out.println("올바른 번호를 선택하세요.");
    }
}



//       System.out.println("1.전체 읽기\t2.선택 줄 읽기");
//       int choicenum = in.nextInt();
//       in.nextLine();
//       if (choicenum==1) {
//           System.out.println("\n저장된 메모:");
//           try (BufferedReader reader = new BufferedReader(new FileReader(Memo.getFileName()))) {
//               String line;
//               while ((line = reader.readLine()) != null) {
//                   System.out.println(line);
//               }
//           } catch (IOException e) {
//               System.out.println("메모 읽기 중 오류 발생.");
//               e.printStackTrace();
//           }
//       }
//       else {
//           System.out.println("몇번째 줄 메모를 읽으시겠습니까?");
//           int choicenum2 = in.nextInt();
//           in.nextLine();
//           System.out.println("\n저장된 메모:");
//           try (BufferedReader reader = new BufferedReader(new FileReader(Memo.getFileName()))) {
//               String line;
//               int i = 0;
//               ArrayList<String> memoList = new ArrayList<>();
//               while ((line = reader.readLine()) != null) {
//                   i++;
//                   memoList.add(line);
//                   if (i==choicenum2) break;
//               } if (choicenum2>i) System.out.println("해당 줄에는 데이터가 없습니다.");
//               else System.out.println(memoList.get(choicenum2-1));
//           } catch (IOException e) {
//               System.out.println("메모 읽기 중 오류 발생.");
//               e.printStackTrace();
//           }
//       }
//    }
//}
//
