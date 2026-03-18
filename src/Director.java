public class Director extends Person {

    public int numberOfShows = 0;

    public Director(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", количество поставленных спектаклей: " + numberOfShows;
    }
}
