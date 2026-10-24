package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("qb")
public final class DoublyLinkList {

	@ObfuscatedName("qb.c")
	public DoublyLinkable field651 = new DoublyLinkable();

	@ObfuscatedName("qb.d")
	public DoublyLinkable field652;

	public DoublyLinkList() {
		field651.field362 = field651;
		field651.field363 = field651;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method262(DoublyLinkable arg0) {
		if (arg0.field363 != null) {
			arg0.method120();
		}

		arg0.field363 = field651.field363;
		arg0.field362 = field651;
		arg0.field363.field362 = arg0;
		arg0.field362.field363 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public DoublyLinkable method263() {
		DoublyLinkable var1 = field651.field362;
		if (field651 == var1) {
			return null;
		} else {
			var1.method120();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public DoublyLinkable method264() {
		DoublyLinkable var1 = field651.field362;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field362;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public DoublyLinkable method265() {
		DoublyLinkable var1 = field652;
		if (field651 == var1) {
			field652 = null;
			return null;
		} else {
			field652 = var1.field362;
			return var1;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method266() {
		int var1 = 0;
		for (DoublyLinkable var2 = field651.field362; var2 != field651; var2 = var2.field362) {
			var1++;
		}

		return var1;
	}
}
