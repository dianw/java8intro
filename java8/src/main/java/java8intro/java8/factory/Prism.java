package java8intro.java8.factory;

public interface Prism extends Geometry {
	@Override
	default double getVolume() {
		return getAreaOfBase() * getHeight();
	}

	double getAreaOfBase();

	double getHeight();
}
