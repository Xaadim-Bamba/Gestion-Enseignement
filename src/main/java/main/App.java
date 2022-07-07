package main;

import GUI.Fenetre_Principal;
import dao.Dao;
import dao.DaoFactory;
import model.*;
import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;


/**
 * Contient la méthode main, Appelle les autres fonctions du programme
 */
public class App {
    public static void main( String[] args ) throws JAXBException, IOException, TransformerException, SAXException {

        //DAO
        Dao<Adresse> adresseDao = DaoFactory.getAdresseDAO();
        Dao<Etudiant> etudiantDao = DaoFactory.getEtudiantDAO();
        Dao<Formation> formationDao = DaoFactory.getFormationDAO();
        Dao<Etablissement> etablissementDao = DaoFactory.getEtablissementDAO();

        //BDD
        Utils.BDD_Reset(adresseDao,etablissementDao,etudiantDao,formationDao);

        //DEMONSTRATION DES FONCTIONNALITES
        System.out.println("=========================================================================");
        System.out.println("DEMONSTRATION DES FONCTIONNALITES");
        Adresse ad1 = new Adresse(4, "Rue Rabelaie", "Angers", 49000, "49", 49.3, 49.7);


        //De rajouter/modifier une formation
        ArrayList Disciplines_MIASHS = new ArrayList() {{
            add("Classification Automatique");
            add("Prévision sur  Séries Chronollogique");
            add("Technologie XML et Bases de Données");
        }};
        Formation formation = new Formation(49, "Master MASHS", Disciplines_MIASHS);
        formationDao.create(formation);

        // De rajouter/modifier un étudiant
        Etudiant etudiant = new Etudiant(235488, "Charles", "Vitry", ad1, formation, "present");
        etudiantDao.create(etudiant);

        // De rajouter/modifier un établissement
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        ArrayList<String> diplomes = new ArrayList<>();

        diplomes.add("Licences");
        diplomes.add("Master");
        etudiants.add(etudiant);

        ArrayList<Formation> formations = new ArrayList<>();
        formations.add(formation);

        Etablissement eta1 = new Etablissement("hf8ui91az", "UCO", "UCO ANGERS", "0245784554", "Université", "public", "Nantes", ad1, etudiants, diplomes,  formations);
        etablissementDao.create(eta1);
        Etablissements etablissements = new Etablissements(etablissementDao.findAll());


        //Modifier un étudiant
        etudiant = new Etudiant(235488, "Charles", "Vitry", ad1, formation, "abscent");
        etudiantDao.update(etudiant);
        System.out.println(etudiant);


        // De rechercher un étudiant par numéro d’étudiant
        System.out.println("◉Rechercher un étudiant par numéro d’étudiant");
        Etudiant recherche_etudiant = new Etudiant(5, "", "", ad1, formation, "");
        System.out.println((etudiantDao.find(recherche_etudiant)).toString());

        // De rechercher un établissement (par numéro de SIRET ou par commune)
        System.out.println("◉Rechercher un établissement par numéro de SIRET");
        Etablissement recherche_Etablissement = new Etablissement("hf8ui91az", "", "", "", "", "", "", ad1, etudiants, diplomes,  formations);
        System.out.println((etablissementDao.find(recherche_Etablissement)).toString());

        // De rechercher une formation (par intitulé)
        System.out.println("◉Rechercher une formation par intitulé");
        Formation recherche_Formation = new Formation(0, "Génie civil", new ArrayList<String>());
        System.out.println((formationDao.find(recherche_Formation)).toString());

        System.out.println("=========================================================================");

        //De lister l’ensemble des formations
        System.out.println("◉De lister l’ensemble des formations");
        formationDao.findAll();
        Utils.Affichage_liste_Formations(formationDao);

        System.out.println("=========================================================================");

        //De lister l’ensemble des établissements
        System.out.println("◉De lister l’ensemble des établissements");
        etablissementDao.findAll();
        //Utils.Affichage_liste_Etablissements(etablissements); Il y en a trop à afficher
        System.out.println(eta1);


        System.out.println("=========================================================================");

        //De lister l’ensemble des étudiants
        System.out.println("◉De lister l’ensemble des étudiants");
        etudiantDao.findAll();
        Utils.Affichage_liste_Etudiants(etudiantDao);

        System.out.println("=========================================================================");

        //De lister les cours d’un étudiant
        System.out.println("◉De lister les cours d’un étudiant");
        System.out.println((Utils.Liste_de_Cours_Etudiant(etudiant)).toString());

        //L’application doit aussi générer une page HTML représentant les différentes
        //informations des établissements (à l’aide d’une transformation XSLT)


        //De faire une extraction des données des établissements sous format XML (en
        //        utilisant DOM, SAX ou JAXB)
        Utils.generateXml(etablissements);

        //Generation HTML
        Utils.generateWithXSLtransformer();

        //Demarrage Interface

        try {
            Fenetre_Principal window = new Fenetre_Principal();
            window.frEtablissement.setVisible(true);
            Fenetre_Principal.Tableau_Etablissement(etablissements);
            Fenetre_Principal.Tableau_Etudiant(etudiantDao);
            Fenetre_Principal.Tableau_Formation(formationDao);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Utils.OpenInWebBrowser("src/AffichageWeb/Accueil.html");


        //Boucle de choix

        Scanner clavier = new Scanner(System.in);
        int choix;

        System.out.println("Bonjour et bienvenue dans notre programme de gestion de l’ensemble des établissements \n" +
                "d’enseignement supérieur en Pays de la Loire.");
        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Que voulez vous faire ? ");


            System.out.println("Jeux de données");
            System.out.println("1 - Réinitialisation des jeux de données ");
            System.out.println("2 - Outdated ");
            System.out.println("Ajouter, Modifier, Supprimmer");
            System.out.println("3 - Ajouter un étudiant");
            System.out.println("4 - Modifier un étudiant");
            System.out.println("5- Ajouter un Etablissement");
            System.out.println("6- Modifier un Etablissement");
            System.out.println("7- Ajouter une Formation");
            System.out.println("8- Modifier une Formation");
            System.out.println("Rechercher");
            System.out.println("9- Rechercher un étudiant");
            System.out.println("10- Rechercher un établissement");
            System.out.println("11- Rechercher une formation");
            System.out.println("LISTER ");
            System.out.println("12- Lister Etudiants");
            System.out.println("13- Lister Formations");
            System.out.println("14- Lister Etablissements");
            System.out.println("15- Lister cours d'un étudiant");
            System.out.println("GENERATION");
            System.out.println("16- Extraction des données des établissements sous format XML");
            System.out.println("17- Générer une page HTML représentant les différentes \n" +
                    "informations des établissements");
            System.out.println("999- Pour quitter.");
            System.out.print("Votre choix : (INT)");
            System.out.println(" ");
            System.out.println(" ");
            choix = clavier.nextInt();
            try {
                switch (choix) {

                    case 1 :
                        System.out.println("Réinitialisation des jeux de données  en cours");
                        Utils.BDD_Reset(adresseDao,etablissementDao,etudiantDao,formationDao);

                        break;

                    case 2 :
                        System.out.println("");
                        break;

                    case 3 :
                        System.out.println(" Ajout un étudiant");
                        System.out.print("ID : (INT)");
                        int id = clavier.nextInt();

                        System.out.print("Nom : ");
                        String Nom = clavier.next();

                        System.out.print("Prenom : ");
                        String Prenom = clavier.next();

                        System.out.print("Présent : ");
                        String Present = clavier.next();

                        Etudiant etudiant1 = new Etudiant(id, Nom, Prenom, ad1, formation, Present);
                        etudiantDao.create(etudiant1);

                        break;

                    case 4 :
                        System.out.println("Modifier étudiant");
                        System.out.print("ID : (INT)");
                        int id1 = clavier.nextInt();

                        System.out.print("Nom : ");
                        String Nom1 = clavier.next();

                        System.out.print("Prenom : ");
                        String Prenom1 = clavier.next();

                        System.out.print("Présent : ");
                        String Present1 = clavier.next();


                        Etudiant etudiant2 = new Etudiant(id1, Nom1, Prenom1, ad1, formation, Present1);
                        etudiantDao.update(etudiant2);
                        System.out.println(etudiant2);


                        break;



                    case 5 :
                        System.out.println("Ajout Etablissement");
                        System.out.print("ID : ");
                        String id3 = clavier.next();

                        System.out.print("Sigle : ");
                        String Sigle = clavier.next();

                        System.out.print("Nom : ");
                        String Nom3 = clavier.next();

                        System.out.print("Téléphone : ");
                        String Telephone = clavier.next();

                        System.out.print("Type d'établissement : ");
                        String Type = clavier.next();

                        System.out.print("Statut : ");
                        String Statut = clavier.next();

                        System.out.print("Université de rattachement : ");
                        String Universite_rattach = clavier.next();

                        Etablissement eta2 = new Etablissement(id3, Sigle, Nom3, Telephone, Type, Statut, Universite_rattach, ad1, etudiants, diplomes,  formations);
                        etablissementDao.create(eta2);
                        etablissements = new Etablissements(etablissementDao.findAll());
                        break;

                    case 6 :
                        System.out.println("Modifier Etablissement");
                        System.out.print("ID : ");
                        String id4 = clavier.next();

                        System.out.print("Sigle : ");
                        String Sigle1 = clavier.next();

                        System.out.print("Nom : ");
                        String Nom4 = clavier.next();

                        System.out.print("Téléphone : ");
                        String Telephone1 = clavier.next();

                        System.out.print("Type d'établissement : ");
                        String Type1 = clavier.next();

                        System.out.print("Statut : ");
                        String Statut1 = clavier.next();

                        System.out.print("Université de rattachement : ");
                        String Universite_rattach1 = clavier.next();

                        eta2 = new Etablissement(id4, Sigle1, Nom4, Telephone1, Type1, Statut1, Universite_rattach1, ad1, etudiants, diplomes,  formations);
                        etablissementDao.update(eta2);
                        break;

                    case 7 :
                        System.out.println("Ajout Formation");
                        System.out.print("ID : (INT) ");
                        int id5 = clavier.nextInt();

                        System.out.print("Intitule : ");
                        String Intitule = clavier.next();

                        Formation formation1 = new Formation(id5, Intitule, Disciplines_MIASHS);
                        formationDao.create(formation1);
                        break;


                    case 8 :
                        System.out.println("Modifier Formation");
                        System.out.print("ID : (INT)");
                        int id6 = clavier.nextInt();

                        System.out.print("Intitule : ");
                        String Intitule1 = clavier.next();

                         formation1 = new Formation(id6, Intitule1, Disciplines_MIASHS);
                        formationDao.update(formation1);
                        break;

                    case 9 :

                        System.out.println("Recherche étudiant ");
                        System.out.println("◉Rechercher un étudiant par numéro d’étudiant");
                        System.out.print("Numéro de l'étudiant : (INT)");
                        int id7 = clavier.nextInt();

                        Etudiant recherche_etudiant1 = new Etudiant(id7, "", "", ad1, formation, "");
                        System.out.println((etudiantDao.find(recherche_etudiant1)).toString());
                        break;



                    case 10 :
                        System.out.println("Recherche établissement");
                        System.out.println("◉Rechercher un établissement par numéro de SIRET");
                        System.out.print("Siret de l'établissement : ");
                        String id8 = clavier.next();
                        Etablissement recherche_Etablissement1 = new Etablissement(id8, "", "", "", "", "", "", ad1, etudiants, diplomes,  formations);
                        System.out.println((etablissementDao.find(recherche_Etablissement1)).toString());

                        break;

                    case 11 :
                        System.out.println("Recherche formation");
                        System.out.println("◉Rechercher une formation par intitulé");
                        System.out.print("Intitule : ");
                        String Intitule2 = clavier.next();
                        Formation recherche_Formation1 = new Formation(0, Intitule2, new ArrayList<String>());
                        System.out.println((formationDao.find(recherche_Formation1)).toString());
                        break;

                    case 12 :
                        System.out.println("Lister Etudiants");
                        System.out.println("◉De lister l’ensemble des étudiants");
                        etudiantDao.findAll();
                        Utils.Affichage_liste_Etudiants(etudiantDao);


                        break;

                    case 13 :
                        System.out.println("Lister Formations");
                        System.out.println("◉De lister l’ensemble des formations");
                        formationDao.findAll();
                        Utils.Affichage_liste_Formations(formationDao);


                        break;


                    case 14 :

                        System.out.println("Lister Etablissements");
                        System.out.println("◉De lister l’ensemble des établissements");
                        etablissementDao.findAll();
                        Utils.Affichage_liste_Etablissements(etablissements);


                        break;

                    case 15 :
                        System.out.println("Lister cours d'un étudiant");
                        System.out.println("◉De lister les cours d’un étudiant");
                        System.out.print("ID Etudiant : (INT)");
                        int id9 = clavier.nextInt();

                        Etudiant recherche_etudiant2 = new Etudiant(id9, "", "", ad1, formation, "");
                        System.out.println((Utils.Liste_de_Cours_Etudiant(etudiantDao.find(recherche_etudiant2))).toString());



                        break;

                    case 16 :
                        System.out.println("Extraction des données des établissements sous format XML");
                        Utils.generateXml(etablissements);
                        Utils.OpenInWebBrowser("src/AffichageWeb/Accueil.html");


                        break;

                    case 17 :
                        System.out.println("Génération page HTML");
                        Utils.generateWithXSLtransformer();


                        break;

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (choix !=999);




    }
}

