package estudo;

public class Superpadraozinho {
	
	private static Superpadraozinho instance;

	private Superpadraozinho() {

	}
	public static Superpadraozinho getInstance(){
			if (instance == null) {
				instance = new Superpadraozinho();
			}
			return instance;
	} 

}
