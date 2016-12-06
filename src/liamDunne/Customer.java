/**
 * Created by Liam on 17/11/2016.
 */
public class Customer {


    private String name;

    private int phoneNumber;

    private String address;




    public Customer()

    {

    }



    public Customer(String name, String address)

    {

        this.name=name;



        this.address = address;

    }

    public void setName(String name)

    {

        this.name=name;

    }



    public void setAddress(String address)

    {

        this.address = address;
    }

    public String getName()

    {

       return name;
    }


    public String getaddress()

    {

        return address;

    }

}


