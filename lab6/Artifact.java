import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Artifact {

    static int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }

    static int Pocket(int W, int wt[], int val[], int n) {
        // Base Case
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            return Pocket(W, wt, val, n - 1);
        }
        else {
            return max(val[n - 1] + Pocket(W - wt[n - 1], wt, val, n - 1),
                    Pocket(W, wt, val, n - 1)
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] cost = new int[N];
        int[] weight = new int[N];
        for (int i = 0; i < N; i++) {
            cost[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }
        System.out.print(Pocket(W, weight, cost, N));
    }

}