package bean;

import java.util.List;
import javax.faces.bean.ManagedBean;

import dao.NotasDao;
import model.NotaRelat;

@ManagedBean
public class NotaRelatMB {

	private NotaRelat nota = new NotaRelat();
	private NotasDao notasDao = new NotasDao();
	private List<NotaRelat> notarelat = notasDao.buscarTodos();
	
	public NotaRelat getNota() {
		return nota;
	}
	public void setNota(NotaRelat nota) {
		this.nota = nota;
	}

	public void salvar() {
		notarelat = notasDao.buscarTodos();
		nota = new NotaRelat();
	}
	
	public List<NotaRelat> getNotarelat() {
		return notarelat;
	}
	public void setNotarelat(List<NotaRelat> notarelat) {
		this.notarelat = notarelat;
	}
}