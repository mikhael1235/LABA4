public class GamingComputer extends Computeri {
    // Было изменено название класса для лучшей читаемости
    GamingComputer(Winchester winchester, DiskDrive diskDrive, Ram ram, boolean isHandMade, int price) {
        super(winchester, diskDrive, ram, isHandMade, price);
    }

    @Override
    String printWinchesterSize() {
        return "Игровой" + super.printWinchesterSize();
    }
}
