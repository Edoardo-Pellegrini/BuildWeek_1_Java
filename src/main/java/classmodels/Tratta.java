package classmodels;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "tratta")
public class Tratta {

	private int nummero;
	private int tempoPercorrenza;
	private String puntoPartenza;
	private String capolinea;
	private MezzoTrasporto mezzoTrasporto;
	
	public Tratta(int nummero, int tempoPercorrenza, String puntoPartenza, String capolinea, MezzoTrasporto mezzoTrasporto) {
		this.nummero = nummero;
		this.tempoPercorrenza = tempoPercorrenza;
		this.puntoPartenza = puntoPartenza;
		this.capolinea = capolinea;
		this.mezzoTrasporto = mezzoTrasporto;
	}
	
	public Tratta(int tempoPercorrenza, String puntoPartenza, String capolinea, MezzoTrasporto mezzoTrasporto) {
		
		this.tempoPercorrenza = tempoPercorrenza;
		this.puntoPartenza = puntoPartenza;
		this.capolinea = capolinea;
		this.mezzoTrasporto = mezzoTrasporto;
	}
	
	public Tratta() {
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getNummero() {
		return nummero;
	}




	public void setNummero(int nummero) {
		this.nummero = nummero;
	}



	@ManyToOne
	public MezzoTrasporto getMezzoTrasporto() {
		return mezzoTrasporto;
	}

	public void setMezzoTrasporto(MezzoTrasporto mezzoTrasporto) {
		this.mezzoTrasporto = mezzoTrasporto;
	}

	public int getTempoPercorrenza() {
		return tempoPercorrenza;
	}
	public void setTempoPercorrenza(int tempoPercorrenza) {
		this.tempoPercorrenza = tempoPercorrenza;
	}
	public String getPuntoPartenza() {
		return puntoPartenza;
	}
	public void setPuntoPartenza(String puntoPartenza) {
		this.puntoPartenza = puntoPartenza;
	}
	public String getCapolinea() {
		return capolinea;
	}
	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}




	@Override
	public String toString() {
		return "Tratta [nummero=" + nummero + ", tempoPercorrenza(mins)=" + tempoPercorrenza + ", puntoPartenza="
				+ puntoPartenza + ", capolinea=" + capolinea + "]";
	}
	
	
}
