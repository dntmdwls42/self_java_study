package java_01;

public class Test_05_01 {
    public static void main(String[] args) {
        int money = 2400;
        int americano = 1500;
        int latte = 2500;
        int smoothie = 3000;

        System.out.println("현재 소지하고 계신 금액은 " + money + " 원 입니다.");

        System.out.println("ㅡㅡㅡ카페메뉴ㅡㅡㅡ");
        System.out.println("|1.아메리카노 1500원|");
        System.out.println("|2.카페라떼 2500원|");
        System.out.println("|3.스무디류 3000원|");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        if (money > americano) {
            System.out.println("구매 가능합니다! " + "잔돈은.. " + (money - americano) + "원 입니다.");
        } else {
            System.out.println("죄송합니다.. 구매하실 수 없습니다..");}
        if (money > latte) {
            System.out.println("구매 가능합니다! " + "잔돈은.. " + (money - latte) + "원 입니다.");
        } else {
            System.out.println("죄송합니다.. 구매하실 수 없습니다..");}
        if (money > smoothie) {
            System.out.println("구매 가능합니다! " + "잔돈은.. " + (money - smoothie) + "원 입니다.");
            } else {
            System.out.println("죄송합니다.. 구매하실 수 없습니다..");}


//        player 1과 2가 가위바위보를 한다.
//        가위 = 0 바위 = 1 보 = 2
//        p1 vs p2 의 변수값을 조정하여 p1 승리, p2 승리, 무승부 만들기

        int player1 = 0;
        int player2 = 2;

        System.out.println("start");
        if (player1 > player2) {
            System.out.println("player1 이(가) 이겼습니다.");
        }
        if (player2 > player1) {
            System.out.println("player2 이(가) 이겼습니다.");
        }
        }
    }
