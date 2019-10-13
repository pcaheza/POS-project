package POSPD;

import java.util.*;

/**
 * Register is the device that the cashier uses to execute a sales transaction with the customer. The system shall provide a way to add, update and delete register data.
 */
public class Register {

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
        // TODO - implement Register.Register
        throw new UnsupportedOperationException();
    }

    /**
     * this constructor have number as parameter.
     * @param number
     */
    public Register(String number) {
        // TODO - implement Register.Register
        throw new UnsupportedOperationException();
    }

    public String toString() {
        // TODO - implement Register.toString
        throw new UnsupportedOperationException();
    }

}