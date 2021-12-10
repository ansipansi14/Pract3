package classes;

public class TipusTerreny {

	String nomTerreny;
	Planta[] nomPlanta;
	int nPlantades; 				//per hora
	
	TipusTerreny(String nomTerreny, Planta[] nomPlanta, int nPlantades){
		this.nomTerreny=nomTerreny;
		this.nPlantades=nPlantades;
		this.nomPlanta=nomPlanta;
		
	}

	public String getNomTerreny() {
		return nomTerreny;
	}

	public void setNomTerreny(String nomTerreny) {
		this.nomTerreny = nomTerreny;
	}

	public Planta[] getNomPlanta() {
		return nomPlanta;
	}

	public void setNomPlanta(Planta[] nomPlanta) {
		this.nomPlanta = nomPlanta;
	}

	public int getnPlantades() {
		return nPlantades;
	}

	public void setnPlantades(int nPlantades) {
		this.nPlantades = nPlantades;
	}
	
	
}
