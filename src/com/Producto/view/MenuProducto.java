package com.Producto.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.Categoria.entity.NoExisteCategoria;
import com.Producto.entity.Producto;
import com.Tienda.view.InputTypes;

public class MenuProducto {

	public ArrayList<Producto> producto = new ArrayList ();
	public static int encabezado(Scanner scanner) {
		int opcion;
		
		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("--------------------");
			System.out.println("1. Ingresar un producto");
			System.out.println("2. Listar productos");
			System.out.println("3. Eliminar producto");
			System.out.println("4. Mostrar la categoria de un producto");
			System.out.println("0. Salir");
			System.out.println();
			
			opcion = InputTypes.readInt("Su opcion?", scanner);
			
			if(opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}
	
	public static void menu(Scanner scanner, ProductosIO productosView)  {
		boolean salir = false;
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					productosView.add();
				} catch (NoExisteCategoria e) {
					System.out.println("La Categoria no existe");
				}
				break;
			case 2:
				productosView.list();
				break;
			case 3:
				productosView.delate();
				break;
			case 4:
				try {
					productosView.mostrarCat();
				} catch (NoExisteCategoria e) {
					System.out.println("La Categoria no existe");
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("El Producto no existe");
				}
				break;
			/*case 4:
				try {
					productosView.listProfe();
				} catch (NoExisteCategoria e) {
					System.out.println("No existe la categoria ");
				}
				break;*/
			}
		}
	}
}
