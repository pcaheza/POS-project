package POSTEST;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import POSPD.Item;
import POSPD.Store;
import POSPD.TaxCategory;
import POSPD.TaxRate;
import POSPD.UPC;

public class posTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Store store = new Store();
		store.setName("cheap");
		store.setNumber("8911HL");
		
		UPC upc1 = new UPC("123456");
		UPC upc2 = new UPC("223456");
		UPC upc3 = new UPC("33456");
		UPC upc4 = new UPC("443456");
		UPC upc5= new UPC("55456");
		UPC upc6 = new UPC("66456");
		
		
		Item item1 = new Item("0001", "rice");
		Item item2 = new Item("002", "shoes");
		Item item3 = new Item("003", "gun");

		TaxCategory category = new TaxCategory("houseHoldCategory");

		TreeSet<TaxRate> taxRates = new TreeSet<>();
		TaxRate txRate1 = new TaxRate(LocalDate.of(2018, 10, 12), new BigDecimal(30.22));
		TaxRate txRate2 = new TaxRate(LocalDate.of(2019, 10, 12), new BigDecimal(15.22));
		taxRates.add(txRate1);
		taxRates.add(txRate2);
		category.setTaxRates(taxRates);

		System.out.println(txRate1);
		TreeSet<Item> collection = new TreeSet<>();
		collection.add(item1);
		collection.add(item2);
		collection.add(item3);
		collection.add(item1);
		collection.add(item2);
		collection.add(item3);
		collection.remove(new Item("002", "table"));
		for (Item o : collection) {

			// if ("002".equals(o.getNumber())) {
			// block of code to be executed if the condition is true
			System.out.println(o);
			// }

		}
	}
}