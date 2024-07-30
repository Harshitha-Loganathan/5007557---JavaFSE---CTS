import java.util.HashMap;

public class OptimizedFinancialForecasting {

    private static HashMap<Integer, Double> memo = new HashMap<>();

    // Optimized recursive method with memoization
    public static double futureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }
        double result = futureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
        memo.put(periods, result);
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 1000;
        double growthRate = 0.05;
        int periods = 10;

        double futureValue = futureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}
