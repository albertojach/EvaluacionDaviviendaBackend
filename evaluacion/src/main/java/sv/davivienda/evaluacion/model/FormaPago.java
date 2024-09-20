package sv.davivienda.evaluacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "FORMA_PAGO")
@XmlRootElement

public class FormaPago implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_FORMA_PAGO")
	private BigDecimal idFormaPago;
	@Size(max = 100)
	@Column(name = "DESCRIPCION")
	private String descripcion;
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFormaPago")
	private Collection<Solicitud> solicitudCollection;*/

	public FormaPago() {
	}

	public FormaPago(BigDecimal idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public BigDecimal getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(BigDecimal idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*@XmlTransient
	public Collection<Solicitud> getSolicitudCollection() {
		return solicitudCollection;
	}

	public void setSolicitudCollection(Collection<Solicitud> solicitudCollection) {
		this.solicitudCollection = solicitudCollection;
	}*/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idFormaPago != null ? idFormaPago.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof FormaPago)) {
			return false;
		}
		FormaPago other = (FormaPago) object;
		if ((this.idFormaPago == null && other.idFormaPago != null)
				|| (this.idFormaPago != null && !this.idFormaPago.equals(other.idFormaPago))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FormaPago [idFormaPago=");
		builder.append(idFormaPago);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
