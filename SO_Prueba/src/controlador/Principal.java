package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.MatteBorder;


import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {

this.setLocationRelativeTo(null);
this.setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1480, 851);
contentPane = new JPanel();
contentPane.setBackground(Color.WHITE);
contentPane.setBorder(new EmptyBorder(2, 2, 2, 0));
setContentPane(contentPane);
contentPane.setLayout(null);
JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setForeground(Color.CYAN);
tabbedPane.setBackground(Color.BLACK);
tabbedPane.setFont(new Font("Times New Roman", Font.BOLD, 20));
tabbedPane.setBounds(0, 0, 1464, 812);
contentPane.add(tabbedPane);
JPanel panel_Proceso = new JPanel();
panel_Proceso.setBackground(Color.BLACK);
tabbedPane.addTab("PROCESO", null, panel_Proceso, null);
panel_Proceso.setLayout(null);
JMenuBar menuBar_1 = new JMenuBar();
menuBar_1.setBorder(new MatteBorder(2, 2, 2, 0, (Color) new Color(0, 255, 255)));
menuBar_1.setBackground(Color.BLACK);
menuBar_1.setBounds(0, 0, 41, 47);
panel_Proceso.add(menuBar_1);
JMenu mnNewMenu_1 = new JMenu("");
mnNewMenu_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/list_32x32.png")));
mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
mnNewMenu_1.setBackground(Color.BLACK);
menuBar_1.add(mnNewMenu_1);
JMenuItem mntmNewMenuItem_1 = new JMenuItem("Importar");
mntmNewMenuItem_1.addActionListener(new ActionListener() {
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
				int Tiempo_Llegada = Integer.parseInt(parts[0]); 
				int Preoridad = Integer.parseInt(parts[1]);
				int Tiempo_Procesador = Integer.parseInt(parts[2]);
				int Mbytes = Integer.parseInt(parts[3]);
				int Cantidad_Impresoras = Integer.parseInt(parts[4]);
				int Cantidad_Escaneres = Integer.parseInt(parts[5]);
				int Cantidad_Modens = Integer.parseInt(parts[6]);
				int Cantidad_CDs = Integer.parseInt(parts[7]);

			}
		} catch (Exception e) {
		
		}
		
	}
});
mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/import_32x32.png")));
mntmNewMenuItem_1.setForeground(Color.CYAN);
mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
mntmNewMenuItem_1.setBackground(Color.BLACK);
mnNewMenu_1.add(mntmNewMenuItem_1);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/background_3.png")));
lblNewLabel.setBounds(39, -11, 1420, 58);
panel_Proceso.add(lblNewLabel);
table = new JTable();
table.setBounds(26, 79, 1, 1);
panel_Proceso.add(table);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(10, 58, 1439, 705);
panel_Proceso.add(scrollPane);
table_1 = new JTable();
table_1.setEnabled(false);
table_1.setBackground(Color.BLACK);
table_1.setForeground(Color.CYAN);
table_1.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
		"Id Proceso", "Estatus", "T_Llegada", "Prioridad Inic", "Prioridad act", "T_P_Requerido", "T_P_Restante", "M_Requerida", "Ubi_Memoria", "Impreso_Solicitadas", "Impreso_Asignadas", "Escan_Solicitado", "Escan_Asignado", "Modem_Solicitado", "Moden_Asignado", "CDs_Solicitados", "CDs_Asignados"
	}
));
table_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
scrollPane.setViewportView(table_1);
JPanel panel_memoria = new JPanel();
tabbedPane.addTab("MEMORIA", null, panel_memoria, null);
panel_memoria.setLayout(null);
JLabel Espacio_Memroia_1 = new JLabel("");
Espacio_Memroia_1.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_1.setForeground(Color.CYAN);
Espacio_Memroia_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_1.setBounds(92, 130, 63, 39);
panel_memoria.add(Espacio_Memroia_1);
JLabel Espacio_Memroia_5 = new JLabel("");
Espacio_Memroia_5.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_5.setForeground(Color.CYAN);
Espacio_Memroia_5.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_5.setBounds(92, 191, 63, 39);
panel_memoria.add(Espacio_Memroia_5);
JLabel Espacio_Memroia_4 = new JLabel("");
Espacio_Memroia_4.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_4.setForeground(Color.CYAN);
Espacio_Memroia_4.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_4.setBounds(29, 191, 63, 39);
panel_memoria.add(Espacio_Memroia_4);
JLabel Espacio_Memroia_3 = new JLabel("");
Espacio_Memroia_3.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_3.setForeground(Color.CYAN);
Espacio_Memroia_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_3.setBounds(215, 130, 63, 39);
panel_memoria.add(Espacio_Memroia_3);
JLabel Espacio_Memroia_2 = new JLabel("");
Espacio_Memroia_2.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_2.setForeground(Color.CYAN);
Espacio_Memroia_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_2.setBounds(154, 130, 63, 39);
panel_memoria.add(Espacio_Memroia_2);
JLabel Espacio_Memroia_6 = new JLabel("");
Espacio_Memroia_6.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_6.setForeground(Color.CYAN);
Espacio_Memroia_6.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_6.setBounds(154, 191, 63, 39);
panel_memoria.add(Espacio_Memroia_6);
JLabel Espacio_Memroia_9 = new JLabel("");
Espacio_Memroia_9.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_9.setForeground(Color.CYAN);
Espacio_Memroia_9.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_9.setBounds(92, 254, 63, 39);
panel_memoria.add(Espacio_Memroia_9);
JLabel Espacio_Memroia_11 = new JLabel("");
Espacio_Memroia_11.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_11.setForeground(Color.CYAN);
Espacio_Memroia_11.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_11.setBounds(215, 254, 63, 39);
panel_memoria.add(Espacio_Memroia_11);
JLabel Espacio_Memroia_10 = new JLabel("");
Espacio_Memroia_10.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_10.setForeground(Color.CYAN);
Espacio_Memroia_10.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_10.setBounds(154, 254, 63, 39);
panel_memoria.add(Espacio_Memroia_10);
JLabel Espacio_Memroia_7 = new JLabel("");
Espacio_Memroia_7.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_7.setForeground(Color.CYAN);
Espacio_Memroia_7.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_7.setBounds(215, 191, 63, 39);
panel_memoria.add(Espacio_Memroia_7);
JLabel Espacio_Memroia_8 = new JLabel("");
Espacio_Memroia_8.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_8.setForeground(Color.CYAN);
Espacio_Memroia_8.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_8.setBounds(29, 254, 63, 39);
panel_memoria.add(Espacio_Memroia_8);
JLabel Espacio_Memroia_12 = new JLabel("");
Espacio_Memroia_12.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_12.setForeground(Color.CYAN);
Espacio_Memroia_12.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_12.setBounds(29, 319, 63, 39);
panel_memoria.add(Espacio_Memroia_12);
JLabel Espacio_Memroia_14 = new JLabel("");
Espacio_Memroia_14.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_14.setForeground(Color.CYAN);
Espacio_Memroia_14.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_14.setBounds(154, 319, 63, 39);
panel_memoria.add(Espacio_Memroia_14);
JLabel Espacio_Memroia_15 = new JLabel("");
Espacio_Memroia_15.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_15.setForeground(Color.CYAN);
Espacio_Memroia_15.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_15.setBounds(215, 319, 63, 39);
panel_memoria.add(Espacio_Memroia_15);
JLabel Espacio_Memroia_13 = new JLabel("");
Espacio_Memroia_13.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_13.setForeground(Color.CYAN);
Espacio_Memroia_13.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_13.setBounds(92, 319, 63, 39);
panel_memoria.add(Espacio_Memroia_13);
JLabel Espacio_Memroia_0 = new JLabel("");
Espacio_Memroia_0.setHorizontalAlignment(SwingConstants.CENTER);
Espacio_Memroia_0.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
Espacio_Memroia_0.setForeground(Color.CYAN);
Espacio_Memroia_0.setFont(new Font("Times New Roman", Font.BOLD, 30));
Espacio_Memroia_0.setBounds(29, 130, 63, 39);
panel_memoria.add(Espacio_Memroia_0);
JLabel lblNewLabel_4_3_1_1 = new JLabel("4");
lblNewLabel_4_3_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1.setBounds(29, 166, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1);
JLabel lblNewLabel_4_3_1_1_1 = new JLabel("5");
lblNewLabel_4_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1.setBounds(92, 166, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1 = new JLabel("6");
lblNewLabel_4_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1.setBounds(154, 166, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1 = new JLabel("7");
lblNewLabel_4_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1.setBounds(215, 166, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1 = new JLabel("9");
lblNewLabel_4_3_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1.setBounds(92, 229, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1 = new JLabel("8");
lblNewLabel_4_3_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1.setBounds(29, 229, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1 = new JLabel("10");
lblNewLabel_4_3_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1.setBounds(154, 229, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1 = new JLabel("11");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1.setBounds(215, 229, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1 = new JLabel("12");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1.setBounds(29, 293, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("13");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1.setBounds(92, 293, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("14");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(154, 293, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("15");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(215, 293, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("3");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(215, 104, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("2");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(154, 104, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("1");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(92, 104, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("0");
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.CYAN);
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(29, 104, 63, 27);
panel_memoria.add(lblNewLabel_4_3_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/background_2.jpg")));
lblNewLabel_1.setBounds(0, 0, 1459, 774);
panel_memoria.add(lblNewLabel_1);
JPanel panel_grafico = new JPanel();
tabbedPane.addTab("GRAFICO", null, panel_grafico, null);

panel = new JPanel();
panel.setBounds(0, 0, 1464, 47);
contentPane.add(panel);
panel.setLayout(null);

JLabel lblNewLabel_2 = new JLabel("Procesos");
lblNewLabel_2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/background_3.png")));
lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_2.setForeground(Color.CYAN);
lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
lblNewLabel_2.setBounds(0, 0, 1464, 209);
panel.add(lblNewLabel_2);
	}
}
