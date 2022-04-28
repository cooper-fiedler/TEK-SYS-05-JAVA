package doorsAndLocks;

public class Main {

	public static void main(String[] args) {
		
		Key key = new Key(Keyshape.Oval);
		
		Key spareKey = (Key) key.clone();

		Door d1 = new Door(key);
		
		Keychain kc1 = new Keychain();

	}

}
