package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("x")
public class DoublyLinkable extends Linkable {

	@ObfuscatedName("x.f")
	public DoublyLinkable field362;

	@ObfuscatedName("x.g")
	public DoublyLinkable field363;

	@ObfuscatedName("x.b()V")
	public void method120() {
		if (field363 != null) {
			field363.field362 = field362;
			field362.field363 = field363;
			field362 = null;
			field363 = null;
		}
	}
}
