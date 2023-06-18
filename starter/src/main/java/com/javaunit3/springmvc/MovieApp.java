package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MovieApp {



    public static void main (String [] args){
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MovieApp.class);
        BestMovieService bestMovieService = appContext.getBean("bestMovieService", BestMovieService.class);
        Movie bestMovie = bestMovieService.getBestMovie();

        System.out.println("Testing: " + bestMovie.getTitle());
        System.out.println("Rating: " + bestMovie.getMaturityRating());
        System.out.println("Genre: " + bestMovie.getGenre());
    }
}
