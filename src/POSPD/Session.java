package POSPD;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * A Session represents the period of time the cashier is using a register to make a sale. The system shall create sessions.
 */
public class Session {

    /**
     * specify the starting dateTime of the session.
     */
    private LocalDateTime StartDateTime;
    /**
     * specify the endDateTime
     */
    private LocalDateTime endDateTime;
    /**
     * Sale is a transaction between a customer and the store the represents the items purchased by the customer.
     */
    private ArrayList<Sale> sales;
    /**
     * 
     * The Cashiers make the sale to the customers. The system shall provide a way to add, update and delete Cashiers
     */
    private Cashier cashier;
    /**
     * Register is a memory that the cashier uses to execute a sales transaction with the customer.
     */
    private Register register;

    public LocalDateTime getStartDateTime() {
        return this.StartDateTime;
    }

    public void setStartDateTime(LocalDateTime StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return this.endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public ArrayList<Sale> getSales() {
        return this.sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public Cashier getCashier() {
        return this.cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Register getRegister() {
        return this.register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    /**
     * 
     * @param cashier
     * @param register
     */
    public Session(Cashier cashier, Register register) {
        // TODO - implement Session.Session
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param sale
     */
    public void addSale(Sale sale) {
        // TODO - implement Session.addSale
        sales.add(sale);
    }

    /**
     * 
     * @param sale
     */
    public void removeSale(Sale sale) {
        // TODO - implement Session.removeSale
        sales.remove(sale);
    }

    /**
     * 
     * @param cash
     */
    public BigDecimal calcCashCountDiff(BigDecimal cash) {
        // TODO - implement Session.calcCashCountDiff
        throw new UnsupportedOperationException();
    }

    public String toString() {
        // TODO - implement Session.toString
        throw new UnsupportedOperationException();
    }

    public Session() {
        // TODO - implement Session.Session
        throw new UnsupportedOperationException();
    }

}