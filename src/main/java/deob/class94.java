package deob;

@ObfuscatedName("dg")
public class class94 extends class105 {

	@ObfuscatedName("dg.af")
	public class437 field1311 = new class437();

	@ObfuscatedName("dg.aw")
	public class437 field1310 = new class437();

	@ObfuscatedName("dg.at")
	public int field1312 = 0;

	@ObfuscatedName("dg.ac")
	public int field1313 = -1;

	@ObfuscatedName("dg.af(Lef;)V")
	public final synchronized void method2890(class105 arg0) {
		this.field1311.method8031(arg0);
	}

	@ObfuscatedName("dg.aw(Lef;)V")
	public final synchronized void method2891(class105 arg0) {
		arg0.method2234();
	}

	@ObfuscatedName("dg.at()V")
	public void method2892() {
		if (this.field1312 <= 0) {
			return;
		}
		for (class112 var1 = (class112) this.field1310.method8034(); var1 != null; var1 = (class112) this.field1310.method8036()) {
			var1.field1489 -= this.field1312;
		}
		this.field1313 -= this.field1312;
		this.field1312 = 0;
	}

	@ObfuscatedName("dg.ac(Luk;Leg;)V")
	public void method2909(class545 arg0, class112 arg1) {
		while (this.field1310.field5123 != arg0 && ((class112) arg0).field1489 <= arg1.field1489) {
			arg0 = arg0.field5600;
		}
		class437.method8041(arg1, arg0);
		this.field1313 = ((class112) this.field1310.field5123.field5600).field1489;
	}

	@ObfuscatedName("dg.ap(Leg;)V")
	public void method2894(class112 arg0) {
		arg0.method2234();
		arg0.method3289();
		class545 var2 = this.field1310.field5123.field5600;
		if (this.field1310.field5123 == var2) {
			this.field1313 = -1;
		} else {
			this.field1313 = ((class112) var2).field1489;
		}
	}

	@ObfuscatedName("dg.aq()Lef;")
	public class105 method2895() {
		return (class105) this.field1311.method8034();
	}

	@ObfuscatedName("dg.ao()Lef;")
	public class105 method2896() {
		return (class105) this.field1311.method8036();
	}

	@ObfuscatedName("dg.as()I")
	public int method2915() {
		return 0;
	}

	@ObfuscatedName("dg.al([III)V")
	public final synchronized void method2899(int[] arg0, int arg1, int arg2) {
		do {
			if (this.field1313 < 0) {
				this.method2897(arg0, arg1, arg2);
				return;
			}
			if (this.field1312 + arg2 < this.field1313) {
				this.field1312 += arg2;
				this.method2897(arg0, arg1, arg2);
				return;
			}
			int var4 = this.field1313 - this.field1312;
			this.method2897(arg0, arg1, var4);
			arg1 += var4;
			arg2 -= var4;
			this.field1312 += var4;
			this.method2892();
			class112 var5 = (class112) this.field1310.method8034();
			synchronized (var5) {
				int var7 = var5.method3295(this);
				if (var7 < 0) {
					var5.field1489 = 0;
					this.method2894(var5);
				} else {
					var5.field1489 = var7;
					this.method2909(var5.field5600, var5);
				}
			}
		} while (arg2 != 0);
	}

	@ObfuscatedName("dg.au([III)V")
	public void method2897(int[] arg0, int arg1, int arg2) {
		for (class105 var4 = (class105) this.field1311.method8034(); var4 != null; var4 = (class105) this.field1311.method8036()) {
			var4.method3217(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("dg.ai(I)V")
	public final synchronized void method2900(int arg0) {
		do {
			if (this.field1313 < 0) {
				this.method2901(arg0);
				return;
			}
			if (this.field1312 + arg0 < this.field1313) {
				this.field1312 += arg0;
				this.method2901(arg0);
				return;
			}
			int var2 = this.field1313 - this.field1312;
			this.method2901(var2);
			arg0 -= var2;
			this.field1312 += var2;
			this.method2892();
			class112 var3 = (class112) this.field1310.method8034();
			synchronized (var3) {
				int var5 = var3.method3295(this);
				if (var5 < 0) {
					var3.field1489 = 0;
					this.method2894(var3);
				} else {
					var3.field1489 = var5;
					this.method2909(var3.field5600, var3);
				}
			}
		} while (arg0 != 0);
	}

	@ObfuscatedName("dg.aa(I)V")
	public void method2901(int arg0) {
		for (class105 var2 = (class105) this.field1311.method8034(); var2 != null; var2 = (class105) this.field1311.method8036()) {
			var2.method2900(arg0);
		}
	}
}
