package playlist;

public class Menu {

	public void mostrar() {
		System.out.println("-------------WELCOME---------------");
		System.out.println("1.Mostrar biblioteca");
		System.out.println("2.Crear Playlist");
		System.out.println("3.Filtrar canciones");
		System.out.println("4.Ordenar canciones");
		System.out.println("5.EXIT");
	}

	public void filterShow() {
		System.out.println(" Como quiere filtrar las canciones:");
		System.out.println("1. Filtrar canciones del mismo genero");
		System.out.println("2. Filtrar canciones en el mismo año");
	}

	public void orderShow() {
		System.out.println(" Como quiere ordenar las canciones:");
		System.out.println("1. Ordenar caciones por fecha");
		System.out.println("2. Ordenar canciones por duración");
	}
}



