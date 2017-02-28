package java8intro.java8.factory.impl;

import java8intro.java8.factory.RectangularPrism;

public class RectangularPrismImpl implements RectangularPrism {
	@Override
	public double getHeight() {
		return 5;
	}

	@Override
	public double getLength() {
		return 10;
	}

	@Override
	public double getWidth() {
		return 25;
	}

}
