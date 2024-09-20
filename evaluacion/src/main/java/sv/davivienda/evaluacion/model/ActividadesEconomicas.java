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
@Table(name = "ACTIVIDADES_ECONOMICAS")
@XmlRootElement

public class ActividadesEconomicas implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_ACTIVIDAD_ECONOMICA")
	private BigDecimal idActividadEconomica;
	@Size(max = 250)
	@Column(name = "DESCRIPCION")
	private String descripcion;
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idActividadEconomica")
	private Collection<Persona> personaCollection;*/

	public ActividadesEconomicas() {
	}

	public ActividadesEconomicas(BigDecimal idActividadEconomica) {
		this.idActividadEconomica = idActividadEconomica;
	}

	public BigDecimal getIdActividadEconomica() {
		return idActividadEconomica;
	}

	public void setIdActividadEconomica(BigDecimal idActividadEconomica) {
		this.idActividadEconomica = idActividadEconomica;
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
		hash += (idActividadEconomica != null ? idActividadEconomica.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof ActividadesEconomicas)) {
			return false;
		}
		ActividadesEconomicas other = (ActividadesEconomicas) object;
		if ((this.idActividadEconomica == null && other.idActividadEconomica != null)
				|| (this.idActividadEconomica != null
						&& !this.idActividadEconomica.equals(other.idActividadEconomica))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ActividadesEconomicas [idActividadEconomica=");
		builder.append(idActividadEconomica);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
