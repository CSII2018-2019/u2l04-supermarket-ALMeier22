
public class Produce extends Item {

	private String expirationDate;
	private double weight;

	Produce(String name, double unitPrice, int quantityInStock, String expirationDate, double weight) {
		super(name, unitPrice, quantityInStock);
		setExpirationDate(expirationDate);
		setWeight(weight);
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getBasePrice() {
		return getUnitPrice() * getWeight();
	}
	
	public String getString() {
		return super.getString() + " weight=" + getWeight() + " expirationDate=" + getExpirationDate();
	}

}
