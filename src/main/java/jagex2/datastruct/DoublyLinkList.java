package jagex2.datastruct;

import deob.ObfuscatedName;

public class DoublyLinkList {

	@ObfuscatedName("BISVHPUN.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("BISVHPUN.b")
	public int _flowObfuscator2 = -589;

	@ObfuscatedName("BISVHPUN.c")
	public DoublyLinkable sentinel = new DoublyLinkable();

	@ObfuscatedName("BISVHPUN.d")
	public DoublyLinkable cursor;

	public DoublyLinkList(int arg0) {
		if (arg0 != 0) {
			this._flowObfuscator2 = -25;
		}
		this.sentinel.next2 = this.sentinel;
		this.sentinel.prev2 = this.sentinel;
	}

	@ObfuscatedName("BISVHPUN.a(LPPOHBEGB;)V")
	public void addTail(DoublyLinkable arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = this.sentinel.prev2;
		arg0.next2 = this.sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("BISVHPUN.a()LPPOHBEGB;")
	public DoublyLinkable removeHead() {
		DoublyLinkable var1 = this.sentinel.next2;
		if (this.sentinel == var1) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("BISVHPUN.b()LPPOHBEGB;")
	public DoublyLinkable head() {
		DoublyLinkable var1 = this.sentinel.next2;
		if (this.sentinel == var1) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("BISVHPUN.a(Z)LPPOHBEGB;")
	public DoublyLinkable next(boolean arg0) {
		if (arg0) {
			throw new NullPointerException();
		}
		DoublyLinkable var2 = this.cursor;
		if (this.sentinel == var2) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var2.next2;
			return var2;
		}
	}

	@ObfuscatedName("BISVHPUN.c()I")
	public int size() {
		int var1 = 0;
		for (DoublyLinkable var2 = this.sentinel.next2; var2 != this.sentinel; var2 = var2.next2) {
			var1++;
		}
		return var1;
	}
}
