package hashMap_ExceptionStuff;

import clases.Cuenta;
import clases.NegativeSalaryException;
import utilidades.Utilidades;

import java.util.HashMap;

public class ExceptionProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Cuenta> c=new HashMap <String, Cuenta>();
		int menu=menu();

		switch (menu) {
		case 1:
			add(c);
			break;

		case 2:
			show(c);
			break;

		case 3:
			insert(c);
			break;

		case 4:
			try {
				retire(c);
			} catch (NegativeSalaryException e) {
				e.printStackTrace();
			}
			break;

		case 5:

			break;

		case 6:
			System.out.println("Adios!");
		}
	}

	public static int menu() {
		System.out.println("1. Introducir nueva cuenta");
		System.out.println("2. Mostrar cuentas");
		System.out.println("3. Insertar dinero");
		System.out.println("4. Retirar dinero");
		System.out.println("5. Obtener DNI de las cuentas por nombre de cuenta");
		System.out.println("6. Salir");
		return Utilidades.leerInt("Elija una opcion:", 1, 6);
	}

	public static int searchDNI(String dni, HashMap <String, Cuenta> c) {
		for (int i=0;i<c.size();i++) {
			if (c.containsKey(dni)) {
				return i;
			}
		}
		return -1;
	}

	public static void negativeSalary(double salario) {

	}

	public static void add(HashMap <String, Cuenta> c) {
		String dni;
		String name;
		double salary=0;

		do {
			System.out.println("Introduce el DNI:");
			dni=Utilidades.introducirCadena();

			if (searchDNI(dni,c)!=-1) {
				System.out.println("Ya existe una cuenta con ese DNI.");
			}
		} while (searchDNI(dni,c)!=-1);
		System.out.println("Introduce el nombre de la cuenta:");
		name=Utilidades.introducirCadena();
		c.put(dni, new Cuenta(dni,name,salary));
		System.out.println("Cuenta añadida.");
	}

	public static void show(HashMap <String, Cuenta> c) {
		for (Cuenta a:c.values()) {
			System.out.println(a.toString());
		}
	}

	public static void insert(HashMap <String, Cuenta> c) {
		String dni;
		double add;
		System.out.println("Introduce el DNI:");
		dni=Utilidades.introducirCadena();

		if (searchDNI(dni,c)!=-1) {
			System.out.println("¿Cuanto dinero quieres añadir?");
			add=Utilidades.leerDouble();
			c.get(dni).setSalary(add+c.get(dni).getSalary());
			System.out.println("El dinero ha sido añadido correctamente.");
		} else {
			System.out.println("No hay cuenta con el DNI introducido.");
		}
	}

	public static void retire(HashMap <String, Cuenta> c) throws NegativeSalaryException {
		String dni;
		double remove;
		System.out.println("Introduce el DNI:");
		dni=Utilidades.introducirCadena();
		if (searchDNI(dni,c)!=-1) {
			System.out.println("¿Cuanto dinero quieres quitar?");
			remove=Utilidades.leerDouble();
			if (c.get(dni).getSalary()-remove<0) {
				throw new NegativeSalaryException(remove);
			} else {
				c.get(dni).setSalary(c.get(dni).getSalary()-remove);
				System.out.println("El dinero ha sido añadido correctamente.");
			}
		} else {
			System.out.println("No hay cuenta con el DNI introducido.");
		}
	}
	
	public static void showDNIFromName(HashMap <String, Cuenta> c) {
		String name;
		boolean found=false;
		System.out.println("Introduce un nombre.");
		name=Utilidades.introducirCadena();
		
		for (Cuenta e:c.values()) {
			if (e.getName().equalsIgnoreCase(name)) {
				System.out.println("DNI de una cuenta de "+name+": "+e.getDni());
				found=true;
			}
		}
		
		if (!found) {
			System.out.println("No hay cuentas con ese nombre.");
		}
	}
}
