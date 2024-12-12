package hashMap_Stuff;
import java.util.HashMap;
import java.util.Map;

import clases.*;
import utilidades.Utilidades;

public class HashMapProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,PublicacionP1> p=new HashMap <String, PublicacionP1>();
		int menu=menu();

		switch (menu) {
		case 1:
			add(p);
			break;

		case 2:

			break;

		case 3:

			break;

		case 4:
			break;

		case 5:
			System.out.println("Adios!");
			break;
		}
	}

	public static int menu() {
		System.out.println("1. Introducir nueva publicacion");
		System.out.println("2. Mostrar publicaciones");
		System.out.println("3. Modificacion dado su id");
		System.out.println("4. Eliminar publicacion dado su id");
		System.out.println("5. Salir");
		return Utilidades.leerInt("Introduce una opcion:", 1, 5);
	}

	public static void add(HashMap <String,PublicacionP1> p) {
		String id, name;
		int menu;
		Tipo type=Tipo.INFANTIL;
		do {
			System.out.println("Introduce el ID:");
			id=Utilidades.introducirCadena();
			if (p.containsKey(id)) {
				System.err.println("Ya hay una publicacion con ese ID.");
			}
 		} while (p.containsKey(id));
		System.out.println("Introduce el nombre:");
		name=Utilidades.introducirCadena();
		
		System.out.println("Elija el tipo:");
		System.out.println("1. Infantil");
		System.out.println("2. Adulto");
		System.out.println("3. Senior");
		menu=Utilidades.leerInt(1,3);
		switch (menu) {
		
		case 1:
			type=Tipo.INFANTIL;
			break;
			
		case 2:
			type=Tipo.ADULTO;
			break;
			
		case 3:
			type=Tipo.SENIOR;
			break;
		}
		PublicacionP1 pI=new PublicacionP1(id, name, type);
		p.put(id, pI);
	}
	
	public static void show(HashMap <String, PublicacionP1> p) {
		
		for (Map.Entry<String, PublicacionP1> entry:p.entrySet()) {
			String key = entry.getKey();
			PublicacionP1 val = entry.getValue();
			
		}
	}
}
