package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Carga de xml de configuracion
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext2.xml");

		//Peticion de beans al contenedor Spring
		secretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",secretarioEmpleado.class);		
		secretarioEmpleado Pedro=contexto.getBean("miSecretarioEmpleado",secretarioEmpleado.class);
		secretarioEmpleado Manu=contexto.getBean("miSecretarioEmpleado",secretarioEmpleado.class);
		secretarioEmpleado Juan=contexto.getBean("miSecretarioEmpleado",secretarioEmpleado.class);
		secretarioEmpleado Ana=contexto.getBean("miSecretarioEmpleado",secretarioEmpleado.class);
		
		//Imprmimos los beans
		System.out.println(Maria);
		System.out.println(Pedro);
		System.out.println(Manu);
		System.out.println(Juan);
		System.out.println(Ana);
		
		//Impresion con codicion
		if(Maria==Pedro)System.out.println("Apuntan al mismo obejto");
		else System.out.println("No se trata del mismo objeto");
	}

}
