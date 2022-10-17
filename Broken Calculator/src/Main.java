import jdk.jfr.Unsigned;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int previous = 0;

        for(int i = 0; i<n; i++){
            String line = scanner.nextLine();
            Scanner scr = new Scanner(line);
            int a = scr.nextInt();
            String sign = scr.next();
            int b = scr.nextInt();

            if(sign.contains("+")){

            }else if(sign.contains("-")){

            }else if(sign.contains("*")){

            }else if(sign.contains("/")){
            }
        }
    }
}
