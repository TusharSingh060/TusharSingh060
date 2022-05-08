import java.util.Scanner;

public class ER2 {
    public static void main(String[] args) {
        Scanner Riffle = new Scanner(System.in);
        int T = Riffle.nextInt();
        for (int i = 0; i < T; i++) {
            int N = Riffle.nextInt();
            int K = Riffle.nextInt();
            int A[] = new int[N];
            int B[] = new int[N];
            int x;
            for (int j = 0; j < N; j++) {
                A[j] = j + 1;
            }
            for (int j = 1; j <= K; j++) {
                x = 0;
                for (int m = 0; m < (N / 2); m++) {
                    B[m] = A[x];
                    x = x + 2;
                }
                x = 1;
                for (int m = (N / 2); m < N; m++) {
                    B[m] = A[x];
                    x = x + 2;
                }
                for (int m = 0; m < N; m++) {
                    A[m] = B[m];
                }
            }
            for (int m = 0; m < N; m++) {
                System.out.print(A[m] + " ");
            }
            System.out.println();
        }
        Riffle.close();
    }
}
