import javax.swing.JOptionPane;

public class Supermarket {

	public static void main(String[] args) {
		
		Item[] goods = new Item[5];		
		goods[0] = new CannedGoods("beans", 4.99, 101);
		goods[1] = new CannedGoods("peas",3.99,52);
		goods[2] = new Flowers("lily",0.99, 6, "pink", "garden plant");
		goods[3] = new Flowers("birthday flowers",2.99, 5 ,"yellow and red", "arrangement");
		goods[4] = new Produce("red apple", 0.02, 51, "12/31/18", 99);
				
		System.out.println("Inventory:");
		for(int i=0; i<goods.length; i++) {
			System.out.println(goods[i].getString());
		}
		
		double totalCost = 0;
		for(int i=0; i<goods.length; i++) {
			String answer = JOptionPane.showInputDialog("How many " 
														+ goods[i].getName() 
														+ " (max " + goods[i].getQuantityInStock() + ") ?");
			int number = Integer.parseInt(answer);
			System.out.println("you bought " + number + " " + goods[i].getName());
			totalCost = totalCost + number * goods[i].getPrice();
			goods[i].setQuantityInStock(goods[i].getQuantityInStock()-number);
		}
		
		System.out.println("total cost = $" + totalCost);
		
		System.out.println("New Inventory:");
		for(int i=0; i<goods.length; i++) {
			System.out.println(goods[i].getString());
		}

		
	}

}
