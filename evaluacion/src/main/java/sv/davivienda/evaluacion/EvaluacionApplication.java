package sv.davivienda.evaluacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EvaluacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionApplication.class, args);
	}
	
	@GetMapping("/")
	public String evaluacion() {
		return "Evaluacion Davivienda";
	}
	
	/*@Bean
	  CommandLineRunner lookup(FindPersonProcess findPerson) {
	    return args -> {
	      String id = "1";

	      if (args.length > 0) {
	        id = args[0];
	      }
	      FindPersonResponse response = findPerson.getFindPerson(id);
	      System.err.println(response.getFindPersonResult().getName());
	    };
	  }*/

}
