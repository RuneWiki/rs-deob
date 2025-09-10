package deob;

@ObfuscatedName("ld")
public class class307 implements class310 {

	@ObfuscatedName("ld.af")
	public int field3481;

	@ObfuscatedName("ld.aw")
	public int field3485;

	@ObfuscatedName("ld.at")
	public int field3480;

	@ObfuscatedName("ld.ac")
	public int field3482;

	@ObfuscatedName("ld.ap")
	public int field3488;

	@ObfuscatedName("ld.aq")
	public int field3483;

	@ObfuscatedName("ld.af(Lll;I)V")
	public void method5947(class290 arg0) {
		if (arg0.field3338 > this.field3488) {
			arg0.field3338 = this.field3488;
		}
		if (arg0.field3336 < this.field3488) {
			arg0.field3336 = this.field3488;
		}
		if (arg0.field3327 > this.field3483) {
			arg0.field3327 = this.field3483;
		}
		if (arg0.field3337 < this.field3483) {
			arg0.field3337 = this.field3483;
		}
	}

	@ObfuscatedName("ld.aw(IIII)Z")
	public boolean method5948(int arg0, int arg1, int arg2) {
		if (arg0 >= this.field3481 && arg0 < this.field3485 + this.field3481) {
			return arg1 >> 6 == this.field3480 && arg2 >> 6 == this.field3482;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ld.at(IIB)Z")
	public boolean method5949(int arg0, int arg1) {
		return arg0 >> 6 == this.field3488 && arg1 >> 6 == this.field3483;
	}

	@ObfuscatedName("ld.ac(IIII)[I")
	public int[] method5954(int arg0, int arg1, int arg2) {
		return this.method5948(arg0, arg1, arg2) ? new int[] { this.field3488 * 64 - this.field3480 * 64 + arg1, this.field3483 * 64 - this.field3482 * 64 + arg2 } : null;
	}

	@ObfuscatedName("ld.ap(IIB)Lna;")
	public class357 method5951(int arg0, int arg1) {
		if (this.method5949(arg0, arg1)) {
			int var3 = this.field3480 * 64 - this.field3488 * 64 + arg0;
			int var4 = this.field3482 * 64 - this.field3483 * 64 + arg1;
			return new class357(this.field3481, var3, var4);
		} else {
			return null;
		}
	}

	@ObfuscatedName("ld.aq(Lwb;I)V")
	public void method5952(class591 arg0) {
		this.field3481 = arg0.method10339();
		this.field3485 = arg0.method10339();
		this.field3480 = arg0.method10341();
		this.field3482 = arg0.method10341();
		this.field3488 = arg0.method10341();
		this.field3483 = arg0.method10341();
		this.method6336();
	}

	@ObfuscatedName("ld.ao(I)V")
	public void method6336() {
	}
}
