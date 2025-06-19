package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BillTest {
	private Bill bill;
	
	@BeforeEach
	void setUp() {
		bill = new Bill("Max Mustermann", "max", "Hauptstr.", "1", 12345, new Date(), "max@gmx.de", "Berlin");
	}
	
	@Test
	void testAddArticle() {
		Bike bike = new Brompton("Brompton 1", 1000, 20, 3, 3);
		Article article = new Article(bike, 1);

        assertTrue(bill.addArticle(article));
        assertEquals(1, bill.getArticles().size());
	}
	
	@Test
	void testGetDetails() {
		Bike bike = new Brompton("Brompton 1", 1000, 20, 3, 3);
		Article article = new Article(bike, 1);

		bill.addArticle(article);
		String details = bill.getDetails();

        assertTrue(details.contains("Max Mustermann"));
	}
	
	@Test
	void testBromptonPreis() {
		Bike bike = new Brompton("Brompton 1", 1000, 20, 3, 3);
		Article article = new Article(bike, 2);

		bill.addArticle(article);
		String details = bill.getDetails();

        assertTrue(details.contains("2000"));
	}
	
	@Test
	void testEBikePreis() {
		Bike bike = new EBike("EBike 2", 1000, 30, 4, 4, 500);
		Article article = new Article(bike, 2);

		bill.addArticle(article);
		String details = bill.getDetails();

        assertTrue(details.contains("1600"));
	}

	@Test
    public void testMountainbikeKeinRabatt() {
        Bike bike = new Mountainbike("Mountainbike M500", 400, 30, 4, 4);
        Article article = new Article(bike, 2);

        bill.addArticle(article);
        String details = bill.getDetails();

        assertTrue(details.contains("800"));
    }
	
	@Test
    public void testMountainbikeMitRabatt() {
        Bike bike = new Mountainbike("Mountainbike M500", 400, 30, 4, 4);
        Article article = new Article(bike, 3);

        bill.addArticle(article);
        String details = bill.getDetails();

        assertTrue(details.contains("864"));
    }
	
	@Test
	public void testPreisVerschiedeneBikes() {
        Bike bike = new Mountainbike("Mountainbike M500", 400, 30, 4, 4);
        Bike bike2 = new EBike("EBike 2", 1000, 30, 4, 4, 500);
        Article article = new Article(bike, 2);
        Article article2 = new Article(bike2, 2);

        bill.addArticle(article);
        bill.addArticle(article2);
        String details = bill.getDetails();

        assertTrue(details.contains("2400"));
    }
}
