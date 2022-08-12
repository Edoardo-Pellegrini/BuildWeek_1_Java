package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import classmodels.Biglietto;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class BigliettoDao extends GenericDao <String, Biglietto> {
	
	private static final Logger log = LoggerFactory.getLogger(GenericDao.class);

	public BigliettoDao(Class<Biglietto> clazz) {
		super(clazz);
		
	}
	
	
	public static List<Biglietto> ricercaPerPunto(String puntoEmissione) {
		EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
		try {
			log.debug("ricercaPerPunto({})", puntoEmissione);
			var query = em.createNamedQuery("Biglietto.SELECT_ALL_QUERY_PER_PUNTO");
			query.setParameter("puntoEmissione", puntoEmissione);
			return query.getResultList();
		} catch (Exception e) {
			log.error("Error retrieving cities by province acronym", e);
			return new ArrayList<>();
		} finally {
			em.close();
		}
	}
	
	public static List<Biglietto> ricercaPerData(LocalDate today) {
		EntityManager  em = JPAutil.getEntityManagerFactory().createEntityManager();
		try {
			log.debug("ricercaPerDato({})", today);
			var query = em.createNamedQuery("Biglietto.SELECT_ALL_QUERY_PER_DATA");
			query.setParameter("today", today);
			return query.getResultList();
		} catch (Exception e) {
			log.error("Error for tickets by date", e);
			return new ArrayList<>();
		} finally {
			em.close();
		}
	}
	
}
