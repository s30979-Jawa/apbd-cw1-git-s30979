import java.util.List;

public class StatisticsHelper {
    public static int calculateSum(List<Integer> values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }
}