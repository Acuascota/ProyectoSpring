package es.pildoras.IoC;

public class directorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacionInforme (interfaz)
	
	private creacionInformes informeNuevo;
	
	//creacion de constructor que inyecta la dependencia
	public directorEmpleado(creacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director "+informeNuevo.getInforme();
	}
	
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
		
		//metodo init. Ejecutar tareas antes de que el bean este disponible
		public void metodoInicial(){
			System.out.println("Dentro del metodo init.Aqui irian las tareas ejecutar antes de que el bean este listo");
		}
		
		//metodo destroy. Ejecutar tareas despues de que el bean haya sid utilizado
		public void metodoFinal(){
			System.out.println("Dentro del metodo destroy.Aqui irian las tareas ejecutar despues de utilizar el bean");
		}

}
