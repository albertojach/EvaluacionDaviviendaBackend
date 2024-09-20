package sv.davivienda.evaluacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.davivienda.evaluacion.dao.SolicitudDao;
import sv.davivienda.evaluacion.model.Solicitud;
import sv.davivienda.evaluacion.repositorio.SolicitudRepositorio;

@Service
public class SolicitudService implements SolicitudDao {

	@Autowired
	private SolicitudRepositorio solicitudRepositorio;

	@Override
	public List<Solicitud> findSolicitudAll() {
		return solicitudRepositorio.findAll();
	}

	@Override
	public Optional<Solicitud> getSolicitudById(Long id) {
		return solicitudRepositorio.findById(id);
	}

	@Override
	public Solicitud crearSolicitud(Solicitud solicitud) {
		// persona.setIdPersona(new BigDecimal(1));
		return solicitudRepositorio.saveAndFlush(solicitud);
	}

}
