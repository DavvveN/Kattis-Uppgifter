import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hisAah = scanner.nextLine();
        String doctorAah = scanner.nextLine();

        if(hisAah.length() >= doctorAah.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
