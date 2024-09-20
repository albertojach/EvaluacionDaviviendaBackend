package sv.davivienda.evaluacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumingwebservice.wsdl.FindPersonResponse;

import sv.davivienda.evaluacion.process.FindPersonProcess;

@RestController
@RequestMapping("/consultarinfopersona")
public class ConsultarInfoPersonaController {

	@Autowired
	private FindPersonProcess findPersonProcess;
	// private FindPersonProcess findPersonProcess = new FindPersonProcess();

	public ConsultarInfoPersonaController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping(path = "/findperson", produces = "application/json")
	public FindPersonResponse findPerson(@RequestParam(value = "id") String id) {

		FindPersonResponse response = findPersonProcess.getFindPerson(id);
		// Utilidades.convertirObjetoAJason(response.toString());
		return response;
	}

}
