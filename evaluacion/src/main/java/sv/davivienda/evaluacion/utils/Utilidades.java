package sv.davivienda.evaluacion.utils;

import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utilidades {

	public static final Logger log = LoggerFactory.getLogger(Utilidades.class);

	public Utilidades() {
		// TODO Auto-generated constructor stub
	}

	public static JSONObject convertirObjetoAJason(String object) {
		try {
			JSONObject soapDatainJsonObject = XML.toJSONObject(object);
			return soapDatainJsonObject;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return null;
		}

	}

}
