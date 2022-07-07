package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import GUI.AjoutEtablissement;


import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class EditEtablissement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	
	
	public EditEtablissement() {
		
		
		
		setTitle("Ajout Association");

		Image association = new ImageIcon(this.getClass().getResource("/association.png")).getImage();
		setIconImage(association);
		setResizable(false);
		setDefaultCloseOperation(AjoutEtablissement.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 800);
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
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setBackground(Color.LIGHT_GRAY);

		JTextPane txtpnAdresseDeLassociation = new JTextPane();
		txtpnAdresseDeLassociation.setEditable(false);
		txtpnAdresseDeLassociation.setForeground(Color.WHITE);
		txtpnAdresseDeLassociation.setBackground(Color.GRAY);
		txtpnAdresseDeLassociation.setText("Sigle");

		final JTextPane textPane_2 = new JTextPane();
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setBackground(Color.LIGHT_GRAY);

		JTextPane txtpnVilleDeLassociation = new JTextPane();
		txtpnVilleDeLassociation.setEditable(false);
		txtpnVilleDeLassociation.setForeground(Color.WHITE);
		txtpnVilleDeLassociation.setBackground(Color.GRAY);
		txtpnVilleDeLassociation.setText("Type Etablissement");

		JTextPane txtpnTerritoireDintervention = new JTextPane();
		txtpnTerritoireDintervention.setEditable(false);
		txtpnTerritoireDintervention.setForeground(Color.WHITE);
		txtpnTerritoireDintervention.setBackground(Color.GRAY);
		txtpnTerritoireDintervention.setText("Statut");

		JTextPane txtpnCatgorieDeLassociation = new JTextPane();
		txtpnCatgorieDeLassociation.setEditable(false);
		txtpnCatgorieDeLassociation.setForeground(Color.WHITE);
		txtpnCatgorieDeLassociation.setBackground(Color.GRAY);
		txtpnCatgorieDeLassociation.setText("Université de Rattachement");

		JTextPane txtpnDescription = new JTextPane();
		txtpnDescription.setEditable(false);
		txtpnDescription.setForeground(Color.WHITE);
		txtpnDescription.setBackground(Color.GRAY);
		txtpnDescription.setText("Adresse");

		final JTextPane textPane_10 = new JTextPane();
		textPane_10.setForeground(Color.BLACK);
		textPane_10.setBackground(Color.LIGHT_GRAY);

		JTextPane txtpnSiteInternet = new JTextPane();
		txtpnSiteInternet.setEditable(false);
		txtpnSiteInternet.setForeground(Color.WHITE);
		txtpnSiteInternet.setBackground(Color.GRAY);
		txtpnSiteInternet.setText("Telephone");

		final JTextPane textPane_12 = new JTextPane();
		textPane_12.setForeground(Color.BLACK);
		textPane_12.setBackground(Color.LIGHT_GRAY);

		JTextPane txtpnMailDeLassociation = new JTextPane();
		txtpnMailDeLassociation.setEditable(false);
		txtpnMailDeLassociation.setForeground(Color.WHITE);
		txtpnMailDeLassociation.setBackground(Color.GRAY);
		txtpnMailDeLassociation.setText("Liste de Formations");

		final JTextPane textPane_14 = new JTextPane();
		textPane_14.setForeground(Color.BLACK);
		textPane_14.setBackground(Color.LIGHT_GRAY);

		JTextPane txtpnAutreStructure = new JTextPane();
		txtpnAutreStructure.setEditable(false);
		txtpnAutreStructure.setForeground(Color.WHITE);
		txtpnAutreStructure.setBackground(Color.GRAY);
		txtpnAutreStructure.setText("Aucune formation spécifié");

		

		final JTextPane txtpnRetour = new JTextPane();
		txtpnRetour.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnRetour.setEditable(false);
		txtpnRetour.setBackground(Color.LIGHT_GRAY);

		final JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Type1", "Type2", "Type3"}));
		comboBox.setEditable(true);

		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Public", "Privé", "Privé Sous Contrat"}));
		comboBox_1.setEditable(true);

		final JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBackground(Color.LIGHT_GRAY);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Nantes","Rennes","Versaille"}));
		comboBox_2.setEditable(true);

		final JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"Non", "Oui"}));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);

		Image confirmer = new ImageIcon(this.getClass().getResource("/confirmer.png")).getImage();
		JButton btnNewButton = new JButton("Ajout");
		btnNewButton.setIcon(new ImageIcon(confirmer));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


			}
				
			
		});

		btnNewButton.setBackground(Color.LIGHT_GRAY);

		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnRetour, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(textPane_10, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnNomDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(textPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnAdresseDeLassociation, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 466,
								Short.MAX_VALUE)
						.addComponent(textPane_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnVilleDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnTerritoireDintervention, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnCatgorieDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnDescription, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnSiteInternet, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(textPane_12, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnMailDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(textPane_14, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnAutreStructure, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(comboBox, 0, 466, Short.MAX_VALUE)
						.addComponent(comboBox_1, 0, 466, Short.MAX_VALUE)
						.addComponent(comboBox_2, 0, 466, Short.MAX_VALUE)
						.addComponent(comboBox_3, 0, 466, Short.MAX_VALUE))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(txtpnNomDeLassociation, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(2)
								.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(txtpnAdresseDeLassociation, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnVilleDeLassociation, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(4)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnTerritoireDintervention, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(4)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnCatgorieDeLassociation, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(4)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textPane_10, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtpnSiteInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textPane_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnMailDeLassociation, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textPane_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnAutreStructure, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(34)
								.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE).addComponent(
										btnNewButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)));

		contentPane.setLayout(gl_contentPane);

	}
}
