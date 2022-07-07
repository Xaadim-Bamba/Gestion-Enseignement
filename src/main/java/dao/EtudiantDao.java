package dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import model.Etudiant;
import model.Adresse;
import model.Formation;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;

public class EtudiantDao extends Dao<Etudiant> {

    MongoCollection<Document> collection = database.getCollection("etudiant");


    private Document generateDocument(Etudiant obj){
        Document document = new Document();

        document.put("id_E", obj.getId_E());
        document.put("nom", obj.getNom());
        document.put("prenom", obj.getPrenom());

        //ajout adresse
        Document adrDocument = new Document();
        adrDocument.put("numero", obj.getAdresse().getNumero());
        adrDocument.put("voie", obj.getAdresse().getVoie());
        adrDocument.put("ville", obj.getAdresse().getVille());
        adrDocument.put("codePostal", obj.getAdresse().getCodePostal());
        adrDocument.put("departement", obj.getAdresse().getDepartement());
        adrDocument.put("longitude", obj.getAdresse().getLongitude());
        adrDocument.put("latitude", obj.getAdresse().getLatitude());

        document.put("adresse", adrDocument);

        Document forDocument = new Document();
        forDocument.put("id_F", obj.getFormation().getid_f());
        forDocument.put("Intitule", obj.getFormation().getIntitule());
        forDocument.put("ListeDisciplines", obj.getFormation().getListeDisciplines());
        document.put("formation", forDocument);

        document.put("present", obj.getPresent());

        return document;
    }

    private Etudiant generateObject(Document document){
        Document adrDocument = (Document) document.get("adresse");
        Adresse adresse = new Adresse(
                adrDocument.getInteger("numero"),
                adrDocument.getString("voie"),
                adrDocument.getString("ville"),
                adrDocument.getInteger("codePostal"),
                adrDocument.getString("departement"),
                adrDocument.getDouble("longitude"),
                adrDocument.getDouble("latitude")
        );

        Document formDocument = (Document) document.get("formation");
        Formation formation = new Formation(
                formDocument.getInteger("id_F"),
                formDocument.getString("Intitule"),
                (ArrayList<String>) formDocument.get("ListeDisciplines")
        );

        Etudiant etu = new Etudiant(
                document.getInteger("id_E"),
                document.getString("nom"),
                document.getString("prenom"),
                adresse,
                formation,
                document.getString("present")

        );

        return etu;



    }



    public boolean create(Etudiant obj) {
        collection.insertOne(generateDocument(obj));
        return true;
    }

    @Override
    public boolean delete(Etudiant obj) {
        collection.deleteOne(Filters.eq("id_E",obj.getId_E()));
        return true;
    }

    @Override
    public boolean update(Etudiant obj) {
   //  collection.findOneAndReplace(Filters.eq("id_E", obj.getId_E()), generateDocument(obj));
        Bson Update = new Document("$set",generateDocument(obj));
        collection.updateOne(Filters.eq("id_E", obj.getId_E()),Update);
        return true;
    }

    @Override
    public Etudiant find(Etudiant obj) {
        Document document = collection.find(Filters.eq("id_E", obj.getId_E())).first();
        //System.out.println("Etudiant trouvé");
       return generateObject(document);
    }

    @Override
    public ArrayList<Etudiant> findAll() {
        ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
        FindIterable<Document> documents = collection.find();
        MongoCursor<Document> cursor = documents.iterator();
        while(cursor.hasNext()){
            Document document = cursor.next();
            etudiants.add(generateObject(document));
        }
        return etudiants;
    }
    public boolean DropCollection(){
        collection.drop();
        return true;

    }

}
