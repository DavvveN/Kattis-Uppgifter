import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = scanner.nextInt();
        scanner.nextLine();
        for(int i =0; i < j; i++){
            System.out.println(scanner.nextLine().length());
        }
    }
}
