package view;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import model.NotaRelat;

@ManagedBean(name="dtSelectionView")
@ViewScoped
public class SelectionView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private NotaRelat selectedNF;
	private List<NotaRelat> selectedNFs;

	@ManagedProperty("#{notaRelat}")
	private NotaRelat notarelat;
	
	public NotaRelat getNotarelat() {
		return notarelat;
	}

	public void setNotarelat(NotaRelat notarelat) {
		this.notarelat = notarelat;
	}

	public NotaRelat getSelectedNF() {
		return selectedNF;
	}

	public void setSelectedNF(NotaRelat selectedNF) {
		this.selectedNF = selectedNF;
	}

	public List<NotaRelat> getSelectedNFs() {
		return selectedNFs;
	}

	public void setSelectedNFs(List<NotaRelat> selectedNFs) {
		this.selectedNFs = selectedNFs;
	}
	public void onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Nota Fiscal Selecionada:", ((NotaRelat) event.getObject()).getnome_razao_social());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowUnselect(UnselectEvent event) {
		FacesMessage msg = new FacesMessage("Nota Fiscal Selecionada:", ((NotaRelat) event.getObject()).getnome_razao_social());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}