package com.Categoria.control;

import java.util.ArrayList;
import java.util.Iterator;

import com.Categoria.entity.Categoria;
import com.Categoria.entity.NoExisteCategoria;
import com.Producto.control.Productos;
import com.Producto.entity.Producto;
import com.Producto.view.ProductosIO;

public class Categorias {
		
		
		private ArrayList<Categoria> categorias;

		
		public Categorias() {
			categorias = new ArrayList<Categoria>();
		}
		public void ingresar(Categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException{
			
			categorias.add(categoria);
		}

		/*public void eliminar (int codCategoria) {
			
			int posicion = buscar(codCategoria);
			
			if (posicion != ultimo) {
				for (int i = posicion; i < categorias.size()-1; i++) {
					categorias.set(posicion, categorias.get(posicion+1));
				}
				ultimo--;
			}
			
		}
		
		public int buscar(int codCategoria) {
			
			int posicion = 0;
			
			for (posicion = 0; posicion < ultimo; posicion++) {
				if (codCategoria == categorias.get(posicion).getCodCategoria()) {
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
		public int buscarProfe(int codCategoria) throws NoExisteCategoria {
			Categoria categoria = null;
			int indice = -1;
			for(Iterator<Categoria>iterator = categorias.iterator(); iterator.hasNext();) {
				categoria = iterator.next();
				if(codCategoria == categoria.getCodCategoria()) {
					indice = categorias.indexOf(categoria);
				}
				
			}
			if(indice == -1) {
				throw new NoExisteCategoria();
			}
			return indice;
			
		}
		
		public void eliminarProfe(int codProducto) throws NoExisteCategoria {
			int indice = buscarProfe(codProducto);
				categorias.remove(indice);
		}
	//**********************************************************************************************************************************

		public ArrayList<Categoria> getCategorias() {
			return categorias;
		}
		
}
