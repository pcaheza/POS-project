package POSTEST;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.gson.Gson;

import POSPD.CashDrawer;
import POSPD.Cashier;
import POSPD.Item;
import POSPD.Person;
import POSPD.Price;
import POSPD.PromoPrice;
import POSPD.Register;
import POSPD.Sale;
import POSPD.SaleLineItem;
import POSPD.Session;
import POSPD.Store;
import POSPD.TaxCategory;
import POSPD.TaxRate;
import POSPD.UPC;

public class PosTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// setting store
		Store store = new Store();
		store.setName("1 Dollar Store");
		store.setNumber("8911HL");

		// setting UPCs
		TreeMap<String, UPC> upcs1 = new TreeMap<>();
		UPC upc1 = new UPC("123456");
		UPC upc2 = new UPC("223456");
		upcs1.put(upc1.getUpc(), upc1);
		upcs1.put(upc2.getUpc(), upc2);

		TreeMap<String, UPC> upcs2 = new TreeMap<>();
		UPC upc3 = new UPC("33456");
		UPC upc4 = new UPC("443456");
		upcs2.put(upc3.getUpc(), upc3);
		upcs2.put(upc4.getUpc(), upc4);

		TreeMap<String, UPC> upcs3 = new TreeMap<>();
		UPC upc5 = new UPC("55456");
		UPC upc6 = new UPC("66456");
		upcs3.put(upc5.getUpc(), upc5);
		upcs3.put(upc6.getUpc(), upc6);

		// setting up prices
		TreeSet<Price> prices1 = new TreeSet<>();
		Price promoPrice1 = new PromoPrice("100", LocalDate.now().toString(), LocalDate.of(2022, 10, 12).toString());
		// Price promoPricex = new PromoPrice("1001", LocalDate.of(2018, 10,
		// 12).toString(),
		// LocalDate.of(2024, 10, 12).toString());
		Price promoPrice2 = new PromoPrice("998321", LocalDate.now().toString(), LocalDate.of(2021, 8, 12).toString());
		Price promoPrice3 = new PromoPrice("3213", LocalDate.of(2018, 6, 26).toString(),
				LocalDate.of(2020, 6, 16).toString());
		prices1.add(promoPrice1);
		prices1.add(promoPrice2);
		prices1.add(promoPrice3);

		TreeSet<Price> prices2 = new TreeSet<>();
		Price promoPrice4 = new PromoPrice("312312", LocalDate.of(2018, 1, 27).toString(),
				LocalDate.of(2024, 1, 27).toString());
		Price promoPrice5 = new PromoPrice("12323", LocalDate.now().toString(), LocalDate.of(2023, 2, 12).toString());
		prices2.add(promoPrice4);
		prices2.add(promoPrice5);

		// setting up item category
		TaxCategory category = new TaxCategory("houseHoldCategory");
		TreeSet<TaxRate> taxRates = new TreeSet<>();
		// setting up tax rate
		TaxRate txRate1 = new TaxRate(LocalDate.now(), new BigDecimal(30.22));
		TaxRate txRate2 = new TaxRate(LocalDate.now(), new BigDecimal(15.22));
		taxRates.add(txRate1);
		taxRates.add(txRate2);
		category.setTaxRates(taxRates);

		// setting items
		Item item1 = new Item("001", "rice");
		item1.setUpcs(upcs1);
		item1.setPrices(prices1);
		item1.setTaxCategory(category);
		Item item2 = new Item("002", "shoes");
		item2.setUpcs(upcs2);
		item2.setPrices(prices2);
		item2.setTaxCategory(category);
		Item item3 = new Item("003", "gun");
		item3.setUpcs(upcs3);
		item3.setPrices(prices1);
		item3.setTaxCategory(category);

		// add items
		store.addItem(item1);
		store.addItem(item2);
		store.addItem(item3);

		// add tax category
		store.addTaxCategory(category);

		// add upc
		store.addUPC(upc1);
		store.addUPC(upc2);
		store.addUPC(upc3);
		store.addUPC(upc4);
		store.addUPC(upc5);

		System.out.println("************************** AC I  ********************");
		System.out.println(store);
		
		System.out.println("************************** AC II ********************");
		
		//setting up cashier
		Cashier cashier1 = new Cashier();
		Cashier cashier2 = new Cashier();;
		Cashier cashier3 = new Cashier();
		
		//setting up person
		Person person1 = new Person();
		person1.setName("Pacifique Caheza");
		person1.setAddress("Area 51");
		person1.setState("NV");
		person1.setZip("00707");
		person1.setSSN("777777");
		person1.setCashier(cashier1);
		cashier1.setNumber("1000");
		cashier1.setPassword("YHN1000XHABN");
		cashier1.setPerson(person1);

		// person 2
		Person person2 = new Person();
		person2.setName("Alex Jackson");
		person2.setAddress("1244 Linc avenue");
		person2.setState("NY");
		person2.setZip("9898");
		person2.setSSN("22324");
		person2.setCashier(cashier2);
		cashier2.setNumber("1001");
		cashier2.setPassword("2YHN1001XHABN");
		cashier2.setPerson(person2);

		// person 3
		Person person3 = new Person();
		person3.setName("Samuel Elijah");
		person3.setAddress("7263 Apple avenue");
		person3.setState("CA");
		person3.setZip("37273");
		person3.setSSN("878678");
		person3.setCashier(cashier3);
		cashier3.setNumber("1003");
		cashier3.setPassword("3YHN1003XHABN");
		cashier3.setPerson(person3);
		
		//set cashier
		store.addCashier(cashier1);
		store.addCashier(cashier2);
		store.addCashier(cashier3);

		// Session session=new Sess
		System.out.println("Store Name : " +store.getName() );
		System.out.println("Store Number : " +store.getNumber() );
		System.out.println("Store Cashier: " +store.getCashier().values() );
		
		System.out.println("************************** AC III ********************");
		
		//setting cash drawer
		CashDrawer cshDrwr=new CashDrawer();
		cshDrwr.setPosition(1);
		cshDrwr.setCashAmount(new BigDecimal(1000));
		
		CashDrawer cshDrwr2=new CashDrawer();
		cshDrwr2.setPosition(2);
		cshDrwr2.setCashAmount(new BigDecimal(2000));
		
		//Registers
		Register reg1=new Register("00100");
		reg1.setCashDrawer(cshDrwr);
		
		Register reg2=new Register("00200");
		reg2.setCashDrawer(cshDrwr2);
		
		store.addRegister(reg1);
		store.addRegister(reg2);
		
		System.out.println("Store Name : " +store.getName() );
		System.out.println("Store Number : " +store.getNumber() );
		System.out.println("Store Registers: " +store.getregisters().values() );
		
		System.out.println("************************** AC IV ********************");
		
		//setup session
		Session session=new Session(cashier1,reg1);
		Sale sale=new Sale("false");
		sale.setDateTime(LocalDateTime.now());
		session.setStartDateTime(LocalDateTime.now());
		SaleLineItem sli1=new SaleLineItem(sale,item1,"20");
		SaleLineItem sli2=new SaleLineItem(sale,item2,"10");
		sale.addLineItem(sli1);
		sale.addLineItem(sli2);
		session.addSale(sale);
		session.setEndDateTime(LocalDateTime.now());
		
		System.out.println("Data about sale");
		System.out.println("######################################");
		System.out.println("Session Start Time: "+session.getStartDateTime());
		System.out.println("Session End Time:  "+session.getEndDateTime());
		System.out.println("Sub Items: "+sale.getSaleLineItems());
		System.out.println("Sale SubTotal: "+sale.calcSubTotal());
		System.out.println("Sale Tax: "+sale.calcTax());
		System.out.println("Sale Total: "+sale.calcTotal());
		
		
	}
}