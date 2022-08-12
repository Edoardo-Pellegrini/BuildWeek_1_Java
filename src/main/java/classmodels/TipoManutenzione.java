package classmodels;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tipomanutenzione")

public class TipoManutenzione {
	
	private int id;
	private String tipo;
	private LocalDate manutenzioneInizio;
	private LocalDate manutenzioneFine;
	private MezzoTrasporto mezzoTrasporto;
	private DistributoreAutomatico distributoreAutomatico;
	
	

	public TipoManutenzione(int id, String tipo, LocalDate manutenzioneInizio, LocalDate manutenzioneFine, MezzoTrasporto mezzoTrasporto,DistributoreAutomatico distributoreAutomatico) {
		this.id = id;
		this.tipo = tipo;
		this.manutenzioneInizio = manutenzioneInizio;
		this.manutenzioneFine = manutenzioneFine;
		this.mezzoTrasporto = mezzoTrasporto;
		this.distributoreAutomatico = distributoreAutomatico ;
	}
	
	public TipoManutenzione(String tipo, LocalDate manutenzioneInizio, LocalDate manutenzioneFine, MezzoTrasporto mezzoTrasporto,DistributoreAutomatico distributoreAutomatico) {
		
		this.tipo = tipo;
		this.manutenzioneInizio = manutenzioneInizio;
		this.manutenzioneFine = manutenzioneFine;
		this.mezzoTrasporto = mezzoTrasporto;
		this.distributoreAutomatico = distributoreAutomatico ;
	}
	

	public TipoManutenzione() {
		
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	
	
	@ManyToOne
	public MezzoTrasporto getMezzoTrasporto() {
		return mezzoTrasporto;
	}

	public void setMezzoTrasporto(MezzoTrasporto mezzoTrasporto) {
		this.mezzoTrasporto = mezzoTrasporto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getManutenzioneInizio() {
		return manutenzioneInizio;
	}

	public void setManutenzioneInizio(LocalDate manutenzioneInizio) {
		this.manutenzioneInizio = manutenzioneInizio;
	}

	public LocalDate getManutenzioneFine() {
		return manutenzioneFine;
	}

	

	public void setManutenzioneFine(LocalDate manutenzioneFine) {
		this.manutenzioneFine = manutenzioneFine;
	}
	
	
	@ManyToOne
	public DistributoreAutomatico getDistributoreAutomatico() {
		return distributoreAutomatico;
	}

	public void setDistributoreAutomatico(DistributoreAutomatico distributoreAutomatico) {
		this.distributoreAutomatico = distributoreAutomatico;
	}

	@Override
	public String toString() {
		return "TipoManutenzione [manutenzioneInizio=" + manutenzioneInizio + ", manutenzioneFine=" + manutenzioneFine
				+ "]";
	}

}
