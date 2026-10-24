package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("qb")
public final class LinkList2 {

	@ObfuscatedName("qb.c")
	public Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("qb.d")
	public Linkable2 cursor;

	public LinkList2() {
		sentinel.next2 = sentinel;
		sentinel.prev2 = sentinel;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}

		arg0.prev2 = sentinel.prev2;
		arg0.next2 = sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public Linkable2 popFront() {
		Linkable2 var1 = sentinel.next2;
		if (sentinel == var1) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public Linkable2 head() {
		Linkable2 var1 = sentinel.next2;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public Linkable2 next() {
		Linkable2 var1 = cursor;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int size() {
		int var1 = 0;
		for (Linkable2 var2 = sentinel.next2; var2 != sentinel; var2 = var2.next2) {
			var1++;
		}

		return var1;
	}
}
