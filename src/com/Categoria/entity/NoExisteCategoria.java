package com.Categoria.entity;

public class NoExisteCategoria extends Exception{
	private static final long serialVersionUID = 1L;

	public NoExisteCategoria() {
		super("La categoria no existe.");
	}
}
