package java_01;

import java.util.Scanner;
public class Test_05_01 {
    public static void main(String[] args) {

        Scanner picknum = new Scanner(System.in);
        Scanner moneynum = new Scanner(System.in);

        int money = 0;
        int pick = 0;
        int americano = 1500;
        int latte = 2500;
        int smoothie = 3000;

        System.out.println("ㅡㅡㅡ카페메뉴ㅡㅡㅡ");
        System.out.println("|1.아메리카노 1500원|");
        System.out.println("|2.카페라떼 2500원|");
        System.out.println("|3.스무디류 3000원|");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        System.out.println("돈을 입력해 주세요.");
        money = moneynum.nextInt();
        System.out.println("고르실 상품 번호를 입력해 주세요.");
        pick = picknum.nextInt();

        System.out.println("현재 소지하고 계신 금액은 " + money + " 원 입니다.");

        if (pick == 0) {
            System.out.println("0이라는 상품명은 없다이새끼야");
        }

        if (pick == 1) {
            if (money >= americano) {
                System.out.println("아메리카노를 구매하셨습니다! " + "잔돈은.. " + (money - americano) + "원 입니다.");
            } else {
                System.out.println("아메리카노 구매에 실패했습니다. 돈이 부족합니다.");
            }
        }

        if (pick == 2) {
            if (money >= latte) {
                System.out.println("카페라떼를 구매하셨습니다! " + "잔돈은.. " + (money - latte) + "원 입니다.");
            } else {
                System.out.println("카페라떼 구매에 실패했습니다. 돈이 부족합니다.");
            }
        }

        if (pick == 3) {
            if (money >= smoothie) {
                System.out.println("스무디를 구매하셨습니다! " + "잔돈은.. " + (money - smoothie) + "원 입니다.");
            } else {
                System.out.println("스무디 구매에 실패했습니다. 돈이 부족합니다.");
            }
        }


        System.out.println("---------------------------------------------------------");//문제 1번과 2번을 나누는 경계선

//        player 1과 2가 가위바위보를 한다.
//        가위 = 0 바위 = 1 보 = 2
//        p1 vs p2 의 변수값을 조정하여 p1 승리, p2 승리, 무승부 만들기

        int p1 = 2;
        int p2 = 0;
        if (p1 == 0 && p2 == 1) { //p1 가위 p2 바위
            System.out.println("p2 승");
        }
        if (p1 == 0 && p2 == 2) { //p1 가위 p2 보
            System.out.println("p1 승");
        }
        if (p1 == 1 && p2 == 0) { //p1 바위 p2 가위
            System.out.println("p1 승");
        }
        if (p1 == 1 && p2 == 2) { //p1 바위 p2 보
            System.out.println("p2 승");
        }
        if (p1 == 2 && p2 == 0) { //p1 보 p2 가위
            System.out.println("p2 승");
        }
        if (p1 == 2 && p2 == 1) { //p1 보 p2 바위
            System.out.println("p2 승");
        }
        if (p1==p2) {
            System.out.println("무승부");
        }
    }
    }