import java.util.Scanner;
import java.util.*;

public class ER4 {
	public static void main(String[] args) {
		Scanner Ved = new Scanner(System.in);
		int T = Ved.nextInt();
		{
			for (int i = 0; i < T; i++) {
				int N = Ved.nextInt();
				int A[] = new int[N];
				int W = Ved.nextInt();
				int L = 0, S = 0;
				for (int j = 0; j < N; j++) {
					A[j] = Ved.nextInt();
				}
				Arrays.sort(A);
				for (int m = (N - 1); m >= 0; m--) {
					L = L + A[m];
					if (L >= W) {
						System.out.println((m));
						S = 1;
					}
					if (S == 1)
						break;
				}
			}
		}
		Ved.close();
	}
}