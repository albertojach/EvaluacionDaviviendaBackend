package sv.davivienda.evaluacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.davivienda.evaluacion.dao.PersonaDao;
import sv.davivienda.evaluacion.model.Persona;
import sv.davivienda.evaluacion.repositorio.PersonaRepositorio;

@Service
public class ClienteService implements PersonaDao {

	@Autowired
	private PersonaRepositorio personaRepositorio;

	@Override
	public List<Persona> findPersonaAll() {
		return personaRepositorio.findAll();
	}

	@Override
	public Optional<Persona> getPersonaById(Long id) {
		return personaRepositorio.findById(id);
	}

	@Override
	public Persona crearCliente(Persona persona) {
		// persona.setIdPersona(new BigDecimal(1));
		return personaRepositorio.saveAndFlush(persona);
	}

}
