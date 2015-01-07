package com.mios.java8.lambda.recuperador;

import java.util.Arrays;
import java.util.List;

import com.mios.java8.lambda.recuperador.beans.TratarDatos;

public class LambdaApp2 {
	public static void main(String[] args) {
		TratarDatos tratarDatos = new TratarDatos();
		
		/*
		 * Invocamos varias sentencias, por eso usamos {}"
		 */
		List<String> lista = tratarDatos.obtenerDatos(datos -> {
			if (datos.isEmpty()){
				return datos;
			} else {
				return datos.subList(2, 4);
			}
		});
 
		System.out.println("Resultado: " + Arrays.toString( lista.toArray()) );
	}
	
}
