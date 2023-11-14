import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];

        // räddningar ------   antalet mål ------ antalet skott
        // räddningar ------   antalet mål ------ antalet skott

        for(int i = 0; i < 3; i++){
            A[i] = scr.nextInt();
        }
        for(int i = 0; i < 3; i++){
            B[i] = scr.nextInt();
        }

        int[] uA = A;
        int[] uB = B;

        do{
            A = uA.clone();
            B = uB.clone();
            if (A[0] == -1) {
                if(B[1] != -1 && B[2] != -1){
                    uA[0] = uB[2] - uB[1];
                }
            }
            if (A[1] == -1) {
                if(A[2] != -1 && B[0] != -1){
                    uA[1] = uA[2] - uB[0];
                }
            }
            if (A[2] == -1) {
                if(A[1] != -1 && B[0] != -1){
                    uA[2] = uA[1] + uB[0];
                }
            }

            if (B[0] == -1) {
                if(A[1] != -1 && A[2] != -1){
                    uB[0] = uA[2] - uA[1];
                }
            }
            if (B[1] == -1) {
                if(B[2] != -1 && A[0] != -1){
                    uB[1] = uB[2] - uA[0];
                }
            }
            if (B[2] == -1) {
                if(B[1] != -1 && A[0] != -1){
                    uB[2] = uB[1] + uA[0];
                }
            }

            if(B[2] == 0){
                uB[1] = 0;
                uA[0] = 0;
            }

            if(A[2] == 0){
                uA[1] = 0;
                uB[0] = 0;
            }
        }while(uA[0] != A[0] || uA[1] != A[1] || uA[2] != A[2] || uB[0] != B[0] || uB[1] != B[1] || uB[2] != B[2] );

        System.out.println(uA[0] + " " + uA[1] + " " + uA[2]);
        System.out.println(uB[0] + " " + uB[1] + " " + uB[2]);

    }
}
