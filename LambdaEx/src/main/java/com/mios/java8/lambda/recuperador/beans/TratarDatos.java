package com.mios.java8.lambda.recuperador.beans;

import java.util.ArrayList;
import java.util.List;

public class TratarDatos {

	List<String> lista = new ArrayList<String>();

	public TratarDatos() {
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
	}

	public List<String> obtenerDatos(Recuperador recuperador){
		return recuperador.filtra(lista);
	}

}
