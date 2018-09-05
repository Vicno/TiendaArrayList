package com.Producto.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.Categoria;
import com.Categoria.entity.NoExisteCategoria;
import com.Producto.control.Productos;
import com.Producto.entity.Producto;
import com.Tienda.view.InputTypes;

public class ProductosIO {
	private Productos productos;
	private Categorias categorias;
	private Scanner scan;
	
	public ProductosIO (Categorias categorias, Productos productos, Scanner scan) {
		
		this.productos = productos;
		this.scan = scan;
		this.categorias=categorias;
	}
	
	public void add() throws NoExisteCategoria {
		Producto producto;
		
		producto = RegistroProductoView.ingresar(scan, productos);
		productos.ingresar(producto);
		
	}

	public void list() {
		
		for ( Iterator<Producto> i = productos.getProductos().iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}
	
	public void delate(){
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto a eliminar: ", scan);
		productos.eliminarProfe(codProducto);
	}
	
	public void mostrarCat() throws NoExisteCategoria, ArrayIndexOutOfBoundsException {
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto cuya categoria quisiera mostrar ", scan);
		System.out.println(productos.getProductos().get(productos.buscarProfe(codProducto)));
		System.out.println(categorias.getCategorias().get(categorias.buscarProfe(productos.getCodCategoria(codProducto))));
	}
	
	public void listProfe() throws NoExisteCategoria {
		int codCategoria = 0;
		int indiceCategoria = 0;
		
		for(int i = 0; i < productos.getCantidad();i++) {
			System.out.println(productos.getProductos().get(i));
			codCategoria = productos.getProductos().get(i).getCodCategoria();
			indiceCategoria = categorias.buscarProfe(codCategoria);
			System.out.println(categorias.getCategorias().get(indiceCategoria));
		}
	}
	
	
}
