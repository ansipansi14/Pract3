package classes;

public class LlistaPlantacions {

	Plantacio[] llista;
	int num;
	
	LlistaPlantacions(Plantacio[] llista){
		this.llista=llista;
		this.num=0;
	}

	public Plantacio[] getLlista() {
		return llista;
	}

	public void setLlista(Plantacio[] llista) {
		this.llista = llista;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
