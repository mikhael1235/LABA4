import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание объектов с разной емкостью винчестеров
        List<Computer> computers = new ArrayList<>();
        Computer computer1 = new Computer(new Winchester(500), new DiskDrive(12), new Ram(16), true, 1000);
        Computer computer2 = new Computer(new Winchester(1000), new DiskDrive(23), new Ram(32), false, 5000);
        Computer computer3 = new Computer(new Winchester(480), new DiskDrive(10), new Ram(8), true, 900);
        Computer computer4 = new Computer(new Winchester(1480), new DiskDrive(23), new Ram(32), false, 4000);
        GamingComputer gamingComputer1 = new GamingComputer(new Winchester(2500), new DiskDrive(100), new Ram(64), true, 6700);
        // Включение компьютеров, проверка на вирусы и вывод размера винчестера и т.д.
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(gamingComputer1);
        for (Computer computer : computers) {
            computer.turnOn();
            computer.checkForViruses();
            System.out.println(computer.printWinchesterSize());
            System.out.println(computer);
            computer.updateComponents();
            System.out.println(computer);
            computer.turnOff();
            System.out.println(" ");
        }
        // Самый выгодный компьютер
        Computer cheapestComputer = computers.getFirst();
        for (Computer computer : computers) {
            if (computer.price < cheapestComputer.price) {
                cheapestComputer = computer;
            }
        }
        System.out.println("Самый выгодный компьютер стоит: " + cheapestComputer.price + " руб.");
    }
}