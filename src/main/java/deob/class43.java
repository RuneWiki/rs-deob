package deob;

@ObfuscatedName("qb")
public final class class43 {

	@ObfuscatedName("qb.d")
	public class24 field655 = new class24();

	@ObfuscatedName("qb.e")
	public class24 field656;

	public class43() {
		field655.field365 = field655;
		field655.field366 = field655;
	}

	@ObfuscatedName("qb.a(Lx;)V")
	public void method263(class24 arg0) {
		if (arg0.field366 != null) {
			arg0.method121();
		}

		arg0.field366 = field655.field366;
		arg0.field365 = field655;
		arg0.field366.field365 = arg0;
		arg0.field365.field366 = arg0;
	}

	@ObfuscatedName("qb.a()Lx;")
	public class24 method264() {
		class24 var1 = field655.field365;
		if (field655 == var1) {
			return null;
		} else {
			var1.method121();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lx;")
	public class24 method265() {
		class24 var1 = field655.field365;
		if (field655 == var1) {
			field656 = null;
			return null;
		} else {
			field656 = var1.field365;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(Z)Lx;")
	public class24 method266() {
		class24 var1 = field656;
		if (field655 == var1) {
			field656 = null;
			return null;
		} else {
			field656 = var1.field365;
			return var1;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method267() {
		int var1 = 0;
		for (class24 var2 = field655.field365; var2 != field655; var2 = var2.field365) {
			var1++;
		}

		return var1;
	}
}
