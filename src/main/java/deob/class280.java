package deob;

@ObfuscatedName("ky")
public class class280 {

	@ObfuscatedName("ky.af")
	public int field3275 = 0;

	@ObfuscatedName("ky.aw")
	public int field3273 = 0;

	@ObfuscatedName("ky.at")
	public int field3277 = 0;

	@ObfuscatedName("ky.ac")
	public int field3274 = 0;

	@ObfuscatedName("ky.af(I)I")
	public int method5831() {
		return this.field3273;
	}

	@ObfuscatedName("ky.aw(I)I")
	public int method5857() {
		return this.field3274;
	}

	@ObfuscatedName("ky.at(I)I")
	public int method5833() {
		return this.field3277;
	}

	@ObfuscatedName("ky.ac(B)I")
	public int method5834() {
		return this.field3273 >> 7;
	}

	@ObfuscatedName("ky.ap(B)I")
	public int method5838() {
		return this.field3277 >> 7;
	}

	@ObfuscatedName("ky.aq(I)I")
	public int method5844() {
		return this.field3275;
	}

	@ObfuscatedName("ky.ao(II)V")
	public void method5841(int arg0) {
		this.field3275 = arg0 & 0x7FF;
	}

	@ObfuscatedName("ky.as(Lky;S)V")
	public void method5837(class280 arg0) {
		this.field3275 = arg0.field3275;
		this.field3273 = arg0.field3273;
		this.field3274 = arg0.field3274;
		this.field3277 = arg0.field3277;
	}

	@ObfuscatedName("ky.al(III)V")
	public void method5830(int arg0, int arg1) {
		this.field3273 = arg0;
		this.field3277 = arg1;
	}

	@ObfuscatedName("ky.au(IB)V")
	public void method5849(int arg0) {
		this.field3274 = arg0;
	}

	@ObfuscatedName("ky.ai(IIS)V")
	public void method5840(int arg0, int arg1) {
		this.field3273 += arg0;
		this.field3277 += arg1;
	}

	@ObfuscatedName("ky.aa(IIIII)V")
	public void method5856(int arg0, int arg1, int arg2, int arg3) {
		this.field3273 += arg0;
		this.field3274 += arg1;
		this.field3277 += arg2;
		this.method5841(this.field3275 + arg3);
	}

	public boolean equals(Object arg0) {
		return arg0 instanceof class280 ? this.method5842((class280) arg0) : false;
	}

	@ObfuscatedName("ky.am(Lky;B)Z")
	public boolean method5842(class280 arg0) {
		return this.field3273 == arg0.field3273 && this.field3274 == arg0.field3274 && this.field3277 == arg0.field3277 && this.field3275 == arg0.field3275;
	}

	public String toString() {
		return this.field3273 + ", " + this.field3274 + ", " + this.field3277 + ", " + this.field3275;
	}
}
