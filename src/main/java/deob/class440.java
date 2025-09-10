package deob;

@ObfuscatedName("qk")
public class class440 {

	@ObfuscatedName("qk.af")
	public class539 field5131 = new class539();

	@ObfuscatedName("qk.aw")
	public class539 field5130;

	public class440() {
		this.field5131.field5589 = this.field5131;
		this.field5131.field5588 = this.field5131;
	}

	@ObfuscatedName("qk.af(Lug;)V")
	public void method8166(class539 arg0) {
		if (arg0.field5588 != null) {
			arg0.method9755();
		}
		arg0.field5588 = this.field5131.field5588;
		arg0.field5589 = this.field5131;
		arg0.field5588.field5589 = arg0;
		arg0.field5589.field5588 = arg0;
	}

	@ObfuscatedName("qk.aw()Lug;")
	public class539 method8174() {
		class539 var1 = this.field5131.field5589;
		if (this.field5131 == var1) {
			this.field5130 = null;
			return null;
		} else {
			this.field5130 = var1.field5589;
			return var1;
		}
	}

	@ObfuscatedName("qk.at()Lug;")
	public class539 method8167() {
		class539 var1 = this.field5130;
		if (this.field5131 == var1) {
			this.field5130 = null;
			return null;
		} else {
			this.field5130 = var1.field5589;
			return var1;
		}
	}
}
