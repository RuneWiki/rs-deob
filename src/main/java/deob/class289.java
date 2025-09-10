package deob;

@ObfuscatedName("la")
public class class289 implements class310 {

	@ObfuscatedName("la.af")
	public int field3325;

	@ObfuscatedName("la.aw")
	public int field3320;

	@ObfuscatedName("la.at")
	public int field3319;

	@ObfuscatedName("la.ac")
	public int field3322;

	@ObfuscatedName("la.ap")
	public int field3321;

	@ObfuscatedName("la.aq")
	public int field3317;

	@ObfuscatedName("la.ao")
	public int field3323;

	@ObfuscatedName("la.as")
	public int field3324;

	@ObfuscatedName("la.al")
	public int field3318;

	@ObfuscatedName("la.au")
	public int field3326;

	@ObfuscatedName("la.af(Lll;I)V")
	public void method5947(class290 arg0) {
		if (arg0.field3338 > this.field3323) {
			arg0.field3338 = this.field3323;
		}
		if (arg0.field3336 < this.field3318) {
			arg0.field3336 = this.field3318;
		}
		if (arg0.field3327 > this.field3324) {
			arg0.field3327 = this.field3324;
		}
		if (arg0.field3337 < this.field3326) {
			arg0.field3337 = this.field3326;
		}
	}

	@ObfuscatedName("la.aw(IIII)Z")
	public boolean method5948(int arg0, int arg1, int arg2) {
		if (arg0 >= this.field3325 && arg0 < this.field3325 + this.field3320) {
			return arg1 >> 6 >= this.field3319 && arg1 >> 6 <= this.field3321 && arg2 >> 6 >= this.field3322 && arg2 >> 6 <= this.field3317;
		} else {
			return false;
		}
	}

	@ObfuscatedName("la.at(IIB)Z")
	public boolean method5949(int arg0, int arg1) {
		return arg0 >> 6 >= this.field3323 && arg0 >> 6 <= this.field3318 && arg1 >> 6 >= this.field3324 && arg1 >> 6 <= this.field3326;
	}

	@ObfuscatedName("la.ac(IIII)[I")
	public int[] method5954(int arg0, int arg1, int arg2) {
		return this.method5948(arg0, arg1, arg2) ? new int[] { this.field3323 * 64 - this.field3319 * 64 + arg1, this.field3324 * 64 - this.field3322 * 64 + arg2 } : null;
	}

	@ObfuscatedName("la.ap(IIB)Lna;")
	public class357 method5951(int arg0, int arg1) {
		if (this.method5949(arg0, arg1)) {
			int var3 = this.field3319 * 64 - this.field3323 * 64 + arg0;
			int var4 = this.field3322 * 64 - this.field3324 * 64 + arg1;
			return new class357(this.field3325, var3, var4);
		} else {
			return null;
		}
	}

	@ObfuscatedName("la.aq(Lwb;I)V")
	public void method5952(class591 arg0) {
		this.field3325 = arg0.method10339();
		this.field3320 = arg0.method10339();
		this.field3319 = arg0.method10341();
		this.field3322 = arg0.method10341();
		this.field3321 = arg0.method10341();
		this.field3317 = arg0.method10341();
		this.field3323 = arg0.method10341();
		this.field3324 = arg0.method10341();
		this.field3318 = arg0.method10341();
		this.field3326 = arg0.method10341();
		this.method5953();
	}

	@ObfuscatedName("la.ao(I)V")
	public void method5953() {
	}
}
