package ar.com.unpaz.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsParalelos {
	
	static Empleado e1 = new Empleado("Pedro Pedraza","Marketing",500000);
	static Empleado e2 = new Empleado("Micaela Michael","Marketing",600000);
	static Empleado e3 = new Empleado("Cesar Andino","Sistemas",2500000);
	static Empleado e4 = new Empleado("Esteban Quito","Sistemas",2500000);
	static Empleado e5 = new Empleado("Rosa Rosada","Sistemas",2500000);
	static Empleado e6 = new Empleado("Quico Villagran","Contabilidad",500300);
	static Empleado e7 = new Empleado("Maria Roca","Ventas",1500000);
	static Empleado e8 = new Empleado("Nintendo Chalmers","Ventas",1200000);
	
	public static List<Empleado> listaDeEmpleados = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
	
	public static void empleados() {
		List<String>nombres =listaDeEmpleados.parallelStream()
								.map(x->x.getNombre())
								.collect(Collectors.toList());
		System.out.println("Lista de empleados");
		nombres.parallelStream().forEachOrdered(System.out::println);
											 
										 
	}
	
	public static void salarios(int salario) {
	 System.out.println("Listado de salarios mayores al ingresado");
	 listaDeEmpleados.parallelStream()
	 .filter(x->x.getSalario()>salario)
	 .map(x->x.getSalario())
	 .forEachOrdered(System.out::println);
									
	}
	
	public static void departamentos() {
		List<String> listaStream = listaDeEmpleados.parallelStream()
								   .map(x-> x.getDepartamento().toUpperCase())
								   .distinct()
								   .collect(Collectors.toList());
		System.out.println("Departamentos existentes");
		listaStream.parallelStream().forEachOrdered(System.out::println);
	}
	
	public static void totalSalarios() {
		int sumaSalarios = listaDeEmpleados.parallelStream()
						   .mapToInt(Empleado::getSalario)
						   .sum();
		System.out.println("La suma de todos los salarios es: "+sumaSalarios);
		
	}
	

}
