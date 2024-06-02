package ar.com.unpaz.model;

public class Empleado {
	
	String nombre;
	String departamento;
	int salario;
	
	
	
	
	
	public Empleado(String nombre, String departamento, int salario) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	

}
