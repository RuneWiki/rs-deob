package deob;

@ObfuscatedName("li")
public class class296 extends class308 {

	@ObfuscatedName("li.af")
	public final int field3401;

	@ObfuscatedName("li.aw")
	public final class303 field3399;

	@ObfuscatedName("li.at")
	public final int field3400;

	@ObfuscatedName("li.ac")
	public final int field3402;

	public class296(class357 arg0, class357 arg1, int arg2, class303 arg3) {
		super(arg0, arg1);
		this.field3401 = arg2;
		this.field3399 = arg3;
		class185 var5 = class185.method4094(this.method5939());
		class606 var6 = var5.method3887(false);
		if (var6 == null) {
			this.field3400 = 0;
			this.field3402 = 0;
		} else {
			this.field3400 = var6.field6020;
			this.field3402 = var6.field6021;
		}
	}

	@ObfuscatedName("li.aw(I)I")
	public int method5939() {
		return this.field3401;
	}

	@ObfuscatedName("li.at(I)Lls;")
	public class303 method5933() {
		return this.field3399;
	}

	@ObfuscatedName("li.ac(B)I")
	public int method5934() {
		return this.field3400;
	}

	@ObfuscatedName("li.ap(I)I")
	public int method5943() {
		return this.field3402;
	}
}
