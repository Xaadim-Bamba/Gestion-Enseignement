package model;

import java.util.ArrayList;

public class Formation {

    private int id_F;
    private String Intitule;
    private ArrayList<String> ListeDisciplines;

    public Formation(int id_f, String Intitule, ArrayList<String> ListeDisciplines) {
        super();
        this.id_F = id_f;
        this.Intitule = Intitule;
        this.ListeDisciplines = ListeDisciplines;
    }

    public int getid_f() {
        return id_F;
    }
    public void setid_f(int id_F) {
        this.id_F = id_F;
    }

    public String getIntitule() {
        return Intitule;
    }
    public void setIntitule(String Intitule) {
        this.Intitule = Intitule;
    }
    public ArrayList<String> getListeDisciplines() {
        return ListeDisciplines;
    }
    public void setVoie(ArrayList<String> ListeDisciplines) {
        this.ListeDisciplines = ListeDisciplines;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id_F=" + id_F +
                ", Intitule='" + Intitule + '\'' +
                ", ListeDisciplines=" + ListeDisciplines +
                '}';
    }
    public String[] MinimaltoString() {
        return new String[]{String.valueOf(id_F),Intitule, String.valueOf(ListeDisciplines)};
    }
}
