package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("BOHLFXVX")
public final class LinkList {

	@ObfuscatedName("BOHLFXVX.c")
	public Linkable field87 = new Linkable();

	@ObfuscatedName("BOHLFXVX.d")
	public Linkable field88;

	public LinkList() {
		field87.field1512 = field87;
		field87.field1513 = field87;
	}

	@ObfuscatedName("BOHLFXVX.a(LZUOIJLRD;)V")
	public void method3(Linkable arg0) {
		if (arg0.field1513 != null) {
			arg0.method604();
		}

		arg0.field1513 = field87.field1513;
		arg0.field1512 = field87;
		arg0.field1513.field1512 = arg0;
		arg0.field1512.field1513 = arg0;
	}

	@ObfuscatedName("BOHLFXVX.a(BLZUOIJLRD;)V")
	public void method4(Linkable arg0) {
		if (arg0.field1513 != null) {
			arg0.method604();
		}

		arg0.field1513 = field87;
		arg0.field1512 = field87.field1512;
		arg0.field1513.field1512 = arg0;
		arg0.field1512.field1513 = arg0;
	}

	@ObfuscatedName("BOHLFXVX.a()LZUOIJLRD;")
	public Linkable method5() {
		Linkable var1 = field87.field1512;
		if (field87 == var1) {
			return null;
		} else {
			var1.method604();
			return var1;
		}
	}

	@ObfuscatedName("BOHLFXVX.b()LZUOIJLRD;")
	public Linkable method6() {
		Linkable var1 = field87.field1512;
		if (field87 == var1) {
			field88 = null;
			return null;
		} else {
			field88 = var1.field1512;
			return var1;
		}
	}

	@ObfuscatedName("BOHLFXVX.a(Z)LZUOIJLRD;")
	public Linkable method7() {
		Linkable var1 = field87.field1513;
		if (field87 == var1) {
			field88 = null;
			return null;
		} else {
			field88 = var1.field1513;
			return var1;
		}
	}

	@ObfuscatedName("BOHLFXVX.a(I)LZUOIJLRD;")
	public Linkable method8() {
		Linkable var1 = field88;
		if (field87 == var1) {
			field88 = null;
			return null;
		} else {
			field88 = var1.field1512;
			return var1;
		}
	}

	@ObfuscatedName("BOHLFXVX.b(I)LZUOIJLRD;")
	public Linkable method9() {
		Linkable var1 = field88;
		if (field87 == var1) {
			field88 = null;
			return null;
		} else {
			field88 = var1.field1513;
			return var1;
		}
	}

	@ObfuscatedName("BOHLFXVX.c()V")
	public void method10() {
		if (field87.field1512 != field87) {
			while (true) {
				Linkable var1 = field87.field1512;
				if (field87 == var1) {
					return;
				}

				var1.method604();
			}
		}
	}
}
