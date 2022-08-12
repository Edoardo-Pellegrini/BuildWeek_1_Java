package classmodels;





import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rivenditore")
public class Rivenditore extends MetodoAcquisto{

	
		
		private boolean autorizzato;


		public Rivenditore() {
		}
		


		public Rivenditore(int id, boolean autorizzato) {
			super(id);
			this.autorizzato = autorizzato;
		}
		
		public Rivenditore(boolean autorizzato) {
			this.autorizzato = autorizzato;
		}




		public boolean isAutorizzato() {
			return autorizzato;
		}

		public void setAutorizzato(boolean autorizzato) {
			this.autorizzato = autorizzato;
		}
		
		
		

	}