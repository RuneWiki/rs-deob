package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("LHGXPZPG")
public final class LinkList {

	@ObfuscatedName("LHGXPZPG.c")
	public Linkable sentinel = new Linkable();

	@ObfuscatedName("LHGXPZPG.d")
	public Linkable cursor;

	public LinkList() {
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
	}

	@ObfuscatedName("LHGXPZPG.a(LPKVMXVTO;)V")
	public void addTail(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}

		arg0.prev = sentinel.prev;
		arg0.next = sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("LHGXPZPG.a(ILPKVMXVTO;)V")
	public void addHead(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}

		arg0.prev = sentinel;
		arg0.next = sentinel.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("LHGXPZPG.a()LPKVMXVTO;")
	public Linkable removeHead() {
		Linkable var1 = sentinel.next;
		if (sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("LHGXPZPG.b()LPKVMXVTO;")
	public Linkable head() {
		Linkable var1 = sentinel.next;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("LHGXPZPG.a(I)LPKVMXVTO;")
	public Linkable tail() {
		Linkable var1 = sentinel.prev;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("LHGXPZPG.a(Z)LPKVMXVTO;")
	public Linkable next() {
		Linkable var1 = cursor;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("LHGXPZPG.b(I)LPKVMXVTO;")
	public Linkable prev() {
		Linkable var1 = cursor;
		if (sentinel == var1) {
			cursor = null;
			return null;
		} else {
			cursor = var1.prev;
			return var1;
		}
	}

	@ObfuscatedName("LHGXPZPG.c()V")
	public void clear() {
		if (sentinel.next != sentinel) {
			while (true) {
				Linkable var1 = sentinel.next;
				if (sentinel == var1) {
					return;
				}

				var1.unlink();
			}
		}
	}
}
