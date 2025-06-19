package refactoring;

public class Brompton extends Bike {

    public Brompton(String productName, double price, int maxSpeed, int rearGearsCount, int frontGearsCount) {
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
    
    @Override
    public double calculatePrice(Article article) {
    	double price = 0;
		if (article.getPurchaseAmount() > 1) {
		    price += (article.getPurchaseAmount() - 1) * getPrice() / 2;
		}
		price += getPrice() * article.getPurchaseAmount();
		return price;
	}
}
