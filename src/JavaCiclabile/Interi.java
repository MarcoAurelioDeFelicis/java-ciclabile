package JavaCiclabile;

public class Interi {
		
	private int []elementi;
	private int indiceCorrente;
	private int numeroElementi;
	
    public int getNumeroElementi() {
	    return numeroElementi;
    }
    // COSTRUTTORE ARRAY
    public Interi (int[] elementiIniziali ) {
    	
	    this.elementi = elementiIniziali;
	    this.numeroElementi = elementi.length;
	    this.indiceCorrente = 0;
    }
    
    //COSTRUTTORE ARRAY VUOTO
    public Interi () {
    	this.elementi = new int [10];
    	this.numeroElementi = 0;
    	this.indiceCorrente = 0;
    }
    
    //METODO PER AGGIUNGERE NUOVO ELEMENTO ALL'ELENCO
    public void addElement (int nuovoElemento) {
    	
    	if (numeroElementi == elementi.length) {
    		
    		int[] nuovoArray = new int [elementi.length + 2];
    		for (int i = 0; i < elementi.length; i++) {
    			nuovoArray[i] = elementi[i];
    			
    		}
    		elementi = nuovoArray;
    	}
    	elementi [numeroElementi] = nuovoElemento;
    	numeroElementi++;
    	
    }
    
    //RESTITUISCE ELEMENTO CORRENTE PER INCREMENTARLO
    public int getElementoSuccessivo() {
    	int elemento = elementi[indiceCorrente];
    	indiceCorrente++;
    	return elemento;
    }
    
    //RETURN TRUE SE CI SONO ANCORA ELEMENTI 
    public boolean hasAncoraElementi() {
    	return indiceCorrente < numeroElementi;
    }
    public void stampa () {
    	if (hasAncoraElementi()) {
    		System.out.println(getElementoSuccessivo());
    		stampa();
    	}
    }
}