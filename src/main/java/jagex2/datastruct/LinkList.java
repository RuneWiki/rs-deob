package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ob")
public final class LinkList {

	@ObfuscatedName("ob.d")
	public Linkable sentinel = new Linkable();

	@ObfuscatedName("ob.e")
	public Linkable cursor;

	public LinkList() {
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
	}

	@ObfuscatedName("ob.a(Lu;)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}

		arg0.prev = sentinel.prev;
		arg0.next = sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("ob.a(ZLu;)V")
	public void pushFront(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}

		arg0.prev = sentinel;
		arg0.next = sentinel.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("ob.a()Lu;")
	public Linkable popFront() {
		Linkable var1 = sentinel.next;
		if (sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("ob.b()Lu;")
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

	@ObfuscatedName("ob.a(Z)Lu;")
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

	@ObfuscatedName("ob.a(B)Lu;")
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

	@ObfuscatedName("ob.b(Z)Lu;")
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

	@ObfuscatedName("ob.c()V")
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
