package prog2.prac2;

import java.util.regex.Pattern;

public class Persona
{
	String nombre;
	String fechaNac;  // Formato DD/MM/YYYY

	public Persona(String nom, String fnac) {
		if (!verificarFecha(fnac)) {
			throw new RuntimeException(
					"formato de fecha no vÃ¡lido");
		}
		nombre = nom;
		fechaNac = fnac;
	}

	private boolean verificarFecha(String fecha) {
		// Verificar, al menos, que está en formato DD/MM/YYYY.
		return Pattern.matches("^\\d{2}/\\d{2}/\\d{4}$", fecha);
	}
}
