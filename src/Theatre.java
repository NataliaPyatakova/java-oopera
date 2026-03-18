import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        //Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Петр", "Петров", Gender.MALE, 180);
        Actor actor3 = new Actor("Марья", "Морева", Gender.FEMALE, 160);
        Director director1 = new Director("Агафон", "Агафонов", Gender.MALE);
        Director director2 = new Director("Дарья", "Дарина", Gender.FEMALE);
        Person musicAuthor1 = new Person("Джакомо", "Пуччини", Gender.MALE);
        Person musicAuthor2 = new Person("Петр", "Чайковский", Gender.MALE);
        Choreographer choreographer = new Choreographer("Майя", "Плисецкая", Gender.FEMALE);

        //Создать три спектакля: обычный, оперный и балет
        //спектакли без актеров
        Show show = new Show("Обыкновенное чудо", 200, director1);
        Ballet ballet = new Ballet("Лебединое озеро", 200, director2, musicAuthor1, "либретто",
                choreographer);
        Opera opera = new Opera("Тоска", 120, director2, musicAuthor2, "либретто2", 50);

        //спектакли с пустыми списками актеров
        ArrayList<Actor> actors1 = new ArrayList<>();
        ArrayList<Actor> actors2 = new ArrayList<>();
        ArrayList<Actor> actors3 = new ArrayList<>();
        Show show1 = new Show("Маленький принц", 250, director1, actors1);
        Ballet ballet1 = new Ballet("Щелкунчик", 200, director2, actors2, musicAuthor1, "либретто",
                choreographer);
        Opera opera1 = new Opera("Богема", 120, director2, actors3, musicAuthor2, "либретто2",
                50);

        show.printBaseInfo();
        show.printDirector();
        show.printActors();

        ballet.printBaseInfo();
        ballet.printDirector();
        ballet.printActors();

        opera.printBaseInfo();
        opera.printDirector();
        opera.printActors();

        show1.printBaseInfo();
        show1.printDirector();
        show1.printActors();

        ballet1.printBaseInfo();
        ballet1.printDirector();
        ballet1.printActors();

        opera1.printBaseInfo();
        opera1.printDirector();
        opera1.printActors();

        //Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль.
        // Один актёр может участвовать в нескольких спектаклях.
        show.addNewActor(actor1);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        opera.addNewActor(actor3);
        opera.addNewActor(actor3);

        show1.addNewActor(actor1);
        ballet1.addNewActor(actor1);
        ballet1.addNewActor(actor2);
        opera1.addNewActor(actor3);
        opera1.addNewActor(actor3);

        //Для каждого спектакля выведите на экран список актёров.
        show.printBaseInfo();
        show.printDirector();
        show.printActors();

        ballet.printBaseInfo();
        ballet.printDirector();
        ballet.printActors();

        opera.printBaseInfo();
        opera.printDirector();
        opera.printActors();

        show1.printBaseInfo();
        show1.printDirector();
        show1.printActors();

        ballet1.printBaseInfo();
        ballet1.printDirector();
        ballet1.printActors();

        opera1.printBaseInfo();
        opera1.printDirector();
        opera1.printActors();

        //Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        ballet.printActors();
        ballet.replaceActor(actor3, "Петров");
        ballet.printActors();

        //Попробуйте заменить в другом спектакле несуществующего актёра
        opera1.printActors();
        opera1.replaceActor(actor1, "Семенов");
        opera1.printActors();

        //Для оперного и балетного спектакля выведите на экран текст либретто.
        ballet.printLibrettoText();
        opera.printLibrettoText();

    }
}
