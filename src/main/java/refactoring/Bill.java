package refactoring;

import java.util.ArrayList;
import java.util.Date;

public class Bill {

    private String customerName;
    private String nickname;
    private Date birthday;
    private String email;
    private String street;
    private String streetNumber;
    private int postalCode;
    private String city;
    private ArrayList<Article> articles;

    public Bill(String customerName, String nickname, String street, String streetNumber, int postalCode, Date birthday, String email, String city) {
        setCustomerName(customerName);
        setNickname(nickname);
        setStreet(street);
        setStreetNumber(streetNumber);
        setPostalCode(postalCode);
        setBirthday(birthday);
        setEmail(email);
        setCity(city);
        setArticles(new ArrayList<>());
    }

    public boolean addArticle(Article a) {
        return getArticles().add(a);
    }

    public String getDetails() {
        String result = "Details for \"" + getCustomerName() + "\"\n";
        result += getStreet() + " " + getStreetNumber() + "\n";
        result += getPostalCode() + " " + getCity() + "\n";
        result += "Geburtstag: " + getBirthday() + "\n";
        result += "Email: " + getEmail() + "\n\n";
        result += printArticle();

        return result;
    }

	private String printArticle() {
		double total = 0;
		String result = "refactoring.Article: \n";
		
		for (Article article : getArticles()) {
            double price = article.getBike().calculatePrice(article);
            if (price > 1000f || price == 1000.0) {
                price = price * 0.8;
            }

            result +=
                    "\t"
                            + article.getBike().getProductName()
                            + "\tx\t"
                            + article.getPurchaseAmount()
                            + "\t=\t"
                            + String.valueOf(price)
                            + "\n";
            total += price;
        }

        result += "\nTotal price:\t" + String.valueOf(total) + "\n";
		return result;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
