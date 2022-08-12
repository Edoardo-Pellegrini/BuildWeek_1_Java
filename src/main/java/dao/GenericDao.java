package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class GenericDao <X, Y> {
    Class<Y> clazz;
	
	
	public GenericDao(Class<Y> clazz) {
		super();
		this.clazz = clazz;
	}

	private static final Logger logger = LoggerFactory.getLogger(GenericDao.class);
	public void save (Y y) {
		EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(y);
        em.getTransaction().commit();
        em.close();
		
	}
	
	public void refresh(Y y) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        try {

            em.refresh(y);

        } finally {
            em.close();
        }
    }
	
	public Y getById(X x) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        try {

            return em.find(clazz, x);

        } finally {
            em.close();
        }
    }
	
	public void delete(Y y) {
        EntityManager em = JPAutil.getEntityManagerFactory().createEntityManager();
        try {

            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            em.remove(y);

            transaction.commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            logger.error("Error deleting object: " + y.getClass().getSimpleName(), ex);
            throw ex;

        } finally {
            em.close();
        }

    }
}
 