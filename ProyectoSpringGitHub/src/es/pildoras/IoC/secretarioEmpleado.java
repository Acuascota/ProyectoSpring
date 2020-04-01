package es.pildoras.IoC;

public class secretarioEmpleado implements Empleados {
	
	//Sett para inyeccion de dependencias
	public void setInformeNuevo(creacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la ajenda de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generedo por el Secretario: "+informeNuevo.getInforme();
	}
	
	//Creacion de campo tipo creacionInforme (interfaz)	
	private creacionInformes informeNuevo;
		
	//Variables para inyeccion de campos
	private String email;
	private String nombreEmpresa;
	
	//Getters y Setters 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
}