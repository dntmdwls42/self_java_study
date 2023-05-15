package java_01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test_06_01 {
    //    if문, Scanner 기능을 이용하여 ATM을 만들어보기.
//    입출금 후 계좌, 현금의 잔액 출력
//    스캐너를 이용한 입출금 선택기능
//    출금시 비밀번호 사용.
    public static void main(String[] args) {

        int 계좌 = 10000;
        int 현금 = 3000;
        int 비밀번호 = 1111;
        int 선택 = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" ");
            System.out.println("===ATM===");
            System.out.println("==1.입금==");
            System.out.println("==2.출금==");
            System.out.println("==3.잔액확인==");
            System.out.println("==4.종료==");
            System.out.println("=========");

            System.out.println("원하시는 메뉴를 선택해 주세요.");

            선택 = sc.nextInt();

            if (선택 == 1) {
                System.out.println("===입금창구===");
                System.out.println("입금하시려는 금액을 입력해 주세요.");
                현금 = sc.nextInt(); //입금하려는 금액 입력받음

                System.out.println("입금하시려는 금액은 " + 현금 + " 원 입니다"); //입금하려는 금액 확인

                계좌 = 현금 + 계좌; //계좌에 현금 집어넣음

                System.out.println("현재 잔액은 " + 계좌 + " 원 입니다."); //최종 계좌금액 출력
            }

            if (선택 == 2) {
                System.out.println("===출금창구===");
                System.out.println("비밀번호를 입력 해 주세요.");
                int temppassword = sc.nextInt(); //비밀번호 입력받음
                if (temppassword == 비밀번호) {
                    System.out.println("비밀번호 일치.");
                    System.out.println("출금하시려는 금액을 입력해 주세요.");
                    현금 = sc.nextInt();

                    System.out.println("출금하시려는 금액은 " + 현금 + " 원 입니다"); //출금하려는 금액 확인
                    if (현금 <= 계좌){
                        계좌 = 계좌 - 현금;
                    }else {
                        System.out.println("[에러] 잔액이 부족해 출금할 수 없습니다.");
                    }
                    System.out.println("현재 잔액은 " + 계좌 + " 원 입니다."); //최종 계좌금액 출력
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 종료합니다.");
                }
            }
            if (선택 == 3) {
                System.out.println("현재 계좌의 잔액은 " + 계좌 + " 원 입니다.");
            }

            if (선택 == 4) {
                break;
            }
        } sc.close();
        System.out.println("이 세션은 종료되었습니다.");
    }
}