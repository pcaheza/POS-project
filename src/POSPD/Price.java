package POSPD;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * price refer to the cost of each item located in store.
 */
public abstract class Price {

    /**
     * this describe the price of the item
     */
    private BigDecimal price;
    /**
     * this specify the effective date of the price
     */
    private LocalDate effectiveDate;
    /**
     * this specify the price of each item
     */
    private Item item;

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * 
     * @param price
     * @param effectiveDate
     */
    public Price(String price, String effectiveDate) {
    	this();
    	this.price=new BigDecimal(price);
    	this.effectiveDate=LocalDate.parse(effectiveDate);
   }    
    /**
     * this function will check the price which has been effected by promoPrice.
     * @param date
     */
    public abstract Boolean isEffective(LocalDate date);

    /**
     * 
     * @param quantity
     */
    public abstract BigDecimal calcAmountForQyt(int quantity);

    /**
     * 
     * @param price
     */
    public abstract int compareTo(Price price);

    public abstract String toString();

    public  Price() {
    }
}