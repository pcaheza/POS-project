package POSPD;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * SaleLineItem represent each item and its details like serial number of each items.
 */
public class SaleLineItem {

    /**
     * this specify the quantity of saleLineItem
     */
    private int quantity;
    /**
     * specify item that will be sold from the store.
     */
    private Item item;
    /**
     * transaction between a customer and the store the represents the items purchased by the customer.
     */
    private Sale sale;

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Sale getSale() {
        return this.sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    /**
     * constructor that will have sale,item, quantity as parameter.
     * @param sale
     * @param item
     * @param quantity
     */
    public SaleLineItem(Sale sale, Item item, String quantity) {
        this.sale=sale;
        this.item=item;
        this.quantity=Integer.valueOf(quantity);
    }

    /**
     * this function will calculate the subtotal of the sold items.
     */
    public BigDecimal calcSubTotal() {
       return item.getPriceForDate(LocalDate.now()).getPrice().multiply(
    		   new BigDecimal(this.quantity));
    }

    /**
     * this function will calculate tax of the sold item.
     */
    public BigDecimal calTax() {
    		return item.getTaxRateForDate(LocalDate.now()).multiply(new BigDecimal(this.quantity));
    }

    /**
     * constructor
     */
    public SaleLineItem() {
    
    }

	@Override
	public String toString() {
		return "SaleLineItem [quantity=" + quantity + ", item=" + item  +"]";
	}

}