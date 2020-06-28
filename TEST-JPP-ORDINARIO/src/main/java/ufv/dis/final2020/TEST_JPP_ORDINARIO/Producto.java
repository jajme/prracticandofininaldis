package ufv.dis.final2020.TEST_JPP_ORDINARIO;

public class Producto {
	private String name;
	private String categoy;
	private String price;
	private String EAN13;

	
	public Producto(String name, String categoy, String price, String eAN13) {
		super();
		this.name = name;
		this.categoy = categoy;
		this.price = price;
		EAN13 = eAN13;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategoy() {
		return categoy;
	}
	public void setCategoy(String categoy) {
		this.categoy = categoy;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEAN13() {
		return EAN13;
	}
	public void setEAN13(String eAN13) {
		EAN13 = eAN13;
	}
}
