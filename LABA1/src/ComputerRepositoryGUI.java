import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerRepositoryGUI {
    private ComputerRepository repository;
    private JFrame frame;
    private JTextArea textArea;

    public ComputerRepositoryGUI(ComputerRepository repository) {
        this.repository = repository;
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Computer Repository");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton addButton = new JButton("Добавить компьютер");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Добавляем новый компьютер в репозиторий
                Computeri newComputer = new Computeri(new Winchester(500), new DiskDrive(12), new Ram(16), true, 1000);
                repository.addComputer(newComputer);
                updateTextArea();
            }
        });

        JButton removeButton = new JButton("Удалить компьютер");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Удаляем первый компьютер из репозитория
                if (!repository.getAllComputers().isEmpty()) {
                    repository.removeComputer(repository.getComputerByIndex(0));
                    updateTextArea();
                }
            }
        });

        JButton updateButton = new JButton("Обновить компьютер");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Обновляем первый компьютер в репозитории
                if (!repository.getAllComputers().isEmpty()) {
                    Computeri oldComputer = repository.getComputerByIndex(0);
                    Computeri newComputer = new Computeri(new Winchester(1000), new DiskDrive(24), new Ram(32), true, 2000);
                    repository.updateComputer(oldComputer, newComputer);
                    updateTextArea();
                }
            }
        });

        textArea = new JTextArea();
        textArea.setEditable(false);

        panel.add(addButton);
        panel.add(removeButton);
        panel.add(updateButton);
        panel.add(new JScrollPane(textArea));

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void updateTextArea() {
        textArea.setText("");
        for (Computeri computer : repository.getAllComputers()) {
            textArea.append(computer.toString() + "\n");
        }
    }
}