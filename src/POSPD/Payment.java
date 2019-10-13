package POSPD;

import java.math.BigDecimal;

/**
 * payment is amount of money person or customer is supposed to pay for the whole sales of item purchasing in stock.
 */
public class Payment {

    /**
     * this specially the amount to be paid.
     */
    private BigDecimal amount;
    /**
     * The Amount Tendered fields calculate the amount of change that is to be tendered to a Customer, based on the difference between their charge amount & the amount of money they gave you.
     */
    private BigDecimal amtTendered;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmtTendered() {
        return this.amtTendered;
    }

    public void setAmtTendered(BigDecimal amtTendered) {
        this.amtTendered = amtTendered;
    }

    /**
     * is a line item on the balance sheet, stating the amount of all cash or other assets that are readily convertible into cash.
     */
    public Boolean countsAsCash() {
        // TODO - implement Payment.countsAsCash
        throw new UnsupportedOperationException();
    }

}