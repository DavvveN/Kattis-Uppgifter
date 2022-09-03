import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int test = scr.nextInt();
        int average = scr.nextInt();
        int sum = 0;

        for (int i = 0; i < test; i++) {
            sum += scr.nextInt();
        }
        if (average == 0) {
            System.out.println("impossible");
            System.exit(0);
        }

        for (int j = 1; j < Integer.MAX_VALUE; j++) {
            double newSum = (j + test) * average;

            newSum -= sum;
            if (newSum >=0) {
                if (newSum / j <= 100) {
                    System.out.println(j);
                    System.exit(0);
                }
            }else{
                break;
            }
        }
        System.out.println("impossible");

    }
}
