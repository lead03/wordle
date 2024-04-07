import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.SystemColor;
import java.awt.Font;

public class VentanaInicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio window = new VentanaInicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaInicio() {
		initialize();
	}

	public void visible() {
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 488, 279);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setToolTipText("Idioma");
		comboBox.setBounds(231, 86, 123, 29);
		frame.getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Idioma", "Español", "Inglés", "Alemán" }));

		JButton ComenzarJuego = new JButton("Jugar!");
		ComenzarJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = comboBox.getSelectedIndex();
				Juego.setIndiceIdioma(indice);
				if (Juego.indiceIdioma == 0) {
					JOptionPane.showMessageDialog(frame, "Debe elegir un idioma y guardar cambios");
				} else if (Juego.indiceIdioma > 0) {
					Interfaz inicio = new Interfaz();
					inicio.Visible();
					frame.setVisible(false);
				}
			}
		});

		ComenzarJuego.setBounds(179, 185, 123, 29);
		frame.getContentPane().add(ComenzarJuego);

		JLabel lblNewLabel = new JLabel("Seleccione idioma");
		lblNewLabel.setBounds(114, 89, 107, 23);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Bienvenido al juego!");
		lblNewLabel_1.setFont(new Font("Parchment", Font.PLAIN, 53));
		lblNewLabel_1.setBounds(121, 11, 239, 49);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
