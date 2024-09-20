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
@Table(name = "ESTADO_CIVIL")
@XmlRootElement

public class EstadoCivil implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_ESTADO_CIVIL")
	private BigDecimal idEstadoCivil;
	@Size(max = 50)
	@Column(name = "DESCRIPCION")
	private String descripcion;
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoCivil")
	private Collection<Persona> personaCollection;*/

	public EstadoCivil() {
	}

	public EstadoCivil(BigDecimal idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public BigDecimal getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(BigDecimal idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*@XmlTransient
	public Collection<Persona> getPersonaCollection() {
		return personaCollection;
	}

	public void setPersonaCollection(Collection<Persona> personaCollection) {
		this.personaCollection = personaCollection;
	}*/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idEstadoCivil != null ? idEstadoCivil.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof EstadoCivil)) {
			return false;
		}
		EstadoCivil other = (EstadoCivil) object;
		if ((this.idEstadoCivil == null && other.idEstadoCivil != null)
				|| (this.idEstadoCivil != null && !this.idEstadoCivil.equals(other.idEstadoCivil))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstadoCivil [idEstadoCivil=");
		builder.append(idEstadoCivil);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
