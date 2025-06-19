package refactoring;

public class Mountainbike extends Bike {

    public int maxSpeed;
    public int rearGearsCount;
    public int frontGearsCount;

    public Mountainbike(String pn, double p, int ms, int rgc, int fgc) {
        setProductName(pn);
        setPrice(p);
        maxSpeed = ms;
        rearGearsCount = rgc;
        frontGearsCount = fgc;
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
        return rearGearsCount * frontGearsCount;
    }
}
