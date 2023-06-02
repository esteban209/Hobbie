package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import metodos.metodosOrdenamiento;
import utilidades.Pelicula;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.TextListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal1 extends JFrame {

	private JPanel contentPane;
	private JTextField textGenero;
	private JTextField textAño;
	private JTextField textNombre;
	Pelicula peli = new Pelicula();
	metodosOrdenamiento metodos = new metodosOrdenamiento();
	private JTable table;
	DefaultTableModel model= new DefaultTableModel();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal1 frame = new Principal1();
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
	public Principal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textGenero = new JTextField();
		textGenero.setBounds(129, 37, 86, 20);
		contentPane.add(textGenero);
		textGenero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Genero");
		lblNewLabel.setBounds(16, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAoDeEstreno = new JLabel("Año de estreno");
		lblAoDeEstreno.setBounds(16, 80, 144, 14);
		contentPane.add(lblAoDeEstreno);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(16, 126, 46, 14);
		contentPane.add(lblNombre);
		
		textAño = new JTextField();
		textAño.setColumns(10);
		textAño.setBounds(129, 77, 86, 20);
		contentPane.add(textAño);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(129, 123, 86, 20);
		contentPane.add(textNombre);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				agregarDatos();
			}
		});
		btnAgregar.setBounds(38, 151, 89, 23);
		contentPane.add(btnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(228, 37, 420, 110);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Peliculas"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(345, 238, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("Lista de peliculas");
		lblNewLabel_1.setBounds(175, 12, 116, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnbBuble = new JButton("BUBBLE");
		btnbBuble.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showInputDialog("Ordenadiendo bublesort");
				metodos.ordenaBubbleSortArray(metodos.lista);
				 Object[] fila={
							metodos.lista
						};
					model.addRow(fila);
					((DefaultTableModel) table.getModel()).addRow(fila);
					System.out.println(metodos.lista);
			}
		});
		btnbBuble.setBounds(181, 170, 89, 23);
		contentPane.add(btnbBuble);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showInputDialog("Ordenadiendo insertsort");
				metodos.ordenaInsertSortArray(metodos.lista);
				 Object[] fila={
							metodos.lista
						};
					model.addRow(fila);
					((DefaultTableModel) table.getModel()).addRow(fila);
					System.out.println(metodos.lista);
			}
		});
		btnInsert.setBounds(282, 170, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnQuick = new JButton("QUICK");
		btnQuick.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showInputDialog("Ordenadiendo quicksort");
				metodos.quicksort(metodos.lista,0,0);
				Object[] fila={
						metodos.lista
					};
				model.addRow(fila);
				((DefaultTableModel) table.getModel()).addRow(fila);
				System.out.println(metodos.lista);
			}
		});
		btnQuick.setBounds(394, 170, 89, 23);
		contentPane.add(btnQuick);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo de ordenamientos");
		lblNewLabel_1_1.setBounds(32, 192, 150, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("bubble arr");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showInputDialog("Ordenadiendo bublesort");
				metodos.ordenaBubbleSortArray(metodos.año);
				 Object[] fila={
							metodos.año
						};
					model.addRow(fila);
					((DefaultTableModel) table.getModel()).addRow(fila);
					System.out.println(metodos.año);
			}
		});
		btnNewButton.setBounds(181, 204, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("insert arr");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				metodos.ordenaBubbleSortArray(metodos.año);
				 Object[] fila={
							metodos.año
						};
					model.addRow(fila);
					((DefaultTableModel) table.getModel()).addRow(fila);
					System.out.println(metodos.año);
			}
		});
		btnNewButton_1.setBounds(282, 204, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("quick arr");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showInputDialog("Ordenadiendo quicksort");
				metodos.quickSort(metodos.año,0,0);
				 Object[] fila={
							metodos.año
						};
					model.addRow(fila);
					((DefaultTableModel) table.getModel()).addRow(fila);
					System.out.println(metodos.año);
			}
		});
		btnNewButton_2.setBounds(394, 204, 89, 23);
		contentPane.add(btnNewButton_2);
	}
	
	private void imprimirTabla(){
		
    }
	private void agregarDatos() {
		peli = new Pelicula();
		int posicion = 0;
		peli.genero=textGenero.getText();
		textGenero.setText("");
		do {
			peli.año=Integer.parseInt(textAño.getText());
			textAño.setText("");
		}while(peli.año<1900 && peli.año>2023);
		peli.nombre=textNombre.getText();
		textNombre.setText("");
		metodos.lista.add(posicion, peli);
		System.out.println(metodos.lista);
	    posicion++;
	    Object[] fila={
				metodos.lista
			};
		model.addRow(fila);
		((DefaultTableModel) table.getModel()).addRow(fila);
	}
}
