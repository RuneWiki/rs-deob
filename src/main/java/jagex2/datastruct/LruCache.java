package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public final class LruCache {

	@ObfuscatedName("t.d")
	public int field329;

	@ObfuscatedName("t.e")
	public int field330;

	@ObfuscatedName("t.f")
	public Linkable2 field331 = new Linkable2();

	@ObfuscatedName("t.g")
	public int capacity;

	@ObfuscatedName("t.h")
	public int available;

	@ObfuscatedName("t.i")
	public HashTable cache = new HashTable(1024);

	@ObfuscatedName("t.j")
	public LinkList2 order = new LinkList2();

	public LruCache(int arg0) {
		capacity = arg0;
		available = arg0;
	}

	@ObfuscatedName("t.a(J)Lx;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) cache.find(arg0);
		if (var3 == null) {
			field329++;
		} else {
			order.push(var3);
			field330++;
		}

		return var3;
	}

	@ObfuscatedName("t.a(Lx;ZJ)V")
	public void put(Linkable2 arg0, long arg1) {
		if (available == 0) {
			Linkable2 var4 = order.popFront();
			var4.unlink();
			var4.unlink2();

			if (field331 == var4) {
				Linkable2 var5 = order.popFront();
				var5.unlink();
				var5.unlink2();
			}
		} else {
			available--;
		}

		cache.put(arg1, arg0);
		order.push(arg0);
	}

	@ObfuscatedName("t.a()V")
	public void clear() {
		while (true) {
			Linkable2 var1 = order.popFront();
			if (var1 == null) {
				break;
			}

			var1.unlink();
			var1.unlink2();
		}

		available = capacity;
	}
}
