package jagex2.datastruct;

import deob.ObfuscatedName;

public class Linkable {

	@ObfuscatedName("PKVMXVTO.a")
	public boolean _flowObfuscator1 = true;

	@ObfuscatedName("PKVMXVTO.b")
	public long key;

	@ObfuscatedName("PKVMXVTO.c")
	public Linkable next;

	@ObfuscatedName("PKVMXVTO.d")
	public Linkable prev;

	@ObfuscatedName("PKVMXVTO.e")
	public static boolean _flowObfuscator2;

	@ObfuscatedName("PKVMXVTO.a()V")
	public void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}
}
