import java.util.ArrayList;
import java.util.List;

public class Redacteur {
    private String nom;
    private String prenom;
    private List<Quiz> quizRediges;

    public Redacteur(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        this.quizRediges = new ArrayList<>();
    }

    public void ajouterQuiz(Quiz quiz){
        quizRediges.add(quiz);
    }

    public String getNom() {
        return nom;

    }

    public String getPrenom() {
        return prenom;

    }

    public List<Quiz> getQuizRediges(){
        return quizRediges;
        
    }

    @Override
    public String toString() {
        return "Redacteur: " + prenom + " " + nom;
    }
}
