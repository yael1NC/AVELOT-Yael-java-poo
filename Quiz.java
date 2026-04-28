import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String nom;
    private Categorie categorie;
    private Redacteur redacteur;
    private List<Question> questions;

    public Quiz(String nom, Categorie categorie, Redacteur redacteur) {
        this.nom = nom;
        this.categorie = categorie;
        this.redacteur = redacteur;
        this.questions = new ArrayList<>();
        redacteur.ajouterQuiz(this);
    }

    public void ajouterQuestion(Question question) {
        questions.add(question);
    }

    public String getNom() {
        return nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Redacteur getRedacteur() {
        return redacteur;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
        return "Quiz: \"" + nom + "\" [" + categorie + "] - " + questions.size() + " question(s) - par " + redacteur.getPrenom() + " " + redacteur.getNom();
    }
}
