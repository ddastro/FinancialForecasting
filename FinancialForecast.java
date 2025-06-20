public class FinancialForecast {

    // Recursive function to compute future value
    public static double predictFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return predictFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization
    public static double predictFutureValueMemo(double initialAmount, double growthRate, int years, Double[] memo) {
        if (years == 0) {
            return initialAmount;
        }
        if (memo[years] != null) {
            return memo[years];
        }
        memo[years] = predictFutureValueMemo(initialAmount, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialAmount = 10000;     // ₹10,000
        double growthRate = 0.08;         // 8% annual growth
        int years = 5;

        // Basic recursive prediction
        double future = predictFutureValue(initialAmount, growthRate, years);
        System.out.println("Future Value (Recursive): ₹" + future);

        // Optimized with memoization
        Double[] memo = new Double[years + 1];
        double futureMemo = predictFutureValueMemo(initialAmount, growthRate, years, memo);
        System.out.println("Future Value (Memoized): ₹" + futureMemo);
    }
}