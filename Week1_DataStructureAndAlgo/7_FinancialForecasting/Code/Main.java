public class Main {
    public static void main(String[] args) {
        double initial = 10000; // initial amount
        double rate = 0.10;     // 10% growth rate
        int years = 5;

        // Simple recursion
        double result = Forecasting.futureValueRecursive(initial, rate, years);
        System.out.println("Future Value (Recursive): ₹" + String.format("%.2f", result));

        // Optimized with memoization
        double[] memo = new double[years + 1];
        double optimizedResult = Forecasting.futureValueMemo(initial, rate, years, memo);
        System.out.println("Future Value (Memoized): ₹" + String.format("%.2f", optimizedResult));
    }
}
