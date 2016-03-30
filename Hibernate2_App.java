// Hibernate Application Class
// When ran Hibernate will insert a row into the Hibernate2_Stock table and the Hibernate_Category table

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

public class Hibernate2_App {
	public static void main(String[] args) {

		System.out.println("Hibernate many to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Hibernate2_Stock stock = new Hibernate2_Stock();
		stock.setStockCode("8523");
		stock.setStockName("FB");

		Hibernate2_Category category1 = new Hibernate2_Category("CONSUMER", "CONSUMER COMPANY");
		Hibernate2_Category category2 = new Hibernate2_Category("INVESTMENT", "INVESTMENT COMPANY");

		Set<Hibernate2_Category> categories = new HashSet<Hibernate2_Category>();
		categories.add(category1);
		categories.add(category2);

		stock.setCategories(categories);

		session.save(stock);

		session.getTransaction().commit(); // TCL COMMIT
		System.out.println("Done");
	}
}