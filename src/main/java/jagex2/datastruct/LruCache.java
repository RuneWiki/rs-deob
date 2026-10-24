package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public final class LruCache {

	@ObfuscatedName("t.a")
	public int field327;

	@ObfuscatedName("t.b")
	public int field328;

	@ObfuscatedName("t.c")
	public DoublyLinkable field329 = new DoublyLinkable();

	@ObfuscatedName("t.d")
	public int field330;

	@ObfuscatedName("t.e")
	public int field331;

	@ObfuscatedName("t.f")
	public HashTable field332 = new HashTable(1024);

	@ObfuscatedName("t.g")
	public DoublyLinkList field333 = new DoublyLinkList();

	public LruCache(int arg0) {
		field330 = arg0;
		field331 = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public DoublyLinkable method114(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) field332.method117(arg0);
		if (var3 == null) {
			field327++;
		} else {
			field333.method262(var3);
			field328++;
		}

		return var3;
	}

	@ObfuscatedName("t.a(Lx;JI)V")
	public void method115(DoublyLinkable arg0, long arg1) {
		if (field331 == 0) {
			DoublyLinkable var4 = field333.method263();
			var4.method119();
			var4.method120();

			if (field329 == var4) {
				DoublyLinkable var5 = field333.method263();
				var5.method119();
				var5.method120();
			}
		} else {
			field331--;
		}

		field332.method118(arg1, arg0);
		field333.method262(arg0);
	}

	@ObfuscatedName("t.a()V")
	public void method116() {
		while (true) {
			DoublyLinkable var1 = field333.method263();
			if (var1 == null) {
				field331 = field330;
				return;
			}

			var1.method119();
			var1.method120();
		}
	}
}
