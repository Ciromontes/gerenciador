package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {

	private static List<Empresa> ListaEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNombre("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNombre("Caelum");
		
		ListaEmpresas.add(empresa);
		ListaEmpresas.add(empresa2);
		
	}
	public void agregarEmpresa(Empresa empresa) {
		DB.ListaEmpresas.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return DB.ListaEmpresas;
		
	}

}
