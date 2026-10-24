package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("PKVMXVTO")
public class Linkable {

	@ObfuscatedName("PKVMXVTO.b")
	public long key;

	@ObfuscatedName("PKVMXVTO.c")
	public Linkable next;

	@ObfuscatedName("PKVMXVTO.d")
	public Linkable prev;

	@ObfuscatedName("PKVMXVTO.a()V")
	public void unlink() {
		if (prev != null) {
			prev.next = next;
			next.prev = prev;
			next = null;
			prev = null;
		}
	}
}
