package factory;

public class Factory {

	public static void main(String[] args) {
		
		Material material = new Material();
				
		Door door1 = material.getDoor("wood");
		door1.Create();
		
		Door door2 = material.getDoor("metal");
		door2.Create();
		
		Door door3 = material.getDoor("plastic");
		door3.Create();
	}
}
