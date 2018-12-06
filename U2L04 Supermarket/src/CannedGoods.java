
public class CannedGoods extends Item {

	CannedGoods(String name, double unitPrice, int quantityInStock) {
		super(name, unitPrice, quantityInStock);
	}

	public double getBasePrice() {
		return getUnitPrice();
	}
	
}
