package com.sanvalero.tiendaOnline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.tiendaOnline.model.Carrito;
import com.sanvalero.tiendaOnline.model.Producto;

public class carritoTest {
	
	private static Carrito carrito;
	
	@BeforeAll
	public static void setupAll() {
		carrito = new Carrito(null, null, null, 0, 0);
	}
	
	@Test
	public void anadirProducto() {
		Producto producto = new Producto("colacao","cacao", 10, null, null, 5, 7);
		carrito.anadirProducto(producto,3);
		
		assertEquals(1, carrito.getDetalles().size());
		assertEquals(7, producto.getStock());
	}
}
