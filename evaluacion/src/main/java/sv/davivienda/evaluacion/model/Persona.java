package sv.davivienda.evaluacion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "PERSONA")
@XmlRootElement

@NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@SequenceGenerator(name = "ID_PERSONA_SEQ", sequenceName = "ID_PERSONA_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_PERSONA_SEQ")
	@Basic(optional = true)
	//@NotNull
	@Column(name = "ID_PERSONA")
	private BigDecimal idPersona;
	@Size(max = 9)
	@Column(name = "DUI")
	private String dui;
	@Size(max = 9)
	@Column(name = "NIT")
	private String nit;
	@Size(max = 150)
	@Column(name = "NOMBRES")
	private String nombres;
	@Size(max = 150)
	@Column(name = "APELLIDOS")
	private String apellidos;
	@Column(name = "SEXO")
	private Character sexo;
	@JoinColumn(name = "ID_ACTIVIDAD_ECONOMICA", referencedColumnName = "ID_ACTIVIDAD_ECONOMICA")
	@ManyToOne(optional = false)
	private ActividadesEconomicas idActividadEconomica;
	@JoinColumn(name = "ID_ESTADO_CIVIL", referencedColumnName = "ID_ESTADO_CIVIL")
	@ManyToOne(optional = false)
	private EstadoCivil idEstadoCivil;
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
	private Collection<Solicitud> solicitudCollection;*/

	public Persona() {
	}

	public Persona(BigDecimal idPersona) {
		this.idPersona = idPersona;
	}

	public BigDecimal getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(BigDecimal idPersona) {
		this.idPersona = idPersona;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public ActividadesEconomicas getIdActividadEconomica() {
		return idActividadEconomica;
	}

	public void setIdActividadEconomica(ActividadesEconomicas idActividadEconomica) {
		this.idActividadEconomica = idActividadEconomica;
	}

	public EstadoCivil getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(EstadoCivil idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
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
		hash += (idPersona != null ? idPersona.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) object;
		if ((this.idPersona == null && other.idPersona != null)
				|| (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idPersona=");
		builder.append(idPersona);
		builder.append(", dui=");
		builder.append(dui);
		builder.append(", nit=");
		builder.append(nit);
		builder.append(", nombres=");
		builder.append(nombres);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", idActividadEconomica=");
		builder.append(idActividadEconomica);
		builder.append(", idEstadoCivil=");
		builder.append(idEstadoCivil);
		builder.append("]");
		return builder.toString();
	}

}
