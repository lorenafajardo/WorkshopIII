package playlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import designprogramming.Spaceships;

public class Main {

	static Calendar calendar = new GregorianCalendar();
	static Menu menu = new Menu();
	static List<Song> library = new ArrayList<Song>();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option=0;
		do  {
			menu.mostrar();
			option=sc.nextInt();
			
			switch (option){
				
			case 1: 
			}break;
			
		}while(option!=5);
		
		LocalDate hoy = LocalDate.parse("2020-07-06");
		
		Song song1 = new Song("La Herida", 1, hoy, 5, "Rock", "Album1", "Simpre la misma funcion el mismo espectador.");
		library.add(song1);
		hoy=LocalDate.parse("2021-08-01");
		Song song2 = new Song("Me Rehuso", 2, hoy, 3, "Regaeton","Album2", "Me rehuso a darte el ultimo beso");
		library.add(song2);
		
		hoy=LocalDate.parse("2021-10-02");
		Song song3 = new Song("Lady Blue", 3, hoy, 2,"Rock","Album3", "Sin control y si direccion la luz se fue a donde voy");
		library.add(song3);
		
		hoy=LocalDate.parse("2018-11-05")	;
		Song song4 = new Song("Una vez", 4, hoy, 2,"Regaeton","Album Ultimo Tour", "Con cara de niña buena pero bellaquita");
		library.add(song3);
		
		for (int i=0;i<library.size();i++) {  
		      System.out.println(library.get(i));
		    }
		
	}
	

}
