import java.util.ArrayList;

public class MusicalShow extends Show {
    public final MusicAuthor musicAuthor;
    public final String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Текст либретто: " + librettoText);
    }

}
