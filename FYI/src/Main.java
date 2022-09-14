import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        if(phoneNumber.startsWith("555")){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        scanner.close();
    }
}
