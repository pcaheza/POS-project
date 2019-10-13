package POSPD;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * Sale is a transaction between a customer and the store the represents the items purchased by the customer. The system shall record the data for a transition, look up the price for an item based on UPC, and calculate the sales tax and sale total, and accept payments.
 */
public class Sale {

    /**
     * this specify the date and time item was purchased.
     */
    private LocalDateTime dateTime;
    /**
     * taxFree is about checking if the sold item is taxFree.
     */
    private Boolean taxFree;
    /**
     * this will ensure the payment of sale purchased in store.
     */
    private Collection<Payment> payments;
    /**
     * SaleLineItem represent each item and its details like serial number of each items.
     */
    private Collection<SaleLineItem> saleLineItems;

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Boolean getTaxFree() {
        return this.taxFree;
    }

    public void setTaxFree(Boolean taxFree) {
        this.taxFree = taxFree;
    }

    public Collection<Payment> getPayments() {
        return this.payments;
    }

    public void setPayments(Collection<Payment> payments) {
        this.payments = payments;
    }

    public Collection<SaleLineItem> getSaleLineItems() {
        return this.saleLineItems;
    }

    public void setSaleLineItems(Collection<SaleLineItem> saleLineItems) {
        this.saleLineItems = saleLineItems;
    }

    /**
     * default constructor
     * @param taxFree
     */
    public Sale(String taxFree) {
        // TODO - implement Sale.Sale
        throw new UnsupportedOperationException();
    }

    /**
     * this function will be in charge to add payment of sold item.
     * @param payment
     */
    public void addPayment(Payment payment) {
        // TODO - implement Sale.addPayment
        throw new UnsupportedOperationException();
    }

    /**
     * this function will remove the payment of sold item.
     * @param payment
     */
    public void removePayment(Payment payment) {
        // TODO - implement Sale.removePayment
        throw new UnsupportedOperationException();
    }

    /**
     * this function will add each item and its details like serial number of each items.
     * @param sli
     */
    public void addLineItem(SaleLineItem sli) {
        // TODO - implement Sale.addLineItem
        throw new UnsupportedOperationException();
    }

    /**
     * SaleLineItem function will reomve specific item and its details like serial number of each ite
     * @param sli
     */
    public void removeSaleLineItem(SaleLineItem sli) {
        // TODO - implement Sale.removeSaleLineItem
        throw new UnsupportedOperationException();
    }

    /**
     * this function will calculate the total.
     */
    public BigDecimal calcTotal() {
        // TODO - implement Sale.calcTotal
        throw new UnsupportedOperationException();
    }

    /**
     * this function will calculate  the subtotal.
     */
    public BigDecimal calcSubTotal() {
        // TODO - implement Sale.calcSubTotal
        throw new UnsupportedOperationException();
    }

    /**
     * this function will calculate the tax.
     */
    public BigDecimal calcTax() {
        // TODO - implement Sale.calcTax
        throw new UnsupportedOperationException();
    }

    /**
     * this function will getTotalPayment.
     */
    public BigDecimal getTotalPayments() {
        // TODO - implement Sale.getTotalPayments
        throw new UnsupportedOperationException();
    }

    /**
     * this function will check if the payment is enough
     */
    public Boolean isPaymentEnough() {
        // TODO - implement Sale.isPaymentEnough
        throw new UnsupportedOperationException();
    }

    /**
     * this function will calculate amount to be payed
     * @param amtTendered
     */
    public void calcAmountForPayment(BigDecimal amtTendered) {
        // TODO - implement Sale.calcAmountForPayment
        throw new UnsupportedOperationException();
    }

    /**
     * this function will calculate change
     */
    public BigDecimal calcChange() {
        // TODO - implement Sale.calcChange
        throw new UnsupportedOperationException();
    }

    /**
     * This function will calculate the tendered amount.
     */
    public BigDecimal caclAmtTendered() {
        // TODO - implement Sale.caclAmtTendered
        throw new UnsupportedOperationException();
    }

    /**
     * constructor
     */
    public Sale() {
        // TODO - implement Sale.Sale
        throw new UnsupportedOperationException();
    }

}