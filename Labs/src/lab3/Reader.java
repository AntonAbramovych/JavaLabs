package com.vtvpmc.DanasMikelionis;
import java.util.Scanner;

public class Reader {
	private Scanner scanner = new Scanner(System.in);
	
	public double nextDouble() {
		return scanner.nextDouble();
	}
	
	public String nextString() {
		return scanner.nextLine();
	}
	
	public char nextChar() {
		return scanner.next().charAt(0);
	}
	
	public int nextInt() {
		return scanner.nextInt();
	}
}
