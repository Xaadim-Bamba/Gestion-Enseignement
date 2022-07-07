package model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="etablissement")
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissement {
    @XmlElement
    private String id_Eta;
    @XmlElement
    private String sigle;
    @XmlElement
    private String nom;
    @XmlElement
    private String telephone;
    @XmlElement
    private String TypeEtablissement;
    @XmlElement
    private String statut; //public privé privé sous contrat
    @XmlElement
    private String Universite_de_Rattachement;
    @XmlElement
    private Adresse adresse;
    @XmlElement
    private ArrayList<Etudiant> Liste_Etudiant;
    @XmlElement
    private ArrayList<String> Liste_De_Diplome;
    @XmlElement
    private ArrayList<Formation> Liste_De_Formations;

    public Etablissement(String id_Eta, String sigle, String nom, String telephone, String typeEtablissement, String statut, String universite_de_Rattachement, Adresse adresse, ArrayList<Etudiant> liste_Etudiant, ArrayList<String> liste_De_Diplome, ArrayList<Formation> liste_De_Formations) {
        this.id_Eta = id_Eta;
        this.sigle = sigle;
        this.nom = nom;
        this.telephone = telephone;
        this.TypeEtablissement = typeEtablissement;
        this.statut = statut;
        this.Universite_de_Rattachement = universite_de_Rattachement;
        this.adresse = adresse;
        this.Liste_Etudiant = liste_Etudiant;
        this.Liste_De_Diplome = liste_De_Diplome;
        this.Liste_De_Formations = liste_De_Formations;
    }

    public Etablissement() {

    }

    public String getId_Eta() {
        return id_Eta;
    }

    public void setId_Eta(String id_Eta) {
        this.id_Eta = id_Eta;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTypeEtablissement() {
        return TypeEtablissement;
    }

    public void setTypeEtablissement(String typeEtablissement) {
        TypeEtablissement = typeEtablissement;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getUniversite_de_Rattachement() {
        return Universite_de_Rattachement;
    }

    public void setUniversite_de_Rattachement(String universite_de_Rattachement) {
        Universite_de_Rattachement = universite_de_Rattachement;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Etudiant> getListe_Etudiant() {
        return Liste_Etudiant;
    }

    public void setListe_Etudiant(ArrayList<Etudiant> liste_Etudiant) {
        Liste_Etudiant = liste_Etudiant;
    }

    public ArrayList<String> getListe_De_Diplome() {
        return Liste_De_Diplome;
    }

    public void setListe_De_Diplome(ArrayList<String> liste_De_Diplome) {
        Liste_De_Diplome = liste_De_Diplome;
    }

    public ArrayList<Formation> getListe_De_Formations() {
        return Liste_De_Formations;
    }

    public void setListe_De_Formations(ArrayList<Formation> liste_De_Formations) {
        Liste_De_Formations = liste_De_Formations;
    }

    @Override
    public String toString() {
        return "Etablissement{" +
                "id_Eta=" + id_Eta +
                ", sigle='" + sigle + '\'' +
                ", nom='" + nom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", TypeEtablissement='" + TypeEtablissement + '\'' +
                ", statut='" + statut + '\'' +
                ", Universite_de_Rattachement='" + Universite_de_Rattachement + '\'' +
                ", adresse=" + adresse +
                ", Liste_Etudiant=" + Liste_Etudiant +
                ", Liste_De_Diplome=" + Liste_De_Diplome +
                ", Liste_De_Formations=" + Liste_De_Formations +
                '}';
    }

    public String[] MinimaltoString() {
        return new String[]{ nom,sigle, telephone, statut};

    }


}