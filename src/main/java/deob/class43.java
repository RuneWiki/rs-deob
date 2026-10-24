package deob;

@ObfuscatedName("qb")
public final class class43 {

	@ObfuscatedName("qb.c")
	public class23 field656 = new class23();

	@ObfuscatedName("qb.d")
	public class23 field657;

	public class43() {
		field656.field356 = field656;
		field656.field357 = field656;
	}

	@ObfuscatedName("qb.a(Lw;)V")
	public void method252(class23 arg0) {
		if (arg0.field357 != null) {
			arg0.method107();
		}

		arg0.field357 = field656.field357;
		arg0.field356 = field656;
		arg0.field357.field356 = arg0;
		arg0.field356.field357 = arg0;
	}

	@ObfuscatedName("qb.a()Lw;")
	public class23 method253() {
		class23 var1 = field656.field356;
		if (field656 == var1) {
			return null;
		} else {
			var1.method107();
			return var1;
		}
	}

	@ObfuscatedName("qb.b()Lw;")
	public class23 method254() {
		class23 var1 = field656.field356;
		if (field656 == var1) {
			field657 = null;
			return null;
		} else {
			field657 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("qb.a(I)Lw;")
	public class23 method255() {
		class23 var1 = field657;
		if (field656 == var1) {
			field657 = null;
			return null;
		} else {
			field657 = var1.field356;
			return var1;
		}
	}

	@ObfuscatedName("qb.c()I")
	public int method256() {
		int var1 = 0;
		for (class23 var2 = field656.field356; var2 != field656; var2 = var2.field356) {
			var1++;
		}

		return var1;
	}
}
