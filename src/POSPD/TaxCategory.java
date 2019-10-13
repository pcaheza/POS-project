package POSPD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * tax category allows to group and manage similar items tax rates. Not all item
 * has the same tax rate. the same tax category can be assigned to more than one
 * sales item , by having into account that it is recommend to split the tax
 * categories by item type.
 */
public class TaxCategory {

	/**
	 * this attribute specify the kind or type of taxCategory.
	 */
	private String category;
	/**
	 * the tax rate is the ratio at which a business or person is taxed.
	 */
	private TreeSet<TaxRate> taxRates;

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public TreeSet<TaxRate> getTaxRates() {
		return this.taxRates;
	}

	public void setTaxRates(TreeSet<TaxRate> taxRates) {
		this.taxRates = taxRates;
	}

	/**
	 * TaxCategory is a default constructor
	 */
	public TaxCategory() {

	}

	/**
	 * TaxCategory is a constructor which category was pass in as parameter.
	 * 
	 * @param category
	 */
	public TaxCategory(String category) {

		// TODO - implement TaxCategory.TaxCategory
		this.category = category;
	}

	/**
	 * this function will retrieve of get TaxRateForData based on the localDate.
	 * 
	 * @param date 
	 * 
	 */
	public BigDecimal getTaxRateForDate(LocalDate date) {
		
		for (TaxRate txRate : taxRates) {
			if (date.isEqual(txRate.getEffectiveDate())) {
				return txRate.getTaxRate();  //this is the rate i.e.10%
			}
		}

		return new BigDecimal(0);
	}

	

	@Override
	public String toString() {
		return "TaxCategory [category=" + category + ", taxRates=" + taxRates + "]";
	}

	/**
	 * this function will remove the TaxRate from TaxCategory.
	 * 
	 * @param taxRate
	 */
	public void removeTaxRate(TaxRate taxRate) {
		//raxRate={[10/20/2012,10%],[01/02/2013,14%],[05/02/2010,15%],}
		taxRates.remove(taxRate);
	}

	/**
	 * this function will add TaxRate to TaxCategory.
	 * 
	 * @param taxRate
	 */
	public void addTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.addTaxRate
		taxRates.add(taxRate);
	}

}