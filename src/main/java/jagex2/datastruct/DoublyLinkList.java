package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("BISVHPUN")
public final class DoublyLinkList {

	@ObfuscatedName("BISVHPUN.c")
	public DoublyLinkable sentinel = new DoublyLinkable();

	@ObfuscatedName("BISVHPUN.d")
	public DoublyLinkable cursor;

	public DoublyLinkList() {
		sentinel.next2 = sentinel;
		sentinel.prev2 = sentinel;
	}

	@ObfuscatedName("BISVHPUN.a(LPPOHBEGB;)V")
	public void addTail(DoublyLinkable arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}

		arg0.prev2 = sentinel.prev2;
		arg0.next2 = sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("BISVHPUN.a()LPPOHBEGB;")
	public DoublyLinkable removeHead() {
		DoublyLinkable var1 = sentinel.next2;
		if (sentinel == var1) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("BISVHPUN.b()LPPOHBEGB;")
	public DoublyLinkable head() {
		DoublyLinkable var1 = sentinel.next2;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("BISVHPUN.a(Z)LPPOHBEGB;")
	public DoublyLinkable next() {
		DoublyLinkable var1 = cursor;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("BISVHPUN.c()I")
	public int size() {
		int var1 = 0;
		for (DoublyLinkable var2 = sentinel.next2; var2 != sentinel; var2 = var2.next2) {
			var1++;
		}

		return var1;
	}
}
