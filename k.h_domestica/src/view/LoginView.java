package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Canvas;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.Box;

public class LoginView {

	private JFrame frmKhDomstica;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frmKhDomstica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKhDomstica = new JFrame();
		frmKhDomstica.getContentPane().setBackground(new Color(255, 255, 255));
		frmKhDomstica.setTitle("K.H Dom\u00E9stica");
		frmKhDomstica.setBounds(100, 100, 600, 600);
		frmKhDomstica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Entrar");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		textField = new JTextField();
		textField.setColumns(1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setForeground(new Color(30, 144, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		passwordField = new JPasswordField();
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setForeground(new Color(30, 144, 255));
		GroupLayout groupLayout = new GroupLayout(frmKhDomstica.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(131)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
						.addComponent(passwordField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
						.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
					.addGap(169))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(241, Short.MAX_VALUE))
		);
		frmKhDomstica.getContentPane().setLayout(groupLayout);
	}
}
