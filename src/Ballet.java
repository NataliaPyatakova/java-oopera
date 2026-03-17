import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private final Choreographer choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
                  String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText,
                  Choreographer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public void printBaseInfo() {
        System.out.println("Название: " + title + ", длительность: " + duration + ", автор музыки: "
                + musicAuthor.toString() + ", хореограф: " + choreographer.toString());
    }
}
