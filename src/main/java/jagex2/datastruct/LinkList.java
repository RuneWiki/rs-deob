package jagex2.datastruct;

import deob.ObfuscatedName;

public class LinkList {

	@ObfuscatedName("LHGXPZPG.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("LHGXPZPG.b")
	public int _flowObfuscator2 = -77;

	@ObfuscatedName("LHGXPZPG.c")
	public Linkable sentinel = new Linkable();

	@ObfuscatedName("LHGXPZPG.d")
	public Linkable cursor;

	public LinkList(int arg0) {
		if (arg0 <= 0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		this.sentinel.next = this.sentinel;
		this.sentinel.prev = this.sentinel;
	}

	@ObfuscatedName("LHGXPZPG.a(LPKVMXVTO;)V")
	public void addTail(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("LHGXPZPG.a(ILPKVMXVTO;)V")
	public void addHead(int arg0, Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		arg1.prev = this.sentinel;
		arg1.next = this.sentinel.next;
		while (arg0 >= 0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
	}

	@ObfuscatedName("LHGXPZPG.a()LPKVMXVTO;")
	public Linkable removeHead() {
		Linkable var1 = this.sentinel.next;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("LHGXPZPG.b()LPKVMXVTO;")
	public Linkable head() {
		Linkable var1 = this.sentinel.next;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("LHGXPZPG.a(I)LPKVMXVTO;")
	public Linkable tail(int arg0) {
		if (arg0 < 5 || arg0 > 5) {
			throw new NullPointerException();
		}
		Linkable var2 = this.sentinel.prev;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.prev;
			return var2;
		}
	}

	@ObfuscatedName("LHGXPZPG.a(Z)LPKVMXVTO;")
	public Linkable next(boolean arg0) {
		Linkable var2 = this.cursor;
		if (arg0) {
			this._flowObfuscator2 = 48;
		}
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.next;
			return var2;
		}
	}

	@ObfuscatedName("LHGXPZPG.b(I)LPKVMXVTO;")
	public Linkable prev(int arg0) {
		Linkable var2 = this.cursor;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		}
		this.cursor = var2.prev;
		if (arg0 != 8) {
			throw new NullPointerException();
		}
		return var2;
	}

	@ObfuscatedName("LHGXPZPG.c()V")
	public void clear() {
		if (this.sentinel.next == this.sentinel) {
			return;
		}
		while (true) {
			Linkable var1 = this.sentinel.next;
			if (this.sentinel == var1) {
				return;
			}
			var1.unlink();
		}
	}
}
