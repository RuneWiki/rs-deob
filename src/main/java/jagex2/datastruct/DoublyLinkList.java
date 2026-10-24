package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("CZYJUOKA")
public final class DoublyLinkList {

	@ObfuscatedName("CZYJUOKA.b")
	public DoublyLinkable field560 = new DoublyLinkable();

	@ObfuscatedName("CZYJUOKA.c")
	public DoublyLinkable field561;

	public DoublyLinkList() {
		field560.field562 = field560;
		field560.field563 = field560;
	}

	@ObfuscatedName("CZYJUOKA.a(LDPPNUUMQ;)V")
	public void method180(DoublyLinkable arg0) {
		if (arg0.field563 != null) {
			arg0.method185();
		}

		arg0.field563 = field560.field563;
		arg0.field562 = field560;
		arg0.field563.field562 = arg0;
		arg0.field562.field563 = arg0;
	}

	@ObfuscatedName("CZYJUOKA.a()LDPPNUUMQ;")
	public DoublyLinkable method181() {
		DoublyLinkable var1 = field560.field562;
		if (field560 == var1) {
			return null;
		} else {
			var1.method185();
			return var1;
		}
	}

	@ObfuscatedName("CZYJUOKA.b()LDPPNUUMQ;")
	public DoublyLinkable method182() {
		DoublyLinkable var1 = field560.field562;
		if (field560 == var1) {
			field561 = null;
			return null;
		} else {
			field561 = var1.field562;
			return var1;
		}
	}

	@ObfuscatedName("CZYJUOKA.a(I)LDPPNUUMQ;")
	public DoublyLinkable method183() {
		DoublyLinkable var1 = field561;
		if (field560 == var1) {
			field561 = null;
			return null;
		} else {
			field561 = var1.field562;
			return var1;
		}
	}

	@ObfuscatedName("CZYJUOKA.c()I")
	public int method184() {
		int var1 = 0;
		for (DoublyLinkable var2 = field560.field562; var2 != field560; var2 = var2.field562) {
			var1++;
		}

		return var1;
	}
}
