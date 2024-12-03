package jagex2.datastruct;

import deob.ObfuscatedName;

public class DoublyLinkable extends Linkable {

	@ObfuscatedName("PPOHBEGB.h")
	public static int _flowObfuscator3;

	@ObfuscatedName("PPOHBEGB.f")
	public DoublyLinkable next2;

	@ObfuscatedName("PPOHBEGB.g")
	public DoublyLinkable prev2;

	@ObfuscatedName("PPOHBEGB.b()V")
	public void unlink2() {
		if (this.prev2 != null) {
			this.prev2.next2 = this.next2;
			this.next2.prev2 = this.prev2;
			this.next2 = null;
			this.prev2 = null;
		}
	}
}
