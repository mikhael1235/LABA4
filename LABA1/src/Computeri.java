
// Было изменено название класса для лучшей читаемости
public class Computeri {
    public Winchester winchester;
    public DiskDrive diskDrive;
    public Ram ram;
    protected boolean isOn;
    protected boolean isHandMade;
    protected int price;

    public Computeri(Winchester winchester, DiskDrive diskDrive, Ram ram, boolean isHandMade, int price) {
        this.winchester = winchester;
        this.diskDrive = diskDrive;
        this.ram = ram;
        this.isOn = false;
        this.isHandMade = isHandMade;
        this.price = price;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Компьютер включен");

    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Компьютер выключен");
    }

    public void checkForViruses() {
        if (this.isOn) {
            System.out.println("Проверка на вирусы...");
            System.out.println("Вирусов нет");
        } else {
            System.out.println("Компьютер выключен. Включите его для проверки на вирусы.");
        }
    }

    String printWinchesterSize() {
        return "Размер винчестера: " + this.winchester.getSize() + " ГБ";
    }

    @Override
    public String toString() {
        return "Computer{" +
                "winchester=" + winchester.getSize() +
                ", diskDrive=" + diskDrive.getSpeed() +
                ", ram=" + ram.getSize() +
                ", isOn=" + isOn +
                ", isHandMade=" + isHandMade +
                ", price=" + price +
                '}';
    }


    public void updateComponents() {
        this.winchester.setSize(this.winchester.getSize() + 500);
        this.price = this.price + 100;
        this.ram.setSize(this.ram.getSize() + 8);
    }
}
