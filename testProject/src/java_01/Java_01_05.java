package java_01;

public class Java_01_05 {
    public static void main(String[] args) {
        if (true){
            System.out.println(10>9);
        }
        if (false){
            System.out.println(10>9);
        }

        int score = 99999;
        if (score >= 60){
            System.out.println("합격입니다.");
        }
        if (score < 60){
            System.out.println("불합격입니다.");
        }
        if (score < 0 || score > 100){
            System.out.println("입력 값 초과입니다.");
        }
    }
}
