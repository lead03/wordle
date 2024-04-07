import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Interfaz {

	private JFrame frame;
	private JLabel mensajeFinalGanaste;
	private JLabel mensajeFinalPerdiste;
	private JButton verificadorBoton;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 * Create the application.
	 * 
	 */
	public Interfaz() {
		initialize();
	}

	public void Visible() {
		frame.setVisible(true);
	}

	private void deshabilitarOcultarFilasSiguientes(int indiceFilaActual, JTextField[][] caja) {
		for (int indiceFila = indiceFilaActual + 1; indiceFila < Juego.cantidadFilas; indiceFila++) {
			for (JTextField campo : caja[indiceFila]) {
				campo.setEnabled(false);
				campo.setVisible(false);
			}
		}
	}

	private void habilitarFilaActual(int indiceFilaActual, JTextField[][] caja) {
		for (JTextField campo : caja[indiceFilaActual]) {
			campo.setEnabled(true);
			campo.setVisible(true);
		}
	}

	private void deshabilitarFilaActual(int indiceFilaActual, JTextField[][] caja) {
		for (JTextField campo : caja[indiceFilaActual]) {
			campo.setEnabled(false);
			campo.setVisible(true);
		}
	}

	private void deshabilitarMostrarFilasAnteriores(int indiceFilaActual, JTextField[][] caja) {
		for (int indiceFila = 0; indiceFila < indiceFilaActual; indiceFila++) {
			for (JTextField campo : caja[indiceFila]) {
				campo.setEnabled(false);
				campo.setVisible(true);
			}
		}
	}

	private void pintarLetraCorrecta(ArrayList<Integer> indicesLetras, int indiceFila, JTextField[][] caja) {
		for (int indice : indicesLetras) {
			caja[indiceFila][indice].setBackground(Color.green);
		}
	}

	private void pintarLetraPosicionIncorrecta(ArrayList<Integer> indicesLetras, int indiceFila, JTextField[][] caja) {
		for (int indice : indicesLetras) {
			caja[indiceFila][indice].setBackground(Color.yellow);
		}
	}

	private void accionesParaGanaste(int indiceFila, JTextField[][] caja) {
		deshabilitarFilaActual(indiceFila, caja);
		for (JTextField campo : caja[indiceFila]) {
			campo.setBackground(Color.green);
		}
		mensajeFinalGanaste.setVisible(true);
		verificadorBoton.setText("Jugar de nuevo");
	}

	private void accionesParaPerdiste(int indiceFila, JTextField[][] caja) {
		deshabilitarFilaActual(indiceFila, caja);
		mensajeFinalPerdiste.setVisible(true);
		verificadorBoton.setText("Jugar de nuevo");
	}

	/**
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */
	private void initialize() {
		switch (Juego.indiceIdioma) {
		case 1:
		default:
			Juego.agregarPalabras();
			Juego.seleccionarPalabraAleatoria();
			break;
		case 2:
			Juego.agregarPalabrasIngles();
			Juego.seleccionarPalabraAleatoriaIngles();
			break;
		case 3:
			Juego.agregarPalabrasAleman();
			Juego.seleccionarPalabraAleatoriaAleman();
			break;
		}
		System.out.print(Juego.palabraElegida);

		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.setBounds(100, 100, 395, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel titulo = new JLabel("Wordle!");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(86, 11, 217, 90);
		titulo.setFont(new Font("Parchment", Font.PLAIN, 80));
		frame.getContentPane().add(titulo);
		mensajeFinalGanaste = new JLabel("GANASTE!");
		mensajeFinalGanaste.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeFinalGanaste.setBounds(86, 400, 217, 37);
		mensajeFinalGanaste.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		mensajeFinalGanaste.setForeground(new Color(0, 128, 64));
		mensajeFinalGanaste.setVisible(false);
		frame.getContentPane().add(mensajeFinalGanaste);

		mensajeFinalPerdiste = new JLabel("Has perdido... La palabra era " + Juego.palabraElegida);
		mensajeFinalPerdiste.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeFinalPerdiste.setBounds(10, 400, 369, 37);
		mensajeFinalPerdiste.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		mensajeFinalPerdiste.setForeground(new Color(83, 0, 0));
		mensajeFinalPerdiste.setVisible(false);
		frame.getContentPane().add(mensajeFinalPerdiste);

		JTextField[][] caja = new JTextField[Juego.cantidadFilas][Juego.cantidadColumnas];
		int cantidadDeFilas = caja.length;
		int cantidadDeColumnas = caja[0].length;
		int posicionY = 110;
		for (int fila = 0; fila < cantidadDeFilas; fila++) {
			int posicionX = 55;
			for (int col = 0; col < cantidadDeColumnas; col++) {
				caja[fila][col] = new JTextField();
				caja[fila][col].setBounds(posicionX, posicionY, 50, 50);
				caja[fila][col].setHorizontalAlignment(SwingConstants.CENTER);
				caja[fila][col].setFont(new Font("Tahoma", Font.PLAIN, 25));
				frame.getContentPane().add(caja[fila][col]);
				posicionX += 55;
				caja[fila][col].addKeyListener(new KeyAdapter() {

					@Override

					public void keyTyped(KeyEvent e) {
						char tempChar = Character.toUpperCase(e.getKeyChar());
						e.setKeyChar(tempChar);
						var elementoActual = e.getSource();
						((JTextField) elementoActual).setText("");
						((JTextField) elementoActual).transferFocus();
					}
				});
			}
			posicionY += 55;
		}

		deshabilitarOcultarFilasSiguientes(Juego.indice, caja);
		habilitarFilaActual(Juego.indice, caja);
		deshabilitarMostrarFilasAnteriores(Juego.indice, caja);

		verificadorBoton = new JButton("Prueba tu suerte");
		verificadorBoton.setBounds(43, 431, 307, 37);
		verificadorBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Juego.juegoTerminado) {
					Juego.indiceIdioma = 0;
					Juego.indice = 0;
					Juego.juegoTerminado = false;
					VentanaInicio ventanaInicial = new VentanaInicio();

					frame.setVisible(false);
					ventanaInicial.visible();
				} else {
					String palabraEscrita = "";
					for (JTextField campo : caja[Juego.indice]) {
						palabraEscrita += campo.getText();
					}
					boolean esCorrecto = Juego.esPalabraCorrecta(palabraEscrita);
					if (esCorrecto) {
						accionesParaGanaste(Juego.indice, caja);
					} else {
						Juego.detectarLetrasCorrectasEIncorrectas(palabraEscrita);
						pintarLetraCorrecta(Juego.indicesCorrectos, Juego.indice, caja);
						Juego.detectarLetrasPosicionIncorrecta(palabraEscrita);
						pintarLetraPosicionIncorrecta(Juego.indicesMalPosicion, Juego.indice, caja);
						Juego.subirIndice();
						deshabilitarOcultarFilasSiguientes(Juego.indice, caja);
						deshabilitarMostrarFilasAnteriores(Juego.indice, caja);
						if (Juego.juegoTerminado) {
							accionesParaPerdiste(Juego.indice, caja);

						} else {
							habilitarFilaActual(Juego.indice, caja);
							verificadorBoton.transferFocus();
						}
					}
				}
			}
		});
		frame.getContentPane().add(verificadorBoton);
	}
}
