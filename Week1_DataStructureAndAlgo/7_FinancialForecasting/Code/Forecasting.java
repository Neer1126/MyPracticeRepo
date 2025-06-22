public class Forecasting {

    // Recursive function to calculate future value
    public static double futureValueRecursive(double initialAmount, double rate, int years) {
        if (years == 0) return initialAmount;
        return futureValueRecursive(initialAmount, rate, years - 1) * (1 + rate);
    }

    // Optimized version using memoization (optional)
    public static double futureValueMemo(double initialAmount, double rate, int years, double[] memo) {
        if (years == 0) return initialAmount;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(initialAmount, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
