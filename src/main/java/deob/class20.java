package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.a")
	public int field261;

	@ObfuscatedName("t.b")
	public class21[] field262;

	public class20(int arg0) {
		field261 = arg0;
		field262 = new class21[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class21 var3 = field262[var2] = new class21();
			var3.field264 = var3;
			var3.field265 = var3;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public class21 method105(long arg0) {
		class21 var3 = field262[(int) (arg0 & field261 - 1)];
		for (class21 var4 = var3.field264; var4 != var3; var4 = var4.field264) {
			if (var4.field263 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("t.a(Lu;JZ)V")
	public void method106(class21 arg0, long arg1) {
		if (arg0.field265 != null) {
			arg0.method107();
		}

		class21 var4 = field262[(int) (arg1 & field261 - 1)];
		arg0.field265 = var4.field265;
		arg0.field264 = var4;
		arg0.field265.field264 = arg0;
		arg0.field264.field265 = arg0;
		arg0.field263 = arg1;
	}
}
