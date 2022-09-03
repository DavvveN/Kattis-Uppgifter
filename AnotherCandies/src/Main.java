import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        long amountOfCandy;


        for (int j = 0; j < testCases; j++) {
            int children = scanner.nextInt();
            amountOfCandy = 0;

            for (int i = 0; i < children; i++) {
                amountOfCandy += (scanner.nextLong() % children);
            }

            if (amountOfCandy %children == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
