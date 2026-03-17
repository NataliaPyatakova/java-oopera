import java.util.ArrayList;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public void printBaseInfo() {
        System.out.println("Название: " + title + ", длительность: " + duration + ", автор музыки: " + musicAuthor.toString());
    }
}
