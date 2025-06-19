package refactoring;

public class Brompton extends Bike {

    private int maxSpeed;
    private int rearGearsCount;
    private int frontGearsCount;

    public Brompton(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
        setProductName(productName);
        setPrice(price);
        setMaxSpeed(maxSpeed);
        setRearGearsCount(rearGearsCount);
        setFrontGearsCount(frontGearsCount);
    }

    public int getMaxSpeed() {
        return maxSpeed;
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

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
