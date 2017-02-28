package java8intro.java8.factory;

public interface RectangularPrism extends Prism {
	@Override
	default double getAreaOfBase() {
		return getLength() * getWidth();
	}

	double getLength();

	double getWidth();
}
