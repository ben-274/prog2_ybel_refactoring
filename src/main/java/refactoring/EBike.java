package refactoring;

public class EBike extends Bike {

    public EBike(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount, int batteryCapacity) {
        setProductName(productName);
        setPrice(price);
        setMaxSpeed(maxSpeed);
        setRearGearsCount(rearGearsCount);
        setFrontGearsCount(frontGearsCount);
        setBatteryCapacity(batteryCapacity);
    }

    @Override
    public int getGearsCount() {
        return getRearGearsCount() * getFrontGearsCount();
    }
}
