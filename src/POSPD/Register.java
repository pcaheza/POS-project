package POSPD;

/**
 * Register is the device that the cashier uses to execute a sales transaction with the customer. The system shall provide a way to add, update and delete register data.
 */
public class Register implements Comparable<Register>{

    private String number;
    /**
     * register will keep record of carDrawer
     */
    private CashDrawer cashDrawer;

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CashDrawer getCashDrawer() {
        return this.cashDrawer;
    }

    public void setCashDrawer(CashDrawer cashDrawer) {
        this.cashDrawer = cashDrawer;
    }

    /**
     * default constructor
     */
    public Register() {
        
    }

    /**
     * this constructor have number as parameter.
     * @param number
     */
    public Register(String number) {
       this.number=number;
    }

	@Override
	public String toString() {
		return "[number=" + number + ", cashDrawer=" + cashDrawer + "]\n";
	}

	@Override
	public int compareTo(Register o) {
		return this.number.compareTo(o.getNumber());
	}

    
}