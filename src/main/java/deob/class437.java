package deob;

@ObfuscatedName("qs")
public class class437 {

	@ObfuscatedName("qs.af")
	public class545 field5123 = new class545();

	@ObfuscatedName("qs.aw")
	public class545 field5124;

	public class437() {
		this.field5123.field5600 = this.field5123;
		this.field5123.field5599 = this.field5123;
	}

	@ObfuscatedName("qs.af(Luk;Luk;)V")
	public static void method8041(class545 arg0, class545 arg1) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		arg0.field5599 = arg1.field5599;
		arg0.field5600 = arg1;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
	}

	@ObfuscatedName("qs.aw()V")
	public void method8029() {
		while (true) {
			class545 var1 = this.field5123.field5600;
			if (this.field5123 == var1) {
				this.field5124 = null;
				return;
			}
			var1.method2234();
		}
	}

	@ObfuscatedName("qs.at(Luk;)V")
	public void method8033(class545 arg0) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		arg0.field5599 = this.field5123.field5599;
		arg0.field5600 = this.field5123;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
	}

	@ObfuscatedName("qs.ac(Luk;)V")
	public void method8031(class545 arg0) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		arg0.field5599 = this.field5123;
		arg0.field5600 = this.field5123.field5600;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
	}

	@ObfuscatedName("qs.ap()Luk;")
	public class545 method8060() {
		class545 var1 = this.field5123.field5600;
		if (this.field5123 == var1) {
			return null;
		} else {
			var1.method2234();
			return var1;
		}
	}

	@ObfuscatedName("qs.aq()Luk;")
	public class545 method8039() {
		class545 var1 = this.field5123.field5599;
		if (this.field5123 == var1) {
			return null;
		} else {
			var1.method2234();
			return var1;
		}
	}

	@ObfuscatedName("qs.ao()Luk;")
	public class545 method8034() {
		class545 var1 = this.field5123.field5600;
		if (this.field5123 == var1) {
			this.field5124 = null;
			return null;
		} else {
			this.field5124 = var1.field5600;
			return var1;
		}
	}

	@ObfuscatedName("qs.as()Luk;")
	public class545 method8035() {
		class545 var1 = this.field5123.field5599;
		if (this.field5123 == var1) {
			this.field5124 = null;
			return null;
		} else {
			this.field5124 = var1.field5599;
			return var1;
		}
	}

	@ObfuscatedName("qs.al()Luk;")
	public class545 method8036() {
		class545 var1 = this.field5124;
		if (this.field5123 == var1) {
			this.field5124 = null;
			return null;
		} else {
			this.field5124 = var1.field5600;
			return var1;
		}
	}

	@ObfuscatedName("qs.au()Luk;")
	public class545 method8037() {
		class545 var1 = this.field5124;
		if (this.field5123 == var1) {
			this.field5124 = null;
			return null;
		} else {
			this.field5124 = var1.field5599;
			return var1;
		}
	}
}
