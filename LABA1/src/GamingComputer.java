public class GamingComputer extends Computer {
    GamingComputer(Winchester winchester, DiskDrive diskDrive, Ram ram, boolean isHandMade, int price) {
        super(winchester, diskDrive, ram, isHandMade, price);
    }

    @Override
    String printWinchesterSize() {
        return "Игровой" + super.printWinchesterSize();
    }
}
