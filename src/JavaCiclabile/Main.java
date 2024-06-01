package JavaCiclabile;

public class Main {

	public static void main(String[] args) {
		//INIZZIALIZZAZIONE CON UN ARRAY DI INTERI
		int[] numeri = {1, 2, 3, 4, 5};
		Interi interi = new Interi(numeri);
		
		//USO DEI METODI GETELEMENTOSUCCESSIVO E HASANCORAEKEMENTI
		interi.stampa();
		
		// CREAZIONE DI UN'ISTANZA SENZA PARAMETRI E AGGIUNTA DI ELEMENTI
		Interi elenco = new Interi();
		elenco.addElement(10);
		elenco.addElement(15);
		elenco.addElement(20);
		
		// RIPORTARE LA POSIZIONE A 0 PER CICLARLI ANCORA
		elenco.getNumeroElementi();
		
		// STAMPA TUTTI GLI ELEMENTI NUOVAMENTE
		elenco.stampa();
		
	}

}
