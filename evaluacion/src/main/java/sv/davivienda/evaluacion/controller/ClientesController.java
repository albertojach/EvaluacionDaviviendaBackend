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
import sv.davivienda.evaluacion.dao.PersonaDao;
import sv.davivienda.evaluacion.exception.ModeloNotFoundException;
import sv.davivienda.evaluacion.model.Persona;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	public ClientesController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private PersonaDao service;

	@GetMapping(path = "/getClientes" ,produces = "application/json")
	public ResponseEntity<List<Persona>> listaPersonas() {
		List<Persona> personas = new ArrayList<>();
		personas = service.findPersonaAll();
		return new ResponseEntity<List<Persona>>(personas, HttpStatus.OK);
	}

	@GetMapping("/getClientes/{id}")
	public ResponseEntity<Persona> buscarPersonaPorId(@PathVariable("id") Long id) {
		Persona persona = service.getPersonaById(id)
				.orElseThrow(() -> new ModeloNotFoundException("Cliente no encontrado id=" + id));
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}
	
	@PostMapping("/postCliente")
    public ResponseEntity<Persona> crearCliente(@Valid @RequestBody Persona persona){
        service.crearCliente(persona);
        return new ResponseEntity<Persona>(HttpStatus.CREATED);
    }

}
