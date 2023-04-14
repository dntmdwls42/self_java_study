package java_01;

public class Java_01_04 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println(a > 5); //true
        System.out.println(b < 10); //false
        System.out.println(a >= 10); //true
        System.out.println(b <= 8); //false


        System.out.println(a < b && a==10); //true
        System.out.println(a < b && a!=10); //false
        System.out.println(a < b || a==10); //true
        System.out.println(a < b || a!=10); //true
        System.out.println("-------------------");
        int num = 13;
        System.out.println(num < 20 && num%2==0);
        int num2 = 16;
        System.out.println(num < 20 && num2%2==0);
        System.out.println("-------------------");

//        물리 화학 지구과학 시험 (합격:true)(불합격:false)
//        평균 60점 이상 합격
//        과락 40점 (1과목이라도 40점이면 불합격)
//        점수를 지정하고 합격, 불합격 만들기
        int 물리=60,화학=60,지구과학=60;
        int 평균 = (물리+화학+지구과학)/3;
        System.out.println(평균 >= 60);
        System.out.println(물리 > 40 && 화학 > 40 && 지구과학 > 40);

        System.out.println("-------------------");

//        숫자를 저장하고 홀수면 true 출력
//        숫자를 저장하고 음수면 true 출력
//        점수 2개를 저장하고 둘중하나만 80점이면 true
//        190일의 개월수,일을 출력 (1개월에 30일) ex) 00월 00일
//        숫자 2개를 저장하고 1번째 숫자가 더 크다면 true

        int quiznum1 = 13;
        System.out.println(quiznum1%2>=1);
        int quiznum2 = 12;
        System.out.println(quiznum2%2>=1);

        int quiznum3 = -2;
        System.out.println(quiznum3<0);
        int quiznum4 = 2;
        System.out.println(quiznum4<0);

        int rnum1 = 60, rnum2 = 80;
        System.out.println(rnum1 >= 80 || rnum2 >= 80);
        int rnum3 = 40, rnum4 = 40;
        System.out.println(rnum3 >= 80 || rnum4 >= 80);

        int day = 190;
        int month;
        month = day/30;
        day = day%30;
        System.out.println(month + "개월 " + day + "일" );

        int bnum1 = 80, bnum2 = 60;
        System.out.println(bnum1 > bnum2);
        int bnum3 = 30, bnum4 = 60;
        System.out.println(bnum3 > bnum4);
    }
}
