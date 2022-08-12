package classmodels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {
	
	private String nome;
	private String cognome;
	private int eta;
	private String codiceId;
//	private Tessera tessera;
//	

	public Utente() {
}

	public Utente(String nome, String cognome, int eta, String codiceId) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.codiceId = codiceId;
		
	}
	
	public Utente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		
		
	}
	
	


//	@OneToOne
//	public Tessera getTessera() {
//		return tessera;
//	}
//
//	public void setTessera(Tessera tessera) {
//		this.tessera = tessera;
//	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getCodiceId() {
		return codiceId;
	}


	public void setCodiceId(String codiceId) {
		this.codiceId = codiceId;
	}
	
	@Override
	public String toString() {
		return "Utente [getNome()=" + getNome() + ", getCognome()=" + getCognome() + ", getEta()=" + getEta()
				+ ", getCodiceId()=" + getCodiceId() + "]";
	}
	

}
