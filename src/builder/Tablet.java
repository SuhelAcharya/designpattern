package builder;

public abstract class Tablet implements Product {

	@Override
	public Housing housing() {
		return new Plastic();
	}

	@Override
	public abstract int price();

}
