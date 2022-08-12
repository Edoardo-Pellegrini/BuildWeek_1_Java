package classmodels;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus extends MezzoTrasporto {

	private int capienza;

	public Bus(int id, boolean inservizio, int capienza) {
		super(id, inservizio, capienza);
		this.capienza = 25;
	}
	
	public Bus(boolean inservizio, int capienza) {
		super(inservizio, capienza);
		this.capienza = 25;
	}
	
	public Bus() {
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	@Override
	public String toString() {
		return "Bus [capienza=" + capienza + "]";
	}

	

	


}
