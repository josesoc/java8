package com.mios.java8.lambda.recuperador;

import java.util.Arrays;
import java.util.List;

import com.mios.java8.lambda.recuperador.beans.TratarDatos;

public class LambdaApp3 {
	public static void main(String[] args) {
		TratarDatos tratarDatos = new TratarDatos();
		
		/*
		 * También podemos llamar a métodos privados
		 */
		List<String> lista = tratarDatos.obtenerDatos(datos -> new LambdaApp3().filtro(datos));
		System.out.println("Resultado: " + Arrays.toString( lista.toArray()) );
	}

	private List<String> filtro(List<String> datos){
		if (datos.isEmpty()){
			return datos;
		} else {
			return datos.subList(2, 4);
		}
	}
}
