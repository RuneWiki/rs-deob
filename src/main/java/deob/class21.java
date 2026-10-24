package deob;

@ObfuscatedName("u")
public final class class21 {

	@ObfuscatedName("u.c")
	public int field327;

	@ObfuscatedName("u.d")
	public class22[] field328;

	public class21(int arg0) {
		field327 = arg0;
		field328 = new class22[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class22 var3 = field328[var2] = new class22();
			var3.field330 = var3;
			var3.field331 = var3;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public class22 method116(long arg0) {
		class22 var3 = field328[(int) (arg0 & field327 - 1)];
		for (class22 var4 = var3.field330; var4 != var3; var4 = var4.field330) {
			if (var4.field329 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("u.a(ILv;J)V")
	public void method117(class22 arg0, long arg1) {
		if (arg0.field331 != null) {
			arg0.method118();
		}

		class22 var4 = field328[(int) (arg1 & field327 - 1)];
		arg0.field331 = var4.field331;
		arg0.field330 = var4;
		arg0.field331.field330 = arg0;
		arg0.field330.field331 = arg0;
		arg0.field329 = arg1;
	}
}
