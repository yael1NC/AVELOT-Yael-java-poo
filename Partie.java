public class Partie {
    private int score;
    private Joueur joueur;
    private Quiz quiz;

    public Partie(Joueur joueur, Quiz quiz, int score) {
        this.joueur = joueur;
        this.quiz = quiz;
        this.score = score;
        joueur.ajouterPartie(this);
    }

    public int getScore() {
        return score;
    }
    public Joueur getJoueur(){
        return joueur;
    }
    public Quiz getQuiz(){
        return quiz;
    }

    @Override
    public String toString() {
        return "Partie: " + joueur.getPrenom() + " " + joueur.getNom()
                + " | Quiz: \"" + quiz.getNom() + "\""
                + " | Score: " + score + "/" + quiz.getQuestions().size();
    }
}
