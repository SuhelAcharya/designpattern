package factory;

public class Material {

	public Door getDoor(String doorType) {
		
		if(doorType == null) {
			return null;
		}
		if(doorType.equalsIgnoreCase("wood")) {
			return new Wood();
		}
		else if(doorType.equalsIgnoreCase("metal")) {
			return new Metal();
		}
		else
			return new Plastic();
		
	}
}
