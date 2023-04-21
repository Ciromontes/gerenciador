package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {

	private static List<Empresa> ListaEmpresas = new ArrayList<>();
	private static Integer llaveSecuencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(DB.llaveSecuencial++);
		empresa.setNombre("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(DB.llaveSecuencial++);
		empresa2.setNombre("Caelum");
		
		ListaEmpresas.add(empresa);
		ListaEmpresas.add(empresa2);
		
	}
	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(DB.llaveSecuencial++);
		DB.ListaEmpresas.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return DB.ListaEmpresas;
		
	}

	public void eliminarEmpresa(Integer id) {
		
		Iterator<Empresa> it =ListaEmpresas.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		for(Empresa empresa: ListaEmpresas) {
			if(empresa.getId() == id) {
				ListaEmpresas.remove(empresa);
			}
		}
		
	}

	public Empresa buscarEmpresaPorId(Integer id) {
		for (Empresa empresa : ListaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
			
		}
		
		return null;
	}

}
