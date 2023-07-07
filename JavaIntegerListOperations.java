import java.util.ArrayList;
import java.util.List;

public class IntegerListOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);

        List<Integer> oddNumbers = removeEvenNumbers(numbers);
        int minimum = findMinimum(oddNumbers);
        int maximum = findMaximum(oddNumbers);
        double mean = findMean(oddNumbers);

        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("Minimum Value: " + minimum);
        System.out.println("Maximum Value: " + maximum);
        System.out.println("Mean: " + mean);
    }

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        return oddNumbers;
    }

    public static int findMinimum(List<Integer> numbers) {
        int minimum = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber < minimum) {
                minimum = currentNumber;
            }
        }

        return minimum;
    }

    public static int findMaximum(List<Integer> numbers) {
        int maximum = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber > maximum) {
                maximum = currentNumber;
            }
        }

        return maximum;
    }

    public static double findMean(List<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
