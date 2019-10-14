package POSPD;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * is alphanumeric strings that store offer to encourage person or customers to
 * purchases their items which are in store and are typically associated with an
 * overarching promotional marketing strategy. The discount associated with a
 * promo code can apply to individual saleItems or an entire order.
 */
public class PromoPrice extends Price {

	/**
	 * this specify the endDate of promotion.
	 */
	private LocalDate endDate;

	public PromoPrice() {

	}

	/**
	 * this is a constructor which have price,effectiveDate and endDate as
	 * parameter.
	 * 
	 * @param price
	 * @param effectiveDate
	 * @param endDate
	 */
	public PromoPrice(String price, String effectiveDate, String endDate) {
		super(price, effectiveDate);
		this.endDate = LocalDate.parse(endDate);
	}
	
	public LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 *TODO
	 * 
	 * @param price
	 */
	public int isEffectiveTo(Price price) {
		// TODO - implement PromoPrice.isEffectiveTo
		throw new UnsupportedOperationException(); //DONT UNDERSTRANT THIS FUNCTION
	}

	/**
	 * this function will make a comparison between the price and the promoPrice.
	 * 
	 * @param price
	 */
	public int compareTo(Price otherPrice) {
		int val = this.getEffectiveDate().compareTo(otherPrice.getEffectiveDate());
		return val == 0 ? this.getPrice().compareTo(otherPrice.getPrice()) : val;// TODO can we compare with the price value? the item price number? what 
	}

	@Override
	public Boolean isEffective(LocalDate date) {
		return this.getEffectiveDate().isBefore(date);
	}

	@Override
	public BigDecimal calcAmountForQyt(int quantity) {
		return this.getPrice().multiply(new BigDecimal(quantity));
	}

	@Override
	public String toString() {
		return "\n endDate=" + endDate + ", getPrice()=" + getPrice() + ", getEffectiveDate()="
				+ getEffectiveDate() + "\n ";
	}

}