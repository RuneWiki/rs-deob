package deob;

@ObfuscatedName("qb")
public final class class43 {

	@ObfuscatedName("qb.a")
	public class24 field653 = new class24();

	@ObfuscatedName("qb.b")
	public class24 field654;

	public class43() {
		field653.field364 = field653;
		field653.field365 = field653;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method262(class24 arg0) {
		if (arg0.field365 != null) {
			arg0.method120();
		}

		arg0.field365 = field653.field365;
		arg0.field364 = field653;
		arg0.field365.field364 = arg0;
		arg0.field364.field365 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public class24 method263() {
		class24 var1 = field653.field364;
		if (field653 == var1) {
			return null;
		} else {
			var1.method120();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public class24 method264() {
		class24 var1 = field653.field364;
		if (field653 == var1) {
			field654 = null;
			return null;
		} else {
			field654 = var1.field364;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public class24 method265() {
		class24 var1 = field654;
		if (field653 == var1) {
			field654 = null;
			return null;
		} else {
			field654 = var1.field364;
			return var1;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method266() {
		int var1 = 0;
		for (class24 var2 = field653.field364; var2 != field653; var2 = var2.field364) {
			var1++;
		}

		return var1;
	}
}
