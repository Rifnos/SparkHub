package main.models;

public class commission {

    public double delivery;
    public double extraEarnings;
    public double tips;

    public commission(double delivery) {
        this(delivery, 0.0, 0.0);
    }

    public commission(double delivery, double oneAmount, boolean isTips) {
        this.delivery = delivery;
        if (isTips) {
            this.tips = oneAmount;
            this.extraEarnings = 0.0;
        }
        else {
            this.extraEarnings = oneAmount;
            this.tips = 0.0;
        }
    }

    public commission(double delivery, double extraEarnings, double tips) {
        this.delivery = delivery;
        this.extraEarnings = extraEarnings;
        this.tips = tips;
    }

    public double getDelivery() { return delivery; }
    public void setDelivery(double delivery) { this.delivery = delivery; }

    public double getExtraEarnings() { return extraEarnings; }
    public void setExtraEarnings(double extraEarnings) { this.extraEarnings = extraEarnings; }

    public double getTips() { return tips; }
    public void setTips(double tips) { this.tips = tips; }
    
}
