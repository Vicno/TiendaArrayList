package com.Tienda.view;

import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.NoExisteCategoria;
import com.Categoria.view.CategoriaIO;
import com.Categoria.view.MenuCategoria;
import com.Producto.control.Productos;
import com.Producto.view.MenuProducto;
import com.Producto.view.ProductosIO;

public class MenuGeneral {
	
	
	private static int encabezado(Scanner scanner) {
		int opcion;
		
		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("--------------------");
			System.out.println("1. Ingresar al menu de categorias");
			System.out.println("2. Ingresar al menu de productos");
			System.out.println("0. Salir");
			System.out.println();
			
			opcion = InputTypes.readInt("Su opcion?", scanner);
			
			if(opcion >= 0 && opcion <= 2) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, ProductosIO productos, CategoriaIO categorias)  {
		boolean salir = false;
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				MenuCategoria.menu(scanner, categorias);
			break;
			
			case 2:
					MenuProducto.menu(scanner, productos);
				
				break;
			
			
			}
		}
	}
}
