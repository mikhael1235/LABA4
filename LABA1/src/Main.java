public class Main {
    public static void main(String[] args) {
        ComputerRepository repository = new ComputerRepository();

        Computeri computer1 = new Computeri(new Winchester(500), new DiskDrive(12), new Ram(16), true, 1000);
        Computeri computer2 = new Computeri(new Winchester(1000), new DiskDrive(23), new Ram(32), false, 5000);
        Computeri computer3 = new Computeri(new Winchester(480), new DiskDrive(10), new Ram(8), true, 900);
        Computeri computer4 = new Computeri(new Winchester(1480), new DiskDrive(23), new Ram(32), false, 4000);
        GamingComputer gamingComputer1 = new GamingComputer(new Winchester(2500), new DiskDrive(100), new Ram(64), true, 6700);

        repository.addComputer(computer1);
        repository.addComputer(computer2);
        repository.addComputer(computer3);
        repository.addComputer(computer4);
        repository.addComputer(gamingComputer1);

        for (Computeri computer : repository.getAllComputers()) {
            computer.turnOn();
            computer.checkForViruses();
            System.out.println(computer.printWinchesterSize());
            System.out.println(computer);
            computer.updateComponents();
            System.out.println(computer);
            computer.turnOff();
            System.out.println(" ");
        }

        Computeri cheapestComputer = repository.getComputerByIndex(0);
        for (Computeri computer : repository.getAllComputers()) {
            if (computer.price < cheapestComputer.price) {
                cheapestComputer = computer;
            }
        }
        System.out.println("Самый выгодный компьютер стоит: " + cheapestComputer.price + " руб.");
    }
}