package refactoring;

public class Bike {

    private String productName;
    private double price;
    public Integer batteryCapacity;
	private int maxSpeed;
	private int rearGearsCount;
	private int frontGearsCount;

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getGearsCount() {
        throw new UnsupportedOperationException("Not Implemented");
    }

	/**
	 * @param batteryCapacity the batteryCapacity to set
	 */
	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getMaxSpeed() {
        return maxSpeed;
    }
	
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
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
