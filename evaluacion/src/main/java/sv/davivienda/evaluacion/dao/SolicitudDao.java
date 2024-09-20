package sv.davivienda.evaluacion.dao;

import java.util.List;
import java.util.Optional;

import sv.davivienda.evaluacion.model.Solicitud;

public interface SolicitudDao {

	public List<Solicitud> findSolicitudAll();

	public Optional<Solicitud> getSolicitudById(Long id);

	public Solicitud crearSolicitud(Solicitud solicitud);

}
