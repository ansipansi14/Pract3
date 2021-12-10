package classes;

public class Plantacio {

	private String nom;
	private int any;
	private int nRodal;
	private TipusTerreny tipus;
	private double superficie; //hra (hectareas)
	
	/**
	 * CONSTRUCTOR:
	 * 
	 * @param nom
	 * @param any
	 * @param nRodal
	 * @param tipus
	 * @param superficie
	 */
	
	Plantacio(String nom, int any, int nRodal, TipusTerreny tipus, double superficie){
		this.nom=nom;
		this.any=any;
		this.nRodal=nRodal;
		this.tipus=tipus;
		this.superficie=superficie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public int getnRodal() {
		return nRodal;
	}

	public void setnRodal(int nRodal) {
		this.nRodal = nRodal;
	}

	public TipusTerreny getTipus() {
		return tipus;
	}

	public void setTipus(TipusTerreny tipus) {
		this.tipus = tipus;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
}
