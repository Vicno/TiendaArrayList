package com.Producto.control;

import java.util.ArrayList;
import java.util.Iterator;

import com.Categoria.control.Categorias;
import com.Categoria.entity.Categoria;
import com.Categoria.entity.NoExisteCategoria;
import com.Categoria.view.CategoriaIO;
import com.Producto.entity.Producto;

public class Productos {
	
	
	private ArrayList<Producto> productos;
	private int cantidad;
	private int ultimo;
	private ArrayList<Categoria> categorias;
	private CategoriaIO categoriasIO;
	
	public Productos () {
		productos = new ArrayList<Producto>();
		categorias = new ArrayList<Categoria>();
	}
	
	public void ingresar(Producto producto) throws java.lang.ArrayIndexOutOfBoundsException{
		productos.add(producto);
		}

	/*public void eliminar (int codProducto) {
		
		int posicion = buscar(codProducto);
		productos.remove(posicion);
		
	}*/
	
/*	private int buscar(int codProducto) {
		
		Producto producto = null;
		int posicion = 0;
		
		for (Iterator<Producto> iterator = productos.iterator(); iterator.hasNext();) {
			producto = iterator.next();
			if (codProducto == productos.) {
				return posicion;
			}
			else {
				posicion = -1;
			}
		}
		
		
		return posicion;
		
	}*/
	
	
	//hechos por el profe
	//****************************************************************************************************************************
	public int buscarProfe(int codProducto){
		Producto producto = null;
		int indice = -1;
		for(Iterator<Producto>iterator = productos.iterator(); iterator.hasNext();) {
			producto = iterator.next();
			if(codProducto == producto.getCodCategoria()) {
				indice = productos.indexOf(producto);
			}
			
		}
		if(indice == -1) {
			System.out.println("No existe el producto");
		}
		return indice;
		
	}
	
	public void eliminarProfe(int codProducto) {
		int indice = buscarProfe(codProducto);
		productos.remove(indice);
	}
//***********************************************************************************************************************************
	public int getCantidad() {
		return cantidad;
	}

	public int getCodCategoria(int codProducto) {
		
		int posicion = buscarProfe(codProducto);
		Producto producto = productos.get(posicion);
		int codCategoria = producto.getCodCategoria();
		return codCategoria;
	}
	
	public ArrayList<Producto> getProductos() {
		
		return productos;
	}
}
