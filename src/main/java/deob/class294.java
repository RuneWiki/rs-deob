package deob;

@ObfuscatedName("ly")
public class class294 implements class310 {

	@ObfuscatedName("ly.af")
	public int field3394;

	@ObfuscatedName("ly.aw")
	public int field3384;

	@ObfuscatedName("ly.at")
	public int field3390;

	@ObfuscatedName("ly.ac")
	public int field3386;

	@ObfuscatedName("ly.ap")
	public int field3395;

	@ObfuscatedName("ly.aq")
	public int field3388;

	@ObfuscatedName("ly.ao")
	public int field3389;

	@ObfuscatedName("ly.as")
	public int field3383;

	@ObfuscatedName("ly.al")
	public int field3391;

	@ObfuscatedName("ly.au")
	public int field3392;

	@ObfuscatedName("ly.af(Lll;I)V")
	public void method5947(class290 arg0) {
		if (arg0.field3338 > this.field3395) {
			arg0.field3338 = this.field3395;
		}
		if (arg0.field3336 < this.field3395) {
			arg0.field3336 = this.field3395;
		}
		if (arg0.field3327 > this.field3388) {
			arg0.field3327 = this.field3388;
		}
		if (arg0.field3337 < this.field3388) {
			arg0.field3337 = this.field3388;
		}
	}

	@ObfuscatedName("ly.aw(IIII)Z")
	public boolean method5948(int arg0, int arg1, int arg2) {
		if (arg0 >= this.field3394 && arg0 < this.field3394 + this.field3384) {
			return arg1 >= (this.field3390 << 6) + (this.field3389 << 3) && arg1 <= (this.field3390 << 6) + (this.field3389 << 3) + 7 && arg2 >= (this.field3386 << 6) + (this.field3383 << 3) && arg2 <= (this.field3386 << 6) + (this.field3383 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ly.at(IIB)Z")
	public boolean method5949(int arg0, int arg1) {
		return arg0 >= (this.field3395 << 6) + (this.field3391 << 3) && arg0 <= (this.field3395 << 6) + (this.field3391 << 3) + 7 && arg1 >= (this.field3392 << 3) + (this.field3388 << 6) && arg1 <= (this.field3392 << 3) + (this.field3388 << 6) + 7;
	}

	@ObfuscatedName("ly.ac(IIII)[I")
	public int[] method5954(int arg0, int arg1, int arg2) {
		return this.method5948(arg0, arg1, arg2) ? new int[] { this.field3391 * 8 - this.field3389 * 8 + this.field3395 * 64 - this.field3390 * 64 + arg1, this.field3392 * 8 - this.field3383 * 8 + this.field3388 * 64 - this.field3386 * 64 + arg2 } : null;
	}

	@ObfuscatedName("ly.ap(IIB)Lna;")
	public class357 method5951(int arg0, int arg1) {
		if (this.method5949(arg0, arg1)) {
			int var3 = this.field3389 * 8 - this.field3391 * 8 + this.field3390 * 64 - this.field3395 * 64 + arg0;
			int var4 = this.field3383 * 8 - this.field3392 * 8 + this.field3386 * 64 - this.field3388 * 64 + arg1;
			return new class357(this.field3394, var3, var4);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ly.aq(Lwb;I)V")
	public void method5952(class591 arg0) {
		this.field3394 = arg0.method10339();
		this.field3384 = arg0.method10339();
		this.field3390 = arg0.method10341();
		this.field3389 = arg0.method10339();
		this.field3386 = arg0.method10341();
		this.field3383 = arg0.method10339();
		this.field3395 = arg0.method10341();
		this.field3391 = arg0.method10339();
		this.field3388 = arg0.method10341();
		this.field3392 = arg0.method10339();
		this.method6258();
	}

	@ObfuscatedName("ly.ao(B)V")
	public void method6258() {
	}
}
