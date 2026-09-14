import java.util.Arrays;

public class memotization_binomial_coeff {
    // A 2D array to store calculated subproblems
    private static int[][] memo;

    public static int select(int n, int k) {
        // Base cases
        if (k == 0 || k == n) {
            return 1;
        }
        if (k > n || k < 0) {
            return 0;
        }

        // If the subproblem has already been solved, return the cached result
        if (memo[n][k] != -1) {
            return memo[n][k];
        }

        // Otherwise, calculate recursively and store the result in the memo table
        memo[n][k] = select(n - 1, k - 1) + select(n - 1, k);
        return memo[n][k];
    }

    public static int nCr(int n, int k) {
        // Create a memo table size (n+1) x (k+1)
        memo = new int[n + 1][k + 1];

        // Initialize all values in the memo table to -1
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return select(n, k);
    }

    public static void main(String[] args) {
        int n = 5, k = 3;
        System.out.println("Memoization Result C(" + n + ", " + k + ") = " + nCr(n, k));
    }
}


