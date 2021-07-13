package it.polito.tdp.anagram.model;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	
	public List<String> anagrammi(String parola) {
		
		List<String> risultato = new ArrayList<>() ;
		permuta("", parola, 0, risultato) ;
		return risultato ;
		
	}

	
	private void permuta(String parziale, String lettere, int livello, List<String> risultato) {
		if( lettere.length()==0 ) {
			risultato.add(parziale) ;
		} else {
			
			for(int i=0; i<lettere.length(); i++) {
				char tentativo = lettere.charAt(i) ; 
				String nuovaParziale = parziale + tentativo ;
				String nuovaLettere = lettere.substring(0, i)+lettere.substring(i+1) ;
				permuta(nuovaParziale, nuovaLettere, livello+1, risultato) ;	
			}
		}
	}
	
}
