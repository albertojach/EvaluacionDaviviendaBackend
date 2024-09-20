package sv.davivienda.evaluacion.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import sv.davivienda.evaluacion.process.FindPersonProcess;

@Configuration
public class FindPersonService {

	public FindPersonService() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    // this package must match the package in the <generatePackage> specified in
	    // pom.xml
	    marshaller.setContextPath("com.example.consumingwebservice.wsdl");
	    return marshaller;
	  }
	
	@Bean
	  public FindPersonProcess findPersonClient(Jaxb2Marshaller marshaller) {
		FindPersonProcess client = new FindPersonProcess();
	    client.setDefaultUri("https://www.crcind.com/csp/samples/SOAP.Demo.CLS");
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  }

}
