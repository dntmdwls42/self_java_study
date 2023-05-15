package java_01;

import java.util.Scanner;

public class Java_01_06 {
    public static void main(String[] args) {
        int p1 = 2;
        int p2 = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("가위 = 0 바위 = 1 보 = 2 (종료 = -1)");
            System.out.println("Player 1 의 숫자를 적어주세요.");
            p1 = sc.nextInt();
            System.out.println("Player 2 의 숫자를 적어주세요.");
            p2 = sc.nextInt();

            if (p1 == -1) {
                break;
            }

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
        sc.close();
        System.out.println("이 세션은 종료되었습니다.");
    }
}