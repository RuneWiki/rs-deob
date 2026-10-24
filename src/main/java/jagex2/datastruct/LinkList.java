package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public final class LinkList {

	@ObfuscatedName("pb.c")
	public Linkable sentinel = new Linkable();

	@ObfuscatedName("pb.d")
	public Linkable cursor;

	public LinkList() {
		sentinel.next = sentinel;
		sentinel.prev = sentinel;
	}

	@ObfuscatedName("pb.a(Lv;)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}

		arg0.prev = sentinel.prev;
		arg0.next = sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("pb.a(Lv;I)V")
	public void pushFront(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}

		arg0.prev = sentinel;
		arg0.next = sentinel.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("pb.a()Lv;")
	public Linkable popFront() {
		Linkable var1 = sentinel.next;
		if (sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("pb.b()Lv;")
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

	@ObfuscatedName("pb.a(B)Lv;")
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

	@ObfuscatedName("pb.a(I)Lv;")
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

	@ObfuscatedName("pb.b(I)Lv;")
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

	@ObfuscatedName("pb.c()V")
	public void clear() {
		while (true) {
			Linkable var1 = sentinel.next;
			if (sentinel == var1) {
				return;
			}

			var1.unlink();
		}
	}
}
