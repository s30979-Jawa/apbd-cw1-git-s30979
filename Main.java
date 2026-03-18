import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers seperated by space:");
        String line = scanner.nextLine();

        String[] tokens = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }

        try {
            for (String token : line.split(" ")) {
                numbers.add(Integer.parseInt(token));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers separated by spaces.");
        }
    }
}