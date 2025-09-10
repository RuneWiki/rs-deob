package deob;

@ObfuscatedName("lo")
public class class288 extends class308 {

	@ObfuscatedName("lo.af")
	public final int field3308;

	@ObfuscatedName("lo.aw")
	public final class291 field3310;

	@ObfuscatedName("lo.at")
	public int field3309;

	@ObfuscatedName("lo.ac")
	public class303 field3315;

	@ObfuscatedName("lo.ap")
	public int field3311;

	@ObfuscatedName("lo.aq")
	public int field3312;

	public class288(class357 arg0, class357 arg1, int arg2, class291 arg3) {
		super(arg0, arg1);
		this.field3308 = arg2;
		this.field3310 = arg3;
		this.method5931();
	}

	@ObfuscatedName("lo.af(B)V")
	public void method5931() {
		this.field3309 = class213.method8013(this.field3308).method4310().field2343;
		this.field3315 = this.field3310.method6082(class185.method4094(this.field3309));
		class185 var1 = class185.method4094(this.method5939());
		class606 var2 = var1.method3887(false);
		if (var2 == null) {
			this.field3311 = 0;
			this.field3312 = 0;
		} else {
			this.field3311 = var2.field6020;
			this.field3312 = var2.field6021;
		}
	}

	@ObfuscatedName("lo.aw(I)I")
	public int method5939() {
		return this.field3309;
	}

	@ObfuscatedName("lo.at(I)Lls;")
	public class303 method5933() {
		return this.field3315;
	}

	@ObfuscatedName("lo.ac(B)I")
	public int method5934() {
		return this.field3311;
	}

	@ObfuscatedName("lo.ap(I)I")
	public int method5943() {
		return this.field3312;
	}
}
