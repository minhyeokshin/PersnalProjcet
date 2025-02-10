package MemoProgram;

//메모장 실행 method

import java.util.Scanner;

public class Memo {

    public void run(){
    Scanner in = new Scanner(System.in);
        while (true) {
        System.out.println("\n메모장 프로그램");
        System.out.println("1. 메모 작성");
        System.out.println("2. 메모 보기");
        System.out.println("3. 검색");
        System.out.println("4. 종료");
        System.out.print("선택: ");
        int choice = in.nextInt();
        in.nextLine(); // 개행 문자 제거

        switch (choice) {
            case 1:
                WriteMemo.writeMemo(in);
                break;
            case 2:
                ReadMemo.readMemo();
                break;
            case 3:
                SearchMemo.searchMemo();
                break;
            case 4:
                System.out.println("프로그램 종료.");
                return;
            default:
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
        }
    }
}
}
