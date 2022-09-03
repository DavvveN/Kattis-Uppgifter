import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            long long1 = scanner.nextLong();
            long long2 = scanner.nextLong();

            System.out.println(Math.abs(long1-long2));
        }
    }
}
