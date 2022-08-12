package classmodels;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "distributoreAutomatico")
public class DistributoreAutomatico extends MetodoAcquisto{
	
	private boolean attivo;
	
	private List<TipoManutenzione> tipoManutenzione;

	public DistributoreAutomatico() {
		
	}
	
	public DistributoreAutomatico(int id, boolean attivo) {
		super(id);
		this.attivo = attivo;
	
	}

	public DistributoreAutomatico(boolean attivo) {

		this.attivo = attivo;
	
	}



	public boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	@OneToMany (mappedBy="distributoreAutomatico", cascade = CascadeType.REMOVE)
	public List<TipoManutenzione> getTipoManutenzione() {
		return tipoManutenzione;
	}


	public void setTipoManutenzione(List<TipoManutenzione> tipoManutenzione) {
		this.tipoManutenzione = tipoManutenzione;
	}

	@Override
	public String toString() {
		return "DistributoreAutomatico [attivo=" + attivo + ", tipoManutenzione=" + tipoManutenzione + "]";
	}
	
	
	

}
