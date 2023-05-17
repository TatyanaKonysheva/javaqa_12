package ru.netolodgy.qa.javaqa_12;

public class MoviePoster {

    private int filmId;
    private String genreFilm;
    private String filmName;

    private String[] movies = new String[0];
    private int limit;


    public MoviePoster() {
        this.limit = 5;
    }

    public MoviePoster(int limit) {
        this.limit = limit;
    }

    public MoviePoster(int filmId, String genreFilm, String filmName) {
        this.filmId = filmId;
        this.genreFilm = genreFilm;
        this.filmName = filmName;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] tmp = new String[resultLength];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];

        }
        return tmp;
    }

}
