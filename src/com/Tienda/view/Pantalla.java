package com.Tienda.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.NoExisteCategoria;
import com.Categoria.view.CategoriaIO;
import com.Producto.control.Productos;
import com.Producto.view.ProductosIO;

public class Pantalla {
	
	public static void main(String[] args) throws NoExisteCategoria {
		
		Productos  productos = new Productos();
		Categorias  categorias = new Categorias();
		Scanner scanner = new Scanner(System.in);
		ProductosIO productosIO = new ProductosIO (categorias, productos, scanner);
		CategoriaIO categoriasIO = new CategoriaIO (categorias, productos , scanner);
		
		/*com.Categoria.view.MenuCategoria.menu(scanner, categoriasIO); 
		com.Producto.view.MenuProducto.menu(scanner, productosIO);*/
		
		MenuGeneral.menu(scanner, productosIO, categoriasIO);
		scanner.close();
		//productosview.Menu();

	}

}
