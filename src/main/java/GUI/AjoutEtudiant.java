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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import GUI.AjoutEtablissement;

import java.awt.Font;

public class AjoutEtudiant extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean autorisation;



	/**
	 * Create the frame.
	 */
	public AjoutEtudiant(final int cle_personnes) {
		String telephone_personne;
		String civilite_personne;
		String nom_personne;
		String prenom_personne;
		String mail_personne;
		String personne_agee_isole;
		
		
		
		
		Image personnes = new ImageIcon(this.getClass().getResource("/personnes.png")).getImage();
		setIconImage(personnes);
		setResizable(false);
		setTitle("Edition Etudiant");
		setDefaultCloseOperation(AjoutEtablissement.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextPane txtpnNomDeLassociation = new JTextPane();
		txtpnNomDeLassociation.setEditable(false);
		txtpnNomDeLassociation.setForeground(Color.WHITE);
		txtpnNomDeLassociation.setBackground(Color.GRAY);
		txtpnNomDeLassociation.setText("Id Etudiant");
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setBackground(Color.LIGHT_GRAY);
		
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
		txtpnDescription.setText("Formation Etudiant");
		
		final JTextPane textPane_10 = new JTextPane();
		textPane_10.setForeground(Color.BLACK);
		textPane_10.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnSiteInternet = new JTextPane();
		txtpnSiteInternet.setEditable(false);
		txtpnSiteInternet.setForeground(Color.WHITE);
		txtpnSiteInternet.setBackground(Color.GRAY);
		txtpnSiteInternet.setText("Présent");
		
		
		
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
		
		final JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBackground(Color.LIGHT_GRAY);

		

		
		Image modifier = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		Image fonction = new ImageIcon(this.getClass().getResource("/fonction.png")).getImage();
		Image benevolat = new ImageIcon(this.getClass().getResource("/benevolat.png")).getImage();
		
		final JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		
		final JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(Color.LIGHT_GRAY);
		
		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Oui", "Non"}));
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.setIcon(new ImageIcon(modifier));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		JButton btnNewButton_2 = new JButton("Modification Formation");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CRER FENETRE AJOUT FORMATION
				
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(fonction));
		
		JButton btnNewButton_3 = new JButton("Ajout Formation");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				EventQueue.invokeLater(new Runnable() {
					public void run() {

					}
				});
				setVisible(false); 
				dispose();
				
				
			}
		});
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setIcon(new ImageIcon(benevolat));
		
		
		JButton btnNewButton_1 = new JButton("Supprimer personne");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 9));
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
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_1, 0, 473, Short.MAX_VALUE)
						.addComponent(textPane_3, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(textPane_10, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(txtpnNomDeLassociation, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(txtpnAdresseDeLassociation, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(textPane_2, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(txtpnVilleDeLassociation, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(txtpnTerritoireDintervention, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(txtpnCatgorieDeLassociation, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(txtpnDescription, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(comboBox, 0, 473, Short.MAX_VALUE)
						.addComponent(txtpnSiteInternet, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 190, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
					.addGap(283))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtpnNomDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtpnAdresseDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnVilleDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnTerritoireDintervention, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnCatgorieDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnSiteInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox)
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addGap(92))
		);
		
		
		
		
		
		
		
		contentPane.setLayout(gl_contentPane);
		
		
		telephone_personne = "Vitry";
		nom_personne = "52 Boulevard Joseph Bédier Angers 49000";
		prenom_personne = "Charles";
		mail_personne = "M1 MIASHS";
		personne_agee_isole = "False";
		
		
		textPane_1.setText(String.valueOf(cle_personnes));
		textPane_2.setText(telephone_personne);


		textPane.setText(nom_personne);
		textPane_3.setText(prenom_personne);
		textPane_10.setText(mail_personne);


		
		
	}
}
