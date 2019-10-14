package POSPD;

/**
 * person represents customers who purchase and pay all items purchased in store to cashiers.
 */
public class Person {

    /**
     * specify the name of the customer
     */
    private String name;
    /**
     * specify address of the customer or person.
     */
    private String address;
    /**
     * specify the state where the customer is living in.
     */
    private String state;
    /**
     * specify the zip of the customer.
     */
    private String zip;
    /**
     * specify phone number of customer.
     */
    private String phone;
    /**
     * specify the serial number of item sold to the customer.
     */
    private String sSN;
    /**
     * specify client city.
     */
    private String city;
    /**
     * specify the cashier who interacted with the customer.
     */
    private Cashier cashier;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSSN() {
        return this.sSN;
    }

    public void setSSN(String sSN) {
        this.sSN = sSN;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Cashier getCashier() {
        return this.cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    /**
     * this is a constructor of person class.
     */
    public Person() {
       
    }

    /**
     * this constructor which having name and address as parameter.
     * @param name
     * @param address
     */
    public void person(String name, String address) {
        
    }

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", state=" + state + ", zip=" + zip + ", phone="
				+ phone + ", sSN=" + sSN + ", city=" + city + ", cashier=" + cashier.getNumber() + "\n";
	}

    

}