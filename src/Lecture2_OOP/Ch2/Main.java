package Lecture2_OOP.Ch2;

public class Main {
    public static void main(String[] args) {
        Premiu premiu2021 = new Premiu("oscar", 2021);
        Premiu premiu2020 = new Premiu("oscar", 2020);
        Premiu premiu2019 = new Premiu("oscar", 2019);
        Premiu premiu2018 = new Premiu("oscar", 2018);

        Actor actor1 = new Actor("Primul actor", 37, new Premiu[]{premiu2021, premiu2020});
        Actor actor2 = new Actor("Second actor", 32, new Premiu[]{premiu2019});
        Actor actor3 = new Actor("Third actor", 52, new Premiu[]{premiu2018});

        Film film1 = new Film(2015, "Olaf", new Actor[]{actor1, actor2});
        Film film2 = new Film(2014, "Hercule", new Actor[]{actor3});
        Film film3 = new Film(2013, "Soya", new Actor[]{actor1, actor2, actor3});
        Film film4 = new Film(2012, "Altfilm", new Actor[]{actor2, actor1});

        Studio studio1 = new Studio("Disney", new Film[]{film2, film4});
        Studio studio2 = new Studio("PG", new Film[]{film1, film2, film3});

        Studio[] studios = new Studio[]{studio1, studio2};
        // 1.Mai mult de 2 filme.
        for (Studio s : studios) {
            if (s.filme.length > 2) {
                System.out.println(s.nume);
            }
        }

        // 2.Studio care contine actorul SecondActor
        for (Studio s : studios) {
            for (Film f : s.filme) {
                for (Actor a : f.actori) {
                    if (a.nume == "Second actor") {
                        System.out.println(s.nume); // studio 2
                    }
                }
            }
        }

        // 3. Actor cu an peste 50
        Film[] filmsDatabase = new Film[]{film1, film2, film3, film4};
        for (Film f : filmsDatabase) {
            for (Actor a : f.actori) {
                if (a.varsta > 50) {
                    System.out.println(f.nume); // studio 2
                }
            }
        }


    }
}
