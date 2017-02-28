package java8intro.java8.factory;

import java8intro.java8.factory.impl.RectangularPrismImpl;

public interface Geometry {
	static Geometry geometry() {
		return new RectangularPrismImpl();
	}

	double getVolume();
}
