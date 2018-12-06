
public class Item {

	private String name;
	private double unitPrice;
	private int quantityInStock;

	Item(String name, double unitPrice, int quantityInStock) {
		setName(name);
		setUnitPrice(unitPrice);
		setQuantityInStock(quantityInStock);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	public double getBasePrice() {
		return getUnitPrice();
	}
	
	public double getPrice() {
		return getBasePrice() * 1.15;
	}
	
	public String getString() {
		return "Item name=" + getName() 
		+ " unitPrice=$" + getUnitPrice()  
		+ " quantityInStock=" + getQuantityInStock()
		+ " price=$" + getPrice();
	}
}
