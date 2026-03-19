import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers seperated by space:");
        String line = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        try {
            for (String token : line.split(" ")) {
                numbers.add(Integer.parseInt(token));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers separated by spaces.");
        }

        int sum = StatisticsHelper.calculateSum(numbers);
        System.out.println("Total sum is: " + sum);

        int min = StatisticsHelper.calculateMin(numbers);
        System.out.println("Min: " + min);
    }
}