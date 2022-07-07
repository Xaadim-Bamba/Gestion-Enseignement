package GUI;

import dao.Dao;
import model.Etablissement;
import model.Etablissements;
import model.Etudiant;
import model.Formation;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.*;

/**
 * Class Principale du GUI qui appelle les autres classes qui sont des Jframe
 */
public class Fenetre_Principal {


    //interface
    public JFrame frEtablissement;
    public static JTable table = new JTable();
    public static  JTable tableEtudiants = new JTable();
    public static JTable tableFormation = new JTable();


    /**
     * Create the application.
     */
    public Fenetre_Principal() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        initialize();

    }

    public static void VidageTableauEtablissement() {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);

    }

    public static void VidageTableauEtudiants() {
        DefaultTableModel dtm = (DefaultTableModel) tableEtudiants.getModel();
        dtm.setRowCount(0);

    }


    public static void VidageTableauFormation() {
        DefaultTableModel dtm = (DefaultTableModel) tableFormation.getModel();
        dtm.setRowCount(0);

    }

    public static void EditionTableEtablissement(String[] ligne ) {

        TableModel tblModel = (DefaultTableModel)table.getModel();
        ((DefaultTableModel) tblModel).addRow(ligne);

    }

    public static void EditionTableEtudiants(String[] ligne ) {



        TableModel tblModel = (DefaultTableModel) tableEtudiants.getModel();
        ((DefaultTableModel) tblModel).addRow(ligne);
    }




    public static void EditionTableFormation(String[] ligne) {
        DefaultTableModel tblModel = (DefaultTableModel) tableFormation.getModel();
        tblModel.addRow(ligne);

    }


    public static void Tableau_Etablissement(Etablissements etablissements){
        for (Etablissement e:etablissements.getEtablissements()){
            EditionTableEtablissement(e.MinimaltoString());
        }


    }

    public static void Tableau_Etudiant(Dao<Etudiant> etudiantDao){
        for (Etudiant e:etudiantDao.findAll()){
            EditionTableEtudiants(e.MinimaltoString());
        }


    }

    public static void Tableau_Formation(Dao<Formation> formationDao){
        for (Formation f:formationDao .findAll()){
            EditionTableFormation(f.MinimaltoString());
        }


    }




    /**
     * Initialize the contents of the frame.
     */
    private void initialize() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        frEtablissement = new JFrame("GESTION ETABLISSEMENT 2022");
        frEtablissement.setTitle("SUPER GESTIONNAIRE ETABLISSEMENT 1.0");
        frEtablissement.setResizable(false);
        frEtablissement.setAutoRequestFocus(false);
        frEtablissement.setForeground(Color.BLACK);
        frEtablissement.getContentPane().setBackground(Color.LIGHT_GRAY);
        frEtablissement.setFont(new Font("Arial Black", Font.BOLD, 12));
      //  Image LogoEtablissement = new ImageIcon(this.getClass().getResource("/LogoEta.png")).getImage();
      //  frEtablissement.setIconImage(LogoEtablissement);
        frEtablissement.setBackground(Color.BLACK);
        frEtablissement.setBounds(25, 25, 1200, 800);
        frEtablissement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{980, 0};
        gridBagLayout.rowHeights = new int[]{32, 1, 0, 1, 0};
        gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 5.0, 0.0, Double.MIN_VALUE};
        frEtablissement.getContentPane().setLayout(gridBagLayout);

        JPanel panel_8 = new JPanel();
        panel_8.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_8 = new GridBagConstraints();
        gbc_panel_8.insets = new Insets(0, 0, 5, 0);
        gbc_panel_8.fill = GridBagConstraints.BOTH;
        gbc_panel_8.gridx = 0;
        gbc_panel_8.gridy = 0;
        frEtablissement.getContentPane().add(panel_8, gbc_panel_8);
        GridBagLayout gbl_panel_8 = new GridBagLayout();
        gbl_panel_8.columnWidths = new int[] {42, 0, 128, 3, 0, 128, 400, 3, 300, 32, 6};
        gbl_panel_8.rowHeights = new int[]{0, 0};
        gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_panel_8.rowWeights = new double[]{1.0, Double.MIN_VALUE};
        panel_8.setLayout(gbl_panel_8);

        JPanel panel_13 = new JPanel();
        panel_13.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_13 = new GridBagConstraints();
        gbc_panel_13.insets = new Insets(0, 0, 0, 5);
        gbc_panel_13.gridx = 0;
        gbc_panel_13.gridy = 0;
        panel_8.add(panel_13, gbc_panel_13);
       // Image LogoEtaBar = new ImageIcon(this.getClass().getResource("/LogoEtaBar.png")).getImage();
     //   panel_13.add(new JLabel(new ImageIcon(LogoEtaBar)));

        JSeparator separator_1 = new JSeparator();
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setForeground(Color.DARK_GRAY);
        separator_1.setBackground(Color.DARK_GRAY);
        GridBagConstraints gbc_separator_1 = new GridBagConstraints();
        gbc_separator_1.insets = new Insets(0, 0, 0, 5);
        gbc_separator_1.gridx = 1;
        gbc_separator_1.gridy = 0;
        panel_8.add(separator_1, gbc_separator_1);

        JPanel panel_14 = new JPanel();
        panel_14.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_14 = new GridBagConstraints();
        gbc_panel_14.insets = new Insets(0, 0, 0, 5);
        gbc_panel_14.gridx = 2;
        gbc_panel_14.gridy = 0;
        panel_8.add(panel_14, gbc_panel_14);

        JMenuBar menuBar = new JMenuBar();
        panel_14.add(menuBar);

        JMenu mnNewMenu = new JMenu("Param\u00E8tres");
        mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
        mnNewMenu.setSelectedIcon(null);
        mnNewMenu.setForeground(Color.DARK_GRAY);
        Image parametre = new ImageIcon(this.getClass().getResource("/parametre.png")).getImage();
        mnNewMenu.setIcon(new ImageIcon(parametre));
        mnNewMenu.setBackground(Color.DARK_GRAY);
        menuBar.add(mnNewMenu);

        JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Mode Nuit");
        Image nuit = new ImageIcon(this.getClass().getResource("/nuit.png")).getImage();
        chckbxmntmNewCheckItem_1.setIcon(new ImageIcon(nuit));
        chckbxmntmNewCheckItem_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxmntmNewCheckItem_1.setForeground(Color.DARK_GRAY);
        chckbxmntmNewCheckItem_1.setBackground(Color.LIGHT_GRAY);
        mnNewMenu.add(chckbxmntmNewCheckItem_1);

        JPanel panel_19 = new JPanel();
        panel_19.setBackground(new Color(192, 192, 192));
        panel_19.setBorder(null);
        GridBagConstraints gbc_panel_19 = new GridBagConstraints();
        gbc_panel_19.fill = GridBagConstraints.BOTH;
        gbc_panel_19.insets = new Insets(0, 0, 0, 5);
        gbc_panel_19.gridx = 3;
        gbc_panel_19.gridy = 0;
        panel_8.add(panel_19, gbc_panel_19);

        JPanel panel_15 = new JPanel();
        panel_15.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_15 = new GridBagConstraints();
        gbc_panel_15.insets = new Insets(0, 0, 0, 5);
        gbc_panel_15.gridx = 5;
        gbc_panel_15.gridy = 0;
        panel_8.add(panel_15, gbc_panel_15);



        JPanel panel_16 = new JPanel();
        panel_16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 128)));
        panel_16.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_16 = new GridBagConstraints();
        gbc_panel_16.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_16.insets = new Insets(0, 0, 0, 5);
        gbc_panel_16.gridx = 6;
        gbc_panel_16.gridy = 0;
        panel_8.add(panel_16, gbc_panel_16);

        final JTextPane textPane = new JTextPane();
        textPane.setEditable(false);
        textPane.setBackground(new Color(128, 128, 128));
        textPane.setContentType("text/html");
        textPane.setText("Aucune action à annuler.");

        panel_16.add(textPane);

        JButton btnNewButton = new JButton("Annuler l'Action");
        btnNewButton.setVerticalAlignment(SwingConstants.TOP);
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(new Color(211, 211, 211));
        Image retour = new ImageIcon(this.getClass().getResource("/retour.png")).getImage();
        btnNewButton.setIcon(new ImageIcon(retour));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textPane.setText("Aucune action à annuler n'est présente.");

            }
        });
        panel_15.add(btnNewButton);

        JPanel panel_20 = new JPanel();
        panel_20.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_20 = new GridBagConstraints();
        gbc_panel_20.insets = new Insets(0, 0, 0, 5);
        gbc_panel_20.fill = GridBagConstraints.BOTH;
        gbc_panel_20.gridx = 7;
        gbc_panel_20.gridy = 0;
        panel_8.add(panel_20, gbc_panel_20);















        JPanel panel_17 = new JPanel();
        panel_17.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_17 = new GridBagConstraints();
        gbc_panel_17.insets = new Insets(0, 0, 0, 5);
        gbc_panel_17.fill = GridBagConstraints.BOTH;
        gbc_panel_17.gridx = 8;
        gbc_panel_17.gridy = 0;
        panel_8.add(panel_17, gbc_panel_17);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBackground(new Color(128, 128, 128));

        final JButton btnNewButton_1 = new JButton("Mode Administrateur désactiver");
        btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 8));
        btnNewButton_1.setBackground(new Color(192, 192, 192));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton_1.setText("Mode Administrateur activé    ");


                //System.out.println("Admin activé");
            }
        });





        GroupLayout gl_panel_17 = new GroupLayout(panel_17);
        gl_panel_17.setHorizontalGroup(
                gl_panel_17.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_17.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_1)
                                .addContainerGap())
        );
        gl_panel_17.setVerticalGroup(
                gl_panel_17.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_17.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_17.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                        .addComponent(btnNewButton_1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                .addContainerGap())
        );
        panel_17.setLayout(gl_panel_17);

        JPanel panel_18 = new JPanel();
        panel_18.setBackground(new Color(192, 192, 192));
        GridBagConstraints gbc_panel_18 = new GridBagConstraints();
        gbc_panel_18.anchor = GridBagConstraints.EAST;
        gbc_panel_18.gridx = 9;
        gbc_panel_18.gridy = 0;
        panel_8.add(panel_18, gbc_panel_18);
        Image info = new ImageIcon(this.getClass().getResource("/info.png")).getImage();
        JLabel label = new JLabel(new ImageIcon(info));
        label.setToolTipText("Clovis Deletre & Charles Vitry\r\n        Support : charles.vitry@etud.uco.fr");
        panel_18.add(label);

        JPanel panel_7 = new JPanel();
        panel_7.setBackground(Color.GRAY);
        GridBagConstraints gbc_panel_7 = new GridBagConstraints();
        gbc_panel_7.insets = new Insets(0, 0, 5, 0);
        gbc_panel_7.fill = GridBagConstraints.BOTH;
        gbc_panel_7.gridx = 0;
        gbc_panel_7.gridy = 1;
        frEtablissement.getContentPane().add(panel_7, gbc_panel_7);
        panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));

        JLayeredPane layeredPane = new JLayeredPane();
        panel_7.add(layeredPane);
        layeredPane.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel panel_9 = new JPanel();
        panel_9.setBackground(new Color(0, 0, 204));
        layeredPane.add(panel_9);

        JPanel panel_10 = new JPanel();
        panel_10.setBackground(new Color(255, 102, 0));
        layeredPane.add(panel_10);

        JPanel panel_11 = new JPanel();
        panel_11.setBackground(new Color(0, 102, 0));
        layeredPane.add(panel_11);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 15));
        tabbedPane.setForeground(Color.BLUE);
        tabbedPane.setBackground(Color.GRAY);
        tabbedPane.setBorder(new MatteBorder(0, 7, 7, 7, (Color) new Color(105, 105, 105)));
        GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
        gbc_tabbedPane.insets = new Insets(0, 0, 5, 0);
        gbc_tabbedPane.fill = GridBagConstraints.BOTH;
        gbc_tabbedPane.gridx = 0;
        gbc_tabbedPane.gridy = 2;
        frEtablissement.getContentPane().add(tabbedPane, gbc_tabbedPane);

        //Border blackline = BorderFactory.createLineBorder(Color.gray);
        EmptyBorder emptyBorder = new EmptyBorder(20, 20, 20, 20);
        EtchedBorder etchedBorder = new EtchedBorder();

        CompoundBorder inner = new CompoundBorder(emptyBorder, etchedBorder);
        CompoundBorder outter = new CompoundBorder(inner, emptyBorder);
        //
        MatteBorder haut = new MatteBorder(5, 0, 0, 0, Color.GRAY);


        MatteBorder bas = new MatteBorder(0, 0, 5, 0, Color.GRAY);

        MatteBorder gauche = new MatteBorder(0, 5, 0, 0, Color.GRAY);

        //
        MatteBorder droit = new MatteBorder(0, 0, 0, 5, Color.GRAY);

        MatteBorder hautgauche = new MatteBorder(5, 5, 0, 0, Color.GRAY);

        //
        MatteBorder hautdroit = new MatteBorder(5, 0, 0, 5, Color.GRAY);

        //
        MatteBorder basgauche = new MatteBorder(0, 5, 5, 0, Color.GRAY);

        MatteBorder basdroit = new MatteBorder(0, 0, 5, 5, Color.GRAY);


        EmptyBorder progressBorder = new EmptyBorder(2, 2, 2, 2);
        //MatteBorder matte = new MatteBorder(10, 10, 10, 10, Color.black);
        MatteBorder matte2 = new MatteBorder(10, 10, 10, 10, Color.LIGHT_GRAY);
        MatteBorder matte3 = new MatteBorder(1, 0, 0, 0, Color.black);
        JPanel Page_Accueil = new JPanel();
        Page_Accueil.setBackground(Color.LIGHT_GRAY);


        Image accueil = new ImageIcon(this.getClass().getResource("/accueil.png")).getImage();

        tabbedPane.addTab("Accueil", new ImageIcon(accueil), Page_Accueil, null);
        Page_Accueil.setLayout(new BorderLayout(0, 0));



        JPanel panel_2 = new JPanel();
        panel_2.setPreferredSize(new Dimension(300,200));
        panel_2.setBorder(outter);
        Page_Accueil.add(panel_2, BorderLayout.WEST);
        panel_2.setLayout(new GridLayout(13, 3, 0, 0));

        JTextPane txtpnStatistiqueDes = new JTextPane();
        txtpnStatistiqueDes.setEditable(false);
        txtpnStatistiqueDes.setForeground(Color.WHITE);
        txtpnStatistiqueDes.setBackground(Color.GRAY);
        txtpnStatistiqueDes.setFont(new Font("Dialog", Font.BOLD, 17));
        txtpnStatistiqueDes.setText("Résultats");
        panel_2.add(txtpnStatistiqueDes);


        JTextPane txtpnForum = new JTextPane();
        txtpnForum.setEditable(false);
        txtpnForum.setFont(new Font("Dialog", Font.BOLD, 17));
        txtpnForum.setForeground(Color.WHITE);
        txtpnForum.setText("Lycées");
        txtpnForum.setBackground(Color.GRAY);
        panel_2.add(txtpnForum);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.BLACK);
        separator.setBackground(Color.BLACK);
        panel_2.add(separator);

        JSeparator separator_2 = new JSeparator();
        separator_2.setForeground(Color.BLACK);
        separator_2.setBackground(Color.BLACK);
        panel_2.add(separator_2);

        JLabel lblChoixDeLanne = new JLabel(" Choix de l'année :");
        lblChoixDeLanne.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblChoixDeLanne);

        JPanel panel_38 = new JPanel();
        panel_2.add(panel_38);

        JComboBox comboBox_6 = new JComboBox();
        comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026"}));
        panel_38.add(comboBox_6);

        JLabel lblJuj = new JLabel(" Mention TB");
        lblJuj.setHorizontalAlignment(SwingConstants.RIGHT);
        lblJuj.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblJuj);

        JLabel lblNewLabel = new JLabel("0");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel(" Mention B");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_2);

        JLabel lblNewLabel_4 = new JLabel("0");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel(" Mention AB");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("0");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel(" Admis");
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("0");
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel(" Rattrapage");
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("0");
        lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_10);

        JLabel lblNewLabel_3 = new JLabel(" Non reçu");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_3);

        JLabel lblNewLabel_11 = new JLabel("0");
        lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_11);

        JLabel lblNewLabel_1 = new JLabel(" Orientation Lycée Technique");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_1);

        JLabel lblNewLabel_13 = new JLabel("0");
        lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_13.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_13);

        JLabel lblNewLabel_12 = new JLabel(" Dont \"réussis\"");
        lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_12);

        JLabel lblNewLabel_14 = new JLabel("0");
        lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_14);

        JLabel lblNewLabel_18 = new JLabel(" Temps Enseignements ");
        lblNewLabel_18.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_18.setFont(new Font("Dialog", Font.PLAIN, 11));
        panel_2.add(lblNewLabel_18);

        JLabel lblNewLabel_15 = new JLabel("6000h");
        lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_2.add(lblNewLabel_15);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(outter);
        panel_3.setPreferredSize(new Dimension(300,200));
        Page_Accueil.add(panel_3, BorderLayout.EAST);
        panel_3.setLayout(new GridLayout(13, 1, 0, 0));

        JTextPane txtpnTopBnvoles = new JTextPane();
        txtpnTopBnvoles.setForeground(Color.WHITE);
        txtpnTopBnvoles.setFont(new Font("Dialog", Font.BOLD, 13));
        txtpnTopBnvoles.setEditable(false);
        txtpnTopBnvoles.setBackground(Color.GRAY);
        txtpnTopBnvoles.setText("TOP 10 Etablissements");
        panel_3.add(txtpnTopBnvoles);

        JComboBox comboBox_7 = new JComboBox();
        comboBox_7.setForeground(Color.WHITE);
        comboBox_7.setBackground(Color.GRAY);
        comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"De l'année", "10 ans", "50 ans", "Au Total"}));
        panel_3.add(comboBox_7);

        JSeparator separator_3 = new JSeparator();
        separator_3.setForeground(Color.BLACK);
        separator_3.setBackground(Color.BLACK);
        panel_3.add(separator_3);

        JSeparator separator_4 = new JSeparator();
        separator_4.setBackground(Color.BLACK);
        separator_4.setForeground(Color.BLACK);
        panel_3.add(separator_4);

        JLabel lblNewLabel_21 = new JLabel("1 ");
        lblNewLabel_21.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_21);

        JLabel lblNewLabel_27 = new JLabel("IMA");
        lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_27.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_27);

        JLabel lblNewLabel_26 = new JLabel("2 ");
        lblNewLabel_26.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_26.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_26);

        JLabel lblNewLabel_25 = new JLabel("Autres");
        lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_25.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_25);

        JLabel lblNewLabel_24 = new JLabel("3 ");
        lblNewLabel_24.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_24.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_24);

        JLabel lblNewLabel_30 = new JLabel("None");
        lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_30.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_30);

        JLabel lblNewLabel_29 = new JLabel("4 ");
        lblNewLabel_29.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_29.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_29);

        JLabel lblNewLabel_23 = new JLabel("None");
        lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_23.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_23);

        JLabel lblNewLabel_28 = new JLabel("5 ");
        lblNewLabel_28.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_28.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_28);

        JLabel lblNewLabel_22 = new JLabel("None");
        lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_22.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_22);

        JLabel lblNewLabel_31 = new JLabel("6 ");
        lblNewLabel_31.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_31.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_31);

        JLabel lblNewLabel_33 = new JLabel("None");
        lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_33.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_33);

        JLabel lblNewLabel_32 = new JLabel("7 ");
        lblNewLabel_32.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_32.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_32);

        JLabel lblNewLabel_35 = new JLabel("None");
        lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_35.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_35);

        JLabel lblNewLabel_34 = new JLabel("8 ");
        lblNewLabel_34.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_34.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_34);

        JLabel lblNewLabel_37 = new JLabel("None");
        lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_37.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_37);

        JLabel lblNewLabel_36 = new JLabel("9 ");
        lblNewLabel_36.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_36.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_36);

        JLabel lblNewLabel_39 = new JLabel("None");
        lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_39.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_39);

        JLabel lblNewLabel_38 = new JLabel("10 ");
        lblNewLabel_38.setFont(new Font("Dialog", Font.PLAIN, 12));
        lblNewLabel_38.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(lblNewLabel_38);

        JLabel lblNewLabel_40 = new JLabel("None");
        lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_40.setFont(new Font("Dialog", Font.PLAIN, 12));
        panel_3.add(lblNewLabel_40);

        JPanel panel_4 = new JPanel();
        Page_Accueil.add(panel_4, BorderLayout.CENTER);
        panel_4.setLayout(new GridLayout(2, 1, 0, 0));

        JPanel panel_5 = new JPanel();
        panel_5.setBorder(matte2);
        panel_4.add(panel_5);
        panel_5.setLayout(new GridLayout(8, 5, 0, 0));

        JLabel lblNewLabel_16 = new JLabel("");
        panel_5.add(lblNewLabel_16);

        JLabel lblNewLabel_19 = new JLabel("");
        panel_5.add(lblNewLabel_19);

        JLabel lblNewLabel_20 = new JLabel("");
        panel_5.add(lblNewLabel_20);

        JLabel lblNewLabel_41 = new JLabel("");
        panel_5.add(lblNewLabel_41);

        JLabel lblNewLabel_42 = new JLabel("");
        lblNewLabel_42.setBackground(Color.WHITE);
        panel_5.add(lblNewLabel_42);

        JLabel lblNewLabel_17 = new JLabel("");
        panel_5.add(lblNewLabel_17);

        JTextPane txtpnIndicateurs = new JTextPane();
        txtpnIndicateurs.setForeground(Color.WHITE);
        txtpnIndicateurs.setBackground(Color.GRAY);
        txtpnIndicateurs.setFont(new Font("Dialog", Font.BOLD, 15));
        txtpnIndicateurs.setEditable(false);
        txtpnIndicateurs.setText(" Variables");
        panel_5.add(txtpnIndicateurs);

        JTextPane txtpnExplicatives = new JTextPane();
        txtpnExplicatives.setForeground(Color.WHITE);
        txtpnExplicatives.setFont(new Font("Dialog", Font.BOLD, 15));
        txtpnExplicatives.setBackground(Color.GRAY);
        txtpnExplicatives.setEditable(false);
        txtpnExplicatives.setText("Explicatives");
        panel_5.add(txtpnExplicatives);

        JTextPane ResultatsEtablissement = new JTextPane();
        ResultatsEtablissement.setForeground(Color.WHITE);
        ResultatsEtablissement.setFont(new Font("Dialog", Font.BOLD, 15));
        ResultatsEtablissement.setBackground(Color.GRAY);
        ResultatsEtablissement.setEditable(false);
        ResultatsEtablissement.setText("Résultats");
        panel_5.add(ResultatsEtablissement);

        JLabel lblNewLabel_43 = new JLabel("");
        panel_5.add(lblNewLabel_43);

        JSeparator separator_5 = new JSeparator();
        separator_5.setForeground(Color.BLACK);
        separator_5.setBackground(Color.BLACK);
        panel_5.add(separator_5);

        JSeparator separator_6 = new JSeparator();
        separator_6.setBackground(Color.BLACK);
        separator_6.setForeground(Color.BLACK);
        panel_5.add(separator_6);

        JSeparator separator_7 = new JSeparator();
        separator_7.setForeground(Color.BLACK);
        separator_7.setBackground(Color.BLACK);
        panel_5.add(separator_7);

        JSeparator separator_8 = new JSeparator();
        separator_8.setBackground(Color.BLACK);
        separator_8.setForeground(Color.BLACK);
        panel_5.add(separator_8);

        JSeparator separator_9 = new JSeparator();
        separator_9.setForeground(Color.BLACK);
        separator_9.setBackground(Color.BLACK);
        panel_5.add(separator_9);

        JLabel lblNewLabel_44 = new JLabel("");
        panel_5.add(lblNewLabel_44);

        JPanel panel_49 = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panel_49.getLayout();
        flowLayout.setVgap(10);
        panel_49.setBorder(hautgauche);
        panel_5.add(panel_49);

        JTextPane txtpnVariable = new JTextPane();
        txtpnVariable.setEditable(false);
        txtpnVariable.setBackground(Color.GRAY);
        txtpnVariable.setText("Variable1");
        panel_49.add(txtpnVariable);

        JPanel panel_50 = new JPanel();
        FlowLayout flowLayout_1 = (FlowLayout) panel_50.getLayout();
        flowLayout_1.setVgap(10);
        panel_50.setBorder(haut);
        panel_5.add(panel_50);

        JTextPane txtpnVariable_1 = new JTextPane();
        txtpnVariable_1.setEditable(false);
        txtpnVariable_1.setBackground(Color.GRAY);
        txtpnVariable_1.setText("Variable2");
        panel_50.add(txtpnVariable_1);

        JPanel panel_51 = new JPanel();
        FlowLayout flowLayout_2 = (FlowLayout) panel_51.getLayout();
        flowLayout_2.setVgap(10);
        panel_51.setBorder(hautdroit);
        panel_5.add(panel_51);

        JTextPane txtpnVariable_2 = new JTextPane();
        txtpnVariable_2.setEditable(false);
        txtpnVariable_2.setBackground(Color.GRAY);
        txtpnVariable_2.setText("Variable3");
        panel_51.add(txtpnVariable_2);

        JLabel lblNewLabel_45 = new JLabel("");
        panel_5.add(lblNewLabel_45);

        JLabel lblNewLabel_46 = new JLabel("");
        panel_5.add(lblNewLabel_46);

        JPanel panel_40 = new JPanel();
        panel_40.setBorder(gauche);
        panel_5.add(panel_40);



        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(10);
        progressBar.setPreferredSize(new Dimension(90,20));
        panel_40.add(progressBar);

        JPanel panel_41 = new JPanel();
        panel_5.add(panel_41);

        JProgressBar progressBar_1 = new JProgressBar();
        progressBar_1.setValue(20);
        progressBar_1.setPreferredSize(new Dimension(90,20));
        panel_41.add(progressBar_1);

        JPanel panel_42 = new JPanel();
        panel_42.setBorder(droit);
        panel_5.add(panel_42);

        JProgressBar progressBar_2 = new JProgressBar();
        progressBar_2.setValue(30);
        progressBar_2.setPreferredSize(new Dimension(90,20));
        panel_42.add(progressBar_2);

        JLabel lblNewLabel_47 = new JLabel("");
        panel_5.add(lblNewLabel_47);

        JLabel lblNewLabel_48 = new JLabel("");
        panel_5.add(lblNewLabel_48);

        JPanel panel_52 = new JPanel();
        FlowLayout flowLayout_3 = (FlowLayout) panel_52.getLayout();
        flowLayout_3.setVgap(15);
        panel_52.setBorder(gauche);
        panel_5.add(panel_52);

        JTextPane txtpnVariable_3 = new JTextPane();
        txtpnVariable_3.setEditable(false);
        txtpnVariable_3.setBackground(Color.GRAY);
        txtpnVariable_3.setText("Variable4");
        panel_52.add(txtpnVariable_3);

        JPanel panel_53 = new JPanel();
        FlowLayout flowLayout_4 = (FlowLayout) panel_53.getLayout();
        flowLayout_4.setVgap(15);
        panel_5.add(panel_53);

        JTextPane txtpnVariable_4 = new JTextPane();
        txtpnVariable_4.setEditable(false);
        txtpnVariable_4.setBackground(Color.GRAY);
        txtpnVariable_4.setText("Variable5");
        panel_53.add(txtpnVariable_4);

        JPanel panel_61 = new JPanel();
        panel_61.setBorder(droit);
        panel_5.add(panel_61);

        JLabel lblNewLabel_50 = new JLabel("");
        panel_5.add(lblNewLabel_50);

        JLabel lblNewLabel_51 = new JLabel("");
        panel_5.add(lblNewLabel_51);

        JPanel panel_37 = new JPanel();
        panel_37.setBorder(basgauche);
        panel_5.add(panel_37);

        JProgressBar progressBar_3 = new JProgressBar();
        progressBar_3.setValue(40);
        progressBar_3.setPreferredSize(new Dimension(90,20));
        panel_37.add(progressBar_3);

        JPanel panel_39 = new JPanel();
        panel_39.setBorder(bas);

        panel_5.add(panel_39);

        JProgressBar progressBar_4 = new JProgressBar();
        progressBar_4.setValue(50);
        progressBar_4.setPreferredSize(new Dimension(90,20));
        panel_39.add(progressBar_4);

        JPanel panel_60 = new JPanel();
        panel_60.setBorder(basdroit);
        panel_5.add(panel_60);

        JLabel lblNewLabel_53 = new JLabel("");
        panel_5.add(lblNewLabel_53);

        JLabel lblNewLabel_54 = new JLabel("");
        panel_5.add(lblNewLabel_54);

        JLabel lblNewLabel_55 = new JLabel("");
        panel_5.add(lblNewLabel_55);

        JLabel lblNewLabel_56 = new JLabel("");
        panel_5.add(lblNewLabel_56);

        JLabel lblNewLabel_57 = new JLabel("");
        panel_5.add(lblNewLabel_57);

        JLabel lblNewLabel_58 = new JLabel("");
        panel_5.add(lblNewLabel_58);

        JPanel panel_6 = new JPanel();
        panel_6.setBorder(matte2);
        panel_4.add(panel_6);
        panel_6.setLayout(new BorderLayout(0, 0));

        JPanel panel_36 = new JPanel();
        panel_36.setBorder(matte3);
        panel_6.add(panel_36, BorderLayout.SOUTH);

        JButton btnNewButton_5 = new JButton("Mis à jour des Indicateurs");
        panel_36.add(btnNewButton_5);

        JPanel panel_34 = new JPanel();
        panel_6.add(panel_34, BorderLayout.CENTER);
        panel_34.setLayout(new GridLayout(6, 5, 0, 0));

        JLabel lblNewLabel_59 = new JLabel("");
        panel_34.add(lblNewLabel_59);

        JLabel lblNewLabel_61 = new JLabel("");
        panel_34.add(lblNewLabel_61);

        JLabel lblNewLabel_60 = new JLabel("");
        panel_34.add(lblNewLabel_60);

        JLabel lblNewLabel_62 = new JLabel("");
        panel_34.add(lblNewLabel_62);

        JLabel lblNewLabel_63 = new JLabel("");
        panel_34.add(lblNewLabel_63);

        JLabel lblNewLabel_64 = new JLabel("");
        panel_34.add(lblNewLabel_64);

        JPanel panel_54 = new JPanel();
        FlowLayout flowLayout_5 = (FlowLayout) panel_54.getLayout();
        flowLayout_5.setVgap(15);
        panel_54.setBorder(hautgauche);
        panel_34.add(panel_54);

        JTextPane txtpnVariable_5 = new JTextPane();
        txtpnVariable_5.setEditable(false);
        txtpnVariable_5.setBackground(Color.GRAY);
        txtpnVariable_5.setText("Variable6");
        panel_54.add(txtpnVariable_5);

        JPanel panel_55 = new JPanel();
        FlowLayout flowLayout_6 = (FlowLayout) panel_55.getLayout();
        flowLayout_6.setVgap(15);
        panel_55.setBorder(haut);
        panel_34.add(panel_55);

        JTextPane txtpnVariable_6 = new JTextPane();
        txtpnVariable_6.setEditable(false);
        txtpnVariable_6.setBackground(Color.GRAY);
        txtpnVariable_6.setText("Variable7");
        panel_55.add(txtpnVariable_6);

        JPanel panel_56 = new JPanel();
        FlowLayout flowLayout_7 = (FlowLayout) panel_56.getLayout();
        flowLayout_7.setVgap(15);
        panel_56.setBorder(hautdroit);
        panel_34.add(panel_56);

        JTextPane txtpnVariable_7 = new JTextPane();
        txtpnVariable_7.setEditable(false);
        txtpnVariable_7.setBackground(Color.GRAY);
        txtpnVariable_7.setText("Variable8");
        panel_56.add(txtpnVariable_7);

        JLabel lblNewLabel_65 = new JLabel("");
        panel_34.add(lblNewLabel_65);

        JLabel lblNewLabel_66 = new JLabel("");
        panel_34.add(lblNewLabel_66);

        JPanel panel_44 = new JPanel();
        panel_44.setBorder(gauche);
        panel_34.add(panel_44);

        JProgressBar progressBar_5 = new JProgressBar();
        progressBar_5.setValue(60);
        progressBar_5.setPreferredSize(new Dimension(90,20));
        panel_44.add(progressBar_5);

        JPanel panel_45 = new JPanel();
        panel_34.add(panel_45);

        JProgressBar progressBar_6 = new JProgressBar();
        progressBar_6.setValue(70);
        progressBar_6.setPreferredSize(new Dimension(90,20));
        panel_45.add(progressBar_6);

        JPanel panel_43 = new JPanel();
        panel_43.setBorder(droit);
        panel_34.add(panel_43);

        JProgressBar progressBar_7 = new JProgressBar();
        progressBar_7.setValue(80);
        progressBar_7.setPreferredSize(new Dimension(90,20));
        panel_43.add(progressBar_7);

        JLabel lblNewLabel_67 = new JLabel("");
        panel_34.add(lblNewLabel_67);

        JLabel lblNewLabel_68 = new JLabel("");
        panel_34.add(lblNewLabel_68);

        JPanel panel_57 = new JPanel();
        FlowLayout flowLayout_8 = (FlowLayout) panel_57.getLayout();
        flowLayout_8.setVgap(15);
        panel_57.setBorder(gauche);
        panel_34.add(panel_57);

        JTextPane txtpnVariable_8 = new JTextPane();
        txtpnVariable_8.setEditable(false);
        txtpnVariable_8.setBackground(Color.GRAY);
        txtpnVariable_8.setText("Variable9");
        panel_57.add(txtpnVariable_8);

        JPanel panel_58 = new JPanel();
        FlowLayout flowLayout_9 = (FlowLayout) panel_58.getLayout();
        flowLayout_9.setVgap(15);
        panel_34.add(panel_58);

        JTextPane txtpnVariable_9 = new JTextPane();
        txtpnVariable_9.setEditable(false);
        txtpnVariable_9.setBackground(Color.GRAY);
        txtpnVariable_9.setText("Variable10");
        panel_58.add(txtpnVariable_9);

        JPanel panel_59 = new JPanel();
        panel_59.setBorder(droit);
        panel_34.add(panel_59);

        JTextPane txtpnIndicateurDeParit = new JTextPane();
        txtpnIndicateurDeParit.setEditable(false);
        txtpnIndicateurDeParit.setBackground(Color.GRAY);
        txtpnIndicateurDeParit.setText("Indicateur \nde Parité");
        panel_59.add(txtpnIndicateurDeParit);

        JLabel lblNewLabel_69 = new JLabel("");
        panel_34.add(lblNewLabel_69);

        JLabel lblNewLabel_70 = new JLabel("");
        panel_34.add(lblNewLabel_70);

        JPanel panel_47 = new JPanel();
        panel_47.setBorder(basgauche);
        panel_34.add(panel_47);

        JProgressBar progressBar_8 = new JProgressBar();
        progressBar_8.setValue(90);
        progressBar_8.setPreferredSize(new Dimension(90,20));
        panel_47.add(progressBar_8);

        JPanel panel_46 = new JPanel();
        panel_46.setBorder(bas);
        panel_34.add(panel_46);

        JProgressBar progressBar_9 = new JProgressBar();
        progressBar_9.setValue(100);
        progressBar_9.setPreferredSize(new Dimension(90,20));
        panel_46.add(progressBar_9);

        JPanel panel_48 = new JPanel();
        panel_48.setBorder(basdroit);
        panel_34.add(panel_48);

        JProgressBar progressBar_10 = new JProgressBar();
        progressBar_10.setPreferredSize(new Dimension(90,20));
        panel_48.add(progressBar_10);

        JLabel lblNewLabel_71 = new JLabel("");
        panel_34.add(lblNewLabel_71);
        tabbedPane.setEnabledAt(0, true);
        tabbedPane.setBackgroundAt(0, Color.GRAY);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.LIGHT_GRAY);
        Image association = new ImageIcon(this.getClass().getResource("/association.png")).getImage();
        tabbedPane.addTab("Etablissement", new ImageIcon(association), panel_1, null);

        JPanel panel_21 = new JPanel();
        panel_21.setBackground(Color.GRAY);

        JPanel panel_22 = new JPanel();
        panel_22.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_22.setBackground(Color.LIGHT_GRAY);

        JPanel panel_23 = new JPanel();
        panel_23.setBackground(Color.GRAY);

        JPanel panel_24 = new JPanel();
        panel_24.setBackground(Color.GRAY);

        JPanel panel_27 = new JPanel();
        panel_27.setBackground(Color.LIGHT_GRAY);
        panel_27.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));

        JPanel panel_28 = new JPanel();
        panel_28.setBackground(Color.LIGHT_GRAY);
        panel_28.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));

        JPanel panel_29 = new JPanel();
        panel_29.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_29.setBackground(Color.LIGHT_GRAY);
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panel_24, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                                        .addComponent(panel_23, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel_1.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(panel_21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_27, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_28, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(panel_22, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_27, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_24, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                                .addGap(6))
        );

        JScrollPane scrollPane = new JScrollPane();

        //JScrollPane js=new JScrollPane(table);
        //js.setVisible(true);




        GroupLayout gl_panel_24 = new GroupLayout(panel_24);
        gl_panel_24.setHorizontalGroup(
                gl_panel_24.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_24.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_24.setVerticalGroup(
                gl_panel_24.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, gl_panel_24.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                .addContainerGap())
        );
        table.setSurrendersFocusOnKeystroke(true);


        table.setFont(new Font("Tahoma", Font.PLAIN, 10));
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Appel.ligne_tableau = table.getSelectedRow();

                final String cle = (String) table.getModel().getValueAt(table.getSelectedRow(), 0);
                if (cle !=null) {
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            try {
                                AjoutEtablissement frame = new AjoutEtablissement(cle);
                                frame.setVisible(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }) ;
                };



            }
        });
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setBackground(Color.LIGHT_GRAY);
        table.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Nom", "Sigle", "Telephone", "Statut"
                }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
        scrollPane.setViewportView(table);



        panel_24.setLayout(gl_panel_24);
        GridBagLayout gbl_panel_29 = new GridBagLayout();
        gbl_panel_29.columnWidths = new int[]{0, 0};
        gbl_panel_29.rowHeights = new int[]{22, 0, 0, 0};
        gbl_panel_29.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_29.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        panel_29.setLayout(gbl_panel_29);

        JPanel panel_12 = new JPanel();
        panel_12.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_12 = new GridBagConstraints();
        gbc_panel_12.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_12.insets = new Insets(0, 0, 5, 0);
        gbc_panel_12.gridx = 0;
        gbc_panel_12.gridy = 0;
        panel_29.add(panel_12, gbc_panel_12);

        JTextPane txtpnAutreStructure = new JTextPane();
        txtpnAutreStructure.setBackground(Color.WHITE);
        txtpnAutreStructure.setEditable(false);
        txtpnAutreStructure.setText("Uniquement Privé");
        panel_12.add(txtpnAutreStructure);

        final JToggleButton tglbtnNewToggleButton = new JToggleButton("désactivé");
        tglbtnNewToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tglbtnNewToggleButton.getText() == "désactivé") {
                    tglbtnNewToggleButton.setText("    activé    ");
                }

                else tglbtnNewToggleButton.setText("désactivé");
            }
        });
        GridBagConstraints gbc_tglbtnNewToggleButton = new GridBagConstraints();
        gbc_tglbtnNewToggleButton.insets = new Insets(0, 0, 5, 0);
        gbc_tglbtnNewToggleButton.gridx = 0;
        gbc_tglbtnNewToggleButton.gridy = 1;
        panel_29.add(tglbtnNewToggleButton, gbc_tglbtnNewToggleButton);
        tglbtnNewToggleButton.setHorizontalAlignment(SwingConstants.LEADING);
        tglbtnNewToggleButton.setIcon(null);

        JPanel panel_35 = new JPanel();
        panel_35.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_35 = new GridBagConstraints();
        gbc_panel_35.anchor = GridBagConstraints.NORTHWEST;
        gbc_panel_35.gridx = 0;
        gbc_panel_35.gridy = 2;
        panel_29.add(panel_35, gbc_panel_35);



        final JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Trier par", "Nom", "Ville", "Statut", "privé"}));


        Image ajout = new ImageIcon(this.getClass().getResource("/ajout.png")).getImage();
        JButton btnNewButton_3 = new JButton("Ajout rapide d'Etablissement");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            EditEtablissement frame = new EditEtablissement();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });



            }
        });
        btnNewButton_3.setIcon(new ImageIcon(ajout));
        btnNewButton_3.setBackground(Color.LIGHT_GRAY);
        panel_21.add(btnNewButton_3);

        Image csv = new ImageIcon(this.getClass().getResource("/csv.png")).getImage();
        JButton btnNewButton_2 = new JButton("Export en format  .csv");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2.setIcon(new ImageIcon(csv));
        btnNewButton_2.setBackground(Color.LIGHT_GRAY);
        panel_21.add(btnNewButton_2);
        GridBagLayout gbl_panel_28 = new GridBagLayout();
        gbl_panel_28.columnWidths = new int[]{0, 0};
        gbl_panel_28.rowHeights = new int[]{22, 0, 0};
        gbl_panel_28.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_28.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_28.setLayout(gbl_panel_28);

        JPanel panel_32 = new JPanel();
        panel_32.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_32 = new GridBagConstraints();
        gbc_panel_32.insets = new Insets(0, 0, 5, 0);
        gbc_panel_32.fill = GridBagConstraints.BOTH;
        gbc_panel_32.gridx = 0;
        gbc_panel_32.gridy = 0;
        panel_28.add(panel_32, gbc_panel_32);

        JPanel panel_33 = new JPanel();
        panel_33.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_33 = new GridBagConstraints();
        gbc_panel_33.fill = GridBagConstraints.BOTH;
        gbc_panel_33.gridx = 0;
        gbc_panel_33.gridy = 1;
        panel_28.add(panel_33, gbc_panel_33);
        panel_33.setLayout(new GridLayout(4, 2, 0, 0));

        final JCheckBox chckbxNewCheckBox_12 = new JCheckBox("Art - Culture – Loisirs");
        chckbxNewCheckBox_12.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_12.setSelected(true);
        chckbxNewCheckBox_12.setBackground(Color.LIGHT_GRAY);
        panel_33.add(chckbxNewCheckBox_12);

        final JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Unions associatives");
        chckbxNewCheckBox_11.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_11.setSelected(true);
        chckbxNewCheckBox_11.setBackground(Color.LIGHT_GRAY);
        panel_33.add(chckbxNewCheckBox_11);

        final JCheckBox chckbxNewCheckBox_13 = new JCheckBox("Cadre de vie – Environnement");
        chckbxNewCheckBox_13.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_13.setSelected(true);
        chckbxNewCheckBox_13.setBackground(Color.LIGHT_GRAY);
        panel_33.add(chckbxNewCheckBox_13);

        final JCheckBox chckbxNewCheckBox_14 = new JCheckBox("Cultuel");
        chckbxNewCheckBox_14.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_14.setSelected(true);
        chckbxNewCheckBox_14.setBackground(Color.LIGHT_GRAY);
        panel_33.add(chckbxNewCheckBox_14);

        final JCheckBox chckbxNewCheckBox_15 = new JCheckBox("Entraide - Solidarité – Santé");
        chckbxNewCheckBox_15.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_15.setSelected(true);
        chckbxNewCheckBox_15.setBackground(Color.LIGHT_GRAY);
        panel_33.add(chckbxNewCheckBox_15);

        final JCheckBox chckbxNewCheckBox_19 = new JCheckBox("Détente - Sports");
        chckbxNewCheckBox_19.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_19.setHorizontalAlignment(SwingConstants.LEFT);
        chckbxNewCheckBox_19.setBackground(Color.LIGHT_GRAY);
        chckbxNewCheckBox_19.setSelected(true);
        panel_33.add(chckbxNewCheckBox_19);

        final JCheckBox chckbxNewCheckBox_18 = new JCheckBox("Enfance - Jeunesse");
        chckbxNewCheckBox_18.setSelected(true);
        chckbxNewCheckBox_18.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_18.setBackground(Color.LIGHT_GRAY);
        panel_33.add(chckbxNewCheckBox_18);

        final JCheckBox chckbxNewCheckBox_20 = new JCheckBox("Autres");
        chckbxNewCheckBox_20.setSelected(true);
        chckbxNewCheckBox_20.setFont(new Font("Dialog", Font.BOLD, 9));
        chckbxNewCheckBox_20.setBackground(Color.LIGHT_GRAY);
        panel_33.add(chckbxNewCheckBox_20);
        GridBagLayout gbl_panel_27 = new GridBagLayout();
        gbl_panel_27.columnWidths = new int[]{0, 0};
        gbl_panel_27.rowHeights = new int[]{22, 0, 0};
        gbl_panel_27.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_27.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_27.setLayout(gbl_panel_27);

        JPanel panel_30 = new JPanel();
        panel_30.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_30 = new GridBagConstraints();
        gbc_panel_30.insets = new Insets(0, 0, 5, 0);
        gbc_panel_30.fill = GridBagConstraints.BOTH;
        gbc_panel_30.gridx = 0;
        gbc_panel_30.gridy = 0;
        panel_27.add(panel_30, gbc_panel_30);


        JPanel panel_31 = new JPanel();
        panel_31.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_31 = new GridBagConstraints();
        gbc_panel_31.fill = GridBagConstraints.BOTH;
        gbc_panel_31.gridx = 0;
        gbc_panel_31.gridy = 1;
        panel_27.add(panel_31, gbc_panel_31);
        panel_31.setLayout(new GridLayout(0, 2, 0, 0));

        GridBagLayout gbl_panel_22 = new GridBagLayout();
        gbl_panel_22.columnWidths = new int[]{281, 0};
        gbl_panel_22.rowHeights = new int[]{22, 0, 0};
        gbl_panel_22.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_22.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_22.setLayout(gbl_panel_22);

        JPanel panel_25 = new JPanel();
        panel_25.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_25 = new GridBagConstraints();
        gbc_panel_25.insets = new Insets(0, 0, 5, 0);
        gbc_panel_25.fill = GridBagConstraints.BOTH;
        gbc_panel_25.gridx = 0;
        gbc_panel_25.gridy = 0;
        panel_22.add(panel_25, gbc_panel_25);


        JPanel panel_26 = new JPanel();
        panel_26.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_26 = new GridBagConstraints();
        gbc_panel_26.fill = GridBagConstraints.BOTH;
        gbc_panel_26.gridx = 0;
        gbc_panel_26.gridy = 1;
        panel_22.add(panel_26, gbc_panel_26);
        panel_26.setLayout(new GridLayout(4, 2, 0, 0));

        Image Etudiant = new ImageIcon(this.getClass().getResource("/personnes.png")).getImage();

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBackground(Color.LIGHT_GRAY);
        tabbedPane.addTab("Etudiant", new ImageIcon(Etudiant), panel_1_1, null);

        JPanel panel_24_1 = new JPanel();
        panel_24_1.setBackground(Color.GRAY);

        JScrollPane scrollPane_1 = new JScrollPane();
        GroupLayout gl_panel_24_1 = new GroupLayout(panel_24_1);
        gl_panel_24_1.setHorizontalGroup(
                gl_panel_24_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 875, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_24_1.setVerticalGroup(
                gl_panel_24_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 554, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel_24_1.setLayout(gl_panel_24_1);

        JPanel panel_23_1 = new JPanel();
        panel_23_1.setBackground(Color.GRAY);

        JTextField txtNom = new JTextField();
        txtNom.setColumns(10);

        JButton btnNewButton_4_1 = new JButton("Rechercher");
        btnNewButton_4_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VidageTableauEtudiants();
                //RECHERCHE_ETUDIANT
            }
        });
        btnNewButton_4_1.setBackground(Color.WHITE);

        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Trier par", "Nom", "Prénom"}));
        GroupLayout gl_panel_23_1 = new GroupLayout(panel_23_1);
        gl_panel_23_1.setHorizontalGroup(
                gl_panel_23_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_23_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNom, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_4_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(398)
                                .addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_panel_23_1.setVerticalGroup(
                gl_panel_23_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.LEADING, gl_panel_23_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_23_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_23_1.setLayout(gl_panel_23_1);

        JPanel panel_29_1 = new JPanel();
        panel_29_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_29_1.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_29_1 = new GridBagLayout();
        gbl_panel_29_1.columnWidths = new int[]{0, 0};
        gbl_panel_29_1.rowHeights = new int[]{22, 0, 0, 0};
        gbl_panel_29_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_29_1.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        panel_29_1.setLayout(gbl_panel_29_1);

        JPanel panel_12_1 = new JPanel();
        panel_12_1.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_12_1 = new GridBagConstraints();
        gbc_panel_12_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_12_1.insets = new Insets(0, 0, 5, 0);
        gbc_panel_12_1.gridx = 0;
        gbc_panel_12_1.gridy = 0;
        panel_29_1.add(panel_12_1, gbc_panel_12_1);

        JTextPane txtpnAutreStructure_1 = new JTextPane();
        txtpnAutreStructure_1.setText("Présent");
        txtpnAutreStructure_1.setEditable(false);
        txtpnAutreStructure_1.setBackground(Color.WHITE);
        panel_12_1.add(txtpnAutreStructure_1);

        JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("désactivé");
        tglbtnNewToggleButton_1.setHorizontalAlignment(SwingConstants.LEADING);
        GridBagConstraints gbc_tglbtnNewToggleButton_1 = new GridBagConstraints();
        gbc_tglbtnNewToggleButton_1.insets = new Insets(0, 0, 5, 0);
        gbc_tglbtnNewToggleButton_1.gridx = 0;
        gbc_tglbtnNewToggleButton_1.gridy = 1;
        panel_29_1.add(tglbtnNewToggleButton_1, gbc_tglbtnNewToggleButton_1);

        JPanel panel_35_1 = new JPanel();
        panel_35_1.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_35_1 = new GridBagConstraints();
        gbc_panel_35_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_35_1.anchor = GridBagConstraints.NORTH;
        gbc_panel_35_1.gridx = 0;
        gbc_panel_35_1.gridy = 2;
        panel_29_1.add(panel_35_1, gbc_panel_35_1);

        JPanel panel_22_1 = new JPanel();
        panel_22_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_22_1.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_22_1 = new GridBagLayout();
        gbl_panel_22_1.columnWidths = new int[]{0, 0};
        gbl_panel_22_1.rowHeights = new int[]{22, 0, 0};
        gbl_panel_22_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_22_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_22_1.setLayout(gbl_panel_22_1);

        JPanel panel_25_1 = new JPanel();
        panel_25_1.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_25_1 = new GridBagConstraints();
        gbc_panel_25_1.fill = GridBagConstraints.BOTH;
        gbc_panel_25_1.insets = new Insets(0, 0, 5, 0);
        gbc_panel_25_1.gridx = 0;
        gbc_panel_25_1.gridy = 0;
        panel_22_1.add(panel_25_1, gbc_panel_25_1);

        JTextPane txtpnVilleDeLassociation_1 = new JTextPane();


        JPanel panel_26_1 = new JPanel();
        panel_26_1.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_26_1 = new GridBagConstraints();
        gbc_panel_26_1.fill = GridBagConstraints.BOTH;
        gbc_panel_26_1.gridx = 0;
        gbc_panel_26_1.gridy = 1;
        panel_22_1.add(panel_26_1, gbc_panel_26_1);
        panel_26_1.setLayout(new GridLayout(0, 2, 0, 0));

        JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Présent");
        chckbxNewCheckBox_1_1.setSelected(true);
        chckbxNewCheckBox_1_1.setBackground(Color.LIGHT_GRAY);
        panel_26_1.add(chckbxNewCheckBox_1_1);

        JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Non Présent");
        chckbxNewCheckBox_2_1.setSelected(true);
        chckbxNewCheckBox_2_1.setBackground(Color.LIGHT_GRAY);
        panel_26_1.add(chckbxNewCheckBox_2_1);

        JPanel panel_21_1 = new JPanel();
        panel_21_1.setBackground(Color.GRAY);
        panel_21_1.setLayout(new GridLayout(2, 1, 0, 0));

        JButton btnNewButton_3_1 = new JButton("Ajout rapide Etudiant ");
        btnNewButton_3_1.setIcon(new ImageIcon(ajout));
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            EditEtudiant frame = new EditEtudiant();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        btnNewButton_3_1.setBackground(Color.LIGHT_GRAY);
        panel_21_1.add(btnNewButton_3_1);

        JButton btnNewButton_2_1 = new JButton("Export en format  .csv");
        btnNewButton_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2_1.setIcon(new ImageIcon(csv));
        btnNewButton_2_1.setBackground(Color.LIGHT_GRAY);
        panel_21_1.add(btnNewButton_2_1);
        GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
        gl_panel_1_1.setHorizontalGroup(
                gl_panel_1_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_1_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panel_24_1, GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                                        .addComponent(panel_23_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel_1_1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(panel_22_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panel_21_1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                        .addComponent(panel_29_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        gl_panel_1_1.setVerticalGroup(
                gl_panel_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_1_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel_1_1.createSequentialGroup()
                                                .addComponent(panel_21_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_22_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(panel_29_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1_1.createSequentialGroup()
                                                .addComponent(panel_23_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_24_1, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                                .addGap(6))
        );
        panel_1_1.setLayout(gl_panel_1_1);

        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setBackground(Color.LIGHT_GRAY);
        Image fonction = new ImageIcon(this.getClass().getResource("/fonction.png")).getImage();
        tabbedPane.addTab("Formation", new ImageIcon(fonction), panel_1_1_1, null);

        JPanel panel_24_1_1 = new JPanel();
        panel_24_1_1.setBackground(Color.GRAY);

        JScrollPane scrollPane_1_1 = new JScrollPane();
        GroupLayout gl_panel_24_1_1 = new GroupLayout(panel_24_1_1);
        gl_panel_24_1_1.setHorizontalGroup(
                gl_panel_24_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 881, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_1_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_1_1, GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_24_1_1.setVerticalGroup(
                gl_panel_24_1_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 554, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_1_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_1_1, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel_24_1_1.setLayout(gl_panel_24_1_1);

        JPanel panel_23_1_1 = new JPanel();
        panel_23_1_1.setBackground(Color.GRAY);

        JTextField textField = new JTextField();
        textField.setColumns(10);

        JButton btnNewButton_4_1_1 = new JButton("Rechercher");
        btnNewButton_4_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VidageTableauFormation();
                //RECHERCHE_FORMATION
            }
        });
        btnNewButton_4_1_1.setBackground(Color.WHITE);
        GroupLayout gl_panel_23_1_1 = new GroupLayout(panel_23_1_1);
        gl_panel_23_1_1.setHorizontalGroup(
                gl_panel_23_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_23_1_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_4_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(560))
        );
        gl_panel_23_1_1.setVerticalGroup(
                gl_panel_23_1_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_23_1_1.createSequentialGroup()
                                .addGap(10)
                                .addGroup(gl_panel_23_1_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_4_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                                .addGap(9))
        );
        panel_23_1_1.setLayout(gl_panel_23_1_1);

        JPanel panel_22_1_1 = new JPanel();
        panel_22_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_22_1_1.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_22_1_1 = new GridBagLayout();
        gbl_panel_22_1_1.columnWidths = new int[]{0, 0};
        gbl_panel_22_1_1.rowHeights = new int[]{22, 0, 0};
        gbl_panel_22_1_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_22_1_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_22_1_1.setLayout(gbl_panel_22_1_1);

        JPanel panel_25_1_1 = new JPanel();
        panel_25_1_1.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_25_1_1 = new GridBagConstraints();
        gbc_panel_25_1_1.fill = GridBagConstraints.BOTH;
        gbc_panel_25_1_1.insets = new Insets(0, 0, 5, 0);
        gbc_panel_25_1_1.gridx = 0;
        gbc_panel_25_1_1.gridy = 0;
        panel_22_1_1.add(panel_25_1_1, gbc_panel_25_1_1);

        JTextPane txtpnVilleDeLassociation_1_1 = new JTextPane();


        JPanel panel_26_1_1 = new JPanel();
        panel_26_1_1.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_26_1_1 = new GridBagConstraints();
        gbc_panel_26_1_1.fill = GridBagConstraints.BOTH;
        gbc_panel_26_1_1.gridx = 0;
        gbc_panel_26_1_1.gridy = 1;
        panel_22_1_1.add(panel_26_1_1, gbc_panel_26_1_1);
        panel_26_1_1.setLayout(new GridLayout(0, 2, 0, 0));


        JPanel panel_21_1_1 = new JPanel();
        panel_21_1_1.setBackground(Color.GRAY);
        panel_21_1_1.setLayout(new GridLayout(2, 1, 0, 0));

        JButton btnNewButton_3_1_1 = new JButton("Ajout rapide Formation \r\n");
        btnNewButton_3_1_1.setEnabled(false);
        btnNewButton_3_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_3_1_1.setIcon(new ImageIcon(ajout));
        btnNewButton_3_1_1.setBackground(Color.LIGHT_GRAY);
        panel_21_1_1.add(btnNewButton_3_1_1);

        JButton btnNewButton_2_1_1 = new JButton("Export en format  .csv");
        btnNewButton_2_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2_1_1.setIcon(new ImageIcon(csv));
        btnNewButton_2_1_1.setBackground(Color.LIGHT_GRAY);
        panel_21_1_1.add(btnNewButton_2_1_1);
        GroupLayout gl_panel_1_1_1 = new GroupLayout(panel_1_1_1);
        gl_panel_1_1_1.setHorizontalGroup(
                gl_panel_1_1_1.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_1_1_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panel_24_1_1, GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                                        .addComponent(panel_23_1_1, GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel_1_1_1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel_22_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_21_1_1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        gl_panel_1_1_1.setVerticalGroup(
                gl_panel_1_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_1_1_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_1_1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel_1_1_1.createSequentialGroup()
                                                .addComponent(panel_21_1_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_22_1_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1_1_1.createSequentialGroup()
                                                .addComponent(panel_23_1_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_24_1_1, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                                .addGap(6))
        );
        panel_1_1_1.setLayout(gl_panel_1_1_1);

        JPanel panel_1_5 = new JPanel();
        panel_1_5.setBackground(Color.LIGHT_GRAY);


        JPanel panel_24_5 = new JPanel();
        panel_24_5.setBackground(Color.GRAY);

        JScrollPane scrollPane_5 = new JScrollPane();
        GroupLayout gl_panel_24_5 = new GroupLayout(panel_24_5);
        gl_panel_24_5.setHorizontalGroup(
                gl_panel_24_5.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 875, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_5.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_5, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_24_5.setVerticalGroup(
                gl_panel_24_5.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 533, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_5.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_5, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel_24_5.setLayout(gl_panel_24_5);

        JPanel panel_23_5 = new JPanel();
        panel_23_5.setBackground(Color.GRAY);

        JTextField txtNomEtablissement_1 = new JTextField();
        txtNomEtablissement_1.setColumns(10);

        JButton btnNewButton_4_5 = new JButton("Rechercher");
        btnNewButton_4_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnNewButton_4_5.setBackground(Color.WHITE);

        JComboBox<String> comboBox_5 = new JComboBox<String>();
        GroupLayout gl_panel_23_5 = new GroupLayout(panel_23_5);
        gl_panel_23_5.setHorizontalGroup(
                gl_panel_23_5.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_23_5.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNomEtablissement_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_4_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(305)
                                .addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addGap(21))
        );
        gl_panel_23_5.setVerticalGroup(
                gl_panel_23_5.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.LEADING, gl_panel_23_5.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_23_5.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNomEtablissement_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_4_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_23_5.setLayout(gl_panel_23_5);

        JPanel panel_28_5 = new JPanel();
        panel_28_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_28_5.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_28_5 = new GridBagLayout();
        gbl_panel_28_5.columnWidths = new int[]{0, 0};
        gbl_panel_28_5.rowHeights = new int[]{22, 0, 0};
        gbl_panel_28_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_28_5.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_28_5.setLayout(gbl_panel_28_5);

        JPanel panel_32_5 = new JPanel();
        panel_32_5.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_32_5 = new GridBagConstraints();
        gbc_panel_32_5.fill = GridBagConstraints.BOTH;
        gbc_panel_32_5.insets = new Insets(0, 0, 5, 0);
        gbc_panel_32_5.gridx = 0;
        gbc_panel_32_5.gridy = 0;
        panel_28_5.add(panel_32_5, gbc_panel_32_5);

        JTextPane txtpnCatgorieDeLassociation_5 = new JTextPane();
        txtpnCatgorieDeLassociation_5.setEditable(false);
        panel_32_5.add(txtpnCatgorieDeLassociation_5);

        JPanel panel_33_5 = new JPanel();
        panel_33_5.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_33_5 = new GridBagConstraints();
        gbc_panel_33_5.fill = GridBagConstraints.BOTH;
        gbc_panel_33_5.gridx = 0;
        gbc_panel_33_5.gridy = 1;
        panel_28_5.add(panel_33_5, gbc_panel_33_5);
        panel_33_5.setLayout(new BorderLayout(0, 0));

        JSlider slider = new JSlider();
        slider.setSnapToTicks(true);
        slider.setMinorTickSpacing(500);
        slider.setMajorTickSpacing(1000);
        slider.setPaintTicks(true);
        slider.setValue(0);
        slider.setMaximum(5000);
        slider.setPaintLabels(true);
        slider.setForeground(Color.LIGHT_GRAY);
        panel_33_5.add(slider);

        JPanel panel_22_5 = new JPanel();
        panel_22_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_22_5.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_22_5 = new GridBagLayout();
        gbl_panel_22_5.columnWidths = new int[]{0, 0};
        gbl_panel_22_5.rowHeights = new int[]{22, 0, 0};
        gbl_panel_22_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_22_5.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_22_5.setLayout(gbl_panel_22_5);

        JPanel panel_25_5 = new JPanel();
        panel_25_5.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_25_5 = new GridBagConstraints();
        gbc_panel_25_5.fill = GridBagConstraints.BOTH;
        gbc_panel_25_5.insets = new Insets(0, 0, 5, 0);
        gbc_panel_25_5.gridx = 0;
        gbc_panel_25_5.gridy = 0;
        panel_22_5.add(panel_25_5, gbc_panel_25_5);

        JTextPane txtpnVilleDeLassociation_5 = new JTextPane();
        txtpnVilleDeLassociation_5.setEditable(false);
        panel_25_5.add(txtpnVilleDeLassociation_5);

        JPanel panel_26_5 = new JPanel();
        panel_26_5.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_26_5 = new GridBagConstraints();
        gbc_panel_26_5.fill = GridBagConstraints.BOTH;
        gbc_panel_26_5.gridx = 0;
        gbc_panel_26_5.gridy = 1;
        panel_22_5.add(panel_26_5, gbc_panel_26_5);
        panel_26_5.setLayout(new GridLayout(0, 2, 0, 0));


        JPanel panel_21_5 = new JPanel();
        panel_21_5.setBackground(Color.GRAY);
        panel_21_5.setLayout(new GridLayout(2, 1, 0, 0));





        JButton btnNewButton_2_5 = new JButton("Export en format  .csv");
        btnNewButton_2_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2_5.setIcon(new ImageIcon(csv));
        btnNewButton_2_5.setBackground(Color.LIGHT_GRAY);
        panel_21_5.add(btnNewButton_2_5);
        GroupLayout gl_panel_1_5 = new GroupLayout(panel_1_5);
        gl_panel_1_5.setHorizontalGroup(
                gl_panel_1_5.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_1_5.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_5.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panel_24_5, GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                                        .addComponent(panel_23_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel_1_5.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panel_28_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(gl_panel_1_5.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(panel_22_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panel_21_5, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        gl_panel_1_5.setVerticalGroup(
                gl_panel_1_5.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_1_5.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_5.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel_1_5.createSequentialGroup()
                                                .addComponent(panel_21_5, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_22_5, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_28_5, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1_5.createSequentialGroup()
                                                .addComponent(panel_23_5, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_24_5, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                                .addGap(6))
        );
        panel_1_5.setLayout(gl_panel_1_5);

        JPanel panel_1_3 = new JPanel();
        panel_1_3.setBackground(Color.LIGHT_GRAY);


        Image benevolat = new ImageIcon(this.getClass().getResource("/benevolat.png")).getImage();



        JPanel panel_24_3 = new JPanel();
        panel_24_3.setBackground(Color.GRAY);

        JScrollPane scrollPane_3 = new JScrollPane();
        GroupLayout gl_panel_24_3 = new GroupLayout(panel_24_3);
        gl_panel_24_3.setHorizontalGroup(
                gl_panel_24_3.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 875, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_3.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_24_3.setVerticalGroup(
                gl_panel_24_3.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 554, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_3.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel_24_3.setLayout(gl_panel_24_3);

        JPanel panel_23_3 = new JPanel();
        panel_23_3.setBackground(Color.GRAY);

        JTextField txtNom_1 = new JTextField();
        txtNom_1.setColumns(10);

        JButton btnNewButton_4_3 = new JButton("Rechercher");
        btnNewButton_4_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnNewButton_4_3.setBackground(Color.WHITE);

        JComboBox<String> comboBox_3 = new JComboBox<String>();
        GroupLayout gl_panel_23_3 = new GroupLayout(panel_23_3);
        gl_panel_23_3.setHorizontalGroup(
                gl_panel_23_3.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_23_3.createSequentialGroup()
                                .addGap(6)
                                .addComponent(txtNom_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_4_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(367)
                                .addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addGap(85))
        );
        gl_panel_23_3.setVerticalGroup(
                gl_panel_23_3.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(GroupLayout.Alignment.LEADING, gl_panel_23_3.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_23_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNom_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_4_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel_23_3.setLayout(gl_panel_23_3);

        JPanel panel_29_3 = new JPanel();
        panel_29_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_29_3.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_29_3 = new GridBagLayout();
        gbl_panel_29_3.columnWidths = new int[]{0, 0};
        gbl_panel_29_3.rowHeights = new int[]{22, 0, 0, 0};
        gbl_panel_29_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_29_3.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        panel_29_3.setLayout(gbl_panel_29_3);

        JPanel panel_12_3 = new JPanel();
        panel_12_3.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_12_3 = new GridBagConstraints();
        gbc_panel_12_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_12_3.insets = new Insets(0, 0, 5, 0);
        gbc_panel_12_3.gridx = 0;
        gbc_panel_12_3.gridy = 0;
        panel_29_3.add(panel_12_3, gbc_panel_12_3);

        JTextPane txtpnAutreStructure_3 = new JTextPane();
        txtpnAutreStructure_3.setText("Nombre d'heure minimum\r\n");
        txtpnAutreStructure_3.setEditable(false);
        txtpnAutreStructure_3.setBackground(Color.WHITE);
        panel_12_3.add(txtpnAutreStructure_3);

        JSlider slider_1 = new JSlider();
        slider_1.setValue(0);
        slider_1.setPaintTicks(true);
        slider_1.setPaintLabels(true);
        slider_1.setMinorTickSpacing(5);
        slider_1.setMajorTickSpacing(20);
        GridBagConstraints gbc_slider_1 = new GridBagConstraints();
        gbc_slider_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_slider_1.insets = new Insets(0, 0, 5, 0);
        gbc_slider_1.gridx = 0;
        gbc_slider_1.gridy = 1;
        panel_29_3.add(slider_1, gbc_slider_1);

        JPanel panel_35_3 = new JPanel();
        panel_35_3.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_35_3 = new GridBagConstraints();
        gbc_panel_35_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_35_3.anchor = GridBagConstraints.NORTH;
        gbc_panel_35_3.gridx = 0;
        gbc_panel_35_3.gridy = 2;
        panel_29_3.add(panel_35_3, gbc_panel_35_3);

        JPanel panel_21_3 = new JPanel();
        panel_21_3.setBackground(Color.GRAY);
        panel_21_3.setLayout(new GridLayout(2, 1, 0, 0));



        JButton btnNewButton_2_3 = new JButton("Export en format  .csv");
        btnNewButton_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2_3.setIcon(new ImageIcon(csv));
        btnNewButton_2_3.setBackground(Color.LIGHT_GRAY);
        panel_21_3.add(btnNewButton_2_3);
        GroupLayout gl_panel_1_3 = new GroupLayout(panel_1_3);
        gl_panel_1_3.setHorizontalGroup(
                gl_panel_1_3.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_1_3.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_3.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel_23_3, 0, 0, Short.MAX_VALUE)
                                        .addComponent(panel_24_3, GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(gl_panel_1_3.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(panel_29_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_21_3, GroupLayout.PREFERRED_SIZE, 319, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_panel_1_3.setVerticalGroup(
                gl_panel_1_3.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_1_3.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_3.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel_1_3.createSequentialGroup()
                                                .addComponent(panel_21_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(panel_29_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1_3.createSequentialGroup()
                                                .addComponent(panel_23_3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_24_3, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        panel_1_3.setLayout(gl_panel_1_3);

        JPanel panel_1_4 = new JPanel();
        panel_1_4.setBackground(Color.LIGHT_GRAY);


        JPanel panel_24_4 = new JPanel();
        panel_24_4.setBackground(Color.GRAY);

        JScrollPane scrollPane_4 = new JScrollPane();
        GroupLayout gl_panel_24_4 = new GroupLayout(panel_24_4);
        gl_panel_24_4.setHorizontalGroup(
                gl_panel_24_4.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 875, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_4.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_4, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_24_4.setVerticalGroup(
                gl_panel_24_4.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 554, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_4.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_4, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel_24_4.setLayout(gl_panel_24_4);

        JPanel panel_23_4 = new JPanel();
        panel_23_4.setBackground(Color.GRAY);

        JTextField txtNomEtablissement_2 = new JTextField();
        txtNomEtablissement_2.setText("\r\n");
        txtNomEtablissement_2.setColumns(10);

        JButton btnNewButton_4_4 = new JButton("Rechercher");
        btnNewButton_4_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnNewButton_4_4.setBackground(Color.WHITE);

        JComboBox<String> comboBox_4 = new JComboBox<String>();
        comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"Trier par: année"}));
        GroupLayout gl_panel_23_4 = new GroupLayout(panel_23_4);
        gl_panel_23_4.setHorizontalGroup(
                gl_panel_23_4.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 875, Short.MAX_VALUE)
                        .addGroup(gl_panel_23_4.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNomEtablissement_2, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_4_4, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addGap(370)
                                .addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addGap(36))
        );
        gl_panel_23_4.setVerticalGroup(
                gl_panel_23_4.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addGroup(gl_panel_23_4.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_23_4.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_panel_23_4.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(gl_panel_23_4.createSequentialGroup()
                                                        .addGap(3)
                                                        .addComponent(txtNomEtablissement_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(gl_panel_23_4.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnNewButton_4_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
                                .addGap(9))
        );
        panel_23_4.setLayout(gl_panel_23_4);

        JPanel panel_22_4 = new JPanel();
        panel_22_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_22_4.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_22_4 = new GridBagLayout();
        gbl_panel_22_4.columnWidths = new int[]{0, 0};
        gbl_panel_22_4.rowHeights = new int[]{22, 0, 0};
        gbl_panel_22_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_22_4.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_22_4.setLayout(gbl_panel_22_4);

        JPanel panel_25_4 = new JPanel();
        panel_25_4.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_25_4 = new GridBagConstraints();
        gbc_panel_25_4.fill = GridBagConstraints.BOTH;
        gbc_panel_25_4.insets = new Insets(0, 0, 5, 0);
        gbc_panel_25_4.gridx = 0;
        gbc_panel_25_4.gridy = 0;
        panel_22_4.add(panel_25_4, gbc_panel_25_4);


        JPanel panel_26_4 = new JPanel();
        panel_26_4.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_26_4 = new GridBagConstraints();
        gbc_panel_26_4.fill = GridBagConstraints.BOTH;
        gbc_panel_26_4.gridx = 0;
        gbc_panel_26_4.gridy = 1;
        panel_22_4.add(panel_26_4, gbc_panel_26_4);
        panel_26_4.setLayout(new GridLayout(0, 2, 0, 0));


        JPanel panel_21_4 = new JPanel();
        panel_21_4.setBackground(Color.GRAY);
        panel_21_4.setLayout(new GridLayout(2, 1, 0, 0));

        JButton btnNewButton_3_4 = new JButton("Import par format .csv\r\n");
        btnNewButton_3_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        Image import1 = new ImageIcon(this.getClass().getResource("/import.png")).getImage();
        btnNewButton_3_4.setIcon(new ImageIcon(import1));
        btnNewButton_3_4.setBackground(Color.LIGHT_GRAY);
        panel_21_4.add(btnNewButton_3_4);

        JButton btnNewButton_2_4 = new JButton("Export en format  .csv");
        btnNewButton_2_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_2_4.setIcon(new ImageIcon(csv));
        btnNewButton_2_4.setBackground(Color.LIGHT_GRAY);
        panel_21_4.add(btnNewButton_2_4);

        GroupLayout gl_panel_1_4 = new GroupLayout(panel_1_4);
        gl_panel_1_4.setHorizontalGroup(
                gl_panel_1_4.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_panel_1_4.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_4.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(panel_24_4, GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                                        .addComponent(panel_23_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel_1_4.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel_22_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_21_4, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        gl_panel_1_4.setVerticalGroup(
                gl_panel_1_4.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_1_4.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1_4.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel_1_4.createSequentialGroup()
                                                .addComponent(panel_21_4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_22_4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1_4.createSequentialGroup()
                                                .addComponent(panel_23_4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(panel_24_4, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                                .addGap(6))
        );
        panel_1_4.setLayout(gl_panel_1_4);



        JPanel panel_24_2 = new JPanel();
        panel_24_2.setBackground(Color.GRAY);

        JScrollPane scrollPane_2 = new JScrollPane();
        GroupLayout gl_panel_24_2 = new GroupLayout(panel_24_2);
        gl_panel_24_2.setHorizontalGroup(
                gl_panel_24_2.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 875, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_2.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_24_2.setVerticalGroup(
                gl_panel_24_2.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 554, Short.MAX_VALUE)
                        .addGroup(gl_panel_24_2.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel_24_2.setLayout(gl_panel_24_2);

        JPanel panel_23_2 = new JPanel();
        panel_23_2.setBackground(Color.GRAY);

        JTextField textField_2 = new JTextField();
        textField_2.setColumns(10);

        JButton btnNewButton_4_2 = new JButton("Rechercher");
        btnNewButton_4_2.setBackground(Color.WHITE);

        JComboBox<String> comboBox_2 = new JComboBox<String>();
        GroupLayout gl_panel_23_2 = new GroupLayout(panel_23_2);
        gl_panel_23_2.setHorizontalGroup(
                gl_panel_23_2.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 875, Short.MAX_VALUE)
                        .addGroup(gl_panel_23_2.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_4_2, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addGap(370)
                                .addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addGap(36))
        );
        gl_panel_23_2.setVerticalGroup(
                gl_panel_23_2.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addGroup(gl_panel_23_2.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_23_2.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_panel_23_2.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(gl_panel_23_2.createSequentialGroup()
                                                        .addGap(3)
                                                        .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(gl_panel_23_2.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnNewButton_4_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
                                .addGap(9))
        );
        panel_23_2.setLayout(gl_panel_23_2);

        JPanel panel_29_2 = new JPanel();
        panel_29_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_29_2.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_29_2 = new GridBagLayout();
        gbl_panel_29_2.columnWidths = new int[]{0, 0};
        gbl_panel_29_2.rowHeights = new int[]{22, 0, 0, 0};
        gbl_panel_29_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_29_2.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        panel_29_2.setLayout(gbl_panel_29_2);

        JPanel panel_12_2 = new JPanel();
        panel_12_2.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_12_2 = new GridBagConstraints();
        gbc_panel_12_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_12_2.insets = new Insets(0, 0, 5, 0);
        gbc_panel_12_2.gridx = 0;
        gbc_panel_12_2.gridy = 0;
        panel_29_2.add(panel_12_2, gbc_panel_12_2);

        JTextPane txtpnAutreStructure_2 = new JTextPane();
        txtpnAutreStructure_2.setEditable(false);
        txtpnAutreStructure_2.setBackground(Color.WHITE);
        panel_12_2.add(txtpnAutreStructure_2);

        JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("désactivé");
        tglbtnNewToggleButton_2.setHorizontalAlignment(SwingConstants.LEADING);
        GridBagConstraints gbc_tglbtnNewToggleButton_2 = new GridBagConstraints();
        gbc_tglbtnNewToggleButton_2.insets = new Insets(0, 0, 5, 0);
        gbc_tglbtnNewToggleButton_2.gridx = 0;
        gbc_tglbtnNewToggleButton_2.gridy = 1;
        panel_29_2.add(tglbtnNewToggleButton_2, gbc_tglbtnNewToggleButton_2);

        JPanel panel_35_2 = new JPanel();
        panel_35_2.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_35_2 = new GridBagConstraints();
        gbc_panel_35_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_panel_35_2.anchor = GridBagConstraints.NORTH;
        gbc_panel_35_2.gridx = 0;
        gbc_panel_35_2.gridy = 2;
        panel_29_2.add(panel_35_2, gbc_panel_35_2);

        JPanel panel_27_2 = new JPanel();
        panel_27_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_27_2.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_27_2 = new GridBagLayout();
        gbl_panel_27_2.columnWidths = new int[]{0, 0};
        gbl_panel_27_2.rowHeights = new int[]{22, 0, 0};
        gbl_panel_27_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_27_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_27_2.setLayout(gbl_panel_27_2);

        JPanel panel_30_2 = new JPanel();
        panel_30_2.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_30_2 = new GridBagConstraints();
        gbc_panel_30_2.fill = GridBagConstraints.BOTH;
        gbc_panel_30_2.insets = new Insets(0, 0, 5, 0);
        gbc_panel_30_2.gridx = 0;
        gbc_panel_30_2.gridy = 0;
        panel_27_2.add(panel_30_2, gbc_panel_30_2);

        JTextPane txtpnTerritoireDintervention_2 = new JTextPane();
        txtpnTerritoireDintervention_2.setEditable(false);
        panel_30_2.add(txtpnTerritoireDintervention_2);

        JPanel panel_31_2 = new JPanel();
        panel_31_2.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_31_2 = new GridBagConstraints();
        gbc_panel_31_2.fill = GridBagConstraints.BOTH;
        gbc_panel_31_2.gridx = 0;
        gbc_panel_31_2.gridy = 1;
        panel_27_2.add(panel_31_2, gbc_panel_31_2);
        panel_31_2.setLayout(new GridLayout(0, 2, 0, 0));

        JPanel panel_28_2 = new JPanel();
        panel_28_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_28_2.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_28_2 = new GridBagLayout();
        gbl_panel_28_2.columnWidths = new int[]{0, 0};
        gbl_panel_28_2.rowHeights = new int[]{22, 0, 0};
        gbl_panel_28_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_28_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_28_2.setLayout(gbl_panel_28_2);

        JPanel panel_32_2 = new JPanel();
        panel_32_2.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_32_2 = new GridBagConstraints();
        gbc_panel_32_2.fill = GridBagConstraints.BOTH;
        gbc_panel_32_2.insets = new Insets(0, 0, 5, 0);
        gbc_panel_32_2.gridx = 0;
        gbc_panel_32_2.gridy = 0;
        panel_28_2.add(panel_32_2, gbc_panel_32_2);

        JPanel panel_33_2 = new JPanel();
        panel_33_2.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_33_2 = new GridBagConstraints();
        gbc_panel_33_2.fill = GridBagConstraints.BOTH;
        gbc_panel_33_2.gridx = 0;
        gbc_panel_33_2.gridy = 1;
        panel_28_2.add(panel_33_2, gbc_panel_33_2);
        panel_33_2.setLayout(new GridLayout(4, 2, 0, 0));


        JPanel panel_22_2 = new JPanel();
        panel_22_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.DARK_GRAY));
        panel_22_2.setBackground(Color.LIGHT_GRAY);
        GridBagLayout gbl_panel_22_2 = new GridBagLayout();
        gbl_panel_22_2.columnWidths = new int[]{0, 0};
        gbl_panel_22_2.rowHeights = new int[]{22, 0, 0};
        gbl_panel_22_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_22_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panel_22_2.setLayout(gbl_panel_22_2);

        JPanel panel_25_2 = new JPanel();
        panel_25_2.setBackground(Color.WHITE);
        GridBagConstraints gbc_panel_25_2 = new GridBagConstraints();
        gbc_panel_25_2.fill = GridBagConstraints.BOTH;
        gbc_panel_25_2.insets = new Insets(0, 0, 5, 0);
        gbc_panel_25_2.gridx = 0;
        gbc_panel_25_2.gridy = 0;
        panel_22_2.add(panel_25_2, gbc_panel_25_2);

        JTextPane txtpnVilleDeLassociation_2 = new JTextPane();
        txtpnVilleDeLassociation_2.setEditable(false);
        panel_25_2.add(txtpnVilleDeLassociation_2);

        JPanel panel_26_2 = new JPanel();
        panel_26_2.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc_panel_26_2 = new GridBagConstraints();
        gbc_panel_26_2.fill = GridBagConstraints.BOTH;
        gbc_panel_26_2.gridx = 0;
        gbc_panel_26_2.gridy = 1;
        panel_22_2.add(panel_26_2, gbc_panel_26_2);
        panel_26_2.setLayout(new GridLayout(0, 2, 0, 0));

        JPanel panel_21_2 = new JPanel();
        panel_21_2.setBackground(Color.GRAY);
        panel_21_2.setLayout(new GridLayout(2, 1, 0, 0));

        JButton btnNewButton_3_2 = new JButton("Ajout rapide d'association + JVS");
        btnNewButton_3_2.setBackground(Color.LIGHT_GRAY);
        panel_21_2.add(btnNewButton_3_2);

        JButton btnNewButton_2_2 = new JButton("Export en format  .csv");
        btnNewButton_2_2.setBackground(Color.LIGHT_GRAY);
        panel_21_2.add(btnNewButton_2_2);



        tableEtudiants.setFont(new Font("Tahoma", Font.PLAIN, 10));
        tableEtudiants.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Appel.ligne_tableau = table.getSelectedRow();

                final String cle_1 = (String) tableEtudiants.getModel().getValueAt(tableEtudiants.getSelectedRow(), 0);

                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            AjoutEtudiant frame = new AjoutEtudiant(Integer.parseInt(cle_1));
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                ;



            }
        });
        tableEtudiants.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableEtudiants.setBackground(Color.LIGHT_GRAY);
        tableEtudiants.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "id_E", "Nom ", "Prénom", "Présent"
                }
        ));
        tableEtudiants.getColumnModel().getColumn(0).setPreferredWidth(150);
        scrollPane_1.setViewportView(tableEtudiants);




        tableFormation.setFont(new Font("Tahoma", Font.PLAIN, 10));
        tableFormation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Appel.ligne_tableau = table.getSelectedRow();

                final String num_personne = (String) tableFormation.getModel().getValueAt(tableFormation.getSelectedRow(), 0);

                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            AjoutFormation frame = new AjoutFormation(num_personne);
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                ;



            }
        });
        tableFormation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableFormation.setBackground(Color.LIGHT_GRAY);
        tableFormation.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "id Formation", "Intitulé", "Liste Disciplines"
                }
        ));
        tableFormation.getColumnModel().getColumn(0).setPreferredWidth(150);
        scrollPane_1_1.setViewportView(tableFormation);











        JButton btnNewButton_4 = new JButton("Rechercher");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VidageTableauEtablissement();




            }
        });
        btnNewButton_4.setBackground(Color.WHITE);


        JTextField txtNomEtablissement = new JTextField();
        txtNomEtablissement.setColumns(20);
        txtNomEtablissement.setHorizontalAlignment(SwingConstants.CENTER);
        txtNomEtablissement.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        txtNomEtablissement.setColumns(10);

        JButton btnCopieDesAdresses = new JButton("Actualisation");

        btnCopieDesAdresses.setFont(new Font("Dialog", Font.PLAIN, 10));
        btnCopieDesAdresses.setBackground(Color.WHITE);
        GroupLayout gl_panel_23 = new GroupLayout(panel_23);
        gl_panel_23.setHorizontalGroup(
                gl_panel_23.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_23.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNomEtablissement, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addGap(80)
                                .addComponent(btnCopieDesAdresses, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_panel_23.setVerticalGroup(
                gl_panel_23.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel_23.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_23.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNomEtablissement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCopieDesAdresses))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_23.setLayout(gl_panel_23);
        panel_21.setLayout(new GridLayout(2, 1, 0, 0));




    }
}
