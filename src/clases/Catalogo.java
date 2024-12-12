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
		Publicacion l1=new Libro("l1","Pajaros a Golpe", 1997, 30);
		Publicacion l2=new Libro("l2","123", 2000, 40);
		Publicacion l3=new Libro("l3","Nada", 1897, 50);
		Publicacion l4=new Libro("l4","Caperucita Roja", 1997, 40);
		Publicacion r1=new Revista("r1", "El mundo", 2020, 1);
		Publicacion r2=new Revista("r2", "El mundo", 2020, 2);
		Publicacion r3=new Revista("r3", "Historia", 2020, 1);
		Publicacion r4=new Revista("r4", "Animales", 2020, 1);
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
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
