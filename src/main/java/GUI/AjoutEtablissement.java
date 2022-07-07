package GUI;

import javax.swing.*;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;



public class AjoutEtablissement extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private JPanel contentPane;
	private boolean autorisation;
	
	

	public AjoutEtablissement(final String cle_association) {
		
		
		String adresse_association ;
		String ville_association ;
		String territoire_intervention;
		String categorie_association;
		String  objet_association;
		String site_internet;
		String mail_association;
		String autre_structure;
		
		
		
		//System.out.println(cle_association);
		
		Image association = new ImageIcon(this.getClass().getResource("/association.png")).getImage();
		setIconImage(association);
		setResizable(false);
		setTitle("Edition Etablissement");
		setDefaultCloseOperation(AjoutEtablissement.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 490, 725);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextPane txtpnNomDeLassociation = new JTextPane();
		txtpnNomDeLassociation.setForeground(Color.WHITE);
		txtpnNomDeLassociation.setEditable(false);
		txtpnNomDeLassociation.setBackground(Color.GRAY);
		txtpnNomDeLassociation.setText("Nom");
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnAdresseDeLassociation = new JTextPane();
		txtpnAdresseDeLassociation.setForeground(Color.WHITE);
		txtpnAdresseDeLassociation.setBackground(Color.GRAY);
		txtpnAdresseDeLassociation.setText("Sigle");
		
		final JTextPane textPane_2 = new JTextPane();
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnVilleDeLassociation = new JTextPane();
		txtpnVilleDeLassociation.setForeground(Color.WHITE);
		txtpnVilleDeLassociation.setBackground(Color.GRAY);
		txtpnVilleDeLassociation.setText("Type Etablissement");
		
		JTextPane txtpnTerritoireDintervention = new JTextPane();
		txtpnTerritoireDintervention.setForeground(Color.WHITE);
		txtpnTerritoireDintervention.setBackground(Color.GRAY);
		txtpnTerritoireDintervention.setText("Statut");
		
		JTextPane txtpnCatgorieDeLassociation = new JTextPane();
		txtpnCatgorieDeLassociation.setForeground(Color.WHITE);
		txtpnCatgorieDeLassociation.setBackground(Color.GRAY);
		txtpnCatgorieDeLassociation.setText("Universite_de_Rattachement");
		
		JTextPane txtpnDescription = new JTextPane();
		txtpnDescription.setForeground(Color.WHITE);
		txtpnDescription.setBackground(Color.GRAY);
		txtpnDescription.setText("Adresse");
		
		final JTextPane textPane_10 = new JTextPane();
		textPane_10.setForeground(Color.BLACK);
		textPane_10.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnSiteInternet = new JTextPane();
		txtpnSiteInternet.setForeground(Color.WHITE);
		txtpnSiteInternet.setBackground(Color.GRAY);
		txtpnSiteInternet.setText("Telephone");
		
		final JTextPane textPane_12 = new JTextPane();
		textPane_12.setForeground(Color.BLACK);
		textPane_12.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnMailDeLassociation = new JTextPane();
		txtpnMailDeLassociation.setForeground(Color.WHITE);
		txtpnMailDeLassociation.setBackground(Color.GRAY);
		txtpnMailDeLassociation.setText("Liste De Formations");
		
		final JTextPane textPane_14 = new JTextPane();
		textPane_14.setForeground(Color.BLACK);
		textPane_14.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnAutreStructure = new JTextPane();
		txtpnAutreStructure.setForeground(Color.WHITE);
		txtpnAutreStructure.setBackground(Color.GRAY);
		txtpnAutreStructure.setText("Aucune formation spécifié");
		
		
		
		Image supprimer = new ImageIcon(this.getClass().getResource("/supprimer.png")).getImage();
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Autoriser Suppression");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			

			public void stateChanged(ChangeEvent e) {
				if(autorisation) {autorisation = false;
				}
	else {autorisation = true;}
			}
		});
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}});
		chckbxNewCheckBox.setBackground(Color.GRAY);
		
		final JTextPane txtpnRetour = new JTextPane();
		txtpnRetour.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnRetour.setEditable(false);
		txtpnRetour.setBackground(Color.LIGHT_GRAY);
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Type1", "Type2", "Type3"}));
		
		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setEditable(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Public", "Privé", "Privé Sous Contrat"}));
		
		final JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setEditable(true);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Nantes","Rennes","Versaille"}));
		
		final JComboBox<String> comboBox_3 = new JComboBox<String>();

		

		
		Image modifier = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.setIcon(new ImageIcon(modifier));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				}
				
				
				
			}
		);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		Image confirmer = new ImageIcon(this.getClass().getResource("/confirmer.png")).getImage();
		Image subvention = new ImageIcon(this.getClass().getResource("/subvention.png")).getImage();
		
		JButton btnNewButton_3 = new JButton("Ajout Etudiant");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setIcon(new ImageIcon(subvention));
		
		JButton btnNewButton_1 = new JButton("Supprimer l'Etablissement");
		btnNewButton_1.setIcon(new ImageIcon(supprimer));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnAdresseDeLassociation, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(textPane_2, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnVilleDeLassociation, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnTerritoireDintervention, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnCatgorieDeLassociation, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 461, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnDescription, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(textPane_10, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnSiteInternet, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(textPane_12, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnMailDeLassociation, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(textPane_14, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnAutreStructure, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(comboBox_3, Alignment.LEADING, 0, 462, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnRetour, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
						.addComponent(txtpnNomDeLassociation, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
					.addGap(123))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
					.addGap(122))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnNomDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnAdresseDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnVilleDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnTerritoireDintervention, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnCatgorieDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_10, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnSiteInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnMailDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnAutreStructure, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
					.addContainerGap())
		);
		//textPane_1.setText(cle_association);
		
		
		
		
		
		contentPane.setLayout(gl_contentPane);


		adresse_association = "Voila";
		objet_association = "Voila";
		site_internet = "Voila";
		mail_association = "Voila";
		
		textPane_1.setText(cle_association);
		textPane_2.setText(adresse_association);
		textPane_10.setText(objet_association);
		textPane_12.setText(site_internet);
		textPane_14.setText(mail_association);
					

	}}
		
