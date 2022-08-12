package classmodels;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.BigliettoDao;
import dao.BusDao;
import dao.DistributoreAutomaticoDao;
import dao.RivenditoreDao;
import dao.TesseraDao;
import dao.TipoManutenzioneDao;
import dao.TramDao;
import dao.TrattaDao;
import dao.UtenteDao;



public class Main {

	public static void main(String[] args) {
		
		
//		Utente utente1 = new Utente("Eugenio", "Codella", 29, "HHR1023");
//		Utente utente2 = new Utente("McGregor", "Connor", 29, "HVC7862");
//		UtenteDao utenti1 = new UtenteDao(Utente.class);
//		utenti1.save((Utente)utente1);
//		UtenteDao utenti2 = new UtenteDao(Utente.class);
//		utenti2.save((Utente)utente2);
		
		
		List<Utente> utenti = new ArrayList<>();
		
		utenti.add(new Utente("Eugenio", "Codella", 29, "HHR1023"));
		utenti.add(new Utente("Jackman", "Hugh", 22, "AGH1443"));
		utenti.add(new Utente("Twain", "Shania", 24, "YWI1026"));
		utenti.add(new Utente("Kelly", "Kapowski", 27, "HYU1423"));
		utenti.add(new Utente("Tim", "Burton", 49, "NMR1929"));
		utenti.add(new Utente("Jimmy", "McGill", 34, "ISK7878"));
		utenti.add(new Utente("Owen", "Codella", 42, "HHR1637"));
		utenti.add(new Utente("Eugenio", "Hughes", 29, "OLR2782"));
		utenti.add(new Utente("Bert", "Magee", 29, "HAL9823"));
		utenti.add(new Utente("Anto", "White", 13, "QUI1923"));
		utenti.add(new Utente("Declan", "Rice", 85, "YEU8823"));
		utenti.add(new Utente("Eugene", "Collon", 19, "UCJ1078"));
		utenti.add(new Utente("Zach", "Braff", 26, "BVC1892"));
		utenti.add(new Utente("Bryan", "Brianson", 56, "BVC1111"));
		
		
		for (int i = 0; i < utenti.size(); i ++) {
			UtenteDao utenti3 = new UtenteDao(Utente.class);
			utenti3.save(utenti.get(i));
				
			}
		
//		Tessera tessera1 = new Tessera(LocalDate.now(), utente1);
//		Tessera tessera2 = new Tessera(LocalDate.now(), utente2);
//		TesseraDao tessere = new TesseraDao(Tessera.class);
//		tessere.save( tessera1);
//		TesseraDao tessere2 = new TesseraDao(Tessera.class);
//		tessere2.save( tessera2);
//		
		List<Tessera> tesseri = new ArrayList<>();
		
		
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(1)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(2)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(3)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(4)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(5)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(6)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(7)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(8)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(9)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(10)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(11)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(12)));
		tesseri.add(new Tessera(LocalDate.now(), utenti.get(13)));
		
		for (int i = 0; i < tesseri.size(); i ++) {
			TesseraDao tesseri3 = new TesseraDao(Tessera.class);
			tesseri3.save(tesseri.get(i));
				
			}
		
		Tram tram1 = new Tram(true, 40);
		TramDao tram = new TramDao(Tram.class);
		tram.save( tram1);
		
		Bus bus1 = new Bus(false, 25);
		Bus bus2 = new Bus(true, 25);
		BusDao busi = new BusDao(Bus.class);
		busi.save( bus1);
		BusDao busi2 = new BusDao(Bus.class);
		busi2.save( bus2);
			
		Tratta tratta1 = new Tratta(120, "Dublin", "Galway", bus1);
		Tratta tratta2 = new Tratta(90, "Mayo", "Sligo", bus1);
		Tratta tratta3 = new Tratta(140, "Dublin", "Cork", bus2);
		Tratta tratta4 = new Tratta(250, "Donegal", "Kerry", bus2);
		TrattaDao tratti = new TrattaDao(Tratta.class);
		tratti.save( tratta1);
		TrattaDao tratti2 = new TrattaDao(Tratta.class);
		tratti2.save( tratta2);
		TrattaDao tratti3 = new TrattaDao(Tratta.class);
		tratti3.save( tratta3);
		TrattaDao tratti4 = new TrattaDao(Tratta.class);
		tratti4.save( tratta4);
		
		DistributoreAutomatico metodoAcquisto1 = new DistributoreAutomatico(true);
		DistributoreAutomaticoDao metodoAcquisti = new DistributoreAutomaticoDao(DistributoreAutomatico.class);
		metodoAcquisti.save(metodoAcquisto1);
		
		Rivenditore metodoAcquisto2 = new Rivenditore(true);
		RivenditoreDao metodoAcquisti2 = new RivenditoreDao(Rivenditore.class);
		metodoAcquisti2.save(metodoAcquisto2);
		
		TipoManutenzione manu1 = new TipoManutenzione("clean" , LocalDate.of(2022, 1, 3), LocalDate.of(2022, 1, 4), tram1, metodoAcquisto1);
		TipoManutenzione manu2 = new TipoManutenzione("refurbishment" , LocalDate.of(2022, 5, 21), LocalDate.of(2022, 6, 26), bus1, metodoAcquisto1);
		TipoManutenzione manu3 = new TipoManutenzione("repair" , LocalDate.of(2022, 2, 22), LocalDate.of(2022, 11, 13), bus2, metodoAcquisto1);
		TipoManutenzioneDao mani = new TipoManutenzioneDao(TipoManutenzione.class);
		mani.save( manu1);
		TipoManutenzioneDao mani2 = new TipoManutenzioneDao(TipoManutenzione.class);
		mani2.save( manu2);
		TipoManutenzioneDao mani3 = new TipoManutenzioneDao(TipoManutenzione.class);
		mani3.save( manu3);
		
		
		List<Biglietto> biglietti = new ArrayList<>();
		
//		biglietti.add(new Biglietto(true, true, Validita.mensile, tessera1, LocalDate.of(2022, 1, 3), LocalDate.of(2022, 2, 3), "Wicklow", metodoAcquisto1));
		biglietti.add(new Biglietto(true, false, Validita.settimanale, tesseri.get(1), LocalDate.of(2022, 1, 3), LocalDate.of(2022, 1, 10), "Carlow", metodoAcquisto1));
		biglietti.add(new Biglietto(true, true, Validita.mensile,  tesseri.get(2), LocalDate.of(2022, 4, 23), LocalDate.of(2022, 5, 23), "Cork", metodoAcquisto2));
		biglietti.add(new Biglietto(false, false, Validita.settimanale,  tesseri.get(3), LocalDate.of(2021, 11, 13), LocalDate.of(2021, 11, 20), "Kerry", metodoAcquisto2));
		biglietti.add(new Biglietto(true, true, Validita.mensile,  tesseri.get(4), LocalDate.of(2022, 2, 14), LocalDate.of(2022, 3, 14), "Donegal", metodoAcquisto1));
		biglietti.add(new Biglietto(true, false, Validita.mensile,  tesseri.get(5), LocalDate.of(2022, 3, 6), LocalDate.of(2022, 4, 6), "Carlow", metodoAcquisto1));
		biglietti.add(new Biglietto(true, true, Validita.settimanale,  tesseri.get(6), LocalDate.of(2022, 7, 7), LocalDate.of(2022, 7, 14), "Carlow", metodoAcquisto1));
		biglietti.add(new Biglietto(true, true, Validita.mensile,  tesseri.get(7), LocalDate.of(2022, 5, 4), LocalDate.of(2022, 6, 4), "Galway", metodoAcquisto2));
		biglietti.add(new Biglietto(false, true, Validita.mensile,  tesseri.get(8), LocalDate.of(2022, 1, 25), LocalDate.of(2022, 2, 25), "Kerry", metodoAcquisto1));
		biglietti.add(new Biglietto(true, true, Validita.mensile,  tesseri.get(9), LocalDate.of(2022, 7, 12), LocalDate.of(2022, 7, 19), "Dublin", metodoAcquisto2));
		biglietti.add(new Biglietto(false, false, Validita.settimanale,  tesseri.get(10), LocalDate.of(2022, 1, 3), LocalDate.of(2022, 2, 10),"Dublin", metodoAcquisto2));
		biglietti.add(new Biglietto(true, true, Validita.mensile,  tesseri.get(11), LocalDate.of(2022, 1, 22), LocalDate.of(2022, 2, 22), "Carlow", metodoAcquisto1));
		biglietti.add(new Biglietto(true, false, Validita.mensile,  tesseri.get(12), LocalDate.of(2021, 9, 3), LocalDate.of(2021, 10, 3), "Donegal", metodoAcquisto2));
		
		for (int i = 0; i < biglietti.size(); i ++) {
			BigliettoDao biglietti1 = new BigliettoDao(Biglietto.class);
			biglietti1.save(biglietti.get(i));
				
			}
		
//		Biglietto biglietto1 = new Biglietto(true, true, Validita.mensile, tessera1, LocalDate.of(2022, 1, 3), LocalDate.of(2022, 2, 3), "Carlow", metodoAcquisto1);
//		
//		BigliettoDao biglietti1 = new BigliettoDao(Biglietto.class);
//		biglietti1.save(biglietto1);
		
		
		
//		utente1.setTessera(tessera1);
		
		
		
		
		
		
		
		
//		Utente utente2 = new Utente("Florencia", "Perez", 38, "HHR1653");
//		Utente utente3 = new Utente("Scott", "Allen", 44, "HHR1933");
//		Utente utente4 = new Utente("Mario", "Micciche", 68, "HHR0193");

//		utenti.save(utente2);
//		utenti.save(utente3);
//		utenti.save(utente4);
		
//		Tessera tessera1 = new Tessera(LocalDate.now(), utente1);
//		TesseraDao tessere = new TesseraDao(Tessera.class);
//		tessere.save(tessera1);
		
		

	}

}