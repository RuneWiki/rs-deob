package deob;

@ObfuscatedName("kv")
public class class285 extends class299 {

	@ObfuscatedName("kv.af(Lwb;I)V")
	public void method5914(class591 arg0) {
		int var2 = arg0.method10339();
		if (class305.field3472.field3469 != var2) {
			throw new IllegalStateException("");
		}
		this.field3426 = arg0.method10339();
		this.field3429 = arg0.method10339();
		this.field3434 = arg0.method10341();
		this.field3427 = arg0.method10341();
		this.field3432 = arg0.method10341();
		this.field3430 = arg0.method10341();
		this.field3433 = arg0.method10365();
		this.field3428 = arg0.method10365();
	}

	@ObfuscatedName("kv.aw(Lwb;I)V")
	public void method5908(class591 arg0) {
		this.field3429 = Math.min(this.field3429, 4);
		this.field3431 = new short[1][64][64];
		this.field3435 = new short[this.field3429][64][64];
		this.field3436 = new byte[this.field3429][64][64];
		this.field3437 = new byte[this.field3429][64][64];
		this.field3438 = new class301[this.field3429][64][64][];
		int var2 = arg0.method10339();
		if (class304.field3464.field3465 != var2) {
			throw new IllegalStateException("");
		}
		int var3 = arg0.method10339();
		int var4 = arg0.method10339();
		if (this.field3432 != var3 || this.field3430 != var4) {
			throw new IllegalStateException("");
		}
		for (int var5 = 0; var5 < 64; var5++) {
			for (int var6 = 0; var6 < 64; var6++) {
				this.method6285(var5, var6, arg0);
			}
		}
	}

	public boolean equals(Object arg0) {
		if (arg0 instanceof class285) {
			class285 var2 = (class285) arg0;
			return this.field3432 == var2.field3432 && this.field3430 == var2.field3430;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.field3432 | this.field3430 << 8;
	}
}
