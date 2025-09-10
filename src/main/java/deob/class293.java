package deob;

@ObfuscatedName("lc")
public class class293 extends class299 {

	@ObfuscatedName("lc.af")
	public int field3377;

	@ObfuscatedName("lc.aw")
	public int field3379;

	@ObfuscatedName("lc.at")
	public int field3382;

	@ObfuscatedName("lc.ac")
	public int field3380;

	@ObfuscatedName("lc.af(Lwb;I)V")
	public void method6253(class591 arg0) {
		int var2 = arg0.method10339();
		if (class305.field3467.field3469 != var2) {
			throw new IllegalStateException("");
		}
		this.field3426 = arg0.method10339();
		this.field3429 = arg0.method10339();
		this.field3434 = arg0.method10341();
		this.field3427 = arg0.method10341();
		this.field3377 = arg0.method10339();
		this.field3379 = arg0.method10339();
		this.field3432 = arg0.method10341();
		this.field3430 = arg0.method10341();
		this.field3382 = arg0.method10339();
		this.field3380 = arg0.method10339();
		this.field3433 = arg0.method10365();
		this.field3428 = arg0.method10365();
	}

	@ObfuscatedName("lc.aw(Lwb;I)V")
	public void method5908(class591 arg0) {
		this.field3429 = Math.min(this.field3429, 4);
		this.field3431 = new short[1][64][64];
		this.field3435 = new short[this.field3429][64][64];
		this.field3436 = new byte[this.field3429][64][64];
		this.field3437 = new byte[this.field3429][64][64];
		this.field3438 = new class301[this.field3429][64][64][];
		int var2 = arg0.method10339();
		if (class304.field3463.field3465 != var2) {
			throw new IllegalStateException("");
		}
		int var3 = arg0.method10339();
		int var4 = arg0.method10339();
		int var5 = arg0.method10339();
		int var6 = arg0.method10339();
		if (this.field3432 != var3 || this.field3430 != var4 || this.field3382 != var5 || this.field3380 != var6) {
			throw new IllegalStateException("");
		}
		for (int var7 = 0; var7 < 8; var7++) {
			for (int var8 = 0; var8 < 8; var8++) {
				this.method6285(this.field3382 * 8 + var7, this.field3380 * 8 + var8, arg0);
			}
		}
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class293)) {
			return false;
		}
		class293 var2 = (class293) arg0;
		if (this.field3432 == var2.field3432 && this.field3430 == var2.field3430) {
			return this.field3382 == var2.field3382 && this.field3380 == var2.field3380;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.field3432 | this.field3430 << 8 | this.field3382 << 16 | this.field3380 << 24;
	}

	@ObfuscatedName("lc.at(B)I")
	public int method6240() {
		return this.field3377;
	}

	@ObfuscatedName("lc.ap(I)I")
	public int method6235() {
		return this.field3379;
	}

	@ObfuscatedName("lc.aq(I)I")
	public int method6238() {
		return this.field3382;
	}

	@ObfuscatedName("lc.ao(I)I")
	public int method6239() {
		return this.field3380;
	}
}
