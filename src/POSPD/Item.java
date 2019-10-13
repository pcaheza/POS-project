package POSPD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Item is something that is sold in the store. The system shall provide a way to add, update and delete Items.
 */
public class Item implements Comparable{

    /**
     * this specify the number of item.
     */
    private String number;
    /**
     * this describe the type of item
     */
    private String description;
    /**
     * this provide the barcode of item
     */
    private TreeMap<String,UPC> upcs;
    /**
     * this specify the price of item
     */
    private TreeSet<Price> prices;
    /**
     * SaleLineItem represent each item and its details like serial number of each items.
     */
    private ArrayList<SaleLineItem> saleLineItems;
    /**
     * this taxCategory specify the tax item is located in
     */
    private TaxCategory taxCategory;

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TreeMap<String,UPC> getUpcs() {
        return this.upcs;
    }

    public void setUpcs(TreeMap<String,UPC> upcs) {
        this.upcs = upcs;
    }

    public TreeSet<Price> getPrices() {
        return this.prices;
    }

    public void setPrices(TreeSet<Price> prices) {
        this.prices = prices;
    }

    public ArrayList<SaleLineItem> getSaleLineItems() {
        return this.saleLineItems;
    }

    public void setSaleLineItems(ArrayList<SaleLineItem> saleLineItems) {
        this.saleLineItems = saleLineItems;
    }

    public TaxCategory getTaxCategory() {
        return this.taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    /**
     * 
     * @param num
     * @param description
     */
    public Item(String num, String description) {
        // TODO - implement Item.Item
        this();
        this.number=num;
        this.description=description;
        
        
   
    }

    /**
     * 
     * @param price
     */
    public void addPrice(Price price) {
    	prices.add(price);
        // TODO - implement Item.addPrice
        
    }

    /**
     * 
     * @param price
     */
    public void removePrice(Price price) {
        // TODO - implement Item.removePrice
        prices.remove(price);
    }

    /**
     * 
     * @param upc
     */
    public void addUPC(UPC upc) {
        // TODO - implement Item.addUPC
        upcs.put(upc.getUpc(), upc);
    }

    /**
     * 
     * @param upc
     */
    public void removeUPC(UPC upc) {
        // TODO - implement Item.removeUPC
        upcs.remove(upc.getUpc());
    }

    /**
     * 
     * @param date
     */
    public Price getPriceForDate(LocalDate date) {
        // TODO - implement Item.getPriceForDate
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param date
     */
    public BigDecimal getTaxRateForDate(LocalDate date) {
		

        // TODO - implement Item.getTaxRateForDate
		throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param date
     * @param quantity
     */
    public BigDecimal calcAmountForDateQty(LocalDate date, int quantity) {
        // TODO - implement Item.calcAmountForDateQty
        throw new UnsupportedOperationException();
    }

  

    @Override
	public String toString() {
		return "Item [number=" + number + ", description=" + description + ", upcs=" + upcs + ", prices=" + prices
				+ ", saleLineItems=" + saleLineItems + ", taxCategory=" + taxCategory + "]";
	}

	public Item() {
        // TODO - implement Item.Item
     
    }
	/**
	 * this.number="3" and other item.number="2" return 1
	 * this.number="2" and other item.number="3" return -1
	 * this.number="3" and other item.number="3" return 0
	 */

	@Override
	public int compareTo(Object other) {
		
		return this.number.compareToIgnoreCase(((Item)other).getNumber());
		
	}

}