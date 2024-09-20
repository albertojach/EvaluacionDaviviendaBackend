package sv.davivienda.evaluacion.dao;

import java.util.List;
import java.util.Optional;

import sv.davivienda.evaluacion.model.Persona;

public interface PersonaDao {
	public List<Persona> findPersonaAll();
	public Optional<Persona> getPersonaById(Long id);
	public Persona crearCliente(Persona persona);
}
