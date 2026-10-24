package deob;

@ObfuscatedName("nb")
public final class class40 {

	@ObfuscatedName("nb.d")
	public class20 field562 = new class20();

	@ObfuscatedName("nb.e")
	public class20 field563;

	public class40() {
		field562.field253 = field562;
		field562.field254 = field562;
	}

	@ObfuscatedName("nb.a(Lt;)V")
	public void method201(class20 arg0) {
		if (arg0.field254 != null) {
			arg0.method89();
		}

		arg0.field254 = field562.field254;
		arg0.field253 = field562;
		arg0.field254.field253 = arg0;
		arg0.field253.field254 = arg0;
	}

	@ObfuscatedName("nb.a()Lt;")
	public class20 method202() {
		class20 var1 = field562.field253;
		if (field562 == var1) {
			return null;
		} else {
			var1.method89();
			return var1;
		}
	}

	@ObfuscatedName("nb.b()Lt;")
	public class20 method203() {
		class20 var1 = field562.field253;
		if (field562 == var1) {
			field563 = null;
			return null;
		} else {
			field563 = var1.field253;
			return var1;
		}
	}

	@ObfuscatedName("nb.a(B)Lt;")
	public class20 method204() {
		class20 var1 = field562.field254;
		if (field562 == var1) {
			field563 = null;
			return null;
		} else {
			field563 = var1.field254;
			return var1;
		}
	}

	@ObfuscatedName("nb.a(I)Lt;")
	public class20 method205() {
		class20 var1 = field563;
		if (field562 == var1) {
			field563 = null;
			return null;
		} else {
			field563 = var1.field253;
			return var1;
		}
	}

	@ObfuscatedName("nb.b(B)Lt;")
	public class20 method206() {
		class20 var1 = field563;
		if (field562 == var1) {
			field563 = null;
			return null;
		} else {
			field563 = var1.field254;
			return var1;
		}
	}

	@ObfuscatedName("nb.c()V")
	public void method207() {
		while (true) {
			class20 var1 = field562.field253;
			if (field562 == var1) {
				return;
			}

			var1.method89();
		}
	}
}
