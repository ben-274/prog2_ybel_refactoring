package refactoring;

public class EBike extends Bike {

    private int rearGearsCount;
    private int frontGearsCount;

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

	/**
	 * @return the frontGearsCount
	 */
	public int getFrontGearsCount() {
		return frontGearsCount;
	}

	/**
	 * @param frontGearsCount the frontGearsCount to set
	 */
	public void setFrontGearsCount(int frontGearsCount) {
		this.frontGearsCount = frontGearsCount;
	}

	/**
	 * @return the rearGearsCount
	 */
	public int getRearGearsCount() {
		return rearGearsCount;
	}

	/**
	 * @param rearGearsCount the rearGearsCount to set
	 */
	public void setRearGearsCount(int rearGearsCount) {
		this.rearGearsCount = rearGearsCount;
	}
}
