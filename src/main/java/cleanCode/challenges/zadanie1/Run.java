package cleanCode.challenges.zadanie1;

import cleanCode.challenges.zadanie1.MovieStore;

import java.util.List;
import java.util.stream.Collectors;

public class Run {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String allMovies = movieStore.getMovies()
                .values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.joining("!"));

        System.out.println(allMovies);

//        movieStore.getMovies()
//                .values()
//                .stream()
//                .flatMap(List::stream)
//                .forEach(e -> System.out.print(e + '!'));
    }
}
