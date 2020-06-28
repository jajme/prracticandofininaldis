package ufv.dis.final2020.TEST_JPP_ORDINARIO;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public final void test1() {
		Inventario inventario = new Inventario();
		Producto p = new Producto("name", "categoria", "price","");
		inventario.addProducto(p);
		assertEquals(true, inventario.getlistaProductos().contains(p));
	}
	
	@Test
	public final void test0() {
		Producto p = new Producto("name", "categoria", "price","");
		assertEquals("price", p.getPrice());
	}
	
	@Test
	public final void test3() {
		Producto p = new Producto("name", "categoria", "price","3948481461576");
		try {
			GeneradorEAN13.generar(p);
		} catch (Exception e) {
			fail("error al generar documento");
		}
	}

}
