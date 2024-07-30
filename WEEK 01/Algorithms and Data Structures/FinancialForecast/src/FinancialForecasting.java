public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return futureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000;
        double growthRate = 0.05;
        int periods = 10;

        double futureValue = futureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
	
	
}

