package domain;
import java.util.ArrayList;

import javax.swing.*;


public class Shop {
	private ArrayList<Product> producten;

	public Shop()
	{
		producten = new ArrayList<>();
	}

	public void addProduct() {
		String title = JOptionPane.showInputDialog("Enter the title:");
		String id = JOptionPane.showInputDialog("Enter the id:");
		String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
		
		this.producten.add(new Product(title, type, id));
	}
	
	public void showProduct(){
		String id = JOptionPane.showInputDialog("Enter the id:");
		Product p = getProductWithId(Integer.parseInt(id));
		JOptionPane.showMessageDialog(null, p.getTitle());

	}

	public void showPrice(){
		String id = JOptionPane.showInputDialog("Enter the id:");
		int idx = Integer.parseInt(id);
		Product p = getProductWithId(idx);
		if(p != null){
			String daysString = JOptionPane.showInputDialog("Enter the number of days:");
			int days = Integer.parseInt(daysString);
			JOptionPane.showMessageDialog(null, p.getPrice(days));
		}
	}

	public Product getProductWithId(int id) {
		for (Product p : this.producten) {
			if (Integer.parseInt(p.getId()) == id) return p;
		}
		return null;
	}
}
