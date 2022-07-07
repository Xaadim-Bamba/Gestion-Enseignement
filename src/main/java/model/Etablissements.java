package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Etablissements {

    @XmlElement(name ="Etablissement") //On met le name en établissement pour que la balise de l'xml ne soit pas défini à établissements.
    private ArrayList<Etablissement> etablissements;

    public Etablissements(ArrayList<Etablissement> etablissements) {
        this.etablissements = etablissements;
    }

    public Etablissements() {

    }

    public void setEtablissements(ArrayList<Etablissement> etablissements) {
        this.etablissements = etablissements;
    }
    public ArrayList<Etablissement> getEtablissements() {
        return etablissements;
    }




}




