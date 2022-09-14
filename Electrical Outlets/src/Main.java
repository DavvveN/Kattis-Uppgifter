import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for(int i = 0; i < testcase; i++){
            int innerTestCases = scanner.nextInt();
            int amountOfOutlets = 0;

            for(int l = 0; l < innerTestCases; l++){
                amountOfOutlets+=scanner.nextInt();
            }
            System.out.println(amountOfOutlets-(innerTestCases-1));
        }
    }
}
