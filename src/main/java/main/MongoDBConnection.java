package main;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Connexion avec la BDD, pattern Singleton
 */
public class MongoDBConnection {
	  	private String url;
	    private static String database; //ici je met le nom de ma database
	    private static MongoDatabase mongoDatabase;

	    private MongoDBConnection() {
	        if (mongoDatabase == null){
	            readConfig();
	            mongoDatabase = MongoClients.create(url).getDatabase(database);
			}
		}

	    public void readConfig(){
	        try {
	            // je charge mon fichier de configuration
	            InputStream input = new FileInputStream("config.properties");
	            Properties properties = new Properties();
	            // je charge les propriétés
	            properties.load(input);
	            // je récupère les valeurs des propriétés
	            this.url = properties.getProperty("url");
	            database = properties.getProperty("database");
	        }catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


	    public static MongoDatabase getDatabase() {
	        if (mongoDatabase == null)
	              new MongoDBConnection();
	        return mongoDatabase;

	    }
}
