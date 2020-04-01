package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext3.xml");

		//Obtencion del Bean
		Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		
		//Impriminos y vemoas como actuan los metodos inti y destroy
		System.out.println(Juan.getInforme());
		
		//Cerrar el contexto
		contexto.close();
	
	}

}
