import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonatiGUI {
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
        JFrame frame = new JFrame("Последовательность Фибоначчи");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JTextField textField = new JTextField(10);
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false);

        JButton button = new JButton("Сгенерировать");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(textField.getText());
                StringBuilder output = new StringBuilder();
                output.append("Первые ").append(count).append(" чисел последовательности Фибоначчи:\n");
                generateFibonati(count, output);
                textArea.setText(output.toString());
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Введите количество чисел:"));
        panel.add(textField);
        panel.add(button);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, new JScrollPane(textArea));

        frame.setVisible(true);
    }
}
