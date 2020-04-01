package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//creacion de objetos de tipo empleado
		Empleados Empleado1= new directorEmpleado();
		//uso de los objetos
		System.out.println(Empleado1.getTareas());*/
		
		//Carga de xml de configuracion
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		directorEmpleado Juan=contexto.getBean("miEmpleado",directorEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		/*secretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",secretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println("Email= "+Maria.getEmail());
		System.out.println("Nombre Empresa= "+Maria.getNombreEmpresa());*/
		
		contexto.close();
	}

}
