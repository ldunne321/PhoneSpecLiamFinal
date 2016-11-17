/**
 * Created by Liam on 17/11/2016.
 */
public class Customer extends Person {

    private int customerNumber;
    private String eMail;



    public Customer (int cn, String em)
    {
        customerNumber = cn;
        eMail = em;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

}



