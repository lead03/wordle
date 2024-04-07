import java.util.ArrayList;

public class Juego {
	private static ArrayList<String> palabrasParaJugar = new ArrayList<String>();
	private static ArrayList<String> palabrasParaJugarIngles = new ArrayList<String>();
	private static ArrayList<String> palabrasParaJugarAleman = new ArrayList<String>();
	public static ArrayList<Integer> indicesCorrectos;
	public static ArrayList<Integer> indicesIncorrectas;
	public static ArrayList<Integer> indicesMalPosicion;
	public static int indice = 0;
	public static int indiceIdioma = 0;
	public static int cantidadColumnas = 5;
	public static int cantidadFilas = 5;
	public static String palabraElegida;
	public static boolean juegoTerminado = false;



	public static void subirIndice() {
		if (Juego.indice < Juego.cantidadFilas - 1) {
			Juego.indice++;
		} else {
			Juego.juegoTerminado = true;
		}
	}

	public static void detectarLetrasCorrectasEIncorrectas(String palabra) {
		Juego.indicesCorrectos = new ArrayList<Integer>();
		Juego.indicesIncorrectas = new ArrayList<Integer>();
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == Juego.palabraElegida.charAt(i)) {
				Juego.indicesCorrectos.add(i);
			} else {
				Juego.indicesIncorrectas.add(i);
			}
		}
	}

	public static void detectarLetrasPosicionIncorrecta(String palabra) {
		ArrayList<Integer> indicesMalPosicion = new ArrayList<Integer>();
		ArrayList<Character> letrasPalabraCorrecta = new ArrayList<Character>();
		for (int indiceLetra : Juego.indicesIncorrectas) {
			letrasPalabraCorrecta.add(Juego.palabraElegida.charAt(indiceLetra));
		}
		for (int indiceLetra : Juego.indicesIncorrectas) {
			if (letrasPalabraCorrecta.contains(palabra.charAt(indiceLetra))) {
				indicesMalPosicion.add(indiceLetra);
				letrasPalabraCorrecta.remove(Character.valueOf(palabra.charAt(indiceLetra)));
			}
		}
		Juego.indicesMalPosicion = indicesMalPosicion;
	}

	public static void agregarPalabras() {
		Juego.palabrasParaJugar.add("PERRO");
		Juego.palabrasParaJugar.add("MIRAR");
		Juego.palabrasParaJugar.add("ALCES");
		Juego.palabrasParaJugar.add("BAJAR");
		Juego.palabrasParaJugar.add("COMER");
		Juego.palabrasParaJugar.add("GATOS");
		Juego.palabrasParaJugar.add("LISAS");
		Juego.palabrasParaJugar.add("MARTE");
		Juego.palabrasParaJugar.add("AMARE");
		Juego.palabrasParaJugar.add("REMAR");
		Juego.palabrasParaJugar.add("OPTAR");
		Juego.palabrasParaJugar.add("RATOS");
		Juego.palabrasParaJugar.add("CASAS");
		Juego.palabrasParaJugar.add("SACOS");
		Juego.palabrasParaJugar.add("LASER");
		Juego.palabrasParaJugar.add("TRIPA");
		Juego.palabrasParaJugar.add("PARIR");
		Juego.palabrasParaJugar.add("COMEN");
		Juego.palabrasParaJugar.add("COLAS");
		Juego.palabrasParaJugar.add("ASEAR");
		Juego.palabrasParaJugar.add("PINTA");
		Juego.palabrasParaJugar.add("ARPAS");
		Juego.palabrasParaJugar.add("RUTAS");
		Juego.palabrasParaJugar.add("MANDO");
		Juego.palabrasParaJugar.add("BOTON");
		Juego.palabrasParaJugar.add("TIZAS");
		Juego.palabrasParaJugar.add("PISAR");
		Juego.palabrasParaJugar.add("GUISO");
		Juego.palabrasParaJugar.add("SOBRE");
		Juego.palabrasParaJugar.add("RESTO");
		Juego.palabrasParaJugar.add("SUMAR");
		Juego.palabrasParaJugar.add("PALAS");
		Juego.palabrasParaJugar.add("SALES");
		Juego.palabrasParaJugar.add("ESTAR");
		Juego.palabrasParaJugar.add("MIMAR");
		Juego.palabrasParaJugar.add("RIMAR");
		Juego.palabrasParaJugar.add("MARES");
		Juego.palabrasParaJugar.add("SOLOS");
		Juego.palabrasParaJugar.add("LOCOS");
		Juego.palabrasParaJugar.add("CALOR");
		Juego.palabrasParaJugar.add("FRIOS");
		Juego.palabrasParaJugar.add("HUELE");
		Juego.palabrasParaJugar.add("DUELE");
		Juego.palabrasParaJugar.add("PUEDE");
		Juego.palabrasParaJugar.add("GRASA");
		Juego.palabrasParaJugar.add("MUGRE");
		Juego.palabrasParaJugar.add("RESTO");
		Juego.palabrasParaJugar.add("LUGAR");
		Juego.palabrasParaJugar.add("GARRA");
		Juego.palabrasParaJugar.add("CARIE");
		Juego.palabrasParaJugar.add("TROTA");
		Juego.palabrasParaJugar.add("MIRAN");
		Juego.palabrasParaJugar.add("TRIZA");
		Juego.palabrasParaJugar.add("TRINA");
		Juego.palabrasParaJugar.add("POBRE");
		Juego.palabrasParaJugar.add("BREAS");
		Juego.palabrasParaJugar.add("FOTOS");
		Juego.palabrasParaJugar.add("GRUAS");
		Juego.palabrasParaJugar.add("COLES");
		Juego.palabrasParaJugar.add("SOLES");
		Juego.palabrasParaJugar.add("PISAR");
		Juego.palabrasParaJugar.add("RISAR");
		Juego.palabrasParaJugar.add("ANTES");
		Juego.palabrasParaJugar.add("PALTA");
		Juego.palabrasParaJugar.add("LATAS");
		Juego.palabrasParaJugar.add("TASAS");
		Juego.palabrasParaJugar.add("SANAN");
		Juego.palabrasParaJugar.add("NADAN");
		Juego.palabrasParaJugar.add("DONAS");
		Juego.palabrasParaJugar.add("NANAS");
		Juego.palabrasParaJugar.add("PASTA");
		Juego.palabrasParaJugar.add("CAQUI");
		Juego.palabrasParaJugar.add("RICOS");
		Juego.palabrasParaJugar.add("PLATA");
		Juego.palabrasParaJugar.add("MOROS");
		Juego.palabrasParaJugar.add("ARREA");
		Juego.palabrasParaJugar.add("ARENA");
		Juego.palabrasParaJugar.add("POSAN");
		Juego.palabrasParaJugar.add("MOZOS");
		Juego.palabrasParaJugar.add("COSAS");
		Juego.palabrasParaJugar.add("LETRA");
		Juego.palabrasParaJugar.add("TRAEN");
		Juego.palabrasParaJugar.add("PIBES");
		Juego.palabrasParaJugar.add("BESOS");
		Juego.palabrasParaJugar.add("LONAS");
		Juego.palabrasParaJugar.add("LIMBO");
		Juego.palabrasParaJugar.add("OLERA");
		Juego.palabrasParaJugar.add("RAMEN");
		Juego.palabrasParaJugar.add("MENSO");
		Juego.palabrasParaJugar.add("SERES");
		Juego.palabrasParaJugar.add("CUNAS");
		Juego.palabrasParaJugar.add("BEBES");
		Juego.palabrasParaJugar.add("BEBAS");
		Juego.palabrasParaJugar.add("NENES");
		Juego.palabrasParaJugar.add("NENAS");
		Juego.palabrasParaJugar.add("FUNAR");
		Juego.palabrasParaJugar.add("RUNAS");
		Juego.palabrasParaJugar.add("HASTA");
		Juego.palabrasParaJugar.add("NUNCA");
	}

	public static void agregarPalabrasIngles() {
		Juego.palabrasParaJugarIngles.add("APPLE");
		Juego.palabrasParaJugarIngles.add("ARROW");
		Juego.palabrasParaJugarIngles.add("BOXES");
		Juego.palabrasParaJugarIngles.add("CARDS");
		Juego.palabrasParaJugarIngles.add("BEERS");
		Juego.palabrasParaJugarIngles.add("HORSE");
		Juego.palabrasParaJugarIngles.add("JAPAN");
		Juego.palabrasParaJugarIngles.add("KINGS");
		Juego.palabrasParaJugarIngles.add("RAINS");
		Juego.palabrasParaJugarIngles.add("SLEEP");
		Juego.palabrasParaJugarIngles.add("SPACE");
		Juego.palabrasParaJugarIngles.add("FLAGS");
		Juego.palabrasParaJugarIngles.add("MAINE");
		Juego.palabrasParaJugarIngles.add("MINES");
		Juego.palabrasParaJugarIngles.add("MINTS");
		Juego.palabrasParaJugarIngles.add("MODES");
		Juego.palabrasParaJugarIngles.add("MONTH");
		Juego.palabrasParaJugarIngles.add("MOUTH");
		Juego.palabrasParaJugarIngles.add("MOVED");
		Juego.palabrasParaJugarIngles.add("MOVES");
		Juego.palabrasParaJugarIngles.add("NAKED");
		Juego.palabrasParaJugarIngles.add("NAMES");
		Juego.palabrasParaJugarIngles.add("NECKS");
		Juego.palabrasParaJugarIngles.add("NIECE");
		Juego.palabrasParaJugarIngles.add("ORDER");
		Juego.palabrasParaJugarIngles.add("OWNED");
		Juego.palabrasParaJugarIngles.add("OWNER");
		Juego.palabrasParaJugarIngles.add("PALMS");
		Juego.palabrasParaJugarIngles.add("PARTY");
		Juego.palabrasParaJugarIngles.add("PANTS");
		Juego.palabrasParaJugarIngles.add("PAWNS");
		Juego.palabrasParaJugarIngles.add("PHONE");
		Juego.palabrasParaJugarIngles.add("PLANT");
		Juego.palabrasParaJugarIngles.add("PLAYS");
		Juego.palabrasParaJugarIngles.add("PORTS");
		Juego.palabrasParaJugarIngles.add("POSES");
	}

	public static void agregarPalabrasAleman() {
		Juego.palabrasParaJugarAleman.add("HUNDE");
		Juego.palabrasParaJugarAleman.add("RUNEN");
		Juego.palabrasParaJugarAleman.add("KÜSSE");
		Juego.palabrasParaJugarAleman.add("BABYS");
		Juego.palabrasParaJugarAleman.add("PFERD");
		Juego.palabrasParaJugarAleman.add("ENTEN");
		Juego.palabrasParaJugarAleman.add("KATZE");
		Juego.palabrasParaJugarAleman.add("VASEN");
		Juego.palabrasParaJugarAleman.add("NICHT");
		Juego.palabrasParaJugarAleman.add("KLAUE");
		Juego.palabrasParaJugarAleman.add("SAGEN");
		Juego.palabrasParaJugarAleman.add("IMMER");
		Juego.palabrasParaJugarAleman.add("GEHEN");
		Juego.palabrasParaJugarAleman.add("SEHEN");
		Juego.palabrasParaJugarAleman.add("DAMIT");
		Juego.palabrasParaJugarAleman.add("UNSER");
		Juego.palabrasParaJugarAleman.add("EINER");
		Juego.palabrasParaJugarAleman.add("EINEM");
		Juego.palabrasParaJugarAleman.add("HABEN");
		Juego.palabrasParaJugarAleman.add("DURCH");
		Juego.palabrasParaJugarAleman.add("WÜRDE");
		Juego.palabrasParaJugarAleman.add("HATTE");
		Juego.palabrasParaJugarAleman.add("GEGEN");
		Juego.palabrasParaJugarAleman.add("SCHON");
		Juego.palabrasParaJugarAleman.add("SEINE");
		Juego.palabrasParaJugarAleman.add("DIESE");
		Juego.palabrasParaJugarAleman.add("WAREN");
		Juego.palabrasParaJugarAleman.add("HEUTE");
		Juego.palabrasParaJugarAleman.add("ALLES");
		Juego.palabrasParaJugarAleman.add("IHREM");
		Juego.palabrasParaJugarAleman.add("IHNEN");
		Juego.palabrasParaJugarAleman.add("SOGAR");
		Juego.palabrasParaJugarAleman.add("FRAGE");
	}

	public static void seleccionarPalabraAleatoria() {
		int cantidadPalabrasAlmacenadas = Juego.palabrasParaJugar.size();
		int indice = (int) (Math.random() * cantidadPalabrasAlmacenadas);
		Juego.palabraElegida = Juego.palabrasParaJugar.get(indice).toUpperCase();
	}

	public static void seleccionarPalabraAleatoriaIngles() {
		int cantidadPalabrasAlmacenadas = Juego.palabrasParaJugarIngles.size();
		int indice = (int) (Math.random() * cantidadPalabrasAlmacenadas);
		Juego.palabraElegida = Juego.palabrasParaJugarIngles.get(indice).toUpperCase();
	}

	public static void seleccionarPalabraAleatoriaAleman() {
		int cantidadPalabrasAlmacenadas = Juego.palabrasParaJugarAleman.size();
		int indice = (int) (Math.random() * cantidadPalabrasAlmacenadas);
		Juego.palabraElegida = Juego.palabrasParaJugarAleman.get(indice).toUpperCase();
	}

	public static boolean esPalabraCorrecta(String palabra) {
		boolean esCorrecto;
		if (palabra.equals(Juego.palabraElegida)) {
			esCorrecto = true;
			Juego.juegoTerminado = true;
		} else {
			esCorrecto = false;
		}
		return esCorrecto;
	}

	public static void setIndiceIdioma(int indice) {
		indiceIdioma = indice;
	}
}
