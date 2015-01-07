package com.mios.java8.lambda.recuperador;

import java.util.Arrays;
import java.util.List;

import com.mios.java8.lambda.recuperador.beans.TratarDatos;

/**
 * La sintaxis básica de las expresiones lambda, es la siguiente:
 * 
 * (params) -> expression
 * 
 * (params) -> { sentences; }
 * 
 * 
 * @author jmroldanv
 *
 */
public class LambdaApp {
	public static void main(String[] args) {
		TratarDatos tratarDatos = new TratarDatos();
		
		/*
		 * Como se puede ver, se indica que se recibe un objeto “datos” y que lo que se devuelve es
		   “datos.subList(2, 4)”, “datos” es solo un marcador, podríamos poner igualmente d -> d.subList(2, 4).
		   
		   Si después de "->" hubiera más de una sentencia las encerrariamos entre llaves. Ver el ejemplo
		   LambdaApp2.java.
		 */
		List<String> lista = tratarDatos.obtenerDatos(datos -> datos.subList(2, 4));
		
		System.out.println("Resultado: " + Arrays.toString( lista.toArray()) );

	}
}
