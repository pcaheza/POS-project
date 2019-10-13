package POSPD;

import java.math.BigDecimal;

/**
 * cash drawer provides a means of temporarily storing cash during and between POS transactions.
 */
public class CashDrawer {

    /**
     * this specially the extra amount in CashDrawer.
     */
    private BigDecimal cashAmount;
    private int position;

    public BigDecimal getCashAmount() {
        return this.cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * this will allow to add cash in cashDrawer.
     * @param cash
     */
    public void addCash(BigDecimal cash) {
        // TODO - implement CashDrawer.addCash
        throw new UnsupportedOperationException();
    }

    /**
     * this function will allow to remove cash in Drawer.
     * @param cash
     */
    public void removeCash(BigDecimal cash) {
        // TODO - implement CashDrawer.removeCash
        throw new UnsupportedOperationException();
    }

    public String toString() {
        // TODO - implement CashDrawer.toString
        throw new UnsupportedOperationException();
    }

    /**
     * this is default constructor.
     */
    public CashDrawer() {
        // TODO - implement CashDrawer.CashDrawer
        throw new UnsupportedOperationException();
    }

}