package deob;

@ObfuscatedName("vm")
public class class559 implements class469 {

	@ObfuscatedName("vm.af")
	public class80 field5762;

	@ObfuscatedName("vm.aw")
	public int field5760;

	@ObfuscatedName("vm.at")
	public int field5761;

	@ObfuscatedName("vm.ac")
	public boolean field5763;

	@ObfuscatedName("vm.ac(Ldr;IIZS)V")
	public void method10043(class80 arg0, int arg1, int arg2, boolean arg3) {
		this.field5762 = arg0;
		this.field5760 = arg1;
		this.field5761 = arg2;
		this.field5763 = arg3;
	}

	@ObfuscatedName("vm.ap(S)V")
	public void method10041() {
		this.field5762 = null;
	}

	@ObfuscatedName("vm.af(Lij;IB)V")
	public void method8896(class216 arg0, int arg1) {
		if (this.field5762 != null) {
			Statics.method3650(this.field5762, arg0, arg1, this.field5760, this.field5761, this.field5763);
		}
	}
}
