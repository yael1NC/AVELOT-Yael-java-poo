import java.util.ArrayList;
import java.util.List;

public class Question {
    private String titre;
    private List<Reponse> reponses;

    public Question(String titre) {
        this.titre = titre;
        this.reponses = new ArrayList<>();
    }

    public void ajouterReponse(Reponse reponse) {
        if (reponses.size() >= 4) {
            throw new IllegalStateException("Une question ne peut avoir que 4 réponses.");
        }
        reponses.add(reponse);
    }

    public String getTitre() {
        return titre;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }

    @Override
    public String toString() {
        return "Question: \"" + titre + "\" (" + reponses.size() + " réponses)";
    }
}
