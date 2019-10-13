package POSPD;

import java.util.*;

/**
 * Store is the retail outlet that sells to the customers, employs the cashiers and owns the items. The system shall provide a way to update store information.
 */
public class Store {

    /**
     * represent the number of everything which are located in store.
     */
    private String number;
    /**
     * name represents the real name of store.
     */
    private String name;
    /**
     * Register is the device that the cashier uses to execute a sales transaction with the customer.
     */
    private TreeMap<String,Register> registers;
    /**
     * attribute cashier make the sale to the customers.
     *  
     */
    private TreeMap<String, Cashier> cashiers;
    /**
     * Session attribute represents the period of time the cashier is using a register to make a sale. The system shall create sessions.
     */
    private ArrayList<Session> sessions;
    /**
     * tax category allows to group and manage similar items tax rates. Not all item has the same tax rate.
     */
    private TreeMap<String,TaxCategory> taxCategories;
    /**
     *  Barcode symbol used for tracking trade items in store.
     */
    private TreeMap<String,UPC> upcs;
    /**
     * Item represents everything that will be purchased from store.
     */
    private TreeMap <String,Item> items;

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeMap<String,Register> getregisters() {
        return this.registers;
    }

    public void setregisters(TreeMap<String,Register> registers) {
        this.registers = registers;
    }

    public TreeMap <String,Cashier> getCashier() {
        return this.cashiers;
    }



    public ArrayList<Session> getSessions() {
        return this.sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }

    public TreeMap<String,TaxCategory> getTaxCategory() {
        return this.taxCategories;
    }

    public void setTaxCategory(TreeMap<String,TaxCategory> taxCategory) {
        this.taxCategories = taxCategory;
    }

    public TreeMap<String,UPC> getUpcs() {
        return this.upcs;
    }

    public void setUpcs(TreeMap<String,UPC> upcs) {
        this.upcs = upcs;
    }

    public TreeMap<String,Item> getItems() {
        return this.items;
    }

    public void setItems(TreeMap<String,Item> items) {
        this.items = items;
    }

    /**
     * default constructor is a constructor which will be called with no arguments (either defined with an empty parameter list, or with default arguments provided for every parameter).
     */
    public Store() {
        /**
         * Craete a items to track Store. 
         */
    	this.items=new TreeMap <String,Item>();
        
       
       
    }

    /**
     * it is a constructor that we will pass in name and number of store as parameter.
     * @param number
     * @param name
     */
    public Store(String number, String name) {
        // TODO - implement Store.Store
    	
    	this.number=number;
    	this.name=name;
         
    }

    /**
     * adds a new item to items
     * @param item
     */
    public void addItem(Item item) {
        
        items.put(item.getNumber(), item);
    }

    /**
     * this method we will help us to remove item in store.
     * @param item
     */
    public void removeItem(Item item) {
        // TODO - implement Store.removeItem
       items.remove(item.getNumber());
    }
   
    {
    	
    }
    /**
     * addupc is function for enable items to be sold ,reordered and tracked through store, this function will add UPC in Store.
     * @param upc
     */
    public void addUPC(UPC upc) {
        // TODO - implement Store.addUPC
        upcs.put(upc.getUpc(), upc);
    }

    /**
     * removeUPC this function will disable or remove UPC from Store.
     * @param upc
     */
    public void removeUPC(UPC upc) {
        // TODO - implement Store.removeUPC
        upcs.remove(upc.getUpc());
    }

    /**
     * this function will add register and register will rings up sales in store,processes payments, and tracks all of sales item,inventory and customer or person data with in store.
     * @param register
     */
    public void addRegister(Register register) {
        // TODO - implement Store.addRegister
      registers.put(register.getNumber(), register);
      
    }

    /**
     * this function will remove register from store.
     * @param register
     */
    public void removeRegister(Register register) {
        // TODO - implement Store.removeRegister
       registers.remove(register.getNumber());
    }

    /**
     * this function will add cashier and cashier make the sale to the customers.
     * @param cashier
     */
    public void addCashier(Cashier cashier) {
        // TODO - implement Store.addCashier
        cashiers.put(cashier.getNumber(), cashier);
    }

    /**
     * this function will remove the cashier from store
     * @param cashier
     */
    public void removeCashier(Cashier cashier) {
        // TODO - implement Store.removeCashier
        cashiers.remove(cashier.getNumber());
    }

    /**
     * this method will add taxCategory in store.taxCategory will allow to group and manage similar items tax rates and not all item has the same tax rate.
     * @param taxCategory
     */
    public void addTaxCategory(TaxCategory taxCategory) {
        // TODO - implement Store.addTaxCategory
        taxCategories.put(taxCategory.getCategory(), taxCategory);
    }

    /**
     * this method will remove taxCategory from Store.
     * @param taxCategory
     */
    public void removeTaxCategory(TaxCategory taxCategory) {
        // TODO - implement Store.removeTaxCategory
    	taxCategories.remove(taxCategory.getCategory());
    	
    }

    /**
     * this method will addSession, session represents the period of time the cashier is using a register to make a sale of item.
     * @param session
     */
    public void addsSession(Session session) {
        // TODO - implement Store.addsSession
        sessions.add(session);
    }
    public void removesSession(Session session) {
        // TODO - implement Store.addsSession
        sessions.remove(session);
    }
    /**
     * this function will search and find register based on the numbers.
     * @param number
     */
    public Register findRegisterByNumber(String number) {
        // TODO - implement Store.findRegisterByNumber
        
    }

    /**
     * this function will search and find item for UPC based on Barcodes of item.
     * @param upc
     */
    public Item findItemForUPC(String upc) {
        // TODO - implement Store.findItemForUPC
        throw new UnsupportedOperationException();
    }

    /**
     * this function will search and find the item based on item number in store.
     * @param number
     */
    public Item findItemForNumber(String number) {
        // TODO - implement Store.findItemForNumber
        throw new UnsupportedOperationException();
    }

    /**
     * this method will search and find cashier based on the number of the cashier.
     * @param number
     */
    public Cashier findCashierForNumber(String number) {
        // TODO - implement Store.findCashierForNumber
        throw new UnsupportedOperationException();
    }

    /**
     * this function will find TaxCategory based on name of taxCategory.
     * @param category
     */
    public TaxCategory findTaxCategoryByName(String category) {
        // TODO - implement Store.findTaxCategoryByName
        throw new UnsupportedOperationException();
    }

    /**
     * this
     */
    public String toString() {
        // TODO - implement Store.toString
        return this.name;
    }

}