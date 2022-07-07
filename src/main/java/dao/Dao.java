package dao;

import com.mongodb.client.MongoDatabase;
import main.MongoDBConnection;
import model.Adresse;
import model.Etablissement;
import model.Etudiant;
import org.bson.Document;

import java.util.ArrayList;


/**
 * @param <T>
 *Les différents DAO hérite de cette classe, contient les méthodes de bases des collections
 */
public abstract class Dao<T> {

	// ici je récupère ma database qui est initialisée à l'aide de la classe que l'on a créé MongoDBConnection
	protected MongoDatabase database = MongoDBConnection.getDatabase();

	/**
	 * @param obj Objet
	 * @return Vraie si l'objet a été correctement créé dans la collection
	 */
    public abstract boolean create(T obj);

	/**
	 * @param obj Objet
	 * @return Vraie si l'objet a été correctement supprimmé dans la collection
	 */
	public abstract boolean delete(T obj);

	/**
	 * @param obj Objet
	 * @return Vraie si l'objet a été correctement modifié dans la collection
	 */
	public abstract boolean update(T obj);

	/**
	 * @param obj Objet à rechercher
	 * @return Objet s'il a été trouver dans la collection
	 */
	public abstract T find(T obj);

	/**
	 * @return Retourne la liste d'objet d'une collection
	 */
	public abstract ArrayList<T> findAll();

	/**
	 * @return Vraie si la collection a été correctement supprimmé
	 */
	public abstract boolean DropCollection();
}
