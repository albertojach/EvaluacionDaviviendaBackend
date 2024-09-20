package sv.davivienda.evaluacion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.davivienda.evaluacion.model.Solicitud;

@Repository
public interface SolicitudRepositorio extends JpaRepository<Solicitud, Long> {

}
