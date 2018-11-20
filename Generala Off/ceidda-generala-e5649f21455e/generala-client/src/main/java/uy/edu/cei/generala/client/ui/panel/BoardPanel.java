package uy.edu.cei.generala.client.ui.panel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;

public class BoardPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardPanel window = new BoardPanel();
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
	public BoardPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JTextArea txtrSeleccioneLaJugada = new JTextArea();
		springLayout.putConstraint(SpringLayout.NORTH, txtrSeleccioneLaJugada, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, txtrSeleccioneLaJugada, 10, SpringLayout.WEST, frame.getContentPane());
		txtrSeleccioneLaJugada.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		txtrSeleccioneLaJugada.setForeground(Color.WHITE);
		txtrSeleccioneLaJugada.setBackground(Color.RED);
		txtrSeleccioneLaJugada.setText("Seleccione la jugada deseada");
		frame.getContentPane().add(txtrSeleccioneLaJugada);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Par");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 6, SpringLayout.SOUTH, txtrSeleccioneLaJugada);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 0, SpringLayout.WEST, txtrSeleccioneLaJugada);
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTro = new JRadioButton("Trío");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnTro, 6, SpringLayout.SOUTH, rdbtnNewRadioButton);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnTro, 0, SpringLayout.WEST, txtrSeleccioneLaJugada);
		rdbtnTro.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnTro);
		
		JRadioButton rdbtnPoker = new JRadioButton("Póker");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnPoker, 6, SpringLayout.SOUTH, rdbtnTro);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnPoker, 0, SpringLayout.WEST, txtrSeleccioneLaJugada);
		rdbtnPoker.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnPoker);
		
		JRadioButton rdbtnFull = new JRadioButton("Full");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnFull, 6, SpringLayout.SOUTH, rdbtnPoker);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnFull, 0, SpringLayout.WEST, txtrSeleccioneLaJugada);
		rdbtnFull.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnFull);
		
		JRadioButton rdbtnEscaleraCorta = new JRadioButton("Escalera corta");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnEscaleraCorta, 6, SpringLayout.SOUTH, rdbtnFull);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnEscaleraCorta, 0, SpringLayout.WEST, txtrSeleccioneLaJugada);
		rdbtnEscaleraCorta.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnEscaleraCorta);
		
		JRadioButton rdbtnEscaleraLarga = new JRadioButton("Escalera larga");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnEscaleraLarga, 6, SpringLayout.SOUTH, rdbtnEscaleraCorta);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnEscaleraLarga, 0, SpringLayout.WEST, txtrSeleccioneLaJugada);
		rdbtnEscaleraLarga.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnEscaleraLarga);
		
		JRadioButton rdbtnGenerala = new JRadioButton("Generala");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnGenerala, 6, SpringLayout.SOUTH, rdbtnEscaleraLarga);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnGenerala, 0, SpringLayout.WEST, txtrSeleccioneLaJugada);
		rdbtnGenerala.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnGenerala);
		
		JRadioButton rdbtnComodn = new JRadioButton("Comodín");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnComodn, 6, SpringLayout.SOUTH, txtrSeleccioneLaJugada);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnComodn, 76, SpringLayout.EAST, rdbtnNewRadioButton);
		rdbtnComodn.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnComodn);
		
		JRadioButton rdbtnSumaDe = new JRadioButton("Suma de 1");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnSumaDe, 0, SpringLayout.WEST, rdbtnComodn);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnSumaDe, 0, SpringLayout.SOUTH, rdbtnTro);
		rdbtnSumaDe.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnSumaDe);
		
		JRadioButton rdbtnSumaDe_1 = new JRadioButton("Suma de 2");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnSumaDe_1, 0, SpringLayout.WEST, rdbtnComodn);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnSumaDe_1, 0, SpringLayout.SOUTH, rdbtnPoker);
		rdbtnSumaDe_1.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnSumaDe_1);
		
		JRadioButton rdbtnSumaDe_2 = new JRadioButton("Suma de 3");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnSumaDe_2, 0, SpringLayout.WEST, rdbtnComodn);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnSumaDe_2, 0, SpringLayout.SOUTH, rdbtnFull);
		rdbtnSumaDe_2.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnSumaDe_2);
		
		JRadioButton rdbtnSumaDe_3 = new JRadioButton("Suma de 4");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnSumaDe_3, 0, SpringLayout.WEST, rdbtnComodn);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnSumaDe_3, 0, SpringLayout.SOUTH, rdbtnEscaleraCorta);
		rdbtnSumaDe_3.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnSumaDe_3);
		
		JRadioButton rdbtnSumaDe_4 = new JRadioButton("Suma de 5");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnSumaDe_4, 0, SpringLayout.WEST, rdbtnComodn);
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnSumaDe_4, 0, SpringLayout.SOUTH, rdbtnEscaleraLarga);
		rdbtnSumaDe_4.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnSumaDe_4);
		
		JRadioButton rdbtnSumaDe_5 = new JRadioButton("Suma de 6");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnSumaDe_5, 0, SpringLayout.NORTH, rdbtnGenerala);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnSumaDe_5, 0, SpringLayout.WEST, rdbtnComodn);
		rdbtnSumaDe_5.setBackground(Color.WHITE);
		frame.getContentPane().add(rdbtnSumaDe_5);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBackground(Color.GREEN);
		springLayout.putConstraint(SpringLayout.NORTH, btnConfirmar, 0, SpringLayout.NORTH, rdbtnGenerala);
		springLayout.putConstraint(SpringLayout.WEST, btnConfirmar, 117, SpringLayout.EAST, rdbtnSumaDe_5);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnPasar = new JButton("Pasar");
		btnPasar.setBackground(UIManager.getColor("ToolBar.dockingForeground"));
		btnPasar.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		springLayout.putConstraint(SpringLayout.EAST, btnPasar, -121, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnPasar, 0, SpringLayout.NORTH, rdbtnGenerala);
		frame.getContentPane().add(btnPasar);
		
		JLabel lblNewLabel = new JLabel("Label con info de la jugada");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -48, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setBackground(Color.YELLOW);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblL = new JLabel("Label con info para el jugador");
		springLayout.putConstraint(SpringLayout.NORTH, lblL, 4, SpringLayout.NORTH, rdbtnEscaleraLarga);
		springLayout.putConstraint(SpringLayout.EAST, lblL, 0, SpringLayout.EAST, btnConfirmar);
		frame.getContentPane().add(lblL);
		
		JLabel lblNewLabel_1 = new JLabel("Label para timer");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 18, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, txtrSeleccioneLaJugada);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel_1);
	}
}
