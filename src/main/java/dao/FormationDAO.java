package dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import model.Adresse;
import model.Etudiant;
import  model.Formation;
import model.Etablissement;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.text.Normalizer;
import java.util.ArrayList;



public class FormationDAO extends Dao<Formation> {

    MongoCollection<Document> collection = database.getCollection("formation");

    private Document generateDocument(Formation obj){
        Document document = new Document();

        document.put("id_F", obj.getid_f());
        document.put("Intitule", obj.getIntitule());
        document.put("ListeDisciplines", obj.getListeDisciplines());

        return(document);
    }

    private Formation generateObject(Document document){
        Formation formation = new Formation(
                document.getInteger("id_F"),
                document.getString("Intitule"),
                (ArrayList<String>) document.get("ListeDisciplines"));
        return(formation);
    }

    @Override
    public boolean create(Formation obj) {
        collection.insertOne(generateDocument(obj));
       // System.out.println("Formation créé avec succès !");
        return true;
    }

    @Override
    public boolean delete(Formation obj) {
        collection.deleteOne(Filters.eq("id_F", obj.getid_f()));
        return true;

    }

    @Override
    public boolean update(Formation obj) {
     //   collection.findOneAndReplace(Filters.eq("id_F", obj.getid_f()),generateDocument(obj));
        Bson Update = new Document("$set",generateDocument(obj));
        collection.updateOne(Filters.eq("id_F", obj.getid_f()), Update);

        return true;
    }


    @Override
    public Formation find(Formation obj) {
        Document document = collection.find(Filters.eq("Intitule", obj.getIntitule())).first();
        return generateObject(document);
    }


    @Override
    public ArrayList<Formation> findAll() {
        ArrayList<Formation> formations = new ArrayList<Formation>();
        FindIterable<Document> documents = collection.find();
        MongoCursor<Document> cursor = documents.iterator();
        while (cursor.hasNext()) {
            Document document = cursor.next();
            formations.add(generateObject(document));
        }
        return formations;
    }

    @Override
    public boolean DropCollection() {
        collection.drop();
        return true;
    }

}