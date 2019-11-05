package com.java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MoveGenere {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<>();
		populate(list);
		Consumer<Movie> consumer = movie->{
			System.out.println(movie.getMovieName());
			System.out.println(movie.getHero());
			System.out.println(movie.getHeroine());
			System.out.println("------------");
		};
		for(Movie m: list) {
			consumer.accept(m);
		}
	}

	private static void populate(ArrayList<Movie> list) {
		list.add(new Movie("Kirrish", "Hiritik", "Priyanka"));
		list.add(new Movie("Bahubali", "Prabhas", "Anuska"));
		list.add(new Movie("Kaho na pyar hai", "Hiritik", "Amesha"));
		
	}

}
