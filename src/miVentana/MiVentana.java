package miVentana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;

public class MiVentana {

	private JFrame MiFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana window = new MiVentana();
					window.MiFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MiFrame = new JFrame();
		MiFrame.setTitle("Ventana Principal");
		MiFrame.setBounds(100, 100, 300, 160);
		MiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton MiBoton = new JButton("Evento ...");
		MiBoton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MiFrame.getContentPane().add(MiBoton, BorderLayout.CENTER);
	}

}
