package deob;

@ObfuscatedName("t")
public final class class20 {

	@ObfuscatedName("t.b")
	public int field259;

	@ObfuscatedName("t.c")
	public class21[] field260;

	public class20(int arg0) {
		field259 = arg0;
		field260 = new class21[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class21 var3 = field260[var2] = new class21();
			var3.field262 = var3;
			var3.field263 = var3;
		}
	}

	@ObfuscatedName("t.a(J)Lu;")
	public class21 method102(long arg0) {
		class21 var3 = field260[(int) (arg0 & field259 - 1)];
		for (class21 var4 = var3.field262; var4 != var3; var4 = var4.field262) {
			if (var4.field261 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("t.a(Lu;IJ)V")
	public void method103(class21 arg0, long arg1) {
		if (arg0.field263 != null) {
			arg0.method104();
		}

		class21 var4 = field260[(int) (arg1 & field259 - 1)];
		arg0.field263 = var4.field263;
		arg0.field262 = var4;
		arg0.field263.field262 = arg0;
		arg0.field262.field263 = arg0;
		arg0.field261 = arg1;
	}
}
