import java.util.Scanner;

public class Fibonati {
    // Изменил 'count' на 'n' для большей ясности
    public static void generateFibonati(int n, StringBuilder output) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            // Изменил 'previousNumber' на 'a' для большей ясности
            output.append(a).append(" ");
            // Изменил 'currentNumber' на 'b' для большей ясности
            int next = a + b;
            a = b;
            // Изменил 'nextNumber' на 'next' для большей ясности
            b = next;
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