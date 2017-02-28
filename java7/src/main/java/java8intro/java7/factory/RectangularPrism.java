package java8intro.java7.factory;

public abstract class RectangularPrism extends Prism {
	@Override
	public double getAreaOfBase() {
		return getLength() * getWidth();
	}

	public abstract double getLength();

	public abstract double getWidth();
}
