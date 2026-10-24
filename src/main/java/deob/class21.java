package deob;

@ObfuscatedName("u")
public final class class21 {

	@ObfuscatedName("u.d")
	public int field334;

	@ObfuscatedName("u.e")
	public class22[] field335;

	public class21(int arg0) {
		field334 = arg0;
		field335 = new class22[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class22 var3 = field335[var2] = new class22();
			var3.field337 = var3;
			var3.field338 = var3;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public class22 method117(long arg0) {
		class22 var3 = field335[(int) (arg0 & field334 - 1)];
		for (class22 var4 = var3.field337; var4 != var3; var4 = var4.field337) {
			if (var4.field336 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("u.a(Lv;JI)V")
	public void method118(class22 arg0, long arg1) {
		if (arg0.field338 != null) {
			arg0.method119();
		}

		class22 var4 = field335[(int) (arg1 & field334 - 1)];
		arg0.field338 = var4.field338;
		arg0.field337 = var4;
		arg0.field338.field337 = arg0;
		arg0.field337.field338 = arg0;
		arg0.field336 = arg1;
	}
}
