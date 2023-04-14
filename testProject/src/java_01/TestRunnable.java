package java_01;

public class TestRunnable {
    public static void main(String[] args) {
        Thread th = new Thread(new TimerRunnable());
        th.start();
    }
}
class TimerRunnable implements Runnable {
    int n = 0;

    public void run() {
        while (true) {
            System.out.println(n);
            n++;
            try{
                Thread.sleep(1);
            }
            catch (InterruptedException e){return;}
        }
    }
}
