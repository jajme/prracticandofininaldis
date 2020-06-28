package ufv.dis.final2020.TEST_JPP_ORDINARIO;

import java.util.ArrayList;

public class Inventario {
	
	private  ArrayList<Producto> listaProductos;
	
	

	public Inventario() {
		this.listaProductos = new ArrayList<Producto>();
	}

	public  ArrayList<Producto> getlistaProductos() {
		return listaProductos;
	}

	public  void setlistaProductos(ArrayList<Producto> listaPersonas) {
		this.listaProductos = listaPersonas;
	}
	
	public  void addProducto(Producto p) {
		this.listaProductos.add(p);
	}
	

}
