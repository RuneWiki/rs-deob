package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("s")
public final class LruCache {

	@ObfuscatedName("s.c")
	public int capacity;

	@ObfuscatedName("s.d")
	public int available;

	@ObfuscatedName("s.e")
	public HashTable cache = new HashTable(1024);

	@ObfuscatedName("s.f")
	public LinkList2 order = new LinkList2();

	public LruCache(int arg0) {
		capacity = arg0;
		available = arg0;
	}

	@ObfuscatedName("s.a(J)Ldb;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) cache.find(arg0);
		if (var3 != null) {
			order.push(var3);
		}

		return var3;
	}

	@ObfuscatedName("s.a(IJLdb;)V")
	public void put(long arg0, Linkable2 arg1) {
		if (available == 0) {
			Linkable2 var4 = order.popFront();
			var4.unlink();
			var4.unlink2();
		} else {
			available--;
		}

		cache.put(arg0, arg1);
		order.push(arg1);
	}

	@ObfuscatedName("s.a()V")
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
