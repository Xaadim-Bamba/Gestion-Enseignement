package dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;

import model.*;
import org.bson.Document;
import model.Adresse;
import org.bson.conversions.Bson;

import java.util.ArrayList;



public class EtablissementDao extends Dao<Etablissement> {

    MongoCollection<Document> collection = database.getCollection("etablissement");


    private Document generateDocument(Etablissement obj){
        Document document = new Document();

        document.put("id_Eta", obj.getId_Eta());
        document.put("sigle", obj.getSigle());
        document.put("nom", obj.getNom());
        document.put("telephone", obj.getTelephone());
        document.put("TypeEtablissement", obj.getTypeEtablissement());
        document.put("statut", obj.getStatut());
        document.put("Universite_de_Rattachement", obj.getUniversite_de_Rattachement());

        // adresse établissement
        Document adrDocument = new Document();
        adrDocument.put("numero", obj.getAdresse().getNumero());
        adrDocument.put("voie", obj.getAdresse().getVoie());
        adrDocument.put("ville", obj.getAdresse().getVille());
        adrDocument.put("codePostal", obj.getAdresse().getCodePostal());
        adrDocument.put("departement", obj.getAdresse().getDepartement());
        adrDocument.put("longitude", obj.getAdresse().getLongitude());
        adrDocument.put("latitude", obj.getAdresse().getLatitude());

        document.put("adresse", adrDocument);

        // création liste étudiant
        ArrayList<Document> etudiants = new ArrayList<Document>();
        for (Etudiant etudiant : obj.getListe_Etudiant()) {
            Document etDocument = new Document();

            etDocument.put("id_E", etudiant.getId_E());
            etDocument.put("nom", etudiant.getNom());
            etDocument.put("prenom", etudiant.getPrenom());

            // adresse de l'étudiant
            Document adretDocument = new Document();
            adretDocument.put("numero", etudiant.getAdresse().getNumero());
            adretDocument.put("voie", etudiant.getAdresse().getVoie());
            adretDocument.put("ville", etudiant.getAdresse().getVille());
            adretDocument.put("codePostal", etudiant.getAdresse().getCodePostal());
            adretDocument.put("departement", etudiant.getAdresse().getDepartement());
            adretDocument.put("longitude", etudiant.getAdresse().getLongitude());
            adretDocument.put("latitude", etudiant.getAdresse().getLatitude());

            etDocument.put("adresse", adretDocument);

            // formation de l'etudiant
            Document foretDocument = new Document();
            foretDocument.put("id_F", etudiant.getFormation().getid_f());
            foretDocument.put("Intitule", etudiant.getFormation().getIntitule());
            foretDocument.put("ListeDisciplines", etudiant.getFormation().getListeDisciplines());

            etDocument.put("formation", foretDocument);

            etDocument.put("present", etudiant.getPresent());
            etudiants.add(etDocument);
        }
        document.put("Liste_Etudiant", etudiants);

        document.put("Liste_De_Diplome", obj.getListe_De_Diplome());

        // création liste des formations :
        ArrayList<Document> formations = new ArrayList<Document>();
        for (Formation formation : obj.getListe_De_Formations()) {
            Document forDocument = new Document();
            forDocument.put("id_F", formation.getid_f());
            forDocument.put("Intitule", formation.getIntitule());
            forDocument.put("ListeDisciplines", formation.getListeDisciplines());
            formations.add(forDocument);
        }
        document.put("Liste_De_Formations", formations);

        return document;
    }

    private Etablissement generateObject(Document document){

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

        ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
        for (Document etudDoc : (ArrayList<Document>) document.get("Liste_Etudiant")) {

            System.out.println(etudDoc);
            Document adretDocument = (Document) document.get("adresse");
            Adresse adresseet = new Adresse(
                    adretDocument.getInteger("numero"),
                    adretDocument.getString("voie"),
                    adretDocument.getString("ville"),
                    adretDocument.getInteger("codePostal"),
                    adretDocument.getString("departement"),
                    adretDocument.getDouble("longitude"),
                    adretDocument.getDouble("latitude")
            );

            Document formDocument = (Document) document.get("formation");
            //System.out.println(formDocument);

            ArrayList Disciplines_MIASHS = new ArrayList() {{
                add("Classification Automatique");
                add("Prévision sur  Séries Chronollogique");
                add("Technologie XML et Bases de Données");
            }};

            Formation formation = new Formation(
                    49, "Master MASHS", Disciplines_MIASHS
                    //formDocument.getInteger("id_F"),
                    //formDocument.getString("Intitule"),
                  //  (ArrayList<String>) formDocument.get("ListeDisciplines")
            );

            Etudiant etu = new Etudiant(
                    etudDoc.getInteger("id_E"),
                    etudDoc.getString("nom"),
                    etudDoc.getString("prenom"),
                    adresseet,
                    formation,
                    etudDoc.getString("present")

            );
            etudiants.add(etu);
        }

        ArrayList<Formation> formations = new ArrayList<Formation>();
        for (Document forDoc : (ArrayList<Document>) document.get("Liste_De_Formations")) {
            Formation formation = new Formation(
                    forDoc.getInteger("id_F"),
                    forDoc.getString("Intitule"),
                    (ArrayList<String>) forDoc.get("ListeDisciplines")
            );
            formations.add(formation);
        }


        Etablissement etablissement = new Etablissement(
                document.getString("id_E"),
                document.getString("sigle"),
                document.getString("nom"),
                document.getString("telephone"),
                document.getString("TypeEtablissement"),
                document.getString("statut"),
                document.getString("Universite_de_Rattachement"),
                adresse,
                etudiants,
                (ArrayList<String>) document.get("Liste_De_Diplome"),
                formations

        );

        return etablissement;



    }

    /*
    private boolean UpdateEtudiantArraylist(Etablissement obj){
        obj.getListe_Etudiant();


        return true;
    }
    */

    @Override
    public boolean create(Etablissement obj) {
        collection.insertOne(generateDocument(obj));
      //  System.out.println("Etablissement créer avec succès !");
        return true;
    }
    //modif

    @Override
    public boolean delete(Etablissement obj) {
        collection.deleteOne(Filters.eq("id_Eta", obj.getId_Eta()));
        return true;
    }

    @Override
    public boolean update(Etablissement obj) {
      //  collection.findOneAndReplace(Filters.eq("id_Eta", obj.getId_Eta()), generateDocument(obj));
        Bson Update = new Document("$set",generateDocument(obj));
        collection.updateOne(Filters.eq("id_Eta", obj.getId_Eta()),Update);
        return true;
    }

    @Override
    public Etablissement find(Etablissement obj) {
        Document document = collection.find(Filters.eq("id_Eta", obj.getId_Eta())).first();
        return generateObject(document);
    }

    @Override
    public ArrayList<Etablissement> findAll() {
        ArrayList<Etablissement> Etablissements = new ArrayList<Etablissement>();
        FindIterable<Document> documents = collection.find();
        MongoCursor<Document> cursor = documents.iterator();
        while(cursor.hasNext()){
            Document document = cursor.next();
            Etablissements.add(generateObject(document));
        }
        return Etablissements;
    }

    @Override
    public boolean DropCollection() {
        collection.drop();
        return true;
    }
}
