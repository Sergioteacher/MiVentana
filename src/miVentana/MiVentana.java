package miVentana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;

/**
 * Clase única de todo el programa
 * @author Sergio Teacher
 *
 */
public class MiVentana {

	private JFrame MiFrame;

	/**
	 * Método que inicia el programa
	 * @param args - Valores iniciales tipo String.
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
		MiBoton.addActionListener(new ActionListener() {
			/**
			 * Controlando el evento mediante
			 * una clase anónima.
			 * @param args - tipo  "ActionEvent"
			 */
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("He pulsado el botón");
			}
		});
		
	}

}

class manejadorVentana implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

class manejadorCompomentes implements ComponentListener {

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}