import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private String nom;
    private String prenom;
    private List<Partie> parties;

    public Joueur(String nom, String prenom) {
        this.nom=nom;
        this.prenom= prenom;
        this.parties = new ArrayList<>();
    }

    public void ajouterPartie(Partie partie) {
        parties.add(partie);
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Partie> getParties() {
        return parties;
    }

    @Override
    public String toString() {
        return "Joueur: " + prenom + " " + nom + "(" + parties.size() + " partie(s) jouee(s))";
    }
    
}
