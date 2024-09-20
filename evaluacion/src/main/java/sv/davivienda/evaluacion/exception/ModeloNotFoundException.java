package sv.davivienda.evaluacion.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException {

	private static final Logger log = LoggerFactory.getLogger(ModeloNotFoundException.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModeloNotFoundException(String mensaje)
	{
		super(mensaje);
		log.error(mensaje);
	}

}
