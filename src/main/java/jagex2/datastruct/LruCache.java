package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("RHNYLZZL")
public final class LruCache {

	@ObfuscatedName("RHNYLZZL.d")
	public DoublyLinkable field1186 = new DoublyLinkable();

	@ObfuscatedName("RHNYLZZL.h")
	public DoublyLinkList field1190 = new DoublyLinkList();

	@ObfuscatedName("RHNYLZZL.e")
	public int field1187;

	@ObfuscatedName("RHNYLZZL.f")
	public int field1188;

	@ObfuscatedName("RHNYLZZL.g")
	public HashTable field1189;

	@ObfuscatedName("RHNYLZZL.b")
	public int field1184;

	@ObfuscatedName("RHNYLZZL.c")
	public int field1185;

	public LruCache(int arg0) {
		field1187 = arg0;
		field1188 = arg0;
		field1189 = new HashTable(1024);
	}

	@ObfuscatedName("RHNYLZZL.a(J)LDPPNUUMQ;")
	public DoublyLinkable method458(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) field1189.method259(arg0);
		if (var3 == null) {
			field1184++;
		} else {
			field1190.method180(var3);
			field1185++;
		}

		return var3;
	}

	@ObfuscatedName("RHNYLZZL.a(LDPPNUUMQ;JI)V")
	public void method459(DoublyLinkable arg0, long arg1) {
		if (field1188 == 0) {
			DoublyLinkable var4 = field1190.method181();
			var4.method604();
			var4.method185();

			if (field1186 == var4) {
				DoublyLinkable var5 = field1190.method181();
				var5.method604();
				var5.method185();
			}
		} else {
			field1188--;
		}

		field1189.method260(arg0, arg1);
		field1190.method180(arg0);
	}

	@ObfuscatedName("RHNYLZZL.a()V")
	public void method460() {
		while (true) {
			DoublyLinkable var1 = field1190.method181();
			if (var1 == null) {
				field1188 = field1187;
				return;
			}

			var1.method604();
			var1.method185();
		}
	}
}
