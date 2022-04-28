package doorsAndLocks;

import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {

	public UUID key;
	private Keyshape shape = Keyshape.Unknown;

	public Key() {
		key = UUID.randomUUID();
	}

	public Key(Keyshape shape) {
		this();
		this.shape = shape;
	}

	public Key(Key original) {
		key = original.key;
		shape = original.shape;
	}

	public Keyshape shape() {
		return shape;
	}

	@Override
	public boolean equals(Object obj) {
		if (!getClass().isInstance(obj))
			return false;
		Key other = (Key) obj;
		return key.equals(other.key);
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (!(o instanceof Key)) return false;
//		Key key1 = (Key) o;
//		return key.equals(key1.key);
//	}

	@Override
	public int hashCode() {
		return key.hashCode();
	}

	@Override
	public int compareTo(Key o) {
		return key.compareTo(o.key);
	}

	@Override
	public Object clone() {
		return new Key(this);
	}

	@Override
	public String toString() {
		return key.toString();
	}

}
