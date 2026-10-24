package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("t")
public final class HashTable {

	@ObfuscatedName("t.d")
	public int bucketCount;

	@ObfuscatedName("t.e")
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

	@ObfuscatedName("t.a(J)Lu;")
	public Linkable find(long arg0) {
		Linkable var3 = buckets[(int) (arg0 & bucketCount - 1)];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("t.a(ZLu;J)V")
	public void put(Linkable arg0, long arg1) {
		if (arg0.prev != null) {
			arg0.unlink();
		}

		Linkable var4 = buckets[(int) (arg1 & bucketCount - 1)];
		arg0.prev = var4.prev;
		arg0.next = var4;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
		arg0.key = arg1;
	}
}
