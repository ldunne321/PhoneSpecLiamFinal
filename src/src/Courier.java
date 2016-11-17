import java.sql.Time;

/**
 * Created by Liam on 17/11/2016.
 */
public class Courier {
   private Time date;
    private double distance;
    private int deliveryNum;
    private double numPackages;

    public Courier(Time date, double distance, int deliveryNum, double numPackages){

        this.date=date;
        this.distance=distance;
        this.deliveryNum=deliveryNum;
        this.numPackages=numPackages;
    }

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(int deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public double getNumPackages() {
        return numPackages;
    }

    public void setNumPackages(double numPackages) {
        this.numPackages = numPackages;
    }


}
