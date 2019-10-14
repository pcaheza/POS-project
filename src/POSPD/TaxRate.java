package POSPD;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

/**
 * Tax Rate is the amount to charge for sales tax for an item. Each item is in one tax category and there is an current effective date base on the current date. The system shall provide a way to add, update and delete Tax Rates.
 */
public class TaxRate implements Comparable<TaxRate>{

    /**
     * the ratio at which a customer is taxed.
     */
    private BigDecimal taxRate;
    /**
     * effectiveDate is the date which store we start using new taxRate.
     */
    private LocalDate effectiveDate;

    public BigDecimal getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public LocalDate getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * it is a constructor which have effectiveDate and taxRate as parameter.
     * @param effectiveDate
     * @param taxRate
     */
    public TaxRate(LocalDate effectiveDate, BigDecimal taxRate) {
        // TODO - implement TaxRate.TaxRate
        this();
        this.effectiveDate=effectiveDate;
        this.taxRate=taxRate;
        
    }

    /**
     * this function will checkout precise time to apply taxRate to customer then if it is the right time it will apply taxRate if not it will not apply TaxRate customer or person.
     * @param date
     * effective=20/10/2019
     * date=13/10/2019
     */
    public boolean isEffective(LocalDate date) {
        
        
        return this.effectiveDate.isBefore(date);
    }
    

    /**
     * this function is about making a comparison between TaxRate.
     * @param taxRate
     * this.taxRate=10% 
     * otherTaxRate.taxRate=20%
     */
    public int compareTo(TaxRate otherTaxRate) {
      return this.taxRate.compareTo(otherTaxRate.getTaxRate());
       
    }


    @Override
	public String toString() {
		return "\n taxRate=" + taxRate.setScale(2, RoundingMode.CEILING) + ", effectiveDate=" + effectiveDate + "\n";
	}

	/**
     * this is a default constructor.
     */
    public TaxRate() {
        
    }

}