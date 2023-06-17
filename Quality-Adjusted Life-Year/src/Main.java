import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        double sum = 0;
        for(int i = 0;  i < a; i++){
            sum += Double.parseDouble(scr.next()) * Double.parseDouble(scr.next());
        }

        System.out.println(sum);
    }
}
