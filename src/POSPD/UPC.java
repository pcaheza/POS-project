package POSPD;
/**
 * is a barcode symbol  used for tracking trade items in store.
 */
public class UPC {

    /**
     *  used for tracking trade items in store.
     */
    private String upc;
    /**
     * specify barcode of item
     */
    private Item item;

    public String getUpc() {
        return this.upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * constructor which has  upc as parameter.
     * @param upc
     */
    public UPC(String upc) {
       this.upc=upc;
    }

  
    @Override
	public String toString() {
		return "UPC [upc=" + upc + ", item=" + item + "]";
	}

	/**
     * this default constructor for upc.
     */
    public UPC() {
        
    }

}