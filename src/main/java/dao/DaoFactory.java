package dao;

import model.Adresse;
import model.Etudiant;
import model.Formation;
import model.Etablissement;

/**
 * Getters des DAO
 */
public class DaoFactory {

	public static Dao<Adresse> getAdresseDAO(){
		return new AdresseDao();
	}

	public static Dao<Etudiant> getEtudiantDAO() { return new EtudiantDao(); }

	public static Dao<Formation> getFormationDAO() {return new FormationDAO(); }

	public static Dao<Etablissement> getEtablissementDAO(){ return  new EtablissementDao();}


}
