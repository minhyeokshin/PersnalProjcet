package StudentManagement.MemoProgram;
//메모장 읽어오기 method

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadMemo {
   public static void readMemo() {
       Scanner in = new Scanner(System.in);

       System.out.println("1. 전체 학생 정보 출력");
       System.out.println("2. 학생 검색");
       System.out.printf("번호를 선택하세요 : ");
       int inputNum = in.nextInt();

       switch (inputNum){
           case 1:
               System.out.println("\n학번 | 이름 | 성적");
               try (BufferedReader reader = new BufferedReader(new FileReader(StudentInfo.FILE_NAME))) {
                   String line;
                   int i = 0;
                   while ((line = reader.readLine()) != null){

                       String[] word = new String[100];
                               word = line.split(",");
                       System.out.printf(word[i]);
                       System.out.printf("\t"+word[i+1]);
                       System.out.printf("\t"+word[i+2]);
                       i++;
                       if (i == 3) break;
                   }
//                   String line;
//                   while ((line = reader.readLine()) != null) {
//                       System.out.println(line);
//                   }
               } catch (IOException e) {
                   System.out.println("메모 읽기 중 오류 발생.");
                   e.printStackTrace();
               }
               break;
           case 2:
               break;
           default:
               System.out.println("올바른 번호를 선택하세요.");
               break;
       }

    }
}

