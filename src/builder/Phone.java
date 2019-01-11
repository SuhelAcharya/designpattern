package builder;

public abstract class Phone implements Product {

	@Override
	public Housing housing() {
		return new Metal();
	}

	@Override
	public abstract int price();
	
}
