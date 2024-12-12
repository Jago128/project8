package clases;
import java.util.ArrayList;
import java.util.HashMap;

import utilidades.Utilidades;

public class ListaSocios {
	private HashMap <String,Socio> listSocios;

	public ListaSocios(HashMap<String, Socio> listSocios) {
		this.listSocios = listSocios;
	}

	public HashMap<String, Socio> getListSocios() {
		return listSocios;
	}

	public void setListSocios(HashMap<String, Socio> listSocios) {
		this.listSocios = listSocios;
	}

	@Override
	public String toString() {
		return "ListaSocios [listSocios=" + listSocios + "]";
	}

	public void fillData() {
		ArrayList <Publicacion> p=new ArrayList <Publicacion>();
		Publicacion l2=new Libro("l2","123", 2000, 40);
		Publicacion r2=new Revista("r2", "El mundo", 2020, 2);
		p.add(l2);
		p.add(r2);
		Socio s1=new Socio("1111111A", "Leire", "Trabado", 34, p);
		p.clear();
		Socio s2=new Socio("2222222A", "Antonio", "Rodeligo", 35, p);
		Socio s3=new Socio("3333333V", "Jon", "Gonzalez", 36, p);
		Socio s4=new Socio("5555555J", "Laura", "Gomez", 12, p);
		listSocios.put("1111111A", s1);
		listSocios.put("2222222A", s2);
		listSocios.put("3333333V", s3);
		listSocios.put("5555555J", s4);
	}

	public boolean esSocio(String dni) {
		for (Socio s:listSocios.values()) {
			if (s.getDni().equalsIgnoreCase(dni)) {
				return true;
			}
		}
		return false;
	}

	public void hacerSocio() {
		String dni, name, surN;
		int age;
		ArrayList <Publicacion> p=new ArrayList <Publicacion>();
		System.out.println("Introduce tu DNI:");
		dni=Utilidades.introducirCadena();
		System.out.println("Nombre:");
		name=Utilidades.introducirCadena();
		System.out.println("Apellido:");
		surN=Utilidades.introducirCadena();
		System.out.println("Edad:");
		age=Utilidades.leerInt();
		if (age<0) {
			do {
				System.err.println("Error. Edad incorrecta.");
				System.out.println("Introduce de nuevo tu edad (un numero positivo):");
				age=Utilidades.leerInt();
			} while (age<0);
		}
		Socio s=new Socio(dni,name,surN,age,p);
		this.listSocios.put(dni,s);
		System.out.println("Los datos del socio se han guardado.");
	}

	public int posicionSocio(String dni) {
		for (int i=0;i<listSocios.size();i++) {
			if (listSocios.containsKey(dni)) {
				return i;
			}
		}
		return -1;
	}
}
