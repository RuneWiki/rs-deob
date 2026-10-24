package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("db")
public class Linkable2 extends Linkable {

	@ObfuscatedName("db.e")
	public Linkable2 next2;

	@ObfuscatedName("db.f")
	public Linkable2 prev2;

	@ObfuscatedName("db.b()V")
	public void unlink2() {
		if (prev2 != null) {
			prev2.next2 = next2;
			next2.prev2 = prev2;
			next2 = null;
			prev2 = null;
		}
	}
}
