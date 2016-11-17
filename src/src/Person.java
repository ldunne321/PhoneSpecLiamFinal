/**
 * Created by Liam on 17/11/2016.
 */
public class Person {


    private String name;

    private int phoneNumber;

    private String address;


    public Person()

    {

    }



    public Person (String name, int phoneNumber, String address)

    {

        this.name=name;

        this.phoneNumber = phoneNumber;

        this.address = address;

    }

    public void setName(String name)

    {

        this.name=name;

    }

    public void setPhoneNumber(int phoneNumber)

    {

       this.phoneNumber = phoneNumber;

    }

    public void setAddress(String address)

    {

        this.address = address;
    }

    public String getName()

    {

       return name;
    }

    public int getphoneNumber()

    {

        return phoneNumber;

    }

    public String getaddress()

    {

        return address;

    }

}


