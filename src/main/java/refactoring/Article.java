package refactoring;

public class Article {

    private Bike bike;
    private int purchaseAmount;

    public Article(Bike bike, int purchaseAmount) {
        setBike(bike);
        setPurchaseAmount(purchaseAmount);
    }

	/**
	 * @return the purchaseAmount
	 */
	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	/**
	 * @param purchaseAmount the purchaseAmount to set
	 */
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	/**
	 * @return the bike
	 */
	public Bike getBike() {
		return bike;
	}

	/**
	 * @param bike the bike to set
	 */
	public void setBike(Bike bike) {
		this.bike = bike;
	}
}
