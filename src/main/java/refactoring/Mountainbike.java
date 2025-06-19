package refactoring;

public class Mountainbike extends Bike {

    private int rearGearsCount;
    private int frontGearsCount;

    public Mountainbike(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
        setProductName(productName);
        setPrice(price);
        setMaxSpeed(maxSpeed);
        setRearGearsCount(rearGearsCount);
        setFrontGearsCount(frontGearsCount);
    }

    @Override
    public Integer getBatteryCapacity() {
        return null;
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
