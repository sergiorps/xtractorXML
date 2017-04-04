package dao;
import model.NotaRelat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class NotasDao {
	
	public List<NotaRelat> buscarTodos() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xtractor");
		EntityManager em = emf.createEntityManager();
		String consulta = "SELECT p FROM NotaRelat p";
		TypedQuery<NotaRelat> query = em.createQuery(consulta, NotaRelat.class);

		List<NotaRelat> resultList = query.getResultList();
		em.close();
		return resultList;

	}
}