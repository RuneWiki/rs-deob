package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("DPPNUUMQ")
public class DoublyLinkable extends Linkable {

	@ObfuscatedName("DPPNUUMQ.e")
	public DoublyLinkable field562;

	@ObfuscatedName("DPPNUUMQ.f")
	public DoublyLinkable field563;

	@ObfuscatedName("DPPNUUMQ.b()V")
	public void method185() {
		if (field563 != null) {
			field563.field562 = field562;
			field562.field563 = field563;
			field562 = null;
			field563 = null;
		}
	}
}
