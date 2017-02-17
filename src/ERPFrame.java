import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;

public class ERPFrame extends JFrame {

	private JPanel contentPane;
	private final JTable table_1 = new JTable();
	private JButton selectButton;
	private JButton insertButton;
	private JButton updateButton;
	private JButton deleteButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ERPFrame frame = new ERPFrame();
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
	public ERPFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1491, 923);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setForeground(new Color(0, 51, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		comboBox.setToolTipText("");
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(397, 269, 416, 76);
		contentPane.add(comboBox);
		table_1.setBounds(224, 474, 1081, 370);
		contentPane.add(table_1);
		
		selectButton = new JButton("Select");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		selectButton.setBounds(22, 40, 155, 76);
		contentPane.add(selectButton);
		
		insertButton = new JButton("Insert");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		insertButton.setBounds(22, 162, 155, 76);
		contentPane.add(insertButton);
		
		updateButton = new JButton("Update");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		updateButton.setBounds(22, 280, 155, 76);
		contentPane.add(updateButton);
		
		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteButton.setBounds(22, 404, 155, 76);
		contentPane.add(deleteButton);
		
		
	}
}
