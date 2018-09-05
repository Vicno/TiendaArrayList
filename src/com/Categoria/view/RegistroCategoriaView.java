package com.Categoria.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.Categoria;
import com.Tienda.view.InputTypes;;

public class RegistroCategoriaView {
public static Categoria ingresar(Scanner scan) {
		
		int codCategoria = InputTypes.readInt("Ingrese el codigo de la categoria.", scan);
		
		String nombreCategoria = InputTypes.readString("Ingrese el nombre de la Categoria.", scan);
		
		String descripcion = InputTypes.readString("Ingrese la descripcion de la Categoria.", scan);
		
		return new Categoria(codCategoria, nombreCategoria, descripcion);
		
	}

}
