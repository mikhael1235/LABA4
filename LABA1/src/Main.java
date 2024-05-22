import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание объектов с разной емкостью винчестеров после рефакторинга
        List<Computeri> computers = new ArrayList<>();
        // Создание объектов Computeri с разной емкостью винчестеров после рефакторинга
        Computeri computer1 = new Computeri(new Winchester(500), new DiskDrive(12), new Ram(16), true, 1000);
        // Создание объектов Computeri с разной емкостью винчестеров после рефакторинга
        Computeri computer2 = new Computeri(new Winchester(1000), new DiskDrive(23), new Ram(32), false, 5000);
        // Создание объектов Computeri с разной емкостью винчестеров после рефакторинга
        Computeri computer3 = new Computeri(new Winchester(480), new DiskDrive(10), new Ram(8), true, 900);
        // Создание объектов Computeri с разной емкостью винчестеров после рефакторинга
        Computeri computer4 = new Computeri(new Winchester(1480), new DiskDrive(23), new Ram(32), false, 4000);
        // Создание объектов GamingComputer с разной емкостью винчестеров после рефакторинга
        GamingComputer gamingComputer1 = new GamingComputer(new Winchester(2500), new DiskDrive(100), new Ram(64), true, 6700);
        // Включение компьютеров, проверка на вирусы и вывод размера винчестера и т.д.
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(gamingComputer1);
        for (Computeri computer : computers) {
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
        Computeri cheapestComputer = computers.getFirst();
        for (Computeri computer : computers) {
            if (computer.price < cheapestComputer.price) {
                cheapestComputer = computer;
            }
        }
        System.out.println("Самый выгодный компьютер стоит: " + cheapestComputer.price + " руб.");
    }
}