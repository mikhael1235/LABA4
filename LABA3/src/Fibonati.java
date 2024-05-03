import java.util.Scanner;

public class Fibonati {
    public static void generateFibonati(int n, StringBuilder output) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            output.append(a).append(" ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел последовательности Фибоначчи: ");
        int n = scanner.nextInt();

        StringBuilder output = new StringBuilder();
        output.append("Первые ").append(n).append(" чисел последовательности Фибоначчи:\n");
        generateFibonati(n, output);
        System.out.println(output);

        scanner.close();
    }
}