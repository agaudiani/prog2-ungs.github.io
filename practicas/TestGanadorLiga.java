package prog2.prac2;

public class Partido
{
	String equipo1;
	String equipo2;

	int goles1;
	int goles2;

	public Partido(String e1, int g1, String e2, int g2) {
		if (e1.equals(e2) || g1 < 0 || g2 < 0) {
			throw new RuntimeException("valores incorrectos");
		}
		equipo1 = e1;
		equipo2 = e2;
		goles1 = g1;
		goles2 = g2;
	}
}
