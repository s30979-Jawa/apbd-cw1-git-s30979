import java.util.List;

public class StatisticsHelper {
    public static int calculateSum(List<Integer> values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }
    public static double calculateAverage(List<Integer> values) {
        if (values.isEmpty()) return 0;
        int sum = calculateSum(values);
        return (double) sum / values.size();
    }
}