package java8intro.java7.factory;

public abstract class Prism implements Geometry {
	@Override
	public double getVolume() {
		return getAreaOfBase() * getHeight();
	}

	public abstract double getAreaOfBase();

	public abstract double getHeight();
}
