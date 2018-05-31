import java.util.Scanner;

 class Invoice {
	String partnumber,des;
	int quantity;
	Double price;
	
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		if(price<0)
		{
			price=0.0;
		}
		else	
		this.price = price;
	
	}
	public void getPrice(Double price) {
	 double total = price*quantity;
	}
	}
public class Invoice {
	public static void main(String args[]) {
		Invoice c=new Invoice();
		Scanner sc=new Scanner (System.in);
		c.setPartnumber(sc.next());
		c.setDes(sc.next());
		c.setPrice(sc.nextDouble());
		c.setQuantity(sc.next());
		System.out.println(c.getPartnumber);
		System.out.println(c.getDes);
		System.out.println(c.getPrice);
		System.out.println(c.getQuantity);
		
		
		
		
	}
}

