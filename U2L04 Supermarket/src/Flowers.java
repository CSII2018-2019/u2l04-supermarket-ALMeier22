
public class Flowers extends Item {

	private String color;
	private String variety;

	Flowers(String name, double unitPrice, int quantityInStock, String color, String variety) {
		super(name, unitPrice, quantityInStock);
		setColor(color);
		setVariety(variety);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}
	
	public double getBasePrice() {
		if(getVariety().equals("arrangement")) {
			return getUnitPrice() + 5; 
		}
		return getUnitPrice();
	}
	
	public String getString() {
		return super.getString() + " color=" + getColor() + " variety=" + getVariety();
	}
}
