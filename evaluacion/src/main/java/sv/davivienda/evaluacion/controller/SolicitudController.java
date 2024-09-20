package sv.davivienda.evaluacion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sv.davivienda.evaluacion.dao.SolicitudDao;
import sv.davivienda.evaluacion.exception.ModeloNotFoundException;
import sv.davivienda.evaluacion.model.Solicitud;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {

	@Autowired
	private SolicitudDao service;

	public SolicitudController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping(path = "/getSolicitudes", produces = "application/json")
	public ResponseEntity<List<Solicitud>> listaSolicitudes() {
		List<Solicitud> solicitudes = new ArrayList<>();
		solicitudes = service.findSolicitudAll();
		return new ResponseEntity<List<Solicitud>>(solicitudes, HttpStatus.OK);
	}

	@GetMapping("/getSolicitudes/{id}")
	public ResponseEntity<Solicitud> buscarSolicitudPorId(@PathVariable("id") Long id) {
		Solicitud solicitud = service.getSolicitudById(id)
				.orElseThrow(() -> new ModeloNotFoundException("Solicitud no encontrado id=" + id));
		return new ResponseEntity<Solicitud>(solicitud, HttpStatus.OK);
	}

	@PostMapping("/postSolicitud")
	public ResponseEntity<Solicitud> crearSolicitud(@Valid @RequestBody Solicitud solicitud) {
		service.crearSolicitud(solicitud);
		return new ResponseEntity<Solicitud>(HttpStatus.CREATED);
	}

}
