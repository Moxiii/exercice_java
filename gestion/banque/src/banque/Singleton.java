package banque;

public class Singleton {
	private static Singleton instance;
	private int uniqueId;
	
	private Singleton(){
		this.uniqueId = System.identityHashCode(this);
	}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public int getUniqueId() {
		return uniqueId;
	}
}
