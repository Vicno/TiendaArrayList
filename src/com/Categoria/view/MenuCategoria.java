package com.Categoria.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.Categoria.entity.Categoria;
import com.Categoria.entity.NoExisteCategoria;
import com.Tienda.view.InputTypes;

public class MenuCategoria {
	
	public ArrayList<Categoria> categoria = new ArrayList();
	public static int encabezado(Scanner scanner) {
		int opcion;
		
		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("--------------------");
			System.out.println("1. Ingresar una categoria");
			System.out.println("2. Listar categorias");
			System.out.println("3. Eliminar categoria");
			System.out.println("4. Productos por categoria");
			System.out.println("0. Salir");
			System.out.println();
			
			opcion = InputTypes.readInt("Su opcion?", scanner);
			
			if(opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}
	
	public static void menu(Scanner scanner, CategoriaIO categoriasView) {
		boolean salir = false;
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				categoriasView.add();
				break;
			case 2:
				categoriasView.list();
				break;
			case 3:
				
				try {
					categoriasView.delate();
				} catch (NoExisteCategoria e) {
					// TODO Auto-generated catch block
					System.out.println("La categoria no existe");
				}
				
				break;
				
			case 4:
				try {
					categoriasView.productList();
				} catch (NoExisteCategoria e) {
					System.out.println("La categoria no existe");
				}
				
				break;
			}
		}
	}

}
