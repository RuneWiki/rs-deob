package jagex2.datastruct;

import deob.ObfuscatedName;

public class LruCache {

	@ObfuscatedName("GCPOSBWX.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("GCPOSBWX.c")
	public boolean _flowObfuscator3 = false;

	@ObfuscatedName("GCPOSBWX.f")
	public DoublyLinkable search = new DoublyLinkable();

	@ObfuscatedName("GCPOSBWX.j")
	public DoublyLinkList history = new DoublyLinkList(_flowObfuscator2);

	@ObfuscatedName("GCPOSBWX.g")
	public int capacity;

	@ObfuscatedName("GCPOSBWX.h")
	public int available;

	@ObfuscatedName("GCPOSBWX.i")
	public HashTable table;

	@ObfuscatedName("GCPOSBWX.b")
	public static int _flowObfuscator2;

	@ObfuscatedName("GCPOSBWX.d")
	public int _flowObfuscator4;

	@ObfuscatedName("GCPOSBWX.e")
	public int _flowObfuscator5;

	public LruCache(boolean arg0, int arg1) {
		this.capacity = arg1;
		this.available = arg1;
		this.table = new HashTable(-877, 1024);
		if (arg0) {
			_flowObfuscator2 = -225;
		}
	}

	@ObfuscatedName("GCPOSBWX.a(J)LPPOHBEGB;")
	public DoublyLinkable get(long arg0) {
		DoublyLinkable var3 = (DoublyLinkable) this.table.get(arg0);
		if (var3 == null) {
			this._flowObfuscator4++;
		} else {
			this.history.addTail(var3);
			this._flowObfuscator5++;
		}
		return var3;
	}

	@ObfuscatedName("GCPOSBWX.a(LPPOHBEGB;JB)V")
	public void put(DoublyLinkable arg0, long arg1, byte arg2) {
		if (arg2 != 2) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		if (this.available == 0) {
			DoublyLinkable var5 = this.history.removeHead();
			var5.unlink();
			var5.unlink2();
			if (this.search == var5) {
				DoublyLinkable var6 = this.history.removeHead();
				var6.unlink();
				var6.unlink2();
			}
		} else {
			this.available--;
		}
		this.table.put(arg0, arg1, (byte) 7);
		this.history.addTail(arg0);
		if (Linkable._flowObfuscator2) {
		}
	}

	@ObfuscatedName("GCPOSBWX.a()V")
	public void clear() {
		while (true) {
			DoublyLinkable var1 = this.history.removeHead();
			if (var1 == null) {
				this.available = this.capacity;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}
}
