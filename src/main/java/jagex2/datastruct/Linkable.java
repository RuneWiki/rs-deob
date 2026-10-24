package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("v")
public class Linkable {

	@ObfuscatedName("v.b")
	public long key;

	@ObfuscatedName("v.c")
	public Linkable next;

	@ObfuscatedName("v.d")
	public Linkable prev;

	@ObfuscatedName("v.a()V")
	public void unlink() {
		if (prev != null) {
			prev.next = next;
			next.prev = prev;
			next = null;
			prev = null;
		}
	}
}
