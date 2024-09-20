package sv.davivienda.evaluacion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.davivienda.evaluacion.model.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long> {

}
