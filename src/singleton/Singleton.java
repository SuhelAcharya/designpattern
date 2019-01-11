package singleton;

public class Singleton {

	private static Singleton onlyInstance = null; //holds one and only instance
	
	private Singleton() { } //made private so that class cannot be instantiated
		
		public static Singleton getInstance() {
			
			if(onlyInstance == null) {
				
				onlyInstance = new Singleton();
			}
			
			return onlyInstance;
	}
		
	public void showMessage() {
		
		System.out.println("Only Object");
	}
}
