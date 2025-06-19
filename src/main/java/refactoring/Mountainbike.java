package refactoring;

public class Mountainbike extends Bike {

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
    
    @Override
    public double calculatePrice(Article article) {
    	double price = 0;
    	if (article.getPurchaseAmount() > 2) {
            price += article.getPurchaseAmount() * getPrice() * 9 / 10;
        } else {
            price += getPrice() * article.getPurchaseAmount();
        }
		return price;
	}

}
