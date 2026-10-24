package deob;

@ObfuscatedName("qb")
public final class class43 {

	@ObfuscatedName("qb.b")
	public class24 field641 = new class24();

	@ObfuscatedName("qb.c")
	public class24 field642;

	public class43() {
		field641.field355 = field641;
		field641.field356 = field641;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method255(class24 arg0) {
		if (arg0.field356 != null) {
			arg0.method119();
		}

		arg0.field356 = field641.field356;
		arg0.field355 = field641;
		arg0.field356.field355 = arg0;
		arg0.field355.field356 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public class24 method256() {
		class24 var1 = field641.field355;
		if (field641 == var1) {
			return null;
		} else {
			var1.method119();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public class24 method257() {
		class24 var1 = field641.field355;
		if (field641 == var1) {
			field642 = null;
			return null;
		} else {
			field642 = var1.field355;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(Z)Lx;")
	public class24 method258() {
		class24 var1 = field642;
		if (field641 == var1) {
			field642 = null;
			return null;
		} else {
			field642 = var1.field355;
			return var1;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method259() {
		int var1 = 0;
		for (class24 var2 = field641.field355; var2 != field641; var2 = var2.field355) {
			var1++;
		}

		return var1;
	}
}
