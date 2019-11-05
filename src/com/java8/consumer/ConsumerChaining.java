package com.java8.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
	static class Movie {
		private String name;
		private String result;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public Movie(String name, String result) {
			super();
			this.name = name;
			this.result = result;
		}
		@Override
		public String toString() {
			return "Movie [name=" + name + ", result=" + result + "]";
		}
		
	}
	public static void main(String[] args) {
		Consumer<Movie> c1 = m->System.out.println(m.getName()+ " is going to release");
		Consumer<Movie> c2 = m->System.out.println(m.getName()+ " is released and the movie is "+m.getResult());
		Consumer<Movie> c3 = m->System.out.println("Movie is going to store in the database");
		Consumer<Movie> chainConsumer = c1.andThen(c2).andThen(c3);
		chainConsumer.accept(new Movie("Bahubali", "Hit"));

	}

}
