package classes;

public class LlistaTerrenys {
	
	TipusTerreny[] llista;
	int num;
	
	LlistaTerrenys(TipusTerreny[] llista){
		this.llista=llista;
		this.num=0;
	}

	public TipusTerreny[] getLlista() {
		return llista;
	}

	public void setLlista(TipusTerreny[] llista) {
		this.llista = llista;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
