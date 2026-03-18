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

    public static int calculateMax(List<Integer> values) {
        if (values.isEmpty()) return 0;

        int max = values.get(0);
        for (int v : values) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static int calculateMin(List<Integer> values) {
        if (values.isEmpty()) return 0;

        int min = values.get(0);
        for (int v : values) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}