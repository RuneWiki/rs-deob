package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.d")
	public int field262;

	@ObfuscatedName("t.e")
	public class21[] field263;

	public class20(int arg0) {
		field262 = arg0;
		field263 = new class21[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class21 var3 = field263[var2] = new class21();
			var3.field265 = var3;
			var3.field266 = var3;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public class21 method105(long arg0) {
		class21 var3 = field263[(int) (arg0 & field262 - 1)];
		for (class21 var4 = var3.field265; var4 != var3; var4 = var4.field265) {
			if (var4.field264 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("t.a(IJLu;)V")
	public void method106(long arg0, class21 arg1) {
		if (arg1.field266 != null) {
			arg1.method107();
		}

		class21 var4 = field263[(int) (arg0 & field262 - 1)];
		arg1.field266 = var4.field266;
		arg1.field265 = var4;
		arg1.field266.field265 = arg1;
		arg1.field265.field266 = arg1;
		arg1.field264 = arg0;
	}
}
