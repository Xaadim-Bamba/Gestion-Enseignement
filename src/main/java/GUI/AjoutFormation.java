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

import java.awt.Font;

public class AjoutFormation extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean autorisation;



	/**
	 * Create the frame.
	 */
	public AjoutFormation(final String nom_association) {


		
		String nom;
		String prenom;
		String fonction;
		
		
		
		
		
		Image fonction1 = new ImageIcon(this.getClass().getResource("/fonction.png")).getImage();
		setIconImage(fonction1);
		setResizable(false);
		setTitle("Edition Formation");
		setDefaultCloseOperation(AjoutEtablissement.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextPane txtpnNomDeLassociation = new JTextPane();
		txtpnNomDeLassociation.setEditable(false);
		txtpnNomDeLassociation.setForeground(Color.WHITE);
		txtpnNomDeLassociation.setBackground(Color.GRAY);
		txtpnNomDeLassociation.setText("Id Formation");
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnAdresseDeLassociation = new JTextPane();
		txtpnAdresseDeLassociation.setEditable(false);
		txtpnAdresseDeLassociation.setForeground(Color.WHITE);
		txtpnAdresseDeLassociation.setBackground(Color.GRAY);
		txtpnAdresseDeLassociation.setText("Intitulé");
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setForeground(Color.BLACK);
		textPane_2.setBackground(Color.LIGHT_GRAY);
		
		JTextPane txtpnVilleDeLassociation = new JTextPane();
		txtpnVilleDeLassociation.setEditable(false);
		txtpnVilleDeLassociation.setForeground(Color.WHITE);
		txtpnVilleDeLassociation.setBackground(Color.GRAY);
		txtpnVilleDeLassociation.setText("Discipline Majeur");
		
		JTextPane txtpnTerritoireDintervention = new JTextPane();
		txtpnTerritoireDintervention.setEditable(false);
		txtpnTerritoireDintervention.setForeground(Color.WHITE);
		txtpnTerritoireDintervention.setBackground(Color.GRAY);
		txtpnTerritoireDintervention.setText("Discipline Secondaire ");
		
		JTextPane txtpnCatgorieDeLassociation = new JTextPane();
		txtpnCatgorieDeLassociation.setEditable(false);
		txtpnCatgorieDeLassociation.setForeground(Color.WHITE);
		txtpnCatgorieDeLassociation.setBackground(Color.GRAY);
		txtpnCatgorieDeLassociation.setText("Spécialisation de la Formation");
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setEditable(false);
		textPane_10.setForeground(Color.BLACK);
		textPane_10.setBackground(Color.LIGHT_GRAY);
		
		
		
		
		
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
		

		
		Image modifier = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(Color.LIGHT_GRAY);
		
		
		
		
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Maths", "Biologie", "Musicologie", "Sociologie", "Autre : tapez"}));
		comboBox.setBackground(Color.LIGHT_GRAY);
		JButton btnNewButton = new JButton("Modifier");
		
		
		
		btnNewButton.setIcon(new ImageIcon(modifier));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		
		Image supprimer = new ImageIcon(this.getClass().getResource("/supprimer.png")).getImage();
		JButton btnNewButton_1 = new JButton("Supprimer Formation");
		btnNewButton_1.setIcon(new ImageIcon(supprimer));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textPane_10, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(comboBox, 0, 466, Short.MAX_VALUE)
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnNomDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnAdresseDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(textPane_2, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnVilleDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnTerritoireDintervention, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addComponent(txtpnCatgorieDeLassociation, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
						.addComponent(chckbxNewCheckBox, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
					.addContainerGap())
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
					.addComponent(textPane_10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnTerritoireDintervention, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnCatgorieDeLassociation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnRetour, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addGap(280))
		);
		
		
		
		
		
		
		
		contentPane.setLayout(gl_contentPane);
	
		nom = "Maths";
		prenom = "Informatique";

		
		
		textPane_1.setText(nom_association);
		textPane_2.setText("Master Ingénierie de la décision & Big Data");
		
		textPane.setText(nom);
		textPane_10.setText(prenom);

		
		
		
		
		}
	}


