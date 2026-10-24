package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("x")
public class Linkable2 extends Linkable {

	@ObfuscatedName("x.f")
	public Linkable2 next2;

	@ObfuscatedName("x.g")
	public Linkable2 prev2;

	@ObfuscatedName("x.b()V")
	public void unlink2() {
		if (prev2 != null) {
			prev2.next2 = next2;
			next2.prev2 = prev2;
			next2 = null;
			prev2 = null;
		}
	}
}
