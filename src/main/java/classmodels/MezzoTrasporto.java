package classmodels;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "mezzoTrasporto")
public abstract class MezzoTrasporto {
	
	private int id;
	private boolean inservizio;
	private int capienza;
	private List<Tratta> tratta;
	private List<TipoManutenzione> tipoManutenzione;
	
	public MezzoTrasporto(boolean inservizio, int capienza) {

		this.inservizio = inservizio;
		this.capienza = capienza;
		
	}
	
	public MezzoTrasporto(int id, boolean inservizio, int capienza) {
		this.id = id;
		this.inservizio = inservizio;
		this.capienza = capienza;
		
	}
	
	public MezzoTrasporto() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@OneToMany (mappedBy="mezzoTrasporto", cascade = CascadeType.REMOVE)
	public List<Tratta> getTratta() {
		return tratta;
	}

	public void setTratta(List<Tratta> tratta) {
		this.tratta = tratta;
	}
	@OneToMany (mappedBy="mezzoTrasporto", cascade = CascadeType.REMOVE)
	public List<TipoManutenzione> getTipoManutenzione() {
		return tipoManutenzione;
	}

	public void setTipoManutenzione(List<TipoManutenzione> tipoManutenzione) {
		this.tipoManutenzione = tipoManutenzione;
	}

	public boolean isInservizio() {
		return inservizio;
	}
	public void setInservizio(boolean inservizio) {
		this.inservizio = inservizio;
	}
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	@Override
	public String toString() {
		return "MezzoTrasporto [inservizio=" + inservizio + ", capienza=" + capienza + ", tratta=" + tratta
				+ ", tipoManutenzione=" + tipoManutenzione + "]";
	}
	
	
	
	
}
