package acme;

import java.io.IOException;

public class Persecucion {

	public static void main(String[] args) throws IOException {
		
		// Primero inicializamos un smartphone ACME con un código de licencia válido
		Smartphone miACMESmartphone = new Smartphone(2.0, "coyote_398978fdskj");
		
		// Localizamos el correcaminos más cercano.
		String coordenadas=miACMESmartphone.locateRoadRunner(PROVINCIA, PAIS);
		
		// Preparamos la trampa
                miACMESmartphone.prepareTrap(coordenadas);
                
                // Golpear al correcaminos con el voltaje deseado..
		miACMESmartphone.zapRoadRunner(40);

	}
    private static final String PAIS = "Spain";
    private static final String PROVINCIA = "Sevilla";
        

}
