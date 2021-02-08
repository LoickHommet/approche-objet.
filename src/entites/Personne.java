package entites;

public class Personne {
    private String prenom;
    private String nom;
    private int codePostal;

    public Personne(String prenom, String nom, int codePostal) {
        this.prenom = prenom;
        this.nom = nom;
        this.codePostal = codePostal;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
}
