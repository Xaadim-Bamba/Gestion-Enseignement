package model;

public class Etudiant {

    private int id_E;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Formation formation;
    private String present;




    public Etudiant(int id_e, String nom, String prenom, Adresse adresse, Formation formation, String present) {
        super();
        this.id_E = id_e;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.formation = formation;
        this.present = present;
    }


    public int getId_E() {
        return id_E;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Formation getFormation() {
        return formation;
    }

    public String getPresent() {
        return present;
    }


    public void setId_E(int id_E) {
        this.id_E = id_E;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public void setPresent(String present) {
        this.present = present;
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "id_E=" + id_E +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                ", formation=" + formation +
                ", present='" + present + '\'' +
                '}';
    }
    public String[] MinimaltoString() {
        return new String[]{String.valueOf(id_E),nom,prenom,present};
    }

}

