import java.util.Scanner;

public class ER3/* CHEF FIXED DEPOSITE */ {
    public static void main(String[] args) {
        Scanner Chef = new Scanner(System.in);
        int T = Chef.nextInt();
        for (int i = 0; i < T; i++) {
            int N = Chef.nextInt();
            int A[] = new int[N];
            int B[] = new int[N];
            int X = Chef.nextInt();
            int L = 0, S = 0, R = 0, Y = 0;
            for (int j = 0; j < N; j++) {
                A[j] = Chef.nextInt();
            }
            for (int m = 0; m < N; m++) {
                for (int o = 0; o < N; o++) {
                    if (A[o] == 0)
                        Y = 0;
                    else {
                        B[m] = A[o];
                        Y = 1;
                    }
                    if (Y == 1)
                        break;
                }
                for (int n = 0; n < N; n++) {
                    if (A[n] != 0) {
                        if (A[n] <= B[m]) {
                            B[m] = A[n];
                            R = n;
                        }
                    }
                }
                A[R] = 0;
            }
            for (int m = (N - 1); m >= 0; m--) {
                L = L + B[m];
                if (L >= X) {
                    System.out.println((N - m));
                    S = 1;
                }
                if (S == 1)
                    break;
            }
            if (S == 0)
                System.out.println("-1");
        }
        Chef.close();
    }
}/*
  * 4
  * 4 6
  * 4 3 5 1
  * 3 15
  * 1 5 3
  * 2 5
  * 10 3
  * 4 7
  * 1 2 3 4
  */
