package com.java8.supplier;

public class SuffleProgram {

	public static void main(String[] args) {
		String songs[]= {"s1","s2","s3","s4","s5"};
		for(int i=songs.length-1;i>=0;i--) {
			int index  = (int) (Math.random()*i);
			System.out.println("playing songs: "+songs[index]);
			String temp = songs[i];
			songs[i]=songs[index];
			songs[index] = temp;
		}

	}
	public static void swap(String s1, String s2) {
		String temp  =s1;
		s1 = s2;
		s2 = temp;
	}

}
