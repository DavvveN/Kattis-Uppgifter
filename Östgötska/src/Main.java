import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String message = scr.nextLine();
        String[] strArray = message.split(" ");

        int counter = 0;
        for (String s : strArray) {
            if (s.contains("ae")) {
                counter += 1;
            }
        }
        double percentage = (double) counter / strArray.length;
        if (percentage >= 0.4) {
            System.out.println("dae ae ju traeligt va");
        } else {
            System.out.println("haer talar vi rikssvenska");
        }
    }
}
