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
	JButton MiBoton;
	JButton OtroBoton;

	/**
	 * Método que inicia el programa
	 * @param args - Valores iniciales tipo String.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("Inicio del programa");
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
		MiFrame.addWindowListener(new manejadorVentana());
		MiFrame.addComponentListener(new manejadorCompomentes());
		
		//MiBoton.addActionListener(new manejadorClicks());
		//OtroBoton.addActionListener(new manejadorClicks());
		
		manejadorClicks CClick = new manejadorClicks();
		MiBoton.addActionListener(CClick);
		OtroBoton.addActionListener(CClick);
		
		
		
		
		
		
		
		//manejadorVentana OidoVentana = manejadorVentana();
		//MiFrame.addWindowFocusListener(OidoVentana);
		//MiFrame.getSize();
		//if( MiFrame. == arg0.getSource()) {
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MiFrame = new JFrame();
		MiFrame.setTitle("Ventana Principal");
		MiFrame.setBounds(100, 100, 300, 160);
		MiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MiBoton = new JButton("Evento ...");
		MiBoton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		MiFrame.getContentPane().add(MiBoton, BorderLayout.CENTER);
		
		OtroBoton = new JButton("Otro evento ...");
		OtroBoton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		MiFrame.getContentPane().add(OtroBoton, BorderLayout.EAST);
		
		
//		MiBoton.addActionListener(new ActionListener() {
//			/**
//			 * Controlando el evento mediante
//			 * una clase anónima.
//			 * @param args - tipo  "ActionEvent"
//			 */
//			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("He pulsado el botón");
//			}
//		});
		
	}

}

/**
 * Clase para gestionar los eventos de la Ventana
 * @author Sergio Teacher
 *
 */
class manejadorVentana implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal Activada    (cambio de estado 1)");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal CERRADA");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Terminado la aplicación: ventana pricipal");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("La ventana pricipal Desactivada (cambio de estado 0)");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("De-iconizada la ventana pricipal");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Iconizada la ventana pricipal");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Abriendo ventana pricipal");
	}
	
}

/**
 * Clase para gestionar los eventos de forma de la Ventana
 * @author Sergio Teacher
 *
 */
class manejadorCompomentes implements ComponentListener {
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Me muevo ...");
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Se ha cambiado su tamaño");
		System.out.println( arg0.getComponent().getSize() );

	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
}

class manejadorClicks implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println( arg0.getActionCommand() );
		System.out.println("He pulsado el botón");
	}
	
	
	
	
	
}