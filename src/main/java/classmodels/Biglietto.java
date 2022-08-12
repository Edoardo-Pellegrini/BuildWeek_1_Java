package classmodels;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "biglietti")
@NamedQuery(name = "Biglietto.SELECT_ALL_QUERY_PER_PUNTO", query = "SELECT c FROM Biglietto c WHERE c.puntoEmissione LIKE :puntoEmissione")
@NamedQuery(name = "Biglietto.SELECT_ALL_QUERY_PER_DATA", query = "SELECT c FROM Biglietto c WHERE c.dataScadenza < :today")


public class Biglietto {
	
	private int id;
	private boolean timbrato;
	private boolean valido;
	private Validita validita;
	private Tessera tessera;
	private LocalDate dataEmissione;
	private LocalDate dataScadenza;
	private String puntoEmissione;
	private MetodoAcquisto metodoAcquisto;
	
		
	

	public Biglietto(int id, boolean timbrato, boolean valido, Validita validita, Tessera tessera, LocalDate dataEmissione,
			LocalDate dataScadenza, String puntoEmissione, MetodoAcquisto metodoAcquisto) {
		this.id = id;
		this.timbrato = timbrato;
		this.valido = valido;
		this.validita = validita;
		this.tessera = tessera;
		this.dataEmissione = dataEmissione;
		this.dataScadenza = dataScadenza;
		this.puntoEmissione = puntoEmissione;
		this.metodoAcquisto  = metodoAcquisto;
	}
	
	public Biglietto(boolean timbrato, boolean valido, Validita validita, Tessera tessera, LocalDate dataEmissione,
			LocalDate dataScadenza, String puntoEmissione, MetodoAcquisto metodoAcquisto) {

		this.timbrato = timbrato;
		this.valido = valido;
		this.validita = validita;
		this.tessera = tessera;
		this.dataEmissione = dataEmissione;
		this.dataScadenza = dataScadenza;
		this.puntoEmissione = puntoEmissione;
		this.metodoAcquisto  = metodoAcquisto;
	}


	public Biglietto() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}
	@Enumerated(EnumType.STRING)
	public Validita getValidita() {
		return validita;
	}

	public void setValidita(Validita validita) {
		this.validita = validita;
	}
	@OneToOne
	public Tessera getTessera() {
		return tessera;
	}

	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}

	public LocalDate getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public String getPuntoEmissione() {
		return puntoEmissione;
	}

	public void setPuntoEmissione(String puntoEmissione) {
		this.puntoEmissione = puntoEmissione;
	}

	public boolean isTimbrato() {
		return timbrato;
	}

	public void setTimbrato(boolean timbrato) {
		this.timbrato = timbrato;
	}
	
	
	@ManyToOne
	public MetodoAcquisto getMetodoAcquisto() {
		return metodoAcquisto;
	}

	public void setMetodoAcquisto(MetodoAcquisto metodoAcquisto) {
		this.metodoAcquisto = metodoAcquisto;
	}

	@Override
	public String toString() {
		return String.format(
				"Biglietto [id=%s, timbrato=%s, valido=%s, validita=%s, tessera=%s, dataEmissione=%s, dataScadenza=%s, puntoEmissione=%s, metodoAcquisto=%s]",
				id, timbrato, valido, validita, tessera, dataEmissione, dataScadenza, puntoEmissione, metodoAcquisto);
	}

	
	


	

}
