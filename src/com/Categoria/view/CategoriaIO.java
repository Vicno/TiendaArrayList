package com.Categoria.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.Categoria;
import com.Categoria.entity.NoExisteCategoria;
import com.Producto.control.Productos;
import com.Producto.entity.Producto;
import com.Tienda.view.InputTypes;

public class CategoriaIO {

	private Categorias categorias;
	private Productos productos;
	private Scanner scan;
	private Producto[] producto;
	
	public CategoriaIO (Categorias categorias, Productos productos, Scanner scan /*, Producto[] producto*/) {
		
		this.producto = producto;
		this.scan = scan;
		this.categorias = categorias;
		this.productos = productos;
	}
	
	public void add() {
		Categoria categoria;
		
		categoria = RegistroCategoriaView.ingresar(scan);
		
		categorias.ingresar(categoria);
	}

	public void list() {
		for ( Iterator<Categoria> i = categorias.getCategorias().iterator(); i.hasNext();) {
			System.out.println(i.next());
			
			
			/*Producto objeto =  (Producto) productos.getProductos()[i];
			System.out.println("codigo del producto " + i + ": " +objeto.getCodProducto());
			System.out.println("nombre del producto " + i + ": " +objeto.getNombre());
			System.out.println("precio del producto " + i + ": " +objeto.getPrecio());
			System.out.println("descripcion del producto " + i + ": " +objeto.getDescripcion());
			System.out.println("codigo de la categoria del producto " + i + ": " +objeto.getCodCategoria());
			System.out.println();
			*/
		}
	}
	
	public void delate()throws NoExisteCategoria{
		int codCategoria = InputTypes.readInt("Ingrese el codigo de la categoria a eliminar: ", scan);
		 categorias.eliminarProfe(codCategoria);
		throw new NoExisteCategoria();
		
	}
	
	public void productList() throws NoExisteCategoria{
		int codCategoria = InputTypes.readInt("Ingrese el codigo de la categoria cuyos productos quisiera mostrar ", scan);
		System.out.println(categorias.getCategorias().iterator().hasNext());
		for (int i = 0; i < productos.getCantidad(); i++) {
			if(codCategoria == productos.getProductos().get(i).getCodCategoria()) {
				System.out.println(productos.getProductos().get(i));
			}
		}
	}
	

	
	
}
