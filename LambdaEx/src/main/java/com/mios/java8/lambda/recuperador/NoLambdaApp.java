package com.mios.java8.lambda.recuperador;

import java.util.Arrays;
import java.util.List;

import com.mios.java8.lambda.recuperador.beans.Recuperador;
import com.mios.java8.lambda.recuperador.beans.TratarDatos;

public class NoLambdaApp {
	public static void main(String[] args) {
		TratarDatos tratarDatos = new TratarDatos();
		
		/*
		 * Si posicionamos el cursor justo después de la apertura del paréntesis en la 
		 * llamada "... .obtenerDatos(" y pulsamos CTRL (ó cmd) + 1 nos mostrará un menú
		 * indicando la opción "Convert to lambda expression".
		 */
		List<String> lista = tratarDatos.obtenerDatos(new Recuperador() {
			
			public List<String> filtra(List<String> datos) {
				return datos.subList(2, 4);
			}
		});
		
		System.out.println("Resultado: " + Arrays.toString( lista.toArray()) );

	}
}
