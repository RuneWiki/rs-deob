package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class Linkable {

	@ObfuscatedName("u.b")
	public long key;

	@ObfuscatedName("u.c")
	public Linkable next;

	@ObfuscatedName("u.d")
	public Linkable prev;

	@ObfuscatedName("u.a()V")
	public void unlink() {
		if (prev != null) {
			prev.next = next;
			next.prev = prev;
			next = null;
			prev = null;
		}
	}
}
