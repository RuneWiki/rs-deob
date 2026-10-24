package deob;

@ObfuscatedName("qb")
public final class class43 {

	@ObfuscatedName("qb.d")
	public class24 field654 = new class24();

	@ObfuscatedName("qb.e")
	public class24 field655;

	public class43() {
		field654.field364 = field654;
		field654.field365 = field654;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method263(class24 arg0) {
		if (arg0.field365 != null) {
			arg0.method121();
		}

		arg0.field365 = field654.field365;
		arg0.field364 = field654;
		arg0.field365.field364 = arg0;
		arg0.field364.field365 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public class24 method264() {
		class24 var1 = field654.field364;
		if (field654 == var1) {
			return null;
		} else {
			var1.method121();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public class24 method265() {
		class24 var1 = field654.field364;
		if (field654 == var1) {
			field655 = null;
			return null;
		} else {
			field655 = var1.field364;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lx;")
	public class24 method266() {
		class24 var1 = field655;
		if (field654 == var1) {
			field655 = null;
			return null;
		} else {
			field655 = var1.field364;
			return var1;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method267() {
		int var1 = 0;
		for (class24 var2 = field654.field364; var2 != field654; var2 = var2.field364) {
			var1++;
		}

		return var1;
	}
}
