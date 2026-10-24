package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("PPOHBEGB")
public class DoublyLinkable extends Linkable {

	@ObfuscatedName("PPOHBEGB.f")
	public DoublyLinkable next2;

	@ObfuscatedName("PPOHBEGB.g")
	public DoublyLinkable prev2;

	@ObfuscatedName("PPOHBEGB.b()V")
	public void unlink2() {
		if (prev2 != null) {
			prev2.next2 = next2;
			next2.prev2 = prev2;
			next2 = null;
			prev2 = null;
		}
	}
}
