// Hibernate Application Class
// When ran Hibernate will insert a row into the Hibernate_Stock table and the Hibernate_StockDailyRecord table

import java.util.Date;
import org.hibernate.Session;

public class Hibernate_App {
	
	public static void main(String[] args) {

		System.out.println("Hibernate one to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Hibernate_Stock stock = new Hibernate_Stock();
		stock.setStockCode("8526");
		stock.setStockName("FB");
		session.save(stock);

		Hibernate_StockDailyRecord stockDailyRecords = new Hibernate_StockDailyRecord();
		stockDailyRecords.setPriceOpen(new Float("1.2"));
		stockDailyRecords.setPriceClose(new Float("1.1"));
		stockDailyRecords.setPriceChange(new Float("10.0"));
		stockDailyRecords.setVolume(3000000L);
		stockDailyRecords.setDate(new Date());

		stockDailyRecords.setStock(stock);
		stock.getStockDailyRecords().add(stockDailyRecords);

		session.save(stockDailyRecords);

		session.getTransaction().commit();
		System.out.println("Done");
	}
}