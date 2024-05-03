import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonatiTest {

    @Test
    public void testFibonati() {
        // Arrange
        int n = 5;
        String expectedSequence = "0 1 1 2 3 ";
        StringBuilder output = new StringBuilder();

        // Act
        Fibonati.generateFibonati(n, output);

        // Assert
        assertEquals(expectedSequence, output.toString(), "Последовательность Фибоначчи для n = 5");
        System.out.println("Тест testFibonati выполнен успешно. Ожидаемый результат: \"" + expectedSequence + "\"");
    }

    @Test
    public void testFibonacciSequenceWithZeroInput() {
        // Arrange
        int n = 0;
        String expectedSequence = "";
        StringBuilder output = new StringBuilder();

        // Act
        Fibonati.generateFibonati(n, output);

        // Assert
        assertEquals(expectedSequence, output.toString(), "Последовательность Фибоначчи для n = 0");
        System.out.println("Тест testFibonacciSequenceWithZeroInput выполнен успешно. Ожидаемый результат: \"" + expectedSequence + "\"");
    }

    @Test
    public void testFibonacciSequenceWithNegativeInput() {
        // Arrange
        int n = -5;
        String expectedSequence = "";
        StringBuilder output = new StringBuilder();

        // Act
        Fibonati.generateFibonati(n, output);

        // Assert
        assertEquals(expectedSequence, output.toString(), "Последовательность Фибоначчи для n = -5");
        System.out.println("Тест testFibonacciSequenceWithNegativeInput выполнен успешно. Ожидаемый результат: \"" + expectedSequence + "\"");
    }
}