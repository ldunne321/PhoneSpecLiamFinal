/**
 * Created by Liam on 04/12/2016.
 */
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Phone> inventory;

    public Inventory(List<Phone> inventory) {
        this.inventory = inventory;
    }

    public void addPhone(String serialNumber, double price,String name, String address,
                         PhoneSpec phoneSpec) {
        Phone phone;
        Customer customer;
        if (phoneSpec instanceof PhoneSpec) {
            phone = new Phone(serialNumber, price, (PhoneSpec) phoneSpec,name,address);



            inventory.add(phone);

        }
    }

    public Phone getPhone(String serialNumber) {
        for (Phone phone : inventory) {
            if (phone.getSerialNumber().equals(serialNumber)) {
                return phone;
            }
        }
        return null;
    }

    public Customer getName(String name) {
        for (Customer customer : inventory) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
    public Customer getAddress(String address) {
        for (Customer customer : inventory) {
            if (customer.getaddress().equals(address)) {
                return customer;
            }
        }
        return null;
    }

    public List<Phone> searchPhone(PhoneSpec spec) {
        List<Phone> matchingPhone = new ArrayList<>();
        for (Phone phone : inventory) {
            PhoneSpec phoneSpec = phone.getSpec();
            if (phoneSpec.matches(spec)) {
                matchingPhone.add(phone);
            }
        }
        return matchingPhone;
    }
}