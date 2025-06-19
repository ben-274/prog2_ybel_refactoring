package refactoring;

public class Bike {

    private String productName;
    private double price;
    public Integer batteryCapacity;

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
}
