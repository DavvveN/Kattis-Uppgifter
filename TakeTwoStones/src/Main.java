import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        System.out.println(n % 2 == 0 ? "Bob" : "Alice");
    }
}
