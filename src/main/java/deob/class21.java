package deob;

@ObfuscatedName("u")
public final class class21 {

	@ObfuscatedName("u.d")
	public int field337;

	@ObfuscatedName("u.e")
	public class22[] field338;

	public class21(int arg0) {
		field337 = arg0;
		field338 = new class22[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class22 var3 = field338[var2] = new class22();
			var3.field340 = var3;
			var3.field341 = var3;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public class22 method118(long arg0) {
		class22 var3 = field338[(int) (arg0 & field337 - 1)];
		for (class22 var4 = var3.field340; var4 != var3; var4 = var4.field340) {
			if (var4.field339 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("u.a(Lv;IJ)V")
	public void method119(class22 arg0, long arg1) {
		if (arg0.field341 != null) {
			arg0.method120();
		}

		class22 var4 = field338[(int) (arg1 & field337 - 1)];
		arg0.field341 = var4.field341;
		arg0.field340 = var4;
		arg0.field341.field340 = arg0;
		arg0.field340.field341 = arg0;
		arg0.field339 = arg1;
	}
}
