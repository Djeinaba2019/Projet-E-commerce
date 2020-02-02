package Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Facture")
public class Facture implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idFacture;
	
	@Column(name="Total")
	private double Total;
	
	@Column(name="Date_Facturation")
	private Date date_Facturation;
	
	@OneToOne
	@JoinColumn(name="idCommande")
	private Commande commande;

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public Date getDate_Facturation() {
		return date_Facturation;
	}

	public void setDate_Facturation(Date date_Facturation) {
		this.date_Facturation = date_Facturation;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Facture(double total, Date date_Facturation, Commande commande) {
		super();
		Total = total;
		this.date_Facturation = date_Facturation;
		this.commande = commande;
	}

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
