package java8intro.java8.factory;

public class Main {
	public static void main(String[] args) {
		Geometry geometry = Geometry.geometry();
		System.out.println(geometry.getVolume());
	}
}
