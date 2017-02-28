package java8intro.java7.factory;

import java8intro.java7.factory.impl.RectangularPrismImpl;

public class Main {
	public static void main(String[] args) {
		Geometry geometry = GeometryFactory.geometry();
		System.out.println(geometry.getVolume());
	}

	public static class GeometryFactory {
		public static Geometry geometry() {
			return new RectangularPrismImpl();
		}
	}
}
