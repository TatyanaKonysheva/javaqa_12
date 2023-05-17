package ru.netolodgy.qa.javaqa_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    MoviePoster Film1 = new MoviePoster(111, "Бладшот", "Боевик");
    MoviePoster Film2 = new MoviePoster(222, "Вперед", "Мультфильм");
    MoviePoster Film3 = new MoviePoster(333, "Отель", "Комедия");
    MoviePoster Film4 = new MoviePoster(444, "Джентельмены", "Боевик");
    MoviePoster Film5 = new MoviePoster(555, "Человек-нивидимка", "Ужасы");
    MoviePoster Film6 = new MoviePoster(666, "Тролли", "Мультфильм");

    @Test
    public void shouldToFindAll() {
        MoviePoster manager = new MoviePoster();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastEqualsFive() {
        MoviePoster manager = new MoviePoster();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoreFive() {
        MoviePoster manager = new MoviePoster();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLessFive() {
        MoviePoster manager = new MoviePoster();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");


        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastEqualsWithLimit() {
        MoviePoster manager = new MoviePoster(3);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithMoreLimit() {
        MoviePoster manager = new MoviePoster(7);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLessLimit() {
        MoviePoster manager = new MoviePoster(7);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");


        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmId() {
        MoviePoster manager = new MoviePoster();

        manager.setFilmId(111);
//        manager.setFilmName("Тролли. Мировой тур.");
//        manager.setGenreFilm("Мультфильм");


        int expected = 111;
        int actual = manager.getFilmId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFilmName() {
        MoviePoster manager = new MoviePoster();

        manager.setFilmName("Тролли. Мировой тур.");

        String expected = "Тролли. Мировой тур.";
        String actual = manager.getFilmName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetGenreFilm() {
        MoviePoster manager = new MoviePoster();

        manager.setGenreFilm("Мультфильм");

        String expected = "Мультфильм";
        String actual = manager.getGenreFilm();

        Assertions.assertEquals(expected, actual);
    }

}
