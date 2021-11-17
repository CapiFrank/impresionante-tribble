package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Memoria extends JFrame {

	private JPanel contentPane;
	private JButton btnProceso;
	private JButton btnMemoria;
	private JButton btnGraficos;
	private JPanel panel;
	private JPanel panel_control;
	private JPanel panel_cambio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memoria frame = new Memoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Memoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1480, 851);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane jScrollPane1 = new JScrollPane();
		jScrollPane1.setBounds(269, 47, 1195, 765);
		jScrollPane1.setBorder(null);
		contentPane.add(jScrollPane1);
		panel_cambio = new JPanel();
		jScrollPane1.setViewportView(panel_cambio);
		panel_cambio.setLayout(null);

		panel_control = new JPanel();
		panel_control.setBounds(0, 47, 269, 765);
		contentPane.add(panel_control);
		panel_control.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/board_256x256.png")));
		lblNewLabel_1.setBounds(10, 408, 249, 334);
		panel_control.add(lblNewLabel_1);

		btnGraficos = new JButton("Graficos");
		btnGraficos.setForeground(Color.CYAN);
		btnGraficos.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnGraficos.setContentAreaFilled(false);
		btnGraficos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
		btnGraficos.setBounds(22, 254, 223, 65);
		panel_control.add(btnGraficos);

		btnMemoria = new JButton("Memoria");
		btnMemoria.setForeground(Color.CYAN);
		btnMemoria.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnMemoria.setContentAreaFilled(false);
		btnMemoria.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
		btnMemoria.setBounds(22, 158, 223, 65);
		panel_control.add(btnMemoria);

		btnProceso = new JButton("Procesos");
		btnProceso.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
		btnProceso.setContentAreaFilled(false);
		btnProceso.setForeground(Color.CYAN);
		btnProceso.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnProceso.setBounds(22, 63, 223, 65);
		panel_control.add(btnProceso);

		JLabel Bordes = new JLabel("");
		Bordes.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 255, 255)));
		Bordes.setBounds(10, 11, 249, 743);
		panel_control.add(Bordes);

		JLabel FondoPanel = new JLabel("");
		FondoPanel.setIcon(new ImageIcon("imagenes/background_3.png"));
		FondoPanel.setBounds(0, 0, 269, 765);
		panel_control.add(FondoPanel);

		panel = new JPanel();
		panel.setBounds(0, 0, 1464, 47);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Procesos");
		lblNewLabel_2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/background_3.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(44, 0, 1420, 47);
		panel.add(lblNewLabel_2);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new MatteBorder(2, 2, 2, 0, (Color) new Color(0, 255, 255)));
		menuBar.setBackground(Color.BLACK);
		menuBar.setBounds(0, 0, 41, 47);
		panel.add(menuBar);

		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setBackground(Color.BLACK);
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/list_32x32.png")));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Importar");
		mntmNewMenuItem.setForeground(Color.CYAN);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fc= new JFileChooser();
				fc.showOpenDialog(null);
				File archivo = fc.getSelectedFile();
				
				try {
					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);
					String linea = "";
					while (((linea=br.readLine())!=null)) {
						
						String[] parts = linea.split(",");
						int part1 = Integer.parseInt(parts[0]); 
						int part2 = Integer.parseInt(parts[1]);

					}
				} catch (Exception e) {
				
				}
				
			}
		});
		mntmNewMenuItem.setBackground(Color.BLACK);
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/import_32x32.png")));
		mnNewMenu.add(mntmNewMenuItem);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.CYAN));
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/background_3.png")));
		lblNewLabel.setBounds(0, 0, 1464, 47);
		panel.add(lblNewLabel);		
	}

}
