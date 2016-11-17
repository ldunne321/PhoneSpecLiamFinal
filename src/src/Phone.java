/**
 * Created by Liam on 17/11/2016.
 */
public class Phone {


        private final String serialNumber;
        private double price;
        private final PhoneSpec spec;

        public Phone(String serialNumber, double price, PhoneSpec spec) {
            this.serialNumber = serialNumber;
            this.price = price;
            this.spec = spec;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(final float newPrice) {
            this.price = newPrice;
        }

        public PhoneSpec getSpec() {
            return spec;
        }
    }


