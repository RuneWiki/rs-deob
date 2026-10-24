package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("GCPOSBWX")
public final class LruCache {

	@ObfuscatedName("GCPOSBWX.f")
	public DoublyLinkable search = new DoublyLinkable();

	@ObfuscatedName("GCPOSBWX.j")
	public DoublyLinkList history = new DoublyLinkList();

	@ObfuscatedName("GCPOSBWX.g")
	public int capacity;

	@ObfuscatedName("GCPOSBWX.h")
	public int available;

	@ObfuscatedName("GCPOSBWX.i")
	public HashTable table;

	@ObfuscatedName("GCPOSBWX.d")
	public int _flowObfuscator4;

	@ObfuscatedName("GCPOSBWX.e")
	public int _flowObfuscator5;

	public LruCache(int arg0) {
		capacity = arg0;
		available = arg0;
		table = new HashTable(1024);
	}

	@ObfuscatedName("GCPOSBWX.a(J)LPPOHBEGB;")
	public DoublyLinkable get(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) table.get(arg0);
		if (var3 == null) {
			_flowObfuscator4++;
		} else {
			history.addTail(var3);
			_flowObfuscator5++;
		}

		return var3;
	}

	@ObfuscatedName("GCPOSBWX.a(LPPOHBEGB;JB)V")
	public void put(DoublyLinkable arg0, long arg1) {
		if (available == 0) {
			DoublyLinkable var4 = history.removeHead();
			var4.unlink();
			var4.unlink2();

			if (search == var4) {
				DoublyLinkable var5 = history.removeHead();
				var5.unlink();
				var5.unlink2();
			}
		} else {
			available--;
		}

		table.put(arg0, arg1);
		history.addTail(arg0);
	}

	@ObfuscatedName("GCPOSBWX.a()V")
	public void clear() {
		while (true) {
			DoublyLinkable var1 = history.removeHead();
			if (var1 == null) {
				available = capacity;
				return;
			}

			var1.unlink();
			var1.unlink2();
		}
	}
}
