import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int numSocks = scr.nextInt();
        int capacity = scr.nextInt();
        int diff = scr.nextInt();
        int[] socks = new int[numSocks];
        int machines = 1;
        int tempCap = 1;

        for (int i = 0; i < numSocks; i++) {
            socks[i] = scr.nextInt();
        }

        if(numSocks ==1){
            System.out.println("1");
            System.exit(0);
        }
        Arrays.sort(socks);

        for (int i = 1; i < numSocks; i++) {
            if (Math.abs(socks[i - 1] - socks[i]) <= diff) {
                if (tempCap == capacity) {
                    machines += 1;
                    tempCap = 1;
                } else if (tempCap < capacity) {
                    tempCap++;
                }
            } else {
                machines += 1;
                tempCap = 1;
            }
        }
        System.out.println(machines);
    }
}
