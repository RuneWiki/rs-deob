package jagex2.datastruct;

import deob.ObfuscatedName;

public class HashTable {

	@ObfuscatedName("ARZPHHDH.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("ARZPHHDH.b")
	public int _flowObfuscator2 = -373;

	@ObfuscatedName("ARZPHHDH.c")
	public int bucketCount;

	@ObfuscatedName("ARZPHHDH.d")
	public Linkable[] buckets;

	public HashTable(int arg0, int arg1) {
		if (arg0 >= 0) {
			throw new NullPointerException();
		}
		this.bucketCount = arg1;
		this.buckets = new Linkable[arg1];
		for (int var3 = 0; var3 < arg1; var3++) {
			Linkable var4 = this.buckets[var3] = new Linkable();
			var4.next = var4;
			var4.prev = var4;
		}
	}

	@ObfuscatedName("ARZPHHDH.a(J)LPKVMXVTO;")
	public Linkable get(long arg0) {
		Linkable var3 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("ARZPHHDH.a(LPKVMXVTO;JB)V")
	public void put(Linkable arg0, long arg1, byte arg2) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		Linkable var5 = this.buckets[(int) (arg1 & (long) (this.bucketCount - 1))];
		if (arg2 != 7) {
			return;
		}
		arg0.prev = var5.prev;
		arg0.next = var5;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
		arg0.key = arg1;
	}
}
