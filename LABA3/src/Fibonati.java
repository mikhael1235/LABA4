import java.util.Scanner;

public class Fibonati {
    // Изменил 'n' на 'count' для большей ясности
    public static void generateFibonati(int count, StringBuilder output) {
        int previousNumber = 0, currentNumber = 1;
        for (int i = 0; i < count; i++) {
            // Изменил 'a' на 'previousNumber' для большей ясности
            output.append(previousNumber).append(" ");
            // Изменил 'b' на 'currentNumber' для большей ясности
            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            // Изменил 'next' на 'nextNumber' для большей ясности
            currentNumber = nextNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел последовательности Фибоначчи: ");
        int count = scanner.nextInt();

        StringBuilder output = new StringBuilder();
        output.append("Первые ").append(count).append(" чисел последовательности Фибоначчи:\n");
        generateFibonati(count, output);
        System.out.println(output );

        scanner.close();
    }
}