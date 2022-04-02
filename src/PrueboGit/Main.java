package PrueboGit;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	System.out.println("Pruebo");
	
	
	
	Persona persona1 = new Persona("Alegre","Lucas",21);
	Persona persona2 = new Persona("Vega","Ayelen",18);
	Persona persona3 = new Persona("Olivieri","Emilio",25);
	Persona persona4 = new Persona("Romero","Ludmila",20);
	
	Facultad facu1 = new Facultad(persona1,"Concordia");
	Facultad facu2 = new Facultad(persona1,"Concordia");
	Facultad facu3 = new Facultad(persona1,"Concordia");
	Facultad facu4 = new Facultad(persona1,"Concordia");
	
	ArrayList<Facultad> arrayFacu = new ArrayList<Facultad>();

	}

}
