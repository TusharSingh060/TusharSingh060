import java.util.Scanner;

public class ER1/* BINARY CONVERTION & PRIME */ {
    public static void main(String[] args) {
        Scanner Program = new Scanner(System.in);
        System.out.println("enter number of task");
        int T = Program.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("enter binary");
            String S = Program.next();
            int S1 = Integer.parseInt(S);
            int F = S1;
            int K = 0;
            while (1 <= F) {
                K = K + 1;
                F = F / 10;
            }
            System.out.println(K);
            double A = 1;
            double B = 0;
            F = S1;
            for (int j = 0; j < K; j++) {
                if ((F % 10) == 1) {
                    A = A * (Math.pow(2, j));
                    B = B + A;
                }
                A = 1;
                F = F / 10;
            }
            System.out.println(B);
            int X = 0;
            for (int m = 1; m <= B; m++) {
                if ((B % m) == 0.0)
                    X = X + 1;
            }
            System.out.println(X);
            A = 0;
            int z = 0;
            if (X == 2) {
                System.out.println("YES");
                A = 1;
                z = 1;
            } else {
                A = 2.0;
            }
            if (A == 2.0) {
                for (int q = 0; q < K; q++) {
                    z = 0;
                    for (int m = (q + 1); m <= K; m++) {
                        String S2 = S.substring(q, m);
                        int F1 = Integer.parseInt(S2);
                        System.out.println(F1);
                        double F2 = 1;
                        double F3 = 0;
                        int F6 = F1;
                        for (int F5 = 0; F5 < (m - q); F5++) {
                            if ((F6 % 10) == 1) {
                                F2 = F2 * (Math.pow(2, F5));
                                F3 = F3 + F2;
                            }
                            F2 = 1;
                            F6 = F6 / 10;
                        }
                        System.out.println(F3);
                        int y = 0;
                        for (int v = 1; v <= F3; v++) {
                            if (F3 % v == 0.0)
                                y = y + 1;
                        }
                        if (y == 2) {
                            System.out.println("YES");
                            z = 1;
                        }
                        if (z == 1)
                            break;
                    }
                    if (z == 1)
                        break;
                }
            }
            if (z == 0)
                System.out.println("NO");
        }
        Program.close();
    }
}