package classmodels;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tram")
public class Tram extends MezzoTrasporto {
	
	private int capienza;
	
	
	public Tram() {
	}

	public Tram(int id, boolean inservizio, int capienza) {
		super(id, inservizio, capienza);
		this.capienza = 40;
	}
	
	public Tram(boolean inservizio, int capienza) {
		super(inservizio, capienza);
		this.capienza = 40;
	}
	
	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	@Override
	public String toString() {
		return "Tram [capienza=" + capienza + "]";
	}


}

