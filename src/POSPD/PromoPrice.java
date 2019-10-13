package POSPD;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * is alphanumeric strings that store offer to encourage person or customers to purchases their items which are in store and are typically associated with an overarching promotional marketing strategy. The discount associated with a promo code can apply to individual saleItems or an entire order.
 */
public class PromoPrice extends Price {

    /**
     * this specify the endDate of promotion.
     */
    private LocalDate endDate;

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * this is a constructor which have price,effectiveDate and endDate as parameter.
     * @param price
     * @param effectiveDate
     * @param endDate
     */
    public PromoPrice(String price, String effectiveDate, String endDate) {
        // TODO - implement PromoPrice.PromoPrice
        throw new UnsupportedOperationException();
    }

    /**
     * this method will specify the price of items which will be effected by the promoPrice.
     * @param price
     */
    public int isEffectiveTo(Price price) {
        // TODO - implement PromoPrice.isEffectiveTo
        throw new UnsupportedOperationException();
    }

    /**
     * this function will make a comparison between the price and the promoPrice.
     * @param price
     */
    public int compareTo(Price price) {
        // TODO - implement PromoPrice.compareTo
        throw new UnsupportedOperationException();
    }

    public String toString() {
        // TODO - implement PromoPrice.toString
        throw new UnsupportedOperationException();
    }

    public PromoPrice() {
        // TODO - implement PromoPrice.PromoPrice
        throw new UnsupportedOperationException();
    }

	@Override
	public Boolean isEffective(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal calcAmountForQyt(int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}