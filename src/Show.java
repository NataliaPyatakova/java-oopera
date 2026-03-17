import java.util.ArrayList;

public class Show {
    public final String title;
    public final int duration;
    public final Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
        director.numberOfShows = director.numberOfShows + 1;  //дернули режисера - передернем счетчик спектаклей
    }

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        director.numberOfShows = director.numberOfShows + 1; //дернули режисера - передернем счетчик спектаклей
    }

    @Override
    public String toString() {
        return "Название: " + title + ", длительность: " + duration;
    }

    public void printBaseInfo() {
        System.out.println("Название: " + title + ", длительность: " + duration);
    }

    public void printDirector() {
        System.out.println("Режиссёр: " + director);
    }

    public void printActors() {
        if (listOfActors != null && !listOfActors.isEmpty()) {
            System.out.println("В спектакле участвуют следующие актеры: ");
            for (Actor actor : listOfActors) {
                System.out.println(actor.toString());
            }
        } else {
            System.out.println("На спектакль не назначены актеры");
        }
    }

    public void addNewActor(Actor actor) {
        if (actor == null) {
            System.out.println("Не передан актер для добавления!");
        } else {
            if (listOfActors == null) {
                listOfActors = new ArrayList<>();
            }
            if (!listOfActors.contains(actor)) {
                listOfActors.add(actor);
                System.out.println("Актер " + actor + " добавлен в спектакль!");
            } else {
                System.out.println("Актер " + actor + " уже участвует в спектакле!");
            }
        }
    }

    public void replaceActor(Actor actor, String replacedActorSurName) {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("На спектакль не назначены актеры");
        } else {
            if (actor == null) {
                System.out.println("Не передан актер для добавления!");
            } else {
                Actor replacedActor = null;
                for (Actor actor2 : listOfActors) {
                    if (actor2.surname.equals(replacedActorSurName)) {
                        replacedActor = actor2;  //поскольку не оговорено иное, то берем первого с такой же фамилией
                        break;                   //полное равенство через equal не используем
                    }
                }
                if (replacedActor == null) {
                    System.out.println("Актер с фамилией " + replacedActorSurName + " в спектакле не участвует");
                } else {
                    listOfActors.remove(replacedActor);
                    System.out.println("Актер " + replacedActor + " удален из спектакля!");
                    listOfActors.add(actor);
                    System.out.println("Актер " + actor + " добавлен в спектакль!");
                }
            }
        }
    }
}
