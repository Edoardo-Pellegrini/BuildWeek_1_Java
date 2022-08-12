package classmodels;


import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tessera")
public class Tessera   {

	private boolean valido;
	private LocalDate tempoValidita;
	private LocalDate dataCreazione;
	private Utente utente;
	private String codiceId;

	public Tessera(LocalDate dataCreazione, Utente utente) {

//		this.valido = true;
		this.tempoValidita = dataCreazione.plusYears(1);
		this.dataCreazione = dataCreazione;
		this.utente = utente;
//		this.codiceId = utente.getCodiceId();
	}

	public Tessera() {
		
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public LocalDate getTempoValidita() {
		return tempoValidita;
	}

	public void setTempoValidita(LocalDate tempoValidita) {
		this.tempoValidita = tempoValidita;
	}

	public LocalDate getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(LocalDate dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	@OneToOne//(mappedBy="tessera")
	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getCodiceId() {
		return codiceId;
	}

	public void setCodiceId(String codiceId) {
		this.codiceId = codiceId;
	}

}
