package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public final class HashTable {

	@ObfuscatedName("u.c")
	public int bucketCount;

	@ObfuscatedName("u.d")
	public Linkable[] buckets;

	public HashTable(int arg0) {
		bucketCount = arg0;
		buckets = new Linkable[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = buckets[var2] = new Linkable();
			var3.next = var3;
			var3.prev = var3;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public Linkable find(long arg0) {
		Linkable var3 = buckets[(int) (arg0 & bucketCount - 1)];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("u.a(JBLv;)V")
	public void put(long arg0, Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}

		Linkable var4 = buckets[(int) (arg0 & bucketCount - 1)];
		arg1.prev = var4.prev;
		arg1.next = var4;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
		arg1.key = arg0;
	}
}
