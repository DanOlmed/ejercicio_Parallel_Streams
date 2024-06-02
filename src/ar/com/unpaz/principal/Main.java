package ar.com.unpaz.principal;

import java.util.Scanner;

import ar.com.unpaz.model.StreamsParalelos;

public class Main {

	public static void main(String[] args) {
		
		menu();
		
		

	}
	
	
	public static void menu() {
		int opcion =0;
		do {
		System.out.println("***MENU PRINCIPAL***\n");
		System.out.println("1.Listado de Empleados\n");
		System.out.println("2.Listado de Salarios\n");
		System.out.println("3.Listado de Departamentos\n");
		System.out.println("4.Total de Salarios\n");
		System.out.println("5.SALIR\n");
		System.out.println("Seleccionar opcion: ");
		
		
		Scanner ingreso = new Scanner(System.in);
		opcion = ingreso.nextInt();
		
			switch(opcion) {
				case 1:{ StreamsParalelos.empleados();;
					break;}
				case 2:{ 
					System.out.println("Ingrese salario base: ");
					Scanner in = new Scanner(System.in);
					int option = in.nextInt();
					StreamsParalelos.salarios(option);
				
					break;}
				case 3: {
					StreamsParalelos.departamentos();
					break;}
				case 4:{ StreamsParalelos.totalSalarios();
					break;}
				
				case 5: {
					ingreso.close();
					
				}
				default:{
					break;}
			}
			
		}while(opcion!=5);
		System.out.println("***FIN DEL PROGRAMA***");
		
	}
	
	

}

