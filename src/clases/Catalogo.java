package clases;
import java.util.ArrayList;

public class Catalogo {
	private ArrayList <Publicacion> list;

	public Catalogo(ArrayList<Publicacion> list) {
		this.list = list;
	}

	public ArrayList<Publicacion> getList() {
		return list;
	}

	public void setList(ArrayList<Publicacion> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Catalogo [list=" +list+ "]";
	}

	public void fillData() {
		list.add(new Libro("l1","Pajaros a Golpe", 1997, 30));
		list.add(new Libro("l2","123", 2000, 40));
		list.add(new Libro("l3","Nada", 1897, 50));
		list.add(new Libro("l4","Caperucita Roja", 1997, 40));
		list.add(new Revista("r1", "El mundo", 2020, 1));
		list.add(new Revista("r2", "El mundo", 2020, 2));
		list.add(new Revista("r3", "Historia", 2020, 1));
		list.add(new Revista("r4", "Animales", 2020, 1));
	}

	public int posicionPublicacion (String code) {
		for (int i=0;i<this.list.size();i++) {
			if (this.list.get(i).getCode().equalsIgnoreCase(code)) {
				return i;
			}
		}
		return -1;
	}
}
