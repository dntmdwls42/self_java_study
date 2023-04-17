package java_01;

public class Java_01_05 {
    public static void main(String[] args) {
        int score = 90;
        if (score >= 60 && score < 100) {
            System.out.println("합격입니다.");
        }
        if (score <= 60 && score > 0) {
            System.out.println("불합격입니다.");
        }
        if (score < 0 || score > 100) {
            System.out.println("입력 범위 초과입니다.");
        }

//        숫자 하나를 지정하고 짝수, 홀수를 출력하기
//        숫자 하나를 지정하고 양수, 음수, 0 출력
//        시험과목 3개를 지정하고
//        평균 80점 이상 'A' 평균 70점 이상 'B' 평균 60점 미만 '재수강'

        int rnum = 33;
        if (rnum % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        if (rnum % 2 == 1) {
            System.out.println("홀수입니다.");
        }

        System.out.println("--------------------");

        int rnum2 = 22;
        if (rnum2 == 0){
            System.out.println("0 입니다.");
        }
        if (rnum2 > 0){
            System.out.println("양수입니다.");
        }
        if (rnum2 < 0){
            System.out.println("음수입니다.");
        }
        System.out.println("--------------------");
        int 국어 = 20, 영어 = 20, 수학 = 20;
        int 총합 = 국어 + 영어 + 수학;
        int 평균 = (총합/3);
        if (평균 >= 80 && 평균 < 100){
            System.out.println("A 학점입니다.");
        }
        if (평균 >= 70 && 평균 < 80) {
            System.out.println("B 학점입니다.");
        }
        if (평균 < 60) {
            System.out.println("C 학점입니다.");
        }
        if (평균 < 0 || 평균 > 100){
            System.out.println("잘못된 값입니다.");
        }
    }
}
