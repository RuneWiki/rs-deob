package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("s")
public final class LruCache {

	@ObfuscatedName("s.d")
	public int field321;

	@ObfuscatedName("s.e")
	public int field322;

	@ObfuscatedName("s.f")
	public Linkable2 field323 = new Linkable2();

	@ObfuscatedName("s.g")
	public int capacity;

	@ObfuscatedName("s.h")
	public int available;

	@ObfuscatedName("s.i")
	public HashTable cache;

	@ObfuscatedName("s.j")
	public LinkList2 order = new LinkList2();

	public LruCache(int arg0) {
		capacity = arg0;
		available = arg0;
		cache = new HashTable(1024);
	}

	@ObfuscatedName("s.a(J)Lw;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) cache.find(arg0);
		if (var3 == null) {
			field321++;
		} else {
			order.push(var3);
			field322++;
		}

		return var3;
	}

	@ObfuscatedName("s.a(IJLw;)V")
	public void put(long arg0, Linkable2 arg1) {
		if (available == 0) {
			Linkable2 var4 = order.popFront();
			var4.unlink();
			var4.unlink2();

			if (field323 == var4) {
				Linkable2 var5 = order.popFront();
				var5.unlink();
				var5.unlink2();
			}
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
