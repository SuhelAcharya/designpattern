package singleton;

public class SingletonImpl {

	public static void main(String[] args) {
		
		Singleton objOne = Singleton.getInstance();
		
		//cannot be created because constructor is set private
		//Singleton objTwo = new Singleton();
				
		objOne.showMessage();
	}
}
