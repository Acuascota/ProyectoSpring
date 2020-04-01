package es.pildoras.IoC;

public class jefeEmpleado implements Empleados{
	//Constructor
	
	public jefeEmpleado(creacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	//Creacion de campo tipo creacionInforme (interfaz)
	
	private creacionInformes informeNuevo;

	public String getTareas() {
		return"Gestiono de las cuestiones relativas a mis empleados ";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe: "+informeNuevo.getInforme();
	}
}
