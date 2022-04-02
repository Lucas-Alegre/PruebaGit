package PrueboGit;

public class Facultad {

	private Persona persona;
	private String ciudad;
	
	public Facultad(Persona persona, String ciudad){
		this.persona=persona;
		this.ciudad=ciudad;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Facultad [ciudad=" + ciudad + "]";
	}
	
}
