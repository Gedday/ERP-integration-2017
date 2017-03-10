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
import javax.swing.JTextPane;

public class ERPFrame extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 842, 551);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setForeground(new Color(0, 51, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUppgift = new JButton("Uppgift 1");
		btnUppgift.setBounds(12, 27, 97, 25);
		contentPane.add(btnUppgift);
		
		JButton btnUppgift_1 = new JButton("Uppgift 2");
		btnUppgift_1.setBounds(12, 65, 97, 25);
		contentPane.add(btnUppgift_1);
		
		JButton btnUppgift_2 = new JButton("Uppgift 3");
		btnUppgift_2.setBounds(12, 103, 97, 25);
		contentPane.add(btnUppgift_2);
		
		JButton btnUppgift_3 = new JButton("Uppgift 4");
		btnUppgift_3.setBounds(12, 144, 97, 25);
		contentPane.add(btnUppgift_3);
		
		JButton btnUppgift_4 = new JButton("Uppgift 5");
		btnUppgift_4.setBounds(12, 182, 97, 25);
		contentPane.add(btnUppgift_4);
		
		JButton btnUppgift_5 = new JButton("Uppgift 6");
		btnUppgift_5.setBounds(12, 220, 97, 25);
		contentPane.add(btnUppgift_5);
		
		JButton btnUppgift_6 = new JButton("Uppgift 7");
		btnUppgift_6.setBounds(12, 258, 97, 25);
		contentPane.add(btnUppgift_6);
		
		JButton btnUppgift_7 = new JButton("Uppgift 8");
		btnUppgift_7.setBounds(12, 298, 97, 25);
		contentPane.add(btnUppgift_7);
		
		JButton btnUppgift_8 = new JButton("Uppgift 9");
		btnUppgift_8.setBounds(12, 336, 97, 25);
		contentPane.add(btnUppgift_8);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(150, 27, 97, 25);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(150, 65, 97, 25);
		contentPane.add(btnUpdate);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(150, 144, 97, 25);
		contentPane.add(btnInsert);
		
		JButton btnFindNo = new JButton("Find No_");
		btnFindNo.setBounds(150, 103, 97, 25);
		contentPane.add(btnFindNo);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(259, 103, 97, 22);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(259, 147, 97, 22);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(461, 147, 97, 22);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(559, 147, 97, 22);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(362, 147, 97, 22);
		contentPane.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(259, 68, 97, 22);
		contentPane.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(362, 68, 97, 22);
		contentPane.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(461, 68, 97, 22);
		contentPane.add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setBounds(559, 68, 97, 22);
		contentPane.add(textPane_8);
		
		JPanel panel = new JPanel();
		panel.setBounds(135, 194, 686, 269);
		contentPane.add(panel);
		
		
	}
}
