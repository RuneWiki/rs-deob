package deob;

@ObfuscatedName("lx")
public class class297 implements class310 {

	@ObfuscatedName("lx.af")
	public int field3405;

	@ObfuscatedName("lx.aw")
	public int field3404;

	@ObfuscatedName("lx.at")
	public int field3416;

	@ObfuscatedName("lx.ac")
	public int field3406;

	@ObfuscatedName("lx.ap")
	public int field3407;

	@ObfuscatedName("lx.aq")
	public int field3408;

	@ObfuscatedName("lx.ao")
	public int field3403;

	@ObfuscatedName("lx.as")
	public int field3412;

	@ObfuscatedName("lx.al")
	public int field3411;

	@ObfuscatedName("lx.au")
	public int field3413;

	@ObfuscatedName("lx.ai")
	public int field3409;

	@ObfuscatedName("lx.aa")
	public int field3414;

	@ObfuscatedName("lx.am")
	public int field3415;

	@ObfuscatedName("lx.an")
	public int field3410;

	@ObfuscatedName("lx.af(Lll;I)V")
	public void method5947(class290 arg0) {
		if (arg0.field3338 > this.field3407) {
			arg0.field3338 = this.field3407;
		}
		if (arg0.field3336 < this.field3407) {
			arg0.field3336 = this.field3407;
		}
		if (arg0.field3327 > this.field3408) {
			arg0.field3327 = this.field3408;
		}
		if (arg0.field3337 < this.field3408) {
			arg0.field3337 = this.field3408;
		}
	}

	@ObfuscatedName("lx.aw(IIII)Z")
	public boolean method5948(int arg0, int arg1, int arg2) {
		if (arg0 >= this.field3405 && arg0 < this.field3405 + this.field3404) {
			return arg1 >= (this.field3416 << 6) + (this.field3403 << 3) && arg1 <= (this.field3416 << 6) + (this.field3411 << 3) + 7 && arg2 >= (this.field3412 << 3) + (this.field3406 << 6) && arg2 <= (this.field3413 << 3) + (this.field3406 << 6) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("lx.at(IIB)Z")
	public boolean method5949(int arg0, int arg1) {
		return arg0 >= (this.field3409 << 3) + (this.field3407 << 6) && arg0 <= (this.field3415 << 3) + (this.field3407 << 6) + 7 && arg1 >= (this.field3414 << 3) + (this.field3408 << 6) && arg1 <= (this.field3410 << 3) + (this.field3408 << 6) + 7;
	}

	@ObfuscatedName("lx.ac(IIII)[I")
	public int[] method5954(int arg0, int arg1, int arg2) {
		return this.method5948(arg0, arg1, arg2) ? new int[] { this.field3409 * 8 - this.field3403 * 8 + this.field3407 * 64 - this.field3416 * 64 + arg1, this.field3414 * 8 - this.field3412 * 8 + this.field3408 * 64 - this.field3406 * 64 + arg2 } : null;
	}

	@ObfuscatedName("lx.ap(IIB)Lna;")
	public class357 method5951(int arg0, int arg1) {
		if (this.method5949(arg0, arg1)) {
			int var3 = this.field3403 * 8 - this.field3409 * 8 + this.field3416 * 64 - this.field3407 * 64 + arg0;
			int var4 = this.field3412 * 8 - this.field3414 * 8 + this.field3406 * 64 - this.field3408 * 64 + arg1;
			return new class357(this.field3405, var3, var4);
		} else {
			return null;
		}
	}

	@ObfuscatedName("lx.aq(Lwb;I)V")
	public void method5952(class591 arg0) {
		this.field3405 = arg0.method10339();
		this.field3404 = arg0.method10339();
		this.field3416 = arg0.method10341();
		this.field3403 = arg0.method10339();
		this.field3411 = arg0.method10339();
		this.field3406 = arg0.method10341();
		this.field3412 = arg0.method10339();
		this.field3413 = arg0.method10339();
		this.field3407 = arg0.method10341();
		this.field3409 = arg0.method10339();
		this.field3415 = arg0.method10339();
		this.field3408 = arg0.method10341();
		this.field3414 = arg0.method10339();
		this.field3410 = arg0.method10339();
		this.method6266();
	}

	@ObfuscatedName("lx.ao(I)V")
	public void method6266() {
	}
}
