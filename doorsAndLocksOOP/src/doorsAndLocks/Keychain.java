package doorsAndLocks;

import java.util.*;



public class Keychain {
	// private Set<Key> keys = new TreeSet<Key>();

	protected HashMap<Keyshape, ArrayList<Key>> keys = new HashMap<Keyshape, ArrayList<Key>>();

	public Keychain() {
	}

	public Keychain(Collection<Key> keys) {
//		this.keys.addAll(keys);
		for (Key k : keys) {
			addKey(k);
		}
	}

	public boolean addKey(Key key) {
//		return keys.add(key);
		if (!keys.containsKey(key.shape()))
			keys.put(key.shape(), new ArrayList<Key>());
		keys.get(key.shape()).add(key);
		return true;
	}

	public boolean removeKey(Key key) {
//		return keys.remove(key);
		if (keys.containsKey(key.shape()))
			return keys.get(key.shape()).remove(key);
		return false;
	}

	public int keyCount() {
//		return keys.size();
		int keyCount = 0;
		for (Keyshape keyshape : keys.keySet()) {
			keyCount += keys.get(keyshape).size();

		}
		return keyCount;
	}

	public boolean lock(Door door) {
		if (door.isLocked())
			return true; // Nothing to do
		if (!door.hasKey())
			return false; // Door cannot be locked
		if (!keys.containsKey(door.key().shape()))
			return false; // Don't have this key
		for (Key k : keys.get(door.key().shape())) {
			if (door.unlock(k))
				return true;
		}
		return false; // Sorry, no key locks this door.
	}

	public boolean unlock(Door door) {
		if (!door.isLocked())
			return true; // Nothing to do
		if (!door.hasKey())
			return true; // Door is already unlocked
		if (!keys.containsKey(door.key().shape()))
			return false; // Don't have this key
		for (Key k : keys.get(door.key().shape())) {
			if (door.unlock(k))
				return true;
		}
		return false;// Sorry, no key unlocks this door
	}

}