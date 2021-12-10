package aplicacio;
import java.io.*;
import classes.*;

public class App {
	
	///////////Carregar Dades de Fitxer Plantacions//////////////
	
	public void carregarDadesPlantacions() {
		try {
			BufferedReader f= new BufferedReader(new FileReader("fPlantacions.txt"));
			String frase;
			
			frase=f.readLine();
			while(frase!=null) {
				System.out.println(""+frase);
				frase=f.readLine();
			}
			f.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("ERROR: L'arxiu no existeix");
		}
		catch(IOException e) {
			System.out.println("ERROR: Lectura arxiu incorrecte");
		}
	}
	
	////////////Carregar Dades de Fitxer Plantes/////////////
	
	public void carregarDadesPlantes() {
		try {
			BufferedReader f= new BufferedReader(new FileReader("fPlantes.txt"));
			String frase;
			
			frase=f.readLine();
			while(frase!=null) {
				System.out.println(""+frase);
				frase=f.readLine();
			}
			f.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("ERROR: L'arxiu no existeix");
		}
		catch(IOException e) {
			System.out.println("ERROR: Lectura arxiu incorrecte");
		}
	}
	
	///////////Carregar Dades de Fitxer Terrenys//////////////
	public void carregarDadesTerrenys() {
		try {
			ObjectInputStream fin= new ObjectInputStream(new FileInputStream("fTerrenys.dat"));
			LlistaTerrenys llista=null;			//s'ha de canviar
			
			for(int i=0;i<=llista.getLlista().length;i++) {
				llista.getLlista()[i]=(TipusTerreny) fin.readObject();
				System.out.println(""+llista.getLlista()[i]);
			}
			fin.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("ERROR: No coincideix amb la classe que busques"+e);
		}
		catch(IOException e) {
			System.out.println("ERROR: Lectura arxiu incorrecte");
		}
			
	}
	
	///////////Guardar Dades de Fitxer Plantacions//////////////
	
	public void guardarDadesPlantacions() {
		try {
			BufferedWriter f= new BufferedWriter(new FileWriter("fPlantacions.txt"),0);			//El zero es per afegir al fitxer
			String frase=null;			//Canviar format al que toca
		
			
			while(frase!=null) {
				f.write(frase);
				System.out.println(""+frase);
			}
			f.close();
		}
		catch(IOException e) {
			System.out.println("ERROR: Escritura arxiu incorrecte");
		}
	}

	////////////Carregar Dades de Fitxer Plantes/////////////

	public void guardarDadesPlantes() {
		try {
			BufferedWriter f= new BufferedWriter(new FileWriter("fPlantes.txt"),0);			//El zero es per afegir al fitxer
			String frase=null;			//Canviar format al que toca
		
			
			while(frase!=null) {
				f.write(frase);
				System.out.println(""+frase);
			}
			f.close();
		}
		catch(IOException e) {
			System.out.println("ERROR: Escritura arxiu incorrecte");
		}
	}
	
	
	///////////Carregar Dades de Fitxer Terrenys//////////////
	
	public void guardarDadesTerrenys() {
		try {
			ObjectOutputStream fout= new ObjectOutputStream(new FileOutputStream("fTerrenys.dat"));
			LlistaTerrenys llista=null;			//s'ha de canviar
			
			for(int i=0;i<=llista.getLlista().length;i++) {
				fout.writeObject(llista.getLlista()[i]);
				System.out.println(""+llista.getLlista()[i]);
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("ERROR: Escritura arxiu incorrecte");
		}
	}
	
	
	//////MAIN/////
	
	public static void main(String[] args) {
		
		

	}

}
