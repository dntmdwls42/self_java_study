package java_01;

public class Java_01_03 {
    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println(a);

        a = 8;
        a = 10;
        a = 20;
        System.out.println(a);

        int x = 3,y = 3;
        double triangle = (x * y)/2.0;
        System.out.println("삼각형 : " + triangle);

//        평균,총점을 구하자. 국어 = 20, 수학 = 90, 영어 = 100
        int 국어 = 20, 수학 = 90, 영어 = 100;
        double 평균 = (국어+수학+영어)/3;
        int 총점 = (국어+수학+영어);
        System.out.println("시험 평균은 : " + 평균 + " 점 입니다.");
        System.out.println("시험 총점은 : " + 총점 + " 점 입니다.");

//        연봉이 1000원이라 가정하였을 때
//        세금 10%를 차감한 연봉을 구하여라.
        int 연봉 = 12500;
        int 세금 = (연봉*10)/100;
        System.out.println("연봉은 = " + (연봉-세금) + " 원 입니다.");

//        350초 에서 초를 제외한 분을 출력.
//        [ (--분--초) 중 --분 출력 ]
        int 초=350;
        int 분=초/60;
        System.out.println(+ 분 + " 분");
        int 나머지 = 초 % 60;
        System.out.println(분 + " 분 " + 나머지 + " 초 ");
    }
}
