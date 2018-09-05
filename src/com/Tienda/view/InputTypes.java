package com.Tienda.view;

import java.util.Scanner;

public class InputTypes {

	public static  int readInt(String msg, Scanner scan) {
		int valor = 0;	
		while(true) {
		try {
			System.out.println(msg);
			valor = scan.nextInt();
			break;
		}catch(java.util.InputMismatchException e){
			System.out.println("el valor debe ser numerico: ");
			
		}
		finally {
			scan.nextLine();
		}
		
		
		}
		return valor;
		
		}
	
	public static  String readString(String msg, Scanner scan) {
		String valor = null;	
		while(true) {
		try {
			System.out.println(msg);
			valor = scan.nextLine();
			break;
		}catch(java.util.InputMismatchException e){
			System.out.println("el valor debe ser String: ");
			scan.nextLine();
		}
		
		
		}
		return valor;
		
		}
	
	public static  double readDouble(String msg, Scanner scan) {
		double valor = 0;	
		while(true) {
		try {
			System.out.println(msg);
			valor = scan.nextDouble();
			scan.nextLine();
			break;
		}catch(java.util.InputMismatchException e){
			System.out.println("el valor debe ser Double: ");
			scan.nextLine();
		}
		
		}
		return valor;
		
		}
}


