package sv.davivienda.evaluacion.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.consumingwebservice.wsdl.FindPerson;
import com.example.consumingwebservice.wsdl.FindPersonResponse;

public class FindPersonProcess extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(FindPerson.class);

	public FindPersonProcess() {
		// TODO Auto-generated constructor stub
	}

	public FindPersonResponse getFindPerson(String id) {

		FindPerson personRequest = new FindPerson();
		personRequest.setId(id);
		log.info("Person request " + personRequest);
		// Hace el llamado al metodo definido en el WSDL
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/SOAP.Demo.FindPerson");
		// Se conecta al servicio y trae una respuesta
		FindPersonResponse findPersonResponse = (FindPersonResponse) getWebServiceTemplate().marshalSendAndReceive(
				"https://www.crcind.com/csp/samples/SOAP.Demo.CLS", personRequest, soapActionCallback);

		log.info("Person response " + findPersonResponse);
		return findPersonResponse;
	}

}
