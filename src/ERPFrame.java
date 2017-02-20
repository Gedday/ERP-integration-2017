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
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JScrollPane;

public class ERPFrame extends JFrame {

	private JPanel contentPane;
	private final JTable table_1 = new JTable();
	private JButton selectButton;
	private JButton insertButton;
	private JButton updateButton;
	private JButton deleteButton;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ERPFrame frame = new ERPFrame();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 516);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setForeground(new Color(0, 51, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(251, 116, 565, 353);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(6, 338, 542, 15);
		panel.add(scrollBar_1);
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(543, 6, 22, 347);
		panel.add(scrollBar);
		table_1.setBounds(0, 0, 565, 353);
		panel.add(table_1);
		table_1.setFillsViewportHeight(true);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		comboBox.setToolTipText("");
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(251, 28, 565, 76);
		contentPane.add(comboBox);
		
		selectButton = new JButton("Select");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		selectButton.setBounds(22, 28, 155, 76);
		contentPane.add(selectButton);
		
		insertButton = new JButton("Insert");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		insertButton.setBounds(22, 149, 155, 76);
		contentPane.add(insertButton);
		
		updateButton = new JButton("Update");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		updateButton.setBounds(22, 267, 155, 76);
		contentPane.add(updateButton);
		
		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteButton.setBounds(22, 393, 155, 76);
		contentPane.add(deleteButton);
		
		
	}
}
