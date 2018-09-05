package com.Producto.view;

import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.Categoria;
import com.Categoria.entity.NoExisteCategoria;
import com.Producto.control.Productos;
import com.Producto.entity.Producto;
import com.Tienda.view.InputTypes;


public class RegistroProductoView {
	
	public static Producto ingresar(Scanner scan, Productos productos) throws NoExisteCategoria{
		int valor = -1;
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto.", scan);
		
		String nombreProducto = InputTypes.readString("Ingrese el nombre del producto.", scan);
		
		double precio = InputTypes.readDouble("Ingrese el precio del producto.", scan);
		
		String descripcion = InputTypes.readString("Ingrese la descripcion del producto.", scan);
		
		int codCategoria = InputTypes.readInt("Ingrese el codigo de la categoria.", scan);
		productos.buscarProfe(codCategoria);
		
		
		return new Producto(codProducto, nombreProducto, precio, descripcion, codCategoria);
		
	}
	
	
}

