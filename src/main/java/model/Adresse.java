package model;

public class Adresse {

    private int numero;
	private String voie;
    private String ville;
    private int codePostal;
	private String departement;
	private double longitude;
	private double latitude;


	@Override
	public String toString() {
		return "Adresse{" +
				"numero=" + numero +
				", voie='" + voie + '\'' +
				", ville='" + ville + '\'' +
				", codePostal=" + codePostal +
				", departement='" + departement + '\'' +
				", longitude=" + longitude +
				", latitude=" + latitude +
				'}';
	}

	public Adresse(int numero, String voie, String ville, int codePostal, String departement, double longitude, double latitude) {
		super();
		this.numero = numero;
		this.voie = voie;
		this.ville = ville;
		this.codePostal = codePostal;
		this.departement = departement;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	

	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public double getLongitude() {return longitude;}
	public double setLongitude(double longitude) {return longitude;}
	public double getLatitude() {return latitude;}
	public double setLatitude(double latitude) {return latitude;}
}
