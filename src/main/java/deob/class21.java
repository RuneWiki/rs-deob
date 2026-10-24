package deob;

@ObfuscatedName("u")
public final class class21 {

	@ObfuscatedName("u.d")
	public int field336;

	@ObfuscatedName("u.e")
	public class22[] field337;

	public class21(int arg0) {
		field336 = arg0;
		field337 = new class22[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class22 var3 = field337[var2] = new class22();
			var3.field339 = var3;
			var3.field340 = var3;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public class22 method117(long arg0) {
		class22 var3 = field337[(int) (arg0 & field336 - 1)];
		for (class22 var4 = var3.field339; var4 != var3; var4 = var4.field339) {
			if (var4.field338 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("u.a(Lv;IJ)V")
	public void method118(class22 arg0, long arg1) {
		if (arg0.field340 != null) {
			arg0.method119();
		}

		class22 var4 = field337[(int) (arg1 & field336 - 1)];
		arg0.field340 = var4.field340;
		arg0.field339 = var4;
		arg0.field340.field339 = arg0;
		arg0.field339.field340 = arg0;
		arg0.field338 = arg1;
	}
}
