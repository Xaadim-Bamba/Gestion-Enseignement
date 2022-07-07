package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

public class EditEtudiant extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public EditEtudiant() {
		
		
		
		
		
		Image personnes = new ImageIcon(this.getClass().getResource("/personnes.png")).getImage();
		setIconImage(personnes);
		setResizable(false);
		setTitle("Ajout Etudiant");
		setDefaultCloseOperation(AjoutEtablissement.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextPane txtpnAdresseDeLassociation = new JTextPane();
		txtpnAdresseDeLassociation.setEditable(false);
		txtpnAdresseDeLassociation.setForeground(Color.WHITE);
		txtpnAdresseDeLassociation.setBackground(Color.GRAY);
		txtpnAdresseDeLassociation.setText("Nom");
		
		final JTextPane textPane_2 = new JTextPane();
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnVilleDeLassociation = new JTextPane();
		txtpnVilleDeLassociation.setEditable(false);
		txtpnVilleDeLassociation.setForeground(Color.WHITE);
		txtpnVilleDeLassociation.setBackground(Color.GRAY);
		txtpnVilleDeLassociation.setText("Prénom");
		
		JTextPane txtpnTerritoireDintervention = new JTextPane();
		txtpnTerritoireDintervention.setEditable(false);
		txtpnTerritoireDintervention.setForeground(Color.WHITE);
		txtpnTerritoireDintervention.setBackground(Color.GRAY);
		txtpnTerritoireDintervention.setText("Adresse");
		
		JTextPane txtpnCatgorieDeLassociation = new JTextPane();
		txtpnCatgorieDeLassociation.setEditable(false);
		txtpnCatgorieDeLassociation.setForeground(Color.WHITE);
		txtpnCatgorieDeLassociation.setBackground(Color.GRAY);
		txtpnCatgorieDeLassociation.setText("Prenom personne");
		
		JTextPane txtpnDescription = new JTextPane();
		txtpnDescription.setEditable(false);
		txtpnDescription.setForeground(Color.WHITE);
		txtpnDescription.setBackground(Color.GRAY);
		txtpnDescription.setText("Formation");
		
		final JTextPane textPane_10 = new JTextPane();
		textPane_10.setForeground(Color.BLACK);
		textPane_10.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnSiteInternet = new JTextPane();
		txtpnSiteInternet.setEditable(false);
		txtpnSiteInternet.setForeground(Color.WHITE);
		txtpnSiteInternet.setBackground(Color.GRAY);
		txtpnSiteInternet.setText("Présent");
		
		
		final JTextPane txtpnRetour = new JTextPane();
		txtpnRetour.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnRetour.setEditable(false);
		txtpnRetour.setBackground(Color.LIGHT_GRAY);
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(Color.LIGHT_GRAY);

		

		
		Image confirmer = new ImageIcon(this.getClass().getResource("/confirmer.png")).getImage();
		
		
		final JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		
		final JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(Color.LIGHT_GRAY);
		
		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Oui", "Non"}));
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Ajout");
		btnNewButton.setIcon(new ImageIcon(confirmer));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnAdresseDeLassociation, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textPane_2, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnVilleDeLassociation, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(comboBox, 0, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnTerritoireDintervention, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnCatgorieDeLassociation, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textPane_3, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnDescription, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textPane_10, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox_1, Alignment.LEADING, 0, 468, Short.MAX_VALUE)
						.addComponent(txtpnSiteInternet, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnAdresseDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnVilleDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnTerritoireDintervention, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnCatgorieDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnSiteInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		
		
		
		
		
		
		
		contentPane.setLayout(gl_contentPane);
		
		
		
		
		
		
	}
	}


