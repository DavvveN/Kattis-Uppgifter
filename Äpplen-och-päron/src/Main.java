import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int A = scr.nextInt() * 7;
        int P = scr.nextInt() * 13;

        if(A == P ){
            System.out.println("lika");
            return;
        }
        else if(A > P){
            System.out.println("axel");
            return;
        }
        System.out.println("petra");
    }
}
