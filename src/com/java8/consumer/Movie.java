package com.java8.consumer;

public class Movie {
private String movieName;
private String hero;
private String heroine;
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getHero() {
	return hero;
}
public void setHero(String hero) {
	this.hero = hero;
}
public String getHeroine() {
	return heroine;
}
public void setHeroine(String heroine) {
	this.heroine = heroine;
}
public Movie(String movieName, String hero, String heroine) {
	super();
	this.movieName = movieName;
	this.hero = hero;
	this.heroine = heroine;
}
@Override
public String toString() {
	return "( movieName=" + movieName + ", hero=" + hero + ", heroine=" + heroine + ")";
}

}
