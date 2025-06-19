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

    public Bill(String cn, String n, String s, String sn, int pc, Date b, String e, String c) {
        setCustomerName(cn);
        setNickname(n);
        setStreet(s);
        setStreetNumber(sn);
        setPostalCode(pc);
        setBirthday(b);
        setEmail(e);
        setCity(c);
        setArticles(new ArrayList<>());
    }

    public boolean addArticle(Article a) {
        return getArticles().add(a);
    }

    public String getDetails() {
        double total = 0;

        String result = "Details for \"" + getCustomerName() + "\"\n";
        result += getStreet() + " " + getStreetNumber() + "\n";
        result += getPostalCode() + " " + getCity() + "\n";
        result += "Geburtstag: " + getBirthday() + "\n";
        result += "Email: " + getEmail() + "\n\n";
        result += "refactoring.Article: \n";
        for (Article article : getArticles()) {
            double price = 0;
            if (article.getBike() instanceof Brompton) {
                if (article.getPurchaseAmount() > 1) {
                    price += (article.getPurchaseAmount() - 1) * article.getBike().price / 2;
                }
                price += article.getBike().price * article.getPurchaseAmount();
            } else if (article.getBike() instanceof EBike) {
                price += article.getBike().price * article.getPurchaseAmount();
            } else if (article.getBike() instanceof Mountainbike) {
                if (article.getPurchaseAmount() > 2) {
                    price += article.getPurchaseAmount() * article.getBike().price * 9 / 10;
                } else {
                    price += article.getBike().price * article.getPurchaseAmount();
                }
            }
            if (price > 1000f || price == 1000.0) {
                price = price * 0.8;
            }

            result +=
                    "\t"
                            + article.getBike().productName
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
