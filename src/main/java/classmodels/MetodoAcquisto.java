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
@Table(name = "metodoAcquisto")

public abstract class MetodoAcquisto {
	
	private int id;
	private List<Biglietto> biglietto;
	
	

	public MetodoAcquisto(int id) {
		this.id = id;

	}


	public MetodoAcquisto() {
		
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	
	@Override
	public String toString() {
		return "MetodoAcquisto [biglietto=" + biglietto + "]";
	}


	@OneToMany (mappedBy="metodoAcquisto", cascade = CascadeType.REMOVE)
	public List<Biglietto> getBiglietto() {
		return biglietto;
	}



	public void setBiglietto(List<Biglietto> biglietto) {
		this.biglietto = biglietto;
	}
	
	

}
